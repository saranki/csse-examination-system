/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csse.exam.main;

/**
 *
 * @author saranki
 */
import com.csse.exam.model.Question;
import com.csse.exam.model.User;
import com.csse.exam.service.ExamPaperService;
import com.csse.exam.service.ExamService;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class ExamPaper extends javax.swing.JFrame {

    /**
     * Creates new form ExamPaper
     */
    public HashMap<String, String> answerMap = new HashMap<String, String>();
    long startTime = System.currentTimeMillis();
    Calendar c = Calendar.getInstance();
    long elapsedTime = 0L;
    ExamService examService = new ExamService();

    ExamPaperService examPaperService = new ExamPaperService();

    private final ArrayList<Question> questionList = examPaperService.getQuestions();
    String questionId;
    String question;
    /* int x = 18;
    int y = 5;*/

    DefaultListModel listModel = new DefaultListModel();

    public ExamPaper() {

        initComponents();
        lblUser.setText(User.getName());
        lblTitleExamPaper.setText(AttemptExam.examinationCode);

        List<Question> questionsByExamId = examPaperService.getQuestionId(AttemptExam.examinationCode);
        questionsByExamId.forEach((result) -> {

            questionId = result.getQuestionId();
            question = result.getQuestion();
            answerMap.put(questionId, "NA");
            /*JButton button = new JButton();
                button.setLocation(x,y);
                button.setSize(60, 40);
                button.setText(questionId);
                button.setVisible(true);    
                
                //listQuestionNo.add(button);
                //System.out.println(question);
                //System.out.println(questionId);
                y = y+45;*/
            listModel.addElement(questionId);
        });
        listQuestionNo.setModel(listModel);

    }

    public void closeUi() {
        while (elapsedTime < 600000) {
            elapsedTime = (new Date()).getTime() - startTime;
            jLabel1.setText("00" + ":" + Long.toString((600000 - elapsedTime) / 60000) + ":" + Long.toString(((600000 - elapsedTime) % 60000) / 1000));
        }
        if (elapsedTime > 600000) {
            JOptionPane.showMessageDialog(null, "The given time has passed", "OK",
                    JOptionPane.INFORMATION_MESSAGE);
            examService.submitAnswers(AttemptExam.examinationCode, getAnswerSetValues());
            ExamModuleContent examModuleContent = new ExamModuleContent();
            examModuleContent.setVisible(true);
            this.dispose();
        }
    }

    private void recordAnswers() {
        if (buttonGroup1.getSelection()!= null) {
            answerMap.replace(listQuestionNo.getSelectedValue(), buttonGroup1.getSelection().getActionCommand());
        }

    }

    private void setSelected() {
        if ("NA".equals(answerMap.get(listQuestionNo.getSelectedValue()))) {
            buttonGroup1.clearSelection();
        } else if ("1".equals(answerMap.get(listQuestionNo.getSelectedValue()))) {
            rdbOption1.setSelected(true);

        } else if ("2".equals(answerMap.get(listQuestionNo.getSelectedValue()))) {
            rdbOption2.setSelected(true);
        } else if ("3".equals(answerMap.get(listQuestionNo.getSelectedValue()))) {
            rdbOption3.setSelected(true);
        } else if ("4".equals(answerMap.get(listQuestionNo.getSelectedValue()))) {
            rdbOption4.setSelected(true);
        } else if ("5".equals(answerMap.get(listQuestionNo.getSelectedValue()))) {
            rdbOption5.setSelected(true);
        }
    }

    private String getAnswerSetValues() {
        String answerSet = "";
        for (Map.Entry<String, String> map : answerMap.entrySet()) {
            answerSet = answerSet + map.getKey() + "-" + map.getValue() + ":";
        }
        return answerSet;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        pnlHeader = new javax.swing.JPanel();
        lblSystem = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        pnlTitle = new javax.swing.JPanel();
        lblTitleExamPaper = new javax.swing.JLabel();
        pnlContent = new javax.swing.JPanel();
        pnlQuestions = new javax.swing.JPanel();
        lblQuestion = new javax.swing.JLabel();
        lblQuestionId = new javax.swing.JLabel();
        rdbOption1 = new javax.swing.JRadioButton();
        rdbOption2 = new javax.swing.JRadioButton();
        rdbOption3 = new javax.swing.JRadioButton();
        rdbOption4 = new javax.swing.JRadioButton();
        rdbOption5 = new javax.swing.JRadioButton();
        lblQuestion1 = new javax.swing.JLabel();
        lblExamQuestionId = new javax.swing.JLabel();
        lblExamQuestion = new javax.swing.JLabel();
        lblOption5 = new javax.swing.JLabel();
        lblOption1 = new javax.swing.JLabel();
        lblOption2 = new javax.swing.JLabel();
        lblOption3 = new javax.swing.JLabel();
        lblOption4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listQuestionNo = new javax.swing.JList<>();
        pnlResult1 = new javax.swing.JPanel();
        lblResult1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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
                .addComponent(lblDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(lblCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(lblExam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(lblResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });
        pnlHeader.add(lblLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, -1, 20));

        pnlTitle.setBackground(new java.awt.Color(70, 102, 144));

        lblTitleExamPaper.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitleExamPaper.setForeground(new java.awt.Color(255, 255, 255));
        lblTitleExamPaper.setText("Examination");

        javax.swing.GroupLayout pnlTitleLayout = new javax.swing.GroupLayout(pnlTitle);
        pnlTitle.setLayout(pnlTitleLayout);
        pnlTitleLayout.setHorizontalGroup(
            pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTitleLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTitleExamPaper, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        pnlTitleLayout.setVerticalGroup(
            pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitleExamPaper, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnlHeader.add(pnlTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 830, 40));

        getContentPane().add(pnlHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 830, 100));

        pnlContent.setBackground(new java.awt.Color(204, 217, 233));
        pnlContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlQuestions.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblQuestion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblQuestion.setText("OPTIONS :");
        pnlQuestions.add(lblQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 80, 20));

        lblQuestionId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblQuestionId.setText("QUESTION NO :");
        pnlQuestions.add(lblQuestionId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        buttonGroup1.add(rdbOption1);
        rdbOption1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdbOption1.setText("a.");
        rdbOption1.setActionCommand("1");
        rdbOption1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdbOption1ItemStateChanged(evt);
            }
        });
        pnlQuestions.add(rdbOption1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        buttonGroup1.add(rdbOption2);
        rdbOption2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdbOption2.setText("b.");
        rdbOption2.setActionCommand("2");
        rdbOption2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdbOption2ItemStateChanged(evt);
            }
        });
        pnlQuestions.add(rdbOption2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        buttonGroup1.add(rdbOption3);
        rdbOption3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdbOption3.setText("c.");
        rdbOption3.setActionCommand("3");
        rdbOption3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdbOption3ItemStateChanged(evt);
            }
        });
        pnlQuestions.add(rdbOption3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        buttonGroup1.add(rdbOption4);
        rdbOption4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdbOption4.setText("d.");
        rdbOption4.setActionCommand("4");
        rdbOption4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdbOption4ItemStateChanged(evt);
            }
        });
        pnlQuestions.add(rdbOption4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        buttonGroup1.add(rdbOption5);
        rdbOption5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdbOption5.setText("e.");
        rdbOption5.setActionCommand("5");
        rdbOption5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdbOption5ItemStateChanged(evt);
            }
        });
        pnlQuestions.add(rdbOption5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        lblQuestion1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblQuestion1.setText("QUESTION : ");
        pnlQuestions.add(lblQuestion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 90, 30));

        lblExamQuestionId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblExamQuestionId.setText(" ");
        pnlQuestions.add(lblExamQuestionId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 150, 30));

        lblExamQuestion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblExamQuestion.setText(" ");
        pnlQuestions.add(lblExamQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 540, 30));

        lblOption5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblOption5.setText(" ");
        pnlQuestions.add(lblOption5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 330, 30));

        lblOption1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblOption1.setText(" ");
        pnlQuestions.add(lblOption1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 330, 30));

        lblOption2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblOption2.setText(" ");
        pnlQuestions.add(lblOption2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 330, 30));

        lblOption3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblOption3.setText(" ");
        pnlQuestions.add(lblOption3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 330, 30));

        lblOption4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblOption4.setText(" ");
        pnlQuestions.add(lblOption4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 330, 30));

        pnlContent.add(pnlQuestions, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 680, 410));

        listQuestionNo.setBackground(new java.awt.Color(204, 204, 255));
        listQuestionNo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        listQuestionNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listQuestionNoMouseClicked(evt);
            }
        });
        listQuestionNo.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listQuestionNoValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listQuestionNo);

        pnlContent.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 480));

        pnlResult1.setBackground(new java.awt.Color(70, 102, 144));
        pnlResult1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlResult1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlResult1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlResult1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlResult1MouseReleased(evt);
            }
        });

        lblResult1.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lblResult1.setForeground(new java.awt.Color(255, 255, 255));
        lblResult1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResult1.setText("Finish Attempt");
        lblResult1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblResult1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblResult1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlResult1Layout = new javax.swing.GroupLayout(pnlResult1);
        pnlResult1.setLayout(pnlResult1Layout);
        pnlResult1Layout.setHorizontalGroup(
            pnlResult1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblResult1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
        );
        pnlResult1Layout.setVerticalGroup(
            pnlResult1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblResult1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        pnlContent.add(pnlResult1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, 250, 50));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText(" ");
        pnlContent.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 440, 120, 30));

        getContentPane().add(pnlContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 830, 520));

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

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        // TODO add your handling code here:
        User.logout();
        Login login = new Login();
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void listQuestionNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listQuestionNoMouseClicked
        // TODO add your handling code here:
        System.out.println("clicked");
        String selectedQuestionId = listQuestionNo.getSelectedValue();
        List<Question> questionsByUniqueId = examPaperService.getQuestion(AttemptExam.examinationCode, selectedQuestionId);
        questionsByUniqueId.forEach((result) -> {
            lblExamQuestionId.setText(result.getQuestionId());
            lblExamQuestion.setText(result.getQuestion());
            String options = result.getOptions();
            System.out.println(options);

            String option1 = options.split(":")[0].split("-")[1];
            String option2 = options.split(":")[1].split("-")[1];
            String option3 = options.split(":")[2].split("-")[1];
            String option4 = options.split(":")[3].split("-")[1];
            String option5 = options.split(":")[4].split("-")[1];

            lblOption1.setText(option1);
            lblOption2.setText(option2);
            lblOption3.setText(option3);
            lblOption4.setText(option4);
            lblOption5.setText(option5);
        });
    }//GEN-LAST:event_listQuestionNoMouseClicked

    private void listQuestionNoValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listQuestionNoValueChanged
        setSelected();

    }//GEN-LAST:event_listQuestionNoValueChanged

    private void pnlResult1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlResult1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlResult1MousePressed

    private void pnlResult1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlResult1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlResult1MouseReleased

    private void rdbOption1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdbOption1ItemStateChanged
        recordAnswers();
    }//GEN-LAST:event_rdbOption1ItemStateChanged

    private void rdbOption2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdbOption2ItemStateChanged
        recordAnswers();
    }//GEN-LAST:event_rdbOption2ItemStateChanged

    private void rdbOption3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdbOption3ItemStateChanged
        recordAnswers();
    }//GEN-LAST:event_rdbOption3ItemStateChanged

    private void rdbOption4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdbOption4ItemStateChanged
        recordAnswers();
    }//GEN-LAST:event_rdbOption4ItemStateChanged

    private void rdbOption5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdbOption5ItemStateChanged
        recordAnswers();
    }//GEN-LAST:event_rdbOption5ItemStateChanged

    private void lblResult1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblResult1MouseClicked
        int input = JOptionPane.showConfirmDialog(null,
                "Do you want to proceed?", "Select an Option...", JOptionPane.YES_NO_CANCEL_OPTION);
        if (input == 0) {
            examService.submitAnswers(AttemptExam.examinationCode, getAnswerSetValues());
            ExamModuleContent examModuleContent = new ExamModuleContent();
            examModuleContent.setVisible(true);
            this.dispose();
        }


    }//GEN-LAST:event_lblResult1MouseClicked

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
            java.util.logging.Logger.getLogger(ExamPaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExamPaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExamPaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExamPaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExamPaper().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCourse;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JLabel lblExam;
    private javax.swing.JLabel lblExamQuestion;
    private javax.swing.JLabel lblExamQuestionId;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblOption1;
    private javax.swing.JLabel lblOption2;
    private javax.swing.JLabel lblOption3;
    private javax.swing.JLabel lblOption4;
    private javax.swing.JLabel lblOption5;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JLabel lblQuestion1;
    private javax.swing.JLabel lblQuestionId;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblResult1;
    private javax.swing.JLabel lblSystem;
    public javax.swing.JLabel lblTitleExamPaper;
    private javax.swing.JLabel lblUser;
    private javax.swing.JList<String> listQuestionNo;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlCourse;
    private javax.swing.JPanel pnlDashboard;
    private javax.swing.JPanel pnlExam;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlLogo;
    private javax.swing.JPanel pnlNavigation;
    private javax.swing.JPanel pnlQuestions;
    private javax.swing.JPanel pnlResult;
    private javax.swing.JPanel pnlResult1;
    private javax.swing.JPanel pnlTitle;
    private javax.swing.JRadioButton rdbOption1;
    private javax.swing.JRadioButton rdbOption2;
    private javax.swing.JRadioButton rdbOption3;
    private javax.swing.JRadioButton rdbOption4;
    private javax.swing.JRadioButton rdbOption5;
    // End of variables declaration//GEN-END:variables
}
