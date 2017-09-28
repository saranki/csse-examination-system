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
public class AddUser extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public AddUser() {
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
        jPanel3 = new javax.swing.JPanel();
        lblPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblName1 = new javax.swing.JLabel();
        rdoStudent = new javax.swing.JRadioButton();
        rdoLecturer1 = new javax.swing.JRadioButton();
        lblRole1 = new javax.swing.JLabel();
        txtName1 = new javax.swing.JTextField();
        lblUsername1 = new javax.swing.JLabel();
        pwdUserPassword = new javax.swing.JPasswordField();
        jPanel9 = new javax.swing.JPanel();
        lblContactUs1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        lblContactUs2 = new javax.swing.JLabel();
        pnlNavigation = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblHome = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblAbout = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lblContactUs = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        pnlHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LECTURER DASHBOARD");
        setMinimumSize(new java.awt.Dimension(950, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlContent.setBackground(new java.awt.Color(204, 217, 233));
        pnlContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 217, 233));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPassword.setText("Password");
        jPanel3.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));
        jPanel3.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 180, 30));

        lblName1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblName1.setText("Name");
        jPanel3.add(lblName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        rdoStudent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdoStudent.setText("Student");
        jPanel3.add(rdoStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        rdoLecturer1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdoLecturer1.setText("Lecturer");
        jPanel3.add(rdoLecturer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));

        lblRole1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRole1.setText("Role");
        jPanel3.add(lblRole1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));
        jPanel3.add(txtName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 180, 30));

        lblUsername1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUsername1.setText("Username");
        jPanel3.add(lblUsername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));
        jPanel3.add(pwdUserPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 180, -1));

        jPanel9.setBackground(new java.awt.Color(70, 102, 144));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel9MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel9MouseReleased(evt);
            }
        });

        lblContactUs1.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lblContactUs1.setForeground(new java.awt.Color(255, 255, 255));
        lblContactUs1.setText("        ADD");
        lblContactUs1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblContactUs1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblContactUs1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblContactUs1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        pnlContent.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 650, 350));

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

        lblContactUs2.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lblContactUs2.setForeground(new java.awt.Color(255, 255, 255));
        lblContactUs2.setText("Delete User");
        lblContactUs2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblContactUs2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblContactUs2, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblContactUs2, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlContent.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, -1));

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

        lblHome.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lblHome.setForeground(new java.awt.Color(255, 255, 255));
        lblHome.setText("Home");
        lblHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHomeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHome, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHome, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
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

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Add User");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
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

        lblAbout.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lblAbout.setForeground(new java.awt.Color(255, 255, 255));
        lblAbout.setText("About");
        lblAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAboutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAbout, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAbout, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlNavigation.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 130, 50));

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
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblContactUs, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlNavigation.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 130, 50));

        jPanel1.setBackground(new java.awt.Color(204, 217, 233));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel9)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlNavigation.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 100));

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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Add User");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlHeader.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 830, 40));

        getContentPane().add(pnlHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 830, -1));

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

    private void lblAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAboutMouseClicked
        AboutUs about = new AboutUs();
        this.setVisible(false);
        about.setVisible(true);
    }//GEN-LAST:event_lblAboutMouseClicked

    private void lblHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseClicked
        // TODO add your handling code here:
        DashboardAdmin admin = new DashboardAdmin();
        this.setVisible(false);
        admin.setVisible(true);
    }//GEN-LAST:event_lblHomeMouseClicked

    private void lblContactUsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblContactUsMouseClicked
        // TODO add your handling code here:
        ContactUs contact = new ContactUs();
        this.setVisible(false);
        contact.setVisible(true);
    }//GEN-LAST:event_lblContactUsMouseClicked

    private void lblContactUs1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblContactUs1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblContactUs1MouseClicked

    private void jPanel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel9MousePressed

    private void jPanel9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel9MouseReleased

    private void lblContactUs2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblContactUs2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblContactUs2MouseClicked

    private void jPanel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel10MousePressed

    private void jPanel10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel10MouseReleased

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
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new AddUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblAbout;
    private javax.swing.JLabel lblContactUs;
    private javax.swing.JLabel lblContactUs1;
    private javax.swing.JLabel lblContactUs2;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRole1;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblUsername1;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlNavigation;
    private javax.swing.JPasswordField pwdUserPassword;
    private javax.swing.JRadioButton rdoLecturer1;
    private javax.swing.JRadioButton rdoStudent;
    private javax.swing.JTextField txtName1;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
