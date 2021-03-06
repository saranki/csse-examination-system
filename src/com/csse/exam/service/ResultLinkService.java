/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csse.exam.service;

import com.csse.exam.config.DBConnection;
import com.csse.exam.model.Exam;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.stream.Collectors;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author munsif
 */
public class ResultLinkService {

    private static final Connection CONNECTION = DBConnection.getConnection();
    public static final Logger LOGGER = Logger.getLogger(ResultService.class.getName());
    private static Handler fileHandler = null;
    private static Handler consoleHandler = null;

    private static PreparedStatement preparedStatement;
    private static ResultSet resultSet;

    private Exam exam;
    private ArrayList<Exam> examList = new ArrayList<>();

    public ResultLinkService() {
        try {
            consoleHandler = new ConsoleHandler();
            fileHandler = new FileHandler("./logs/answerlinkservice/log_answer_link_service.log", true);

            LOGGER.addHandler(consoleHandler);
            LOGGER.addHandler(fileHandler);

            consoleHandler.setLevel(Level.ALL);
            fileHandler.setLevel(Level.ALL);
            fileHandler.setFormatter(new SimpleFormatter());
            LOGGER.setLevel(Level.ALL);

            LOGGER.info("Result Service Initiated");
        }
        catch (IOException | SecurityException e) {
            LOGGER.log(Level.SEVERE, "Error occur in FileHandler : ", e);
        }
    }

    /**
     *
     * @param moduleId
     * @return ArrayList of type Exam and extraction of the specific fields
     */
    public ArrayList<Exam> getExamDetails(String moduleId) {
        try {
            preparedStatement = CONNECTION.prepareStatement("SELECT * FROM exam WHERE moduleId = '" + moduleId + "'");
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                exam = new Exam();
                exam.setExamDate(resultSet.getDate("examDate"));
                exam.setExamId(resultSet.getString("examId"));
                exam.setModuleId(resultSet.getString("moduleId"));
                exam.setResultState(resultSet.getString("resultState"));
                examList.add(exam);
            }
        }
        catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error occured in getExamDetails() : ", e);
        }
        return examList;
    }

    /**
     *
     * @return ArrayList of type Exam and extraction of the specific fields
     */
    public ArrayList<Exam> getAllExamDetails() {
        try {
            preparedStatement = CONNECTION.prepareStatement("SELECT * FROM exam");
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                exam = new Exam();
                exam.setExamDate(resultSet.getDate("examDate"));
                exam.setExamId(resultSet.getString("examId"));
                exam.setModuleId(resultSet.getString("moduleId"));
                exam.setResultState(resultSet.getString("resultState"));
                examList.add(exam);
            }
        }
        catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error occured in getAllExamDetails() : ", e);
        }
        return examList;
    }

    /**
     *
     * @param examId
     * @return List of Exams specific to that Id
     */
    public List<Exam> getResultLinkState(String examId) {
        return examList.stream()
                .filter(t -> t.getExamId().equals(examId))
                .collect(Collectors.toList());
    }

    public boolean updateResultLinkStatus(String resultState, String examId) {
        boolean status = false;
        try {
            preparedStatement = CONNECTION.prepareStatement("UPDATE exam SET resultState = ? WHERE examId = ? ");
            preparedStatement.setString(1, resultState);
            preparedStatement.setString(2, examId);
            int updated = preparedStatement.executeUpdate();
            System.out.println(updated + " Record Updated");
            LOGGER.log(Level.INFO, "{0} Record Updated", updated);
            status = true;
        }
        catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error occur in updateResultLinkStatus() : ", e);
        }
        return status;
    }

    /**
     *
     * @return Default Table Model to populate the jTable in View
     */
    public DefaultTableModel fillResultLinkTable() {
        DefaultTableModel table = new DefaultTableModel(new Object[]{"Examination Code", "Module Id", "Examination Date", "Result Link Status"}, 0);

        examList.forEach((result) -> {
            table.addRow(new Object[]{result.getExamId(), result.getModuleId(), result.getExamDate(), result.getResultState()});
        });

        return table;
    }

    public DefaultListModel fillEnabledResultLinks(String resultState) {
        getAllExamDetails();
        getEnabledLinks(resultState);

        DefaultListModel<String> list = new DefaultListModel<>();

        examList.forEach((result) -> {
            list.addElement(result.getExamId());
        });

        return list;
    }

    public List<Exam> getEnabledLinks(String resultState) {
        return examList.stream()
                .filter(t -> t.getResultState() != null && t.getResultState().equals(resultState))
                .collect(Collectors.toList());
    }

}
