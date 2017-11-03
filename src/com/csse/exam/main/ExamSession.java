/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csse.exam.main;

import com.csse.exam.common.ClearComponents;
import com.csse.exam.common.CommonComponents;
import com.csse.exam.common.Validation;
import com.csse.exam.model.Session;
import com.csse.exam.service.SessionService;
import java.awt.Color;
import static java.lang.Integer.parseInt;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author saranki
 */
public class ExamSession extends javax.swing.JFrame {
    
    CommonComponents commonComponents = new CommonComponents();
    SessionService sessionService = new SessionService();
    Validation validation = new Validation();
    ClearComponents clear = new ClearComponents();
    private final ArrayList<Session> sessionList = sessionService.getSession();
    DefaultTableModel tableModel; 
    SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
    Date date = new Date();

    
    String examId;
    String moduleId = LecturerSearchCourse.moduleCode;
    int sessionId;
    String examTime;
    String examVenue;
    String examDate;

    /**
     * Creates new form ExamSession
     */
    public ExamSession() {
        initComponents();
        cmbSearchExamId.setVisible(true);
        lblSearchExamId.setVisible(true);
        sessionService.addValueToComboBoxBasedOnField(cmbExamId, moduleId);
        //Load examination id from database to cmbExamId, cmbSearchExamId comboboxes.
        //commonComponents.addValueToComboBox(cmbExamId, "exam", "examId");
        //commonComponents.addValueToComboBox(cmbSearchExamId, "exam", "examId");
        
        //Fill exam session details table by fetching data from the database
        sessionService.fillSessionDetailsTable(tblSession,moduleId);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlNavigation = new javax.swing.JPanel();
        pnlDashboard = new javax.swing.JPanel();
        lblDashboard = new javax.swing.JLabel();
        pnlCourse = new javax.swing.JPanel();
        lblCourse = new javax.swing.JLabel();
        pnlExam = new javax.swing.JPanel();
        lblExam = new javax.swing.JLabel();
        pnlResult = new javax.swing.JPanel();
        lblResult = new javax.swing.JLabel();
        pnlLogo = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        pnlContent = new javax.swing.JPanel();
        pnlSessionDetails = new javax.swing.JPanel();
        lblExamId = new javax.swing.JLabel();
        lblExamDate = new javax.swing.JLabel();
        lblExamTime = new javax.swing.JLabel();
        lblExamVenue = new javax.swing.JLabel();
        cmbExamId = new javax.swing.JComboBox<>();
        txtExamDate = new javax.swing.JTextField();
        txtExamVenue = new javax.swing.JTextField();
        Date date = new Date();
        SpinnerDateModel spinnerDate =
        new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        spinExamTime = new javax.swing.JSpinner(spinnerDate);
        txtModuleId = new javax.swing.JTextField();
        lblModuleId = new javax.swing.JLabel();
        txtSessionId = new javax.swing.JTextField();
        btnClearAll = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblSessionId = new javax.swing.JLabel();
        pnlSessionTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSession = new javax.swing.JTable();
        lblSearchExamId = new javax.swing.JLabel();
        cmbSearchExamId = new javax.swing.JComboBox<>();
        pnlHeader = new javax.swing.JPanel();
        lblSystem = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        pnlTitle = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlNavigation.setBackground(new java.awt.Color(105, 135, 170));
        pnlNavigation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlDashboard.setBackground(new java.awt.Color(70, 102, 144));
        pnlDashboard.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlDashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlDashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlDashboardMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlDashboardMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlDashboardMouseReleased(evt);
            }
        });

        lblDashboard.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lblDashboard.setForeground(new java.awt.Color(255, 255, 255));
        lblDashboard.setText("Dashboard");

        javax.swing.GroupLayout pnlDashboardLayout = new javax.swing.GroupLayout(pnlDashboard);
        pnlDashboard.setLayout(pnlDashboardLayout);
        pnlDashboardLayout.setHorizontalGroup(
            pnlDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDashboardLayout.setVerticalGroup(
            pnlDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlNavigation.add(pnlDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 130, 50));

        pnlCourse.setBackground(new java.awt.Color(70, 102, 144));
        pnlCourse.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlCourse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlCourseMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlCourseMouseReleased(evt);
            }
        });

        lblCourse.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lblCourse.setForeground(new java.awt.Color(255, 255, 255));
        lblCourse.setText("Course");
        lblCourse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlCourseLayout = new javax.swing.GroupLayout(pnlCourse);
        pnlCourse.setLayout(pnlCourseLayout);
        pnlCourseLayout.setHorizontalGroup(
            pnlCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCourseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCourse, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlCourseLayout.setVerticalGroup(
            pnlCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCourseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCourse, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlNavigation.add(pnlCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 130, 50));

        pnlExam.setBackground(new java.awt.Color(70, 102, 144));
        pnlExam.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlExam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlExam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlExamMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlExamMouseReleased(evt);
            }
        });

        lblExam.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lblExam.setForeground(new java.awt.Color(255, 255, 255));
        lblExam.setText("Exam");

        javax.swing.GroupLayout pnlExamLayout = new javax.swing.GroupLayout(pnlExam);
        pnlExam.setLayout(pnlExamLayout);
        pnlExamLayout.setHorizontalGroup(
            pnlExamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblExam, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlExamLayout.setVerticalGroup(
            pnlExamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlExamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblExam, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlNavigation.add(pnlExam, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 130, 50));

        pnlResult.setBackground(new java.awt.Color(70, 102, 144));
        pnlResult.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlResult.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlResult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlResultMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlResultMouseReleased(evt);
            }
        });

        lblResult.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lblResult.setForeground(new java.awt.Color(255, 255, 255));
        lblResult.setText("Result");

        javax.swing.GroupLayout pnlResultLayout = new javax.swing.GroupLayout(pnlResult);
        pnlResult.setLayout(pnlResultLayout);
        pnlResultLayout.setHorizontalGroup(
            pnlResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblResult, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlResultLayout.setVerticalGroup(
            pnlResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblResult, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlNavigation.add(pnlResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 130, 50));

        pnlLogo.setBackground(new java.awt.Color(204, 217, 233));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/csse/exam/resource/SLIIT_Crest.png"))); // NOI18N

        javax.swing.GroupLayout pnlLogoLayout = new javax.swing.GroupLayout(pnlLogo);
        pnlLogo.setLayout(pnlLogoLayout);
        pnlLogoLayout.setHorizontalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblLogo)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        pnlLogoLayout.setVerticalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlNavigation.add(pnlLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 100));

        getContentPane().add(pnlNavigation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 620));

        pnlContent.setBackground(new java.awt.Color(204, 217, 233));
        pnlContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlSessionDetails.setBackground(new java.awt.Color(204, 217, 233));
        pnlSessionDetails.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlSessionDetails.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblExamId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblExamId.setText("EXAMINATION CODE : ");
        pnlSessionDetails.add(lblExamId, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 30));

        lblExamDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblExamDate.setText("EXAMINATION DATE :");
        pnlSessionDetails.add(lblExamDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 150, 30));

        lblExamTime.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblExamTime.setText("EXAMINATION TIME :");
        pnlSessionDetails.add(lblExamTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 150, 30));

        lblExamVenue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblExamVenue.setText("EXAMINATION VENUE :");
        pnlSessionDetails.add(lblExamVenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 180, 30));

        cmbExamId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbExamId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT EXAMINATION ID" }));
        cmbExamId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbExamIdActionPerformed(evt);
            }
        });
        pnlSessionDetails.add(cmbExamId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 220, 30));

        txtExamDate.setEditable(false);
        pnlSessionDetails.add(txtExamDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 220, 30));
        pnlSessionDetails.add(txtExamVenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 180, 30));

        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(spinExamTime, "HH:mm");
        spinExamTime.setEditor(dateEditor);
        pnlSessionDetails.add(spinExamTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 180, 30));

        txtModuleId.setEditable(false);
        pnlSessionDetails.add(txtModuleId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 55, 220, 30));

        lblModuleId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblModuleId.setText("MODULE ID :");
        pnlSessionDetails.add(lblModuleId, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 55, 100, 30));

        txtSessionId.setEditable(false);
        pnlSessionDetails.add(txtSessionId, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 55, 180, 30));

        btnClearAll.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnClearAll.setText("CLEAR ALL");
        btnClearAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearAllMouseClicked(evt);
            }
        });
        pnlSessionDetails.add(btnClearAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 110, 40));

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        pnlSessionDetails.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 110, 40));

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        pnlSessionDetails.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 110, 40));

        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        pnlSessionDetails.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 110, 40));

        lblSessionId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSessionId.setText("EXAMINATION SESSION :");
        pnlSessionDetails.add(lblSessionId, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 55, -1, 30));

        pnlContent.add(pnlSessionDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 800, 200));

        pnlSessionTable.setBackground(new java.awt.Color(204, 217, 233));
        pnlSessionTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlSessionTable.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblSession.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EXAMINATION ID", "MODULE ID", "EXAMINATION DATE", "SESSION ID", "EXAMINATION TIME", "EXAMINATION VENUE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSession.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSessionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSession);

        pnlSessionTable.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 780, 210));

        lblSearchExamId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSearchExamId.setText("EXAMINATION CODE : ");
        pnlSessionTable.add(lblSearchExamId, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, 30));

        cmbSearchExamId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbSearchExamId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT EXAMINATION ID" }));
        pnlSessionTable.add(cmbSearchExamId, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 240, 30));

        pnlContent.add(pnlSessionTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 800, 270));

        getContentPane().add(pnlContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 830, 520));

        pnlHeader.setBackground(new java.awt.Color(105, 135, 170));
        pnlHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSystem.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblSystem.setForeground(new java.awt.Color(255, 255, 255));
        lblSystem.setText("MCQ EXAM SYSTEM");
        pnlHeader.add(lblSystem, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lblUser.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser.setText("BobTheBuilder");
        lblUser.setToolTipText("");
        pnlHeader.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 10, 460, 20));

        lblLogout.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(204, 217, 233));
        lblLogout.setText("(LOGOUT)");
        lblLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlHeader.add(lblLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, -1, 20));

        pnlTitle.setBackground(new java.awt.Color(70, 102, 144));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Exam Session");

        javax.swing.GroupLayout pnlTitleLayout = new javax.swing.GroupLayout(pnlTitle);
        pnlTitle.setLayout(pnlTitleLayout);
        pnlTitleLayout.setHorizontalGroup(
            pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTitleLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        pnlTitleLayout.setVerticalGroup(
            pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        pnlHeader.add(pnlTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 830, 40));

        getContentPane().add(pnlHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 830, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDashboardMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlDashboardMouseClicked

    private void pnlDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDashboardMouseEntered
        // TODO add your handling code here:
        //        jPanel5.setBackground(new Color(153,150,255));
    }//GEN-LAST:event_pnlDashboardMouseEntered

    private void pnlDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDashboardMouseExited
        // TODO add your handling code here:[153,204,255]
    }//GEN-LAST:event_pnlDashboardMouseExited

    private void pnlDashboardMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDashboardMousePressed
        // TODO add your handling code here:
        pnlDashboard.setBackground(new Color(204, 217, 233));
    }//GEN-LAST:event_pnlDashboardMousePressed

    private void pnlDashboardMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDashboardMouseReleased
        // TODO add your handling code here:
        pnlDashboard.setBackground(new Color(70, 102, 144));
    }//GEN-LAST:event_pnlDashboardMouseReleased

    private void pnlCourseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCourseMousePressed
        // TODO add your handling code here:
        pnlCourse.setBackground(new Color(204, 217, 233));
    }//GEN-LAST:event_pnlCourseMousePressed

    private void pnlCourseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCourseMouseReleased
        // TODO add your handling code here:
        pnlCourse.setBackground(new Color(70, 102, 144));
    }//GEN-LAST:event_pnlCourseMouseReleased

    private void pnlExamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlExamMousePressed
        // TODO add your handling code here:
        pnlExam.setBackground(new Color(204, 217, 233));
    }//GEN-LAST:event_pnlExamMousePressed

    private void pnlExamMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlExamMouseReleased
        // TODO add your handling code here:
        pnlExam.setBackground(new Color(70, 102, 144));
    }//GEN-LAST:event_pnlExamMouseReleased

    private void pnlResultMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlResultMousePressed
        // TODO add your handling code here:
        pnlResult.setBackground(new Color(204, 217, 233));
    }//GEN-LAST:event_pnlResultMousePressed

    private void pnlResultMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlResultMouseReleased
        // TODO add your handling code here:
        pnlResult.setBackground(new Color(70, 102, 144));
    }//GEN-LAST:event_pnlResultMouseReleased

    private void cmbExamIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbExamIdActionPerformed
        // TODO add your handling code here:
       
       if(cmbExamId.getSelectedIndex() !=0)
       {
            examId = cmbExamId.getSelectedItem().toString();           
            clear.clearTextFields(pnlSessionDetails);       
            sessionService.getExamDetailsById(examId,txtModuleId, txtExamDate);
            txtSessionId.setText(sessionService.getSessionId(examId));
       }

    }//GEN-LAST:event_cmbExamIdActionPerformed

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        // TODO add your handling code here:
       
        boolean nullValue = validation.checkEmptyTextBox(pnlSessionDetails);  
        boolean addValue;
        if(!nullValue)
        {            
            JOptionPane.showMessageDialog(null, "Please fill all the text boxes", "Failure Message", 1);
        }
        else
        {
            examId =cmbExamId.getSelectedItem().toString();
            sessionId = parseInt(txtSessionId.getText());          
            examTime = spinExamTime.getValue().toString().split(" ")[3].substring(0, 5);
            examVenue = txtExamVenue.getText();
            examDate = txtExamDate.getText();
            
            String isExisting = sessionService.isExamIdExisting(examId);
            System.out.println("existing "+isExisting);
            if(isExisting != null)
            {
                int availableValue = sessionService.checkSessionAvailability(examDate,examTime, examVenue, examId);
                System.out.println("available "+availableValue);
                if(availableValue != 0)
                {
                    JOptionPane.showMessageDialog(null, "The requested slot is already booked for another exam.\nPlease provide another time and venue.", "Failure Message", 1);

                }
                else
                {
                    addValue  = sessionService.addExamSessionDetails(examId, sessionId, examTime, examVenue);
        
                    if(addValue)
                    {
                        JOptionPane.showMessageDialog(null, "Exam session details were successfully added to the database", "Success Message", 1);
                        tableModel= (DefaultTableModel) tblSession.getModel();
                        tableModel.setRowCount(0);
                        sessionService.fillSessionDetailsTable(tblSession, moduleId);
                    }          
                }
            
            }
            
            else
            {
                addValue  = sessionService.addExamSessionDetails(examId, sessionId, examTime, examVenue);
        
                    if(addValue)
                    {
                        JOptionPane.showMessageDialog(null, "Exam session details were successfully added to the database", "Success Message", 1);
                        tableModel= (DefaultTableModel) tblSession.getModel();
                        tableModel.setRowCount(0);
                        sessionService.fillSessionDetailsTable(tblSession, moduleId);
                    }  
            }
        }       
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnClearAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearAllMouseClicked
        // TODO add your handling code here:
        clear.clearTextFields(pnlSessionDetails);
        clear.resetComboBox(pnlSessionDetails);
        txtSessionId.setText("");
        tableModel = (DefaultTableModel) tblSession.getModel(); 
        tableModel.setRowCount(0);           
        sessionService.fillSessionDetailsTable(tblSession, moduleId);
         try{
            spinExamTime.setValue((Date)dateFormat.parse(dateFormat.format(date)));
             System.out.println(dateFormat.format(date));
        }catch(ParseException e)
        {
       
        }
    }//GEN-LAST:event_btnClearAllMouseClicked

    private void tblSessionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSessionMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblSession.getSelectedRow();
        TableModel tModel = tblSession.getModel();   
        
        examId = tModel.getValueAt(selectedRow, 0).toString();
        moduleId = tModel.getValueAt(selectedRow, 1).toString();
        examDate = tModel.getValueAt(selectedRow, 2).toString();
        sessionId = parseInt(tModel.getValueAt(selectedRow, 3).toString());
        examTime = tModel.getValueAt(selectedRow, 4).toString();
        examVenue = tModel.getValueAt(selectedRow, 5).toString();
        
        cmbExamId.setSelectedItem(examId);
        txtModuleId.setText(moduleId);
        txtExamDate.setText(examDate);
        txtSessionId.setText(String.valueOf(sessionId));
        try{
            spinExamTime.setValue((Date)dateFormat.parse(examTime));
        }catch(ParseException e)
        {
        
        }
        txtExamVenue.setText(examVenue);
        
    }//GEN-LAST:event_tblSessionMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        tableModel= (DefaultTableModel) tblSession.getModel();
        examId = cmbExamId.getSelectedItem().toString();
        sessionId = parseInt(txtSessionId.getText());
        examTime = spinExamTime.getValue().toString().split(" ")[3].substring(0, 5);
        examVenue = txtExamVenue.getText();
        
        boolean nullValue = validation.checkEmptyTextBox(pnlSessionDetails);  
       
        if(!nullValue)
        {            
            JOptionPane.showMessageDialog(null, "Please fill all the text boxes", "Failure Message", 1);
        }
        else
        {
            boolean updateValue = sessionService.updateSessionDetails(examId, sessionId, examTime, examVenue);
            if(updateValue)
            {
                JOptionPane.showMessageDialog(this, "Exam details were successfully updated", "Success Message", 1);
                
                tableModel.setRowCount(0);
                sessionService.fillSessionDetailsTable(tblSession,moduleId);
            }
            else
                JOptionPane.showMessageDialog(this, "Exam details were not updated", "Error Message", 1);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        // TODO add your handling code here:
        System.out.println("in");
        
        tableModel= (DefaultTableModel) tblSession.getModel();
        boolean  val = false ;
       
        examId = cmbExamId.getSelectedItem().toString();
        sessionId = parseInt(txtSessionId.getText());
        System.out.println("sessionId "+sessionId);
        examDate = txtExamDate.getText();
         Date currentDate = new Date() ;
        try{
        currentDate = ((Date)dateFormat.parse(examDate));
        
        }
        catch(Exception e)
        {
        
        }
        val= currentDate.after(date);
            System.out.println("val "+val);
        if(val)
        {
            boolean deleteValue = sessionService.deleteSessionDetails(examId, sessionId);
            
            if(deleteValue)
            {
                JOptionPane.showMessageDialog(this, "Exam details were successfully deleted", "Success Message", 1);
                tableModel.setRowCount(0);
                sessionService.fillSessionDetailsTable(tblSession, moduleId);
                
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Exam that you have selected is already done.\nYou cannot delete the exam history", "Fasilure Message", 1);

        }
       
        
    }//GEN-LAST:event_btnDeleteMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ExamSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExamSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExamSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExamSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExamSession().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClearAll;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbExamId;
    private javax.swing.JComboBox<String> cmbSearchExamId;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCourse;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JLabel lblExam;
    private javax.swing.JLabel lblExamDate;
    private javax.swing.JLabel lblExamId;
    private javax.swing.JLabel lblExamTime;
    private javax.swing.JLabel lblExamVenue;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblModuleId;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblSearchExamId;
    private javax.swing.JLabel lblSessionId;
    private javax.swing.JLabel lblSystem;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlCourse;
    private javax.swing.JPanel pnlDashboard;
    private javax.swing.JPanel pnlExam;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlLogo;
    private javax.swing.JPanel pnlNavigation;
    private javax.swing.JPanel pnlResult;
    private javax.swing.JPanel pnlSessionDetails;
    private javax.swing.JPanel pnlSessionTable;
    private javax.swing.JPanel pnlTitle;
    private javax.swing.JSpinner spinExamTime;
    private javax.swing.JTable tblSession;
    private javax.swing.JTextField txtExamDate;
    private javax.swing.JTextField txtExamVenue;
    private javax.swing.JTextField txtModuleId;
    private javax.swing.JTextField txtSessionId;
    // End of variables declaration//GEN-END:variables
}
