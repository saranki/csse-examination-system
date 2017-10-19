/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csse.exam.main;

import com.csse.exam.common.Validation;
import com.csse.exam.config.DBConnection;
import com.csse.exam.model.User;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author user
 */
public class Modules extends javax.swing.JFrame {

    Connection conn;
    private String moduleId;
   
    /**
     * Creates new form Dashboard
     */
    public Modules() {
        initComponents();
        displayModules();
        lblUser.setText(User.getName());
        
    }
    public boolean validateValues()
    {
        Validation validation = new Validation();
        if (validation.checkTextNull(txtModuleName.getText()) || validation.checkTextNull(pwdModulePassword.getText())) {
            JOptionPane.showMessageDialog(null, "You can't keep fields empty");
            return false;
        } 
        else {
            return true;
        }
    }
    
    public String getNewModuleId(){
        String lastModuleId = null;
        String newModuleId = null;

        try {
               
                Connection con = DBConnection.getConnection();
                String query = " SELECT moduleId FROM module\n" +
                                "order by moduleId desc limit 1;";
                PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement(query);
                
                // execute the preparedstatement
                ResultSet rs = preparedStmt.executeQuery(); 
                if(rs.next()){
                    lastModuleId = rs.getString("moduleId");
                }
                String last3 = lastModuleId.substring(lastModuleId.length() - 3);
                newModuleId = lastModuleId.substring(0,4)+String.valueOf(Integer.parseInt(last3) + 1);
                
                con.close();

                } catch (SQLException | HeadlessException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
        return newModuleId;
    }
    
    public String getAllocatedYearAndSemester(){
        String yearPrefix = null;
        String semesterPrefix = null;
        String allocatedTo;
        
        int year = cmbYear.getSelectedIndex();
        int semester = cmbSemester.getSelectedIndex();
        
        switch(year)
        {
            case(0):yearPrefix="Y1";break;
            case(1):yearPrefix="Y2";break;
            case(2):yearPrefix="Y3";break;
            case(3):yearPrefix="Y4";break;
        }
       switch(semester)
       {
           case(0):semesterPrefix="S1";break;
           case(1):semesterPrefix="S2";break;
       }
       
       allocatedTo = yearPrefix+semesterPrefix;
       return allocatedTo;
    }

     public void executeQuery(String query){
        
        try{
               conn = (Connection) DBConnection.getConnection();
               Statement st=conn.createStatement();

               PreparedStatement pst = (PreparedStatement) conn.prepareStatement(query); 
               pst.execute();
               ResultSet result = st.executeQuery("select * from module");
               DefaultTableModel aModel = (DefaultTableModel) tblModule.getModel();
               aModel.setRowCount(0);
               try {
                    result.beforeFirst();
            
                    // Loop through the ResultSet and transfer in the Model
                    java.sql.ResultSetMetaData rsmd = result.getMetaData();
                    int colNo = rsmd.getColumnCount();
                    while(result.next())
                    {   
                        Object[] objects = new Object[colNo];

                        for(int i=0;i<colNo;i++){
                           objects[i]=result.getObject(i+1);
                         }

                        aModel.addRow(objects);
                    }
                    tblModule.setModel(aModel);
                   } catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
            catch(Exception e){
               JOptionPane.showMessageDialog(null, e);
            } 
   
        
    }
     
     public void displayModules()
     {
         String query="select * from module";
         executeQuery(query);
     }
     public void setModuleID(String id)
     {
         moduleId = id;
     }
     public String getModuleID(){
         return moduleId;
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdoButtonGroup = new javax.swing.ButtonGroup();
        pnlContent = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblModuleYear = new javax.swing.JLabel();
        lblModuleName = new javax.swing.JLabel();
        txtModuleName = new javax.swing.JTextField();
        pwdModulePassword = new javax.swing.JPasswordField();
        pnlModuleDelete = new javax.swing.JPanel();
        btnModuleDelete = new javax.swing.JLabel();
        lblModulePassword1 = new javax.swing.JLabel();
        cmbSemester = new javax.swing.JComboBox<>();
        lblModuleYear1 = new javax.swing.JLabel();
        cmbYear = new javax.swing.JComboBox<>();
        pnlModuleUpdate = new javax.swing.JPanel();
        btnModuleUpdate = new javax.swing.JLabel();
        pnlModuleAdd = new javax.swing.JPanel();
        btnModuleAdd = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblModule = new javax.swing.JTable();
        pnlNavigation = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblHome = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lblContactUs = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        pnlModule = new javax.swing.JPanel();
        lblModules = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblAbout = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lblExamPasswordPanel = new javax.swing.JLabel();
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

        lblModuleYear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblModuleYear.setText("Semester");
        jPanel3.add(lblModuleYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        lblModuleName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblModuleName.setText("Name");
        jPanel3.add(lblModuleName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
        jPanel3.add(txtModuleName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 180, 30));
        jPanel3.add(pwdModulePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 180, -1));

        pnlModuleDelete.setBackground(new java.awt.Color(70, 102, 144));
        pnlModuleDelete.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlModuleDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlModuleDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlModuleDeleteMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlModuleDeleteMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlModuleDeleteMouseReleased(evt);
            }
        });

        btnModuleDelete.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        btnModuleDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnModuleDelete.setText("       DELETE");
        btnModuleDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModuleDeleteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlModuleDeleteLayout = new javax.swing.GroupLayout(pnlModuleDelete);
        pnlModuleDelete.setLayout(pnlModuleDeleteLayout);
        pnlModuleDeleteLayout.setHorizontalGroup(
            pnlModuleDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnModuleDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        );
        pnlModuleDeleteLayout.setVerticalGroup(
            pnlModuleDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModuleDeleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnModuleDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(pnlModuleDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 110, -1));

        lblModulePassword1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblModulePassword1.setText("Password");
        jPanel3.add(lblModulePassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        cmbSemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semester 1", "Semester 2", " " }));
        jPanel3.add(cmbSemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 130, 30));

        lblModuleYear1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblModuleYear1.setText("Year");
        jPanel3.add(lblModuleYear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        cmbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year 1", "Year 2", "Year 3", "Year 4" }));
        jPanel3.add(cmbYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 130, 30));

        pnlModuleUpdate.setBackground(new java.awt.Color(70, 102, 144));
        pnlModuleUpdate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlModuleUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlModuleUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlModuleUpdateMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlModuleUpdateMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlModuleUpdateMouseReleased(evt);
            }
        });

        btnModuleUpdate.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        btnModuleUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnModuleUpdate.setText("      UPDATE");
        btnModuleUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModuleUpdateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlModuleUpdateLayout = new javax.swing.GroupLayout(pnlModuleUpdate);
        pnlModuleUpdate.setLayout(pnlModuleUpdateLayout);
        pnlModuleUpdateLayout.setHorizontalGroup(
            pnlModuleUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnModuleUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        );
        pnlModuleUpdateLayout.setVerticalGroup(
            pnlModuleUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModuleUpdateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnModuleUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(pnlModuleUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        pnlModuleAdd.setBackground(new java.awt.Color(70, 102, 144));
        pnlModuleAdd.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlModuleAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlModuleAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlModuleAddMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlModuleAddMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlModuleAddMouseReleased(evt);
            }
        });

        btnModuleAdd.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        btnModuleAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnModuleAdd.setText("         ADD");
        btnModuleAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModuleAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlModuleAddLayout = new javax.swing.GroupLayout(pnlModuleAdd);
        pnlModuleAdd.setLayout(pnlModuleAddLayout);
        pnlModuleAddLayout.setHorizontalGroup(
            pnlModuleAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnModuleAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        );
        pnlModuleAddLayout.setVerticalGroup(
            pnlModuleAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModuleAddLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnModuleAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(pnlModuleAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 110, -1));

        tblModule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Module ID", "Name", "Password", "Allocated To"
            }
        ));
        tblModule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblModuleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblModule);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 390, 220));

        pnlContent.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 790, 370));

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
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

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

        pnlNavigation.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 130, 50));

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

        pnlModule.setBackground(new java.awt.Color(70, 102, 144));
        pnlModule.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlModule.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlModule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlModuleMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlModuleMouseReleased(evt);
            }
        });

        lblModules.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lblModules.setForeground(new java.awt.Color(255, 255, 255));
        lblModules.setText("Modules");
        lblModules.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblModules.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblModulesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlModuleLayout = new javax.swing.GroupLayout(pnlModule);
        pnlModule.setLayout(pnlModuleLayout);
        pnlModuleLayout.setHorizontalGroup(
            pnlModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModuleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblModules, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlModuleLayout.setVerticalGroup(
            pnlModuleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModuleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblModules, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlNavigation.add(pnlModule, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

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

        pnlNavigation.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, -1, -1));

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

        lblExamPasswordPanel.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lblExamPasswordPanel.setForeground(new java.awt.Color(255, 255, 255));
        lblExamPasswordPanel.setText("Exam Password");
        lblExamPasswordPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExamPasswordPanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblExamPasswordPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblExamPasswordPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlNavigation.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 130, 50));

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
        jLabel2.setText("Modules");

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

    private void btnModuleDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModuleDeleteMouseClicked
        // TODO add your handling code here:
        String moduleId = getModuleID();
        String query = "delete from sql12196110.module where moduleId='"+moduleId+"';";
        executeQuery(query);
    }//GEN-LAST:event_btnModuleDeleteMouseClicked

    private void pnlModuleDeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlModuleDeleteMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlModuleDeleteMousePressed

    private void pnlModuleDeleteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlModuleDeleteMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlModuleDeleteMouseReleased

    private void pnlModuleDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlModuleDeleteMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_pnlModuleDeleteMouseClicked

    private void lblModulesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModulesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblModulesMouseClicked

    private void pnlModuleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlModuleMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlModuleMousePressed

    private void pnlModuleMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlModuleMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlModuleMouseReleased

    private void btnModuleUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModuleUpdateMouseClicked
        // TODO add your handling code here:
        String moduleId = getModuleID();
        String moduleName = txtModuleName.getText();
        String password = pwdModulePassword.getText();
        String allocated = getAllocatedYearAndSemester();
        
        if(validateValues())
        {
            String query = "update sql12196110.module set moduleName ='"+moduleName+"',modulePassword='"+password+"',allocatedTo='"+allocated+"' where moduleId='"+moduleId+"';";
            executeQuery(query);
        }
        
    }//GEN-LAST:event_btnModuleUpdateMouseClicked

    private void pnlModuleUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlModuleUpdateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlModuleUpdateMouseClicked

    private void pnlModuleUpdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlModuleUpdateMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlModuleUpdateMousePressed

    private void pnlModuleUpdateMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlModuleUpdateMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlModuleUpdateMouseReleased

    private void btnModuleAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModuleAddMouseClicked
        String newID = getNewModuleId();
        String moduleName = txtModuleName.getText();
        String password = pwdModulePassword.getText();
        String allocated = getAllocatedYearAndSemester();
        
        if(validateValues())
        {
            String query = "Insert into module values('"+newID+"','"+moduleName+"','"+password+"','"+allocated+"')";
            executeQuery(query);
        }
    }//GEN-LAST:event_btnModuleAddMouseClicked

    private void pnlModuleAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlModuleAddMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlModuleAddMouseClicked

    private void pnlModuleAddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlModuleAddMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlModuleAddMousePressed

    private void pnlModuleAddMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlModuleAddMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlModuleAddMouseReleased

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        AddUser user = new AddUser();
        this.setVisible(false);
        user.setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void tblModuleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblModuleMouseClicked
        // TODO add your handling code here:
        int i = tblModule.getSelectedRow();
        TableModel model = tblModule.getModel();
        setModuleID(model.getValueAt(i, 0).toString());
        txtModuleName.setText(model.getValueAt(i, 1).toString());
        pwdModulePassword.setText(model.getValueAt(i, 2).toString());
       
    }//GEN-LAST:event_tblModuleMouseClicked

    private void lblExamPasswordPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExamPasswordPanelMouseClicked
        // TODO add your handling code here:
        SetExamPassword exam = new SetExamPassword();
        this.setVisible(false);
        exam.setVisible(true);
    }//GEN-LAST:event_lblExamPasswordPanelMouseClicked

    private void jPanel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel9MousePressed

    private void jPanel9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel9MouseReleased

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
            java.util.logging.Logger.getLogger(Modules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Modules().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnModuleAdd;
    private javax.swing.JLabel btnModuleDelete;
    private javax.swing.JLabel btnModuleUpdate;
    private javax.swing.JComboBox<String> cmbSemester;
    private javax.swing.JComboBox<String> cmbYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAbout;
    private javax.swing.JLabel lblContactUs;
    private javax.swing.JLabel lblExamPasswordPanel;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblModuleName;
    private javax.swing.JLabel lblModulePassword1;
    private javax.swing.JLabel lblModuleYear;
    private javax.swing.JLabel lblModuleYear1;
    private javax.swing.JLabel lblModules;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlModule;
    private javax.swing.JPanel pnlModuleAdd;
    private javax.swing.JPanel pnlModuleDelete;
    private javax.swing.JPanel pnlModuleUpdate;
    private javax.swing.JPanel pnlNavigation;
    private javax.swing.JPasswordField pwdModulePassword;
    private javax.swing.ButtonGroup rdoButtonGroup;
    private javax.swing.JTable tblModule;
    private javax.swing.JTextField txtModuleName;
    // End of variables declaration//GEN-END:variables
}