/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.studentsystem.view;

import com.google.gson.Gson;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import static ec.edu.espe.studentsystem.controller.ActivityController.findAllActivities;
import static ec.edu.espe.studentsystem.controller.ClassroomController.findTeacher;
import static ec.edu.espe.studentsystem.controller.MongoConection.getConnection;
import ec.edu.espe.studentsystem.controller.Theme;
import static ec.edu.espe.studentsystem.controller.Theme.setFlatLightLafTheme;
import ec.edu.espe.studentsystem.model.Activity;
import ec.edu.espe.studentsystem.model.Assignation;
import java.awt.EventQueue;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class FrmActivity extends javax.swing.JFrame {

    DefaultTableModel dtm = new DefaultTableModel();

    private final Document activityData;
    private final Document teacher;

    /**
     * Creates new form FrmActivity
     *
     * @param activityData
     * @param teacher
     */
    public FrmActivity(Document activityData, Document teacher) {
        initComponents();
        this.activityData = activityData;
        this.teacher = teacher;
        txtActivityName.setText((String) activityData.get("name"));
        fillInputs();

        String[] head = new String[]{"ID", "Name", "Grade"};
        dtm.setColumnIdentifiers(head);
        tblStudentsAct.setModel(dtm);

        DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
        Alinear.setHorizontalAlignment(SwingConstants.CENTER);
        tblStudentsAct.getColumnModel().getColumn(0).setCellRenderer(Alinear);

        showActivities();
    }

    public final void fillInputs() {
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date shipping;
        try {
            shipping = formato.parse((String) activityData.get("shipping"));
            Date deadline = formato.parse((String) activityData.get("deadline"));
            txtName.setText((String) activityData.get("name"));
            dtShipping.setDate(shipping);
            dtDeadline.setDate(deadline);
            txtAComment.setText((String) activityData.get("comment"));
            cmbType.setSelectedItem(activityData.get("activityType"));

        } catch (ParseException ex) {
            Logger.getLogger(FrmActivity.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    final void showActivities() {

        ArrayList<Document> assignations = (ArrayList<Document>) activityData.get("activityReport");

        addToTable(assignations);
    }

    void addToTable(ArrayList<Document> assignations) {
        dtm.setRowCount(0);
        MongoCollection studentsCollection = getConnection("students");
        String studentName;
        for (Document assignation : assignations) {

            Bson filter = Filters.and(Filters.eq("id", (int) assignation.get("studentId")));
            Document studentData = (Document) studentsCollection.find(filter).first();
            if (studentData != null) {
                studentName = (String) studentData.get("name");
                dtm.addRow(new Object[]{assignation.get("studentId"),
                    studentName,
                    assignation.get("grade")
                });
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtActivityName = new javax.swing.JLabel();
        pnlSearch = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        dtShipping = new com.toedter.calendar.JDateChooser();
        dtDeadline = new com.toedter.calendar.JDateChooser();
        btnFind = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAComment = new javax.swing.JTextArea();
        cmbType = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudentsAct = new javax.swing.JTable();
        bthBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnStudentSystem = new javax.swing.JMenu();
        mniAbout = new javax.swing.JMenuItem();
        mniLogOut = new javax.swing.JMenuItem();
        menuView = new javax.swing.JMenu();
        cbmiDarkMode = new javax.swing.JCheckBoxMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mnItmClassrooms = new javax.swing.JMenuItem();
        mnItmStudents = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtActivityName.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        txtActivityName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtActivityName.setText("...");

        pnlSearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 1, true));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(jLabel3.getFont().deriveFont(jLabel3.getFont().getStyle() | java.awt.Font.BOLD));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Name");

        jLabel4.setText("Shipping");

        jLabel5.setText("Deadline");

        txtName.setName(""); // NOI18N
        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNameFocusGained(evt);
            }
        });
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        dtShipping.setDateFormatString("dd-MM-yyyy");
        dtShipping.setOpaque(false);

        dtDeadline.setDateFormatString("dd-MM-yyyy");
        dtDeadline.setFocusable(false);
        dtDeadline.setOpaque(false);

        btnFind.setFont(btnFind.getFont().deriveFont(btnFind.getFont().getStyle() & ~java.awt.Font.BOLD, btnFind.getFont().getSize()+2));
        btnFind.setForeground(new java.awt.Color(51, 51, 51));
        btnFind.setText("Update");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        jLabel6.setText("Comment");

        txtAComment.setColumns(20);
        txtAComment.setRows(5);
        jScrollPane2.setViewportView(txtAComment);

        cmbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Homework", "Exam", "Workshop" }));
        cmbType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTypeActionPerformed(evt);
            }
        });

        pnlSearch.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlSearch.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlSearch.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlSearch.setLayer(txtName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlSearch.setLayer(dtShipping, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlSearch.setLayer(dtDeadline, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlSearch.setLayer(btnFind, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlSearch.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlSearch.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlSearch.setLayer(cmbType, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pnlSearchLayout = new javax.swing.GroupLayout(pnlSearch);
        pnlSearch.setLayout(pnlSearchLayout);
        pnlSearchLayout.setHorizontalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSearchLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSearchLayout.createSequentialGroup()
                        .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174)
                        .addComponent(btnFind))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSearchLayout.createSequentialGroup()
                        .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dtDeadline, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtName)
                            .addComponent(dtShipping, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14))
        );
        pnlSearchLayout.setVerticalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtName)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dtShipping, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dtDeadline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbType))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        tblStudentsAct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblStudentsAct);

        bthBack.setText("Back");
        bthBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthBackActionPerformed(evt);
            }
        });

        jPanel1.setBorder(pnlSearch.getBorder());

        jLabel1.setText("ID:");

        jTextField1.setText("jTextField1");

        jLabel2.setText("Grade");

        jTextField2.setText("jTextField2");

        jButton1.setText("Save");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Edit Grades");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(55, 55, 55))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton1)))
                .addGap(20, 20, 20))
        );

        mnStudentSystem.setText("StudentSystem");

        mniAbout.setText("About");
        mniAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAboutActionPerformed(evt);
            }
        });
        mnStudentSystem.add(mniAbout);

        mniLogOut.setText("Log Out");
        mniLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLogOutActionPerformed(evt);
            }
        });
        mnStudentSystem.add(mniLogOut);

        jMenuBar1.add(mnStudentSystem);

        menuView.setText("View");

        cbmiDarkMode.setText("Dark Mode");
        cbmiDarkMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmiDarkModeActionPerformed(evt);
            }
        });
        menuView.add(cbmiDarkMode);

        jMenuBar1.add(menuView);

        jMenu1.setText("Management");

        mnItmClassrooms.setText("Classrooms");
        mnItmClassrooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItmClassroomsActionPerformed(evt);
            }
        });
        jMenu1.add(mnItmClassrooms);

        mnItmStudents.setText("Students");
        mnItmStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItmStudentsActionPerformed(evt);
            }
        });
        jMenu1.add(mnItmStudents);

        jMenuBar1.add(jMenu1);

        menuHelp.setText("Help");

        jMenuItem1.setText("Mail");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuHelp.add(jMenuItem1);

        jMenuBar1.add(menuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(bthBack))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pnlSearch)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtActivityName, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bthBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtActivityName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameFocusGained

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();

    }//GEN-LAST:event_btnFindActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
        /*Document student = findDataStudent();
        txtName.setText();
        dtShipping.setDate(date);
        dtDeadline.setDate(date);*/
    }//GEN-LAST:event_txtNameActionPerformed

    private void cmbTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTypeActionPerformed

    private void bthBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthBackActionPerformed
        // TODO add your handling code here:
        Document teacherData = findTeacher((int)teacher.get("id"));
        FrmActivitiesManagement activitiesManagement = new FrmActivitiesManagement((String) activityData.get("subjectName"),teacherData);
        activitiesManagement.setVisible(true);
        if("FlatLaf Light".equals(UIManager.getLookAndFeel().getName())){
            activitiesManagement.setStatusCbmiDarkMode(false);
        }else{
            activitiesManagement.setStatusCbmiDarkMode(true);
        }
        this.dispose();
    }//GEN-LAST:event_bthBackActionPerformed

    private void mniAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAboutActionPerformed
        // TODO add your handling code here:
        FrmAboutUs aboutUs = new FrmAboutUs();
        aboutUs.setVisible(true);
        if ("FlatLaf Light".equals(UIManager.getLookAndFeel().getName())) {
            aboutUs.setStatusCbmiDarkMode(false);
        } else {
            aboutUs.setStatusCbmiDarkMode(true);
        }
        this.dispose();
    }//GEN-LAST:event_mniAboutActionPerformed

    private void mniLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLogOutActionPerformed
        // TODO add your handling code here:
        FrmMain main = new FrmMain();
        main.setVisible(true);
        if ("FlatLaf Light".equals(UIManager.getLookAndFeel().getName())) {
            main.setStatusCbmiDarkMode(false);
        } else {
            main.setStatusCbmiDarkMode(true);
        }
        this.dispose();
    }//GEN-LAST:event_mniLogOutActionPerformed

    private void cbmiDarkModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmiDarkModeActionPerformed
        if (cbmiDarkMode.isSelected()) {
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    Theme.setDarkTheme();
                }
            });
        } else {
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    Theme.setFlatLightLafTheme();
                }
            });
        }
    }//GEN-LAST:event_cbmiDarkModeActionPerformed

    private void mnItmClassroomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItmClassroomsActionPerformed
        // TODO add your handling code here:
        Document teacherId = findTeacher((int)teacher.get("id"));
        FrmClassroomManagement classroomManagement = new FrmClassroomManagement(teacherId);
        classroomManagement.setVisible(true);
        if("FlatLaf Light".equals(UIManager.getLookAndFeel().getName())){
            classroomManagement.setStatusCbmiDarkMode(false);
        }else{
            classroomManagement.setStatusCbmiDarkMode(true);
        }
        this.dispose();
    }//GEN-LAST:event_mnItmClassroomsActionPerformed

    private void mnItmStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItmStudentsActionPerformed
        // TODO add your handling code here:
        FrmStudentManagement studentManagement = new FrmStudentManagement();
        studentManagement.setVisible(true);
        if("FlatLaf Light".equals(UIManager.getLookAndFeel().getName())){
            studentManagement.setStatusCbmiDarkMode(false);
        }else{
            studentManagement.setStatusCbmiDarkMode(true);
        }
        this.dispose();
    }//GEN-LAST:event_mnItmStudentsActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        FrmHelp newHelp = new FrmHelp();
        newHelp.setVisible(true);
        if("FlatLaf Light".equals(UIManager.getLookAndFeel().getName())){
            newHelp.setStatusCbmiDarkMode(false);
        }else{
            newHelp.setStatusCbmiDarkMode(true);
        }
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        setFlatLightLafTheme();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmActivity(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bthBack;
    private javax.swing.JButton btnFind;
    private javax.swing.JCheckBoxMenuItem cbmiDarkMode;
    private javax.swing.JComboBox<String> cmbType;
    private com.toedter.calendar.JDateChooser dtDeadline;
    private com.toedter.calendar.JDateChooser dtShipping;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenu menuView;
    private javax.swing.JMenuItem mnItmClassrooms;
    private javax.swing.JMenuItem mnItmStudents;
    private javax.swing.JMenu mnStudentSystem;
    private javax.swing.JMenuItem mniAbout;
    private javax.swing.JMenuItem mniLogOut;
    private javax.swing.JLayeredPane pnlSearch;
    private javax.swing.JTable tblStudentsAct;
    private javax.swing.JTextArea txtAComment;
    private javax.swing.JLabel txtActivityName;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    public boolean getStatusCbmiDarkMode() {
        return cbmiDarkMode.isSelected();
    }

    public void setStatusCbmiDarkMode(boolean isSelected) {
        this.cbmiDarkMode.setSelected(isSelected);
    }

}
