/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.studentsystem.view;

import static ec.edu.espe.studentsystem.controller.ActivityController.establishAssignation;
import static ec.edu.espe.studentsystem.controller.ActivityController.findAllActivities;
import static ec.edu.espe.studentsystem.controller.ClassroomController.readClassrooms;
import static ec.edu.espe.studentsystem.controller.TeacherController.createActivity;
import static ec.edu.espe.studentsystem.controller.TeacherController.findActivity;
import ec.edu.espe.studentsystem.controller.Theme;
import static ec.edu.espe.studentsystem.controller.Theme.setFlatLightLafTheme;
import ec.edu.espe.studentsystem.model.Activity;
import ec.edu.espe.studentsystem.model.Assignation;

import java.awt.EventQueue;
import java.awt.HeadlessException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class FrmActivitiesManagement extends javax.swing.JFrame {

    DefaultTableModel dtm = new DefaultTableModel();
    
    private final String classroomName;
    private final Document teacher;

    /**
     * Creates new form FrmAssignments
     *
     * @param classroomName
     * @param teacher
     */
    public FrmActivitiesManagement(String classroomName, Document teacher) {
        initComponents();
        addClassroomsToCmb();
        this.teacher = teacher;
        cmbClassrooms.setSelectedItem(classroomName);
        String selectedItem = (String) cmbClassrooms.getSelectedItem();
        if (!selectedItem.equals("ID")) {
            enableInputs(selectedItem);
        }
        this.classroomName = classroomName;
        
        String[] head = new String[]{"Name","Type","Shipping","Deadline"};
        dtm.setColumnIdentifiers(head);
        tblAssignments.setModel(dtm);
        
        DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
        Alinear.setHorizontalAlignment(SwingConstants.CENTER);
        tblAssignments.getColumnModel().getColumn(0).setCellRenderer(Alinear);
        
        showActivities(selectedItem);
    }

    final void showActivities(String selectedItem) {
        
        ArrayList<Activity> activities = findAllActivities(teacher.getInteger("id"),selectedItem);
        addToTable(activities);
    }

    void addToTable(ArrayList<Activity> activities) {
        dtm.setRowCount(0);
        for (Activity activity : activities) {
            dtm.addRow(new Object[]{activity.getName()
                    ,activity.getActivityType()
                    ,activity.getShipping()
                    ,activity.getDeadline()
            });
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

        pnlForm = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbClassroomName = new javax.swing.JLabel();
        pnlSearch = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        dtShipping = new com.toedter.calendar.JDateChooser();
        dtDeadline = new com.toedter.calendar.JDateChooser();
        btnFind = new javax.swing.JButton();
        btnNewAssignment = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAComment = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        cmbType = new javax.swing.JComboBox<>();
        btnChangeAct = new javax.swing.JButton();
        cmbClassrooms = new javax.swing.JComboBox<>();
        pnlTable = new javax.swing.JPanel();
        tblAssignmentsContainer = new javax.swing.JScrollPane();
        tblAssignments = new javax.swing.JTable();
        pnlActions = new javax.swing.JLayeredPane();
        jLabel7 = new javax.swing.JLabel();
        btnOpen = new javax.swing.JButton();
        txtAction = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnStudentSystem = new javax.swing.JMenu();
        mniAbout = new javax.swing.JMenuItem();
        mniLogOut = new javax.swing.JMenuItem();
        mnManage = new javax.swing.JMenu();
        menuView = new javax.swing.JMenu();
        cbmiDarkMode = new javax.swing.JCheckBoxMenuItem();
        menuHelp = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlForm.setFont(new java.awt.Font("Cascadia Code", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Cascadia Code", 1, 24)); // NOI18N
        jLabel1.setText("Activities");

        lbClassroomName.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        lbClassroomName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbClassroomName.setText("...");

        pnlSearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 1, true));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(jLabel3.getFont().deriveFont(jLabel3.getFont().getStyle() | java.awt.Font.BOLD));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Name");

        jLabel4.setText("Shipping");

        jLabel5.setText("Deadline");

        txtName.setEnabled(false);
        txtName.setName(""); // NOI18N
        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNameFocusGained(evt);
            }
        });

        dtShipping.setDateFormatString("dd-MM-yyyy");
        dtShipping.setEnabled(false);
        dtShipping.setOpaque(false);

        dtDeadline.setDateFormatString("dd-MM-yyyy");
        dtDeadline.setEnabled(false);
        dtDeadline.setFocusable(false);
        dtDeadline.setOpaque(false);

        btnFind.setFont(btnFind.getFont().deriveFont(btnFind.getFont().getStyle() & ~java.awt.Font.BOLD, btnFind.getFont().getSize()+2));
        btnFind.setForeground(new java.awt.Color(51, 51, 51));
        btnFind.setText("Find");
        btnFind.setEnabled(false);
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnNewAssignment.setText("New Assignment");
        btnNewAssignment.setEnabled(false);
        btnNewAssignment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewAssignmentActionPerformed(evt);
            }
        });

        jLabel6.setText("Comment");

        txtAComment.setColumns(20);
        txtAComment.setRows(5);
        txtAComment.setEnabled(false);
        jScrollPane2.setViewportView(txtAComment);

        jLabel2.setText("(Insert Name)");

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
        pnlSearch.setLayer(btnNewAssignment, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlSearch.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlSearch.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlSearch.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlSearch.setLayer(cmbType, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pnlSearchLayout = new javax.swing.GroupLayout(pnlSearch);
        pnlSearch.setLayout(pnlSearchLayout);
        pnlSearchLayout.setHorizontalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtName)
                    .addComponent(dtShipping, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(dtDeadline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSearchLayout.createSequentialGroup()
                        .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addGap(48, 48, 48)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSearchLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlSearchLayout.createSequentialGroup()
                        .addComponent(btnFind)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNewAssignment))
                    .addGroup(pnlSearchLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        pnlSearchLayout.setVerticalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSearchLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlSearchLayout.createSequentialGroup()
                        .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dtShipping, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dtDeadline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)))
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewAssignment, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFind))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlFormLayout = new javax.swing.GroupLayout(pnlForm);
        pnlForm.setLayout(pnlFormLayout);
        pnlFormLayout.setHorizontalGroup(
            pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbClassroomName, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210))
            .addGroup(pnlFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSearch)
                .addGap(32, 32, 32))
        );
        pnlFormLayout.setVerticalGroup(
            pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbClassroomName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pnlSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnChangeAct.setText("Change");
        btnChangeAct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeActMouseClicked(evt);
            }
        });
        btnChangeAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActActionPerformed(evt);
            }
        });

        cmbClassrooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClassroomsActionPerformed(evt);
            }
        });

        tblAssignments.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        tblAssignments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Shipping", "Deadine"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblAssignments.setOpaque(false);
        tblAssignmentsContainer.setViewportView(tblAssignments);

        pnlActions.setBorder(pnlSearch.getBorder());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Name");

        btnOpen.setBackground(new java.awt.Color(0, 255, 102));
        btnOpen.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnOpen.setForeground(new java.awt.Color(255, 255, 255));
        btnOpen.setText("Open");
        btnOpen.setEnabled(false);
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        txtAction.setEnabled(false);
        txtAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActionActionPerformed(evt);
            }
        });
        txtAction.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtActionKeyReleased(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 0, 51));
        btnDelete.setForeground(new java.awt.Color(255, 204, 204));
        btnDelete.setText("Delete");
        btnDelete.setEnabled(false);

        pnlActions.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlActions.setLayer(btnOpen, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlActions.setLayer(txtAction, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlActions.setLayer(btnDelete, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pnlActionsLayout = new javax.swing.GroupLayout(pnlActions);
        pnlActions.setLayout(pnlActionsLayout);
        pnlActionsLayout.setHorizontalGroup(
            pnlActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlActionsLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlActionsLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlActionsLayout.createSequentialGroup()
                        .addGroup(pnlActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAction)
                            .addGroup(pnlActionsLayout.createSequentialGroup()
                                .addComponent(btnOpen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(btnDelete)))
                        .addGap(16, 16, 16))))
        );
        pnlActionsLayout.setVerticalGroup(
            pnlActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlActionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOpen)
                    .addComponent(btnDelete))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlTableLayout = new javax.swing.GroupLayout(pnlTable);
        pnlTable.setLayout(pnlTableLayout);
        pnlTableLayout.setHorizontalGroup(
            pnlTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTableLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(pnlActions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tblAssignmentsContainer)
                .addContainerGap())
        );
        pnlTableLayout.setVerticalGroup(
            pnlTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTableLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tblAssignmentsContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
            .addGroup(pnlTableLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(pnlActions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnClean.setBackground(new java.awt.Color(204, 255, 255));
        btnClean.setText("Clean");
        btnClean.setEnabled(false);
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        mnStudentSystem.setText("StudentSystem");

        mniAbout.setText("About");
        mniAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAboutActionPerformed(evt);
            }
        });
        mnStudentSystem.add(mniAbout);

        mniLogOut.setText("Log Out");
        mnStudentSystem.add(mniLogOut);

        jMenuBar1.add(mnStudentSystem);

        mnManage.setText("Manage");
        jMenuBar1.add(mnManage);

        menuView.setText("View");

        cbmiDarkMode.setText("Dark Mode");
        cbmiDarkMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmiDarkModeActionPerformed(evt);
            }
        });
        menuView.add(cbmiDarkMode);

        jMenuBar1.add(menuView);

        menuHelp.setText("Help");
        jMenuBar1.add(menuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbClassrooms, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnChangeAct, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(pnlForm, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(btnClean)
                        .addGap(15, 15, 15))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbClassrooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnChangeAct))
                    .addComponent(btnClean, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        // TODO add your handling code here:
        String activityName = txtAction.getText();
        Document activityData = findActivity(activityName);

        if (activityData != null) {
            FrmActivity frmActivity = new FrmActivity(activityData, teacher);
            frmActivity.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "We can't find the activity inserted", "Activity insertion", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnOpenActionPerformed

    private void txtActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActionActionPerformed

    private void cmbClassroomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClassroomsActionPerformed
        // TODO add your handling code here:
        cmbClassrooms.getActionCommand();

    }//GEN-LAST:event_cmbClassroomsActionPerformed

    private void mniAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAboutActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_mniAboutActionPerformed

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

    private void btnChangeActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActActionPerformed
        // TODO add your handling code here:
        Date date = new Date();
        String selectedClassroom = (String) cmbClassrooms.getSelectedItem();
        emptyInputs(date);
        if ("Classrooms".equals(selectedClassroom)) {
            disableInputs();
        } else {
            enableInputs(selectedClassroom);
            showActivities(selectedClassroom);
        }
    }//GEN-LAST:event_btnChangeActActionPerformed

    public final void enableInputs(String selectedClassroom) {
        lbClassroomName.setText(selectedClassroom);
        txtName.setEnabled(true);
        cmbType.setEnabled(true);
        dtShipping.setEnabled(true);
        dtDeadline.setEnabled(true);
        txtAComment.setEnabled(true);
        btnFind.setEnabled(true);
        btnNewAssignment.setEnabled(true);
        btnClean.setEnabled(true);
        txtAction.setEnabled(true);
    }

    public void disableInputs() {
        lbClassroomName.setText("...");
        txtName.setEnabled(false);
        cmbType.setEnabled(false);
        dtShipping.setEnabled(false);
        dtDeadline.setEnabled(false);
        txtAComment.setEnabled(false);
        btnFind.setEnabled(false);
        btnNewAssignment.setEnabled(false);
        btnClean.setEnabled(false);
        txtAction.setEnabled(false);
    }

    private void emptyInputs(Date date) {
        txtName.setText("");
        dtShipping.setDate(date);
        dtDeadline.setDate(date);
        txtAComment.setText("");
        txtAction.setText("");
    }

    private void btnChangeActMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChangeActMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnChangeActMouseClicked

    private void txtActionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtActionKeyReleased
        // TODO add your handling code here:

        if (txtAction.getText() != null || !" ".equals(txtAction.getText())) {
            btnOpen.setEnabled(true);
            btnDelete.setEnabled(true);
        } else {
            btnOpen.setEnabled(false);
            btnDelete.setEnabled(false);
        }
    }//GEN-LAST:event_txtActionKeyReleased

    private void btnNewAssignmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewAssignmentActionPerformed
        // TODO add your handling code here:
        Activity activity;
        try {
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date shipping = dtShipping.getDate();
            Date deadline = dtDeadline.getDate();

            String shippingStr = dateFormat.format(shipping);
            String deadlineStr = dateFormat.format(deadline);

            ArrayList<Assignation> activityReport = establishAssignation((String) cmbClassrooms.getSelectedItem());
            String actName = (String) cmbClassrooms.getSelectedItem();
            String actType = (String) cmbType.getSelectedItem();
            int teacherId = teacher.getInteger("id");

            activity = new Activity(actName, teacherId, txtName.getText(), shippingStr, deadlineStr, txtAComment.getText(), actType, activityReport);
            System.out.println(activity.getActivityReport().get(0));
            createActivity(activity);
            JOptionPane.showMessageDialog(this, txtName.getText() + " activity added succesfully!", "Activity insertion", JOptionPane.INFORMATION_MESSAGE);
            showActivities((String) cmbClassrooms.getSelectedItem());
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "We can't find the activity inserted", txtName.getText() + " activity doesn't exist", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnNewAssignmentActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");

        String name = txtName.getText();
        Document activityData = findActivity(name);
        if (activityData != null) {
            try {
                Date shipping = formato.parse((String) activityData.get("shipping"));
                Date deadline = formato.parse((String) activityData.get("deadline"));
                txtName.setText(name);
                dtShipping.setDate(shipping);
                dtDeadline.setDate(deadline);
                txtAComment.setText((String) activityData.get("comment"));
                cmbType.setSelectedItem(activityData.get("activityType"));
            } catch (ParseException ex) {
                Logger.getLogger(FrmActivitiesManagement.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "We can't find the activity inserted", txtName.getText() + "Activity doesn't exist", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnFindActionPerformed

    private void txtNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameFocusGained

    private void cmbTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTypeActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        // TODO add your handling code here:
        showActivities((String) cmbClassrooms.getSelectedItem());
    }//GEN-LAST:event_btnCleanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        setFlatLightLafTheme();


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmActivitiesManagement("", null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangeAct;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnNewAssignment;
    private javax.swing.JButton btnOpen;
    private javax.swing.JCheckBoxMenuItem cbmiDarkMode;
    private javax.swing.JComboBox<String> cmbClassrooms;
    private javax.swing.JComboBox<String> cmbType;
    private com.toedter.calendar.JDateChooser dtDeadline;
    private com.toedter.calendar.JDateChooser dtShipping;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbClassroomName;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenu menuView;
    private javax.swing.JMenu mnManage;
    private javax.swing.JMenu mnStudentSystem;
    private javax.swing.JMenuItem mniAbout;
    private javax.swing.JMenuItem mniLogOut;
    private javax.swing.JLayeredPane pnlActions;
    private javax.swing.JPanel pnlForm;
    private javax.swing.JLayeredPane pnlSearch;
    private javax.swing.JPanel pnlTable;
    private javax.swing.JTable tblAssignments;
    private javax.swing.JScrollPane tblAssignmentsContainer;
    private javax.swing.JTextArea txtAComment;
    private javax.swing.JTextField txtAction;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    private void addClassroomsToCmb() {
        ArrayList<String> classrooms;
        classrooms = readClassrooms();
        cmbClassrooms.addItem("Classrooms");
        for (String classroom : classrooms) {
            cmbClassrooms.addItem(classroom);
        }
    }

    public boolean getStatusCbmiDarkMode() {
        return cbmiDarkMode.isSelected();
    }

    public void setStatusCbmiDarkMode(boolean isSelected) {
        this.cbmiDarkMode.setSelected(isSelected);
    }
}
