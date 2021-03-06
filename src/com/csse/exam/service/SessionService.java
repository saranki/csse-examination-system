/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csse.exam.service;

import com.csse.exam.config.DBConnection;
import com.csse.exam.model.Session;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saranki
 */
public class SessionService {
    
    private static final Connection connection = DBConnection.getConnection();   
    private static PreparedStatement preparedStatement;
    private static ResultSet resultSet;
    Session session;
    private final ArrayList<Session> sessionList = new ArrayList<>();   
    
    
    
    
    /**
     * This method will get the necessary attributes from the relevant tables and load the values to the specified table.
     * @param table - This is the table to which we will be loading the values
     * @param moduleId
     */
    public void fillSessionDetailsTable(JTable table, String moduleId)
    {
       
        DefaultTableModel tableModel= (DefaultTableModel) table.getModel();       
        try
        {             
            preparedStatement = connection.prepareStatement("SELECT e.examId, e.moduleId, e.examDate,s.sessionId, s.examTime, s.examVenue FROM exam e, session s WHERE e.examId=s.examId AND e.moduleId=?");
            preparedStatement.setString(1, moduleId);
            resultSet = preparedStatement.executeQuery();
            
            ResultSetMetaData resultMetaData = resultSet.getMetaData();
            int columnCount=resultMetaData.getColumnCount();           
            
            while(resultSet.next())
            {   
                
                Object[] objects = new Object[columnCount];
 
                for(int i=0;i<columnCount;i++)
                {
                    objects[i]=resultSet.getObject(i+1);
                }
                tableModel.addRow(objects);
            }
                    
            table.setModel(tableModel);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }        
    }
    
    /**
     *Get all the session details
     * @return array list
     */
    public ArrayList<Session> getSession() 
    {
        try
        {
            preparedStatement = connection.prepareStatement("SELECT e.examId, e.moduleId, e.examDate,s.sessionId, s.examTime, s.examVenue FROM exam e, session s WHERE e.examId=s.examId");           
            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next())
            {
               session = new Session();
            
               session.setExamId(resultSet.getString("examId"));
               session.setModuleId(resultSet.getString("moduleId"));
               session.setExamDate(resultSet.getString("examDate"));
               session.setSessionId(resultSet.getInt("sessionId"));
               session.setExamTime(resultSet.getString("examTime"));
               session.setExamVenue(resultSet.getString("examVenue"));               
               sessionList.add(session);
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return sessionList;
    }
   
   
   
   /**
    * Get exam details by exam Id
    * @param examId
    * @param module
    * @param examDate
    * @param sessionId
    * @param examTime
    * @param examVenue 
    */
   public void getExamDetailsById(String examId, JTextField module, JTextField examDate) 
    {
        try
        {
            
            preparedStatement = connection.prepareStatement("SELECT examId, moduleId, examDate FROM exam WHERE examId=?");
            preparedStatement.setString(1, examId);
            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next())
            {
               module.setText(resultSet.getString("moduleId"));              
               examDate.setText(resultSet.getString("examDate"));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }           
    }
   
   /**
    * Check if the exam id is existing
    * @param examId
    * @return boolean value
    */
   public String isExamIdExisting(String examId)
   {
       String id = null;
       try
       {
           preparedStatement = connection.prepareStatement("SELECT DISTINCT examId FROM session WHERE examId=?");
           preparedStatement.setString(1, examId);
           resultSet = preparedStatement.executeQuery();
           
           while(resultSet.next())
           {
                 id= resultSet.getString("examId");
           }
       }
       catch(SQLException e)
       {
           
       }
       return id;
   }
   
   /**
    * Get session details by exam id and session id
    * @param examId
    * @param sessionId
    * @param examTime
    * @param examVenue 
    */
   public void getSessionDetailsById(String examId, int sessionId, JSpinner examTime, JTextField examVenue) 
    {
        try
        {           
            preparedStatement = connection.prepareStatement("SELECT examTime, examVenue FROM session WHERE examId=? AND sessionId=?");
            preparedStatement.setString(1, examId);
            preparedStatement.setInt(2, sessionId);
            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next())
            {              
               examVenue.setText(resultSet.getString("examVenue"));               
               //System.out.println(resultSet.getObject("examTime"));
               //examTime.setValue(resultSet.getObject("examTime"));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }           
    }
   
   /**
    * Get latest session id by exam id in db
    * @param examId
    * @return 
    */
   public String getLatestSessionId(String examId)
    {
        String sessionId = null;

        try {
            preparedStatement = connection.prepareStatement("SELECT MAX(sessionId)\n"
                    + "FROM session\n"
                    + "WHERE examId=?");
            preparedStatement.setString(1, examId);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                sessionId = resultSet.getString(1);
            }
        } catch (SQLException e) {

        }
        return sessionId;
        
    }
   
   /**
    * Get the session id for the  next question
    * @param examId
    * @return sessionId
    */
   public String getSessionId(String examId)
    {
        String sessionId;
        String maxSessionId;
        int number;
        
        maxSessionId = getLatestSessionId(examId);
        
        if(maxSessionId == null)
        {
            sessionId = "1";
        }
        else
        {
            number = Integer.parseInt(maxSessionId) + 1;                     
            sessionId = String.valueOf(number);
        }
        return sessionId;
    }       
    
   /**
    * Add session id to combo box based on exam id
    * @param comboBox
    * @param examId 
    */
    public void getSessionIdByExamId(JComboBox comboBox, String examId) {
        String value = null;
        try {
            preparedStatement = connection.prepareStatement("SELECT DISTINCT sessionId FROM session WHERE examId=?");
            preparedStatement.setString(1, examId);
            resultSet = preparedStatement.executeQuery();

            while(resultSet.next())
            {
               value =  resultSet.getString("sessionId"); 
               if(value == null)
               {
                   value = "-";
               }
               comboBox.addItem(value);                
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    /**
     * Add exam details
     * @param examId
     * @param sessionId
     * @param examTime
     * @param examVenue
     * @return boolean value
     */
    public boolean addExamSessionDetails(String examId, int sessionId ,String examTime, String examVenue)
    {
        try {
            preparedStatement = connection.prepareStatement("INSERT INTO session (examId, sessionId, examTime, examVenue)" + "VALUES(?,?,?,?)");
              
            preparedStatement.setString(1, examId);
            preparedStatement.setInt(2, sessionId);
            preparedStatement.setString(3, examTime);
            preparedStatement.setString(4, examVenue);
            

            int executeUpdate = preparedStatement.executeUpdate();
            System.out.println(executeUpdate + " records updated");      
            
            return true;
        } 
        catch (SQLException e) 
        {
            System.out.println(e);
        }
        return false;
    }
    
    /**
     * Check whether an exam is already booked on same date, time and venue
     * @param examDate
     * @param examTime
     * @param examVenue
     * @param examId
     * @return exam id count
     */
    public int checkSessionAvailability(String examDate,String examTime, String examVenue, String examId)
    {       
        int value = 0;
        try
        {
           
            preparedStatement = connection.prepareStatement("SELECT (COUNT(DISTINCT s.examId)) FROM session s, exam e WHERE e.examId = s.examId AND e.examDate=? AND s.examTime=? AND s.examVenue=?");           
            
            preparedStatement.setString(1, examDate);
            preparedStatement.setString(2, examTime);
            preparedStatement.setString(3, examVenue);
            
            resultSet = preparedStatement.executeQuery(); 
            
            while(resultSet.next()) {
                value = resultSet.getInt(1);
                System.out.println("value = "+value);
            }
                       
        }
        catch(SQLException e)
        {
        
        }
        return value;
    }
    
    /**
     * Filter session details based on exam id
     * @param examId
     * @return 
     */
    public List<Session> getSessionDetailsById(String examId) {
        return sessionList.stream()
                .filter(t -> t.getExamId().equals(examId))
                .collect(Collectors.toList());

    }
    
    /**
     * Update session details
     * @param examId
     * @param sessionId
     * @param examTime
     * @param examVenue
     * @return boolean value
     */
    public boolean updateSessionDetails(String examId, int sessionId, String examTime, String examVenue){
        try {
            
            preparedStatement = connection.prepareStatement("UPDATE session SET examTime=?, examVenue =? WHERE examId=? AND sessionId=?");         
            
            preparedStatement.setString(1, examTime);
            preparedStatement.setString(2, examVenue);
            preparedStatement.setString(3, examId);
            preparedStatement.setInt(4, sessionId);
                   
            int i = preparedStatement.executeUpdate();
            System.out.println(i + " records updated");            
            return true;
        } catch (SQLException e) {
                System.out.println(e);
        }        
        return false;
    }
    
    /**
     * Delete session details
     * @param examId
     * @param sessionId
     * @return boolean value
     */
    public boolean deleteSessionDetails(String examId, int sessionId){
        try {
            
            preparedStatement = connection.prepareStatement("DELETE FROM session WHERE examId=? AND sessionId=?");                     
            preparedStatement.setString(1, examId);
            preparedStatement.setInt(2, sessionId);
            
            int i = preparedStatement.executeUpdate();
            System.out.println(i + " records deleted");            
            return true;
        } catch (SQLException e) {
                System.out.println(e);
        }        
        return false;

    }
    
    /**
     * Add exam id to combo box based on module id
     * @param comboBox
     * @param moduleId 
     */
    public void addValueToComboBoxBasedOnField(JComboBox comboBox, String moduleId) {

        String value = null;
        try {
            preparedStatement = connection.prepareStatement("SELECT DISTINCT s.examId FROM session s, exam e WHERE s.examId=e.examId AND e.moduleId=?");
            preparedStatement.setString(1, moduleId);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                value = resultSet.getString("examId");
                if (value == null) {
                    value = "-";
                }
                comboBox.addItem(value);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

}
            

