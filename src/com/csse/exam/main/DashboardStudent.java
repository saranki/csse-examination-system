/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csse.exam.main;

import com.csse.exam.model.User;
import java.awt.Color;

/**
 *
 * @author user
 */
public class DashboardStudent extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    ModuleContent moduleContent = new ModuleContent();

    public DashboardStudent() {
        initComponents();
        lblUser.setText(User.getName());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContent = new javax.swing.JPanel();
        lblUpcomingEvents = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstUpcomingEvents = new javax.swing.JList<>();
        lblRecentActivity = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        pnlNavigation = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblHomeSD = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblModulesSD = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lblContactUs = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        lblExamTimeTable = new javax.swing.JLabel();
        pnlHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        pnlModuleContent = new javax.swing.JPanel();
        lblViewHeading = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstModules = new javax.swing.JList<>();
        pnlQuizContent = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstQuiz = new javax.swing.JList<>();
        pnlAttemptQuizContent = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblSelectedQuiz = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LECTURER DASHBOARD");
        setMinimumSize(new java.awt.Dimension(950, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlContent.setBackground(new java.awt.Color(204, 217, 233));
        pnlContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUpcomingEvents.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUpcomingEvents.setText("Upcoming Events");
        pnlContent.add(lblUpcomingEvents, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        lstUpcomingEvents.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstUpcomingEvents);

        pnlContent.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 240, 280));

        lblRecentActivity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRecentActivity.setText("Recent Activity");
        pnlContent.add(lblRecentActivity, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, -1, -1));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        pnlContent.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 210, 280));

        getContentPane().add(pnlContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 820, 520));

        pnlNavigation.setBackground(new java.awt.Color(105, 135, 170));
        pnlNavigation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(70, 102, 144));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel5MouseReleased(evt);
            }
        });

        lblHomeSD.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lblHomeSD.setForeground(new java.awt.Color(255, 255, 255));
        lblHomeSD.setText("Home");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHomeSD, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHomeSD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnlNavigation.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 130, 50));

        jPanel6.setBackground(new java.awt.Color(70, 102, 144));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel6MouseReleased(evt);
            }
        });

        lblModulesSD.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lblModulesSD.setForeground(new java.awt.Color(255, 255, 255));
        lblModulesSD.setText("My Modules");
        lblModulesSD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblModulesSD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblModulesSDMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblModulesSD, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblModulesSD, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnlNavigation.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 130, 50));

        jPanel7.setBackground(new java.awt.Color(70, 102, 144));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel7MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel7MouseReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("About");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnlNavigation.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 130, 50));

        jPanel8.setBackground(new java.awt.Color(70, 102, 144));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel8MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel8MouseReleased(evt);
            }
        });

        lblContactUs.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lblContactUs.setForeground(new java.awt.Color(255, 255, 255));
        lblContactUs.setText("Contact Us");
        lblContactUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblContactUsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblContactUs, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblContactUs, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnlNavigation.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 130, 50));

        jPanel1.setBackground(new java.awt.Color(204, 217, 233));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/csse/exam/resource/SLIIT_Crest.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel9)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlNavigation.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 100));

        jPanel10.setBackground(new java.awt.Color(70, 102, 144));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel10MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel10MouseReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Exams");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnlNavigation.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 130, 50));

        jPanel11.setBackground(new java.awt.Color(70, 102, 144));
        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel11MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel11MouseReleased(evt);
            }
        });

        lblExamTimeTable.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lblExamTimeTable.setForeground(new java.awt.Color(255, 255, 255));
        lblExamTimeTable.setText("Time Tables");
        lblExamTimeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExamTimeTableMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblExamTimeTable, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblExamTimeTable, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnlNavigation.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 130, 50));

        getContentPane().add(pnlNavigation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 620));

        pnlHeader.setBackground(new java.awt.Color(105, 135, 170));
        pnlHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MCQ EXAM SYSTEM");
        pnlHeader.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lblUser.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser.setText("BobTheBuilder");
        lblUser.setToolTipText("");
        pnlHeader.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 10, 460, 20));

        lblLogout.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(204, 217, 233));
        lblLogout.setText("LOGOUT");
        lblLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });
        pnlHeader.add(lblLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, -1, 20));

        jPanel2.setBackground(new java.awt.Color(70, 102, 144));

        lblHeader.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader.setText("Student Dashboard");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlHeader.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 830, 40));

        getContentPane().add(pnlHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 830, -1));

        pnlModuleContent.setBackground(new java.awt.Color(204, 217, 233));
        pnlModuleContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblViewHeading.setBackground(new java.awt.Color(70, 102, 144));
        lblViewHeading.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        lblViewHeading.setForeground(new java.awt.Color(70, 102, 144));
        lblViewHeading.setText("Modules");
        pnlModuleContent.add(lblViewHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 100, 30));

        lstModules.setBackground(new java.awt.Color(204, 217, 233));
        lstModules.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lstModules.setForeground(new java.awt.Color(51, 102, 255));
        lstModules.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "SPM", "UEE", "DBS", "CSSE" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstModules.setSelectionBackground(new java.awt.Color(204, 204, 204));
        lstModules.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstModulesValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(lstModules);

        pnlModuleContent.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 310, 130));

        getContentPane().add(pnlModuleContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 830, 520));

        pnlQuizContent.setBackground(new java.awt.Color(204, 217, 233));
        pnlQuizContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setBackground(new java.awt.Color(70, 102, 144));
        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(70, 102, 144));
        jLabel12.setText("Selected Module");
        pnlQuizContent.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 200, 30));

        lstQuiz.setBackground(new java.awt.Color(204, 217, 233));
        lstQuiz.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lstQuiz.setForeground(new java.awt.Color(51, 102, 255));
        lstQuiz.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "SPM-Quiz-1", "UEE-Quiz-1", "DBS-Quiz-1", "CSSE-Quiz-1" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstQuiz.setSelectionBackground(new java.awt.Color(204, 204, 204));
        lstQuiz.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstQuizValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(lstQuiz);

        pnlQuizContent.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 310, 130));

        getContentPane().add(pnlQuizContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 830, 520));

        pnlAttemptQuizContent.setBackground(new java.awt.Color(204, 217, 233));
        pnlAttemptQuizContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));

        lblSelectedQuiz.setBackground(new java.awt.Color(70, 102, 144));
        lblSelectedQuiz.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        lblSelectedQuiz.setForeground(new java.awt.Color(51, 51, 51));
        lblSelectedQuiz.setText("Selected Quiz");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(lblSelectedQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSelectedQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pnlAttemptQuizContent.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 280, 60));

        jLabel14.setBackground(new java.awt.Color(70, 102, 144));
        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Attemp Quiz");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlAttemptQuizContent.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 250, 70));

        jPanel9.setBackground(new java.awt.Color(204, 217, 233));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setText("jTextField2");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel9.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 30));

        pnlAttemptQuizContent.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 150, 50));

        jLabel13.setBackground(new java.awt.Color(70, 102, 144));
        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Quizz Password");
        pnlAttemptQuizContent.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 200, 30));

        getContentPane().add(pnlAttemptQuizContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 830, 520));

        setSize(new java.awt.Dimension(966, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        // TODO add your handling code here:
//        jPanel5.setBackground(new Color(153,150,255));
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
        // TODO add your handling code here:[153,204,255]

    }//GEN-LAST:event_jPanel5MouseExited

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        // TODO add your handling code here:
        jPanel5.setBackground(new Color(204, 217, 233));
    }//GEN-LAST:event_jPanel5MousePressed

    private void jPanel5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseReleased
        // TODO add your handling code here:
        jPanel5.setBackground(new Color(70, 102, 144));
    }//GEN-LAST:event_jPanel5MouseReleased

    private void jPanel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MousePressed
        // TODO add your handling code here:
        jPanel6.setBackground(new Color(204, 217, 233));
    }//GEN-LAST:event_jPanel6MousePressed

    private void jPanel6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseReleased
        // TODO add your handling code here:
        jPanel6.setBackground(new Color(70, 102, 144));
    }//GEN-LAST:event_jPanel6MouseReleased

    private void jPanel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MousePressed
        // TODO add your handling code here:
        jPanel7.setBackground(new Color(204, 217, 233));
    }//GEN-LAST:event_jPanel7MousePressed

    private void jPanel7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseReleased
        // TODO add your handling code here:
        jPanel7.setBackground(new Color(70, 102, 144));
    }//GEN-LAST:event_jPanel7MouseReleased

    private void jPanel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MousePressed
        // TODO add your handling code here:
        jPanel8.setBackground(new Color(204, 217, 233));
    }//GEN-LAST:event_jPanel8MousePressed

    private void jPanel8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseReleased
        // TODO add your handling code here:
        jPanel8.setBackground(new Color(70, 102, 144));
    }//GEN-LAST:event_jPanel8MouseReleased

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        // TODO add your handling code here:
        User.logout();
        Login login = new Login();
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        AboutUs about = new AboutUs();
        this.setVisible(false);
        about.setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void lblContactUsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblContactUsMouseClicked
        // TODO add your handling code here:
        ContactUs contact = new ContactUs();
        this.setVisible(false);
        contact.setVisible(true);
    }//GEN-LAST:event_lblContactUsMouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void lstQuizValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstQuizValueChanged

        lblHeader.setText(lblModulesSD.getText() + " - " + lstQuiz.getSelectedValue());
        lblSelectedQuiz.setText(lstQuiz.getSelectedValue());
        pnlQuizContent.setVisible(false);
        pnlAttemptQuizContent.setVisible(true);

    }//GEN-LAST:event_lstQuizValueChanged

    private void lstModulesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstModulesValueChanged
        lblHeader.setText(lblModulesSD.getText() + " - " + lstModules.getSelectedValue());
        pnlModuleContent.setVisible(false);
        pnlQuizContent.setVisible(true);
    }//GEN-LAST:event_lstModulesValueChanged

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        ExamModuleContent examModuleContent = new ExamModuleContent();
        this.setVisible(false);
        examModuleContent.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jPanel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel10MousePressed

    private void jPanel10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel10MouseReleased

    private void lblModulesSDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModulesSDMouseClicked
        this.setVisible(false);
        moduleContent.setVisible(true);

    }//GEN-LAST:event_lblModulesSDMouseClicked

    private void lblExamTimeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExamTimeTableMouseClicked
        ExamTimeTables examTimeTables = new ExamTimeTables();
        this.setVisible(false);
        examTimeTables.setVisible(true);
    }//GEN-LAST:event_lblExamTimeTableMouseClicked

    private void jPanel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel11MousePressed

    private void jPanel11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel11MouseReleased

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
            java.util.logging.Logger.getLogger(DashboardStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblContactUs;
    private javax.swing.JLabel lblExamTimeTable;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblHomeSD;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblModulesSD;
    private javax.swing.JLabel lblRecentActivity;
    private javax.swing.JLabel lblSelectedQuiz;
    private javax.swing.JLabel lblUpcomingEvents;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblViewHeading;
    private javax.swing.JList<String> lstModules;
    private javax.swing.JList<String> lstQuiz;
    private javax.swing.JList<String> lstUpcomingEvents;
    private javax.swing.JPanel pnlAttemptQuizContent;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlModuleContent;
    private javax.swing.JPanel pnlNavigation;
    private javax.swing.JPanel pnlQuizContent;
    // End of variables declaration//GEN-END:variables
}
