package ec.edu.espe.studentsystem.view;

import static ec.edu.espe.studentsystem.controller.ClassroomController.readClassrooms;
import ec.edu.espe.studentsystem.controller.StudentController;
import ec.edu.espe.studentsystem.controller.ThemeController;
import ec.edu.espe.studentsystem.model.Student;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class FrmStudentManagement extends javax.swing.JFrame {

    final int teacherId;
    DefaultTableModel model;

    /**
     * Creates new form FrmStudentManagement
     *
     * @param teacherId
     */
    public FrmStudentManagement(int teacherId) {
        this.teacherId = teacherId;
        initComponents();
        fillCmbClassrooms();
        model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Password");
        model.addColumn("Name");
        model.addColumn("Mail");
        model.addColumn("Date of Birth");
        this.jTable1.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfPassword = new javax.swing.JTextField();
        tfMail = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        dataChooser = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cmbClassrooms = new javax.swing.JComboBox<>();
        btnAssing = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        labelId = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnStudentSystem = new javax.swing.JMenu();
        mniAbout = new javax.swing.JMenuItem();
        mniLogOut = new javax.swing.JMenuItem();
        mnManage = new javax.swing.JMenu();
        miClassrooms = new javax.swing.JMenuItem();
        menuView = new javax.swing.JMenu();
        cbmiDarkMode = new javax.swing.JCheckBoxMenuItem();
        menuHelp = new javax.swing.JMenu();
        mnMail = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Students Management");

        jLabel2.setText("Name:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setText("Password:");

        jLabel4.setText("Mail:");

        jLabel5.setText("Date of Birth:");

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnUpdate)
                    .addComponent(btnNew))
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFind)
                    .addComponent(btnDelete))
                .addGap(53, 53, 53))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew)
                    .addComponent(btnFind))
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        dataChooser.setDateFormatString("dd-MM-yyyy");

        jLabel6.setText("ID:");

        btnClear.setText("Clear");
        btnClear.setEnabled(false);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        cmbClassrooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClassroomsActionPerformed(evt);
            }
        });

        btnAssing.setText("Assign");
        btnAssing.setEnabled(false);

        jLabel7.setText("ID:");

        jLabel9.setText("assign to");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelId, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnAssing)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbClassrooms, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbClassrooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(labelId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(btnAssing)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfMail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                            .addComponent(tfId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClear)
                        .addGap(253, 253, 253))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 13, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(dataChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnClear)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(29, 29, 29))
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

        mnManage.setText("Manage");

        miClassrooms.setText("Classrooms");
        miClassrooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClassroomsActionPerformed(evt);
            }
        });
        mnManage.add(miClassrooms);

        jMenuBar1.add(mnManage);

        menuView.setText("View");
        menuView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuViewActionPerformed(evt);
            }
        });

        cbmiDarkMode.setText("Dark Mode");
        cbmiDarkMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmiDarkModeActionPerformed(evt);
            }
        });
        menuView.add(cbmiDarkMode);

        jMenuBar1.add(menuView);

        menuHelp.setText("Help");
        menuHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHelpActionPerformed(evt);
            }
        });

        mnMail.setText("Mail");
        mnMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnMailActionPerformed(evt);
            }
        });
        menuHelp.add(mnMail);

        jMenuBar1.add(menuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mniAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAboutActionPerformed
        FrmAboutUs aboutUs = new FrmAboutUs();
        aboutUs.setVisible(true);
        if ("FlatLaf Light".equals(UIManager.getLookAndFeel().getName()))
        {
            aboutUs.setStatusCbmiDarkMode(false);
        } else
        {
            aboutUs.setStatusCbmiDarkMode(true);
        }
        this.dispose();
    }//GEN-LAST:event_mniAboutActionPerformed

    private void cbmiDarkModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmiDarkModeActionPerformed
        if (cbmiDarkMode.isSelected())
        {
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    ThemeController.setDarkTheme();
                }
            });
        } else
        {
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    ThemeController.setFlatLightLafTheme();
                }
            });
        }
    }//GEN-LAST:event_cbmiDarkModeActionPerformed

    private void mnMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnMailActionPerformed
        FrmHelp newHelp = new FrmHelp();
        newHelp.setVisible(true);
        if ("FlatLaf Light".equals(UIManager.getLookAndFeel().getName()))
        {
            newHelp.setStatusCbmiDarkMode(false);
        } else
        {
            newHelp.setStatusCbmiDarkMode(true);
        }
        this.dispose();
    }//GEN-LAST:event_mnMailActionPerformed

    private void menuHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHelpActionPerformed
        FrmHelp newHelp = new FrmHelp();
        newHelp.setVisible(true);
        if ("FlatLaf Light".equals(UIManager.getLookAndFeel().getName()))
        {
            newHelp.setStatusCbmiDarkMode(false);
        } else
        {
            newHelp.setStatusCbmiDarkMode(true);
        }
        this.dispose();
    }//GEN-LAST:event_menuHelpActionPerformed

    private void mniLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLogOutActionPerformed
        FrmMain main = new FrmMain();
        main.setVisible(true);
        if ("FlatLaf Light".equals(UIManager.getLookAndFeel().getName()))
        {
            main.setStatusCbmiDarkMode(false);
        } else
        {
            main.setStatusCbmiDarkMode(true);
        }
        this.dispose();
    }//GEN-LAST:event_mniLogOutActionPerformed

    private void menuViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuViewActionPerformed
        if (cbmiDarkMode.isSelected())
        {
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    ThemeController.setDarkTheme();
                }
            });
        } else
        {
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    ThemeController.setFlatLightLafTheme();
                }
            });
        }
    }//GEN-LAST:event_menuViewActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date birtOfDate = dataChooser.getDate();
        String date = dateFormat.format(birtOfDate);
        int id = StudentController.generateRandomId();
        StudentController.addToStudentsCollection(id, tfName.getText(), tfPassword.getText(), tfMail.getText(), date);
        StudentController.addToSubjectsCollection(id);
        addToTableBtnNew(id);
        emptySpaces();
        btnClear.setEnabled(true);
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed

        boolean validation = false;
        if (tfId.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Id field is empty");
            validation = false;
        } else
        {
            validation = true;
        }
        if (validation)
        {
            int id = Integer.parseInt(tfId.getText());
            Student student = StudentController.find(id);

            if (student.getId() != 0)
            {
                String name = student.getName();
                String password = student.getPassword();
                String mail = student.getEmail();
                String dateOfBirth = student.getDateOfBirth();
                addToTable(id, name, password, mail, dateOfBirth);
                tfName.setText(name);
                tfPassword.setText(password);
                tfMail.setText(mail);
                labelId.setText(String.valueOf(id));
                SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
                Date birtOfDate;
                try
                {
                    birtOfDate = format.parse(student.getDateOfBirth());
                    dataChooser.setDate(birtOfDate);
                } catch (ParseException ex)
                {
                    Logger.getLogger(FrmStudentManagement.class.getName()).log(Level.SEVERE, null, ex);
                }
                btnAssing.setEnabled(true);
                btnClear.setEnabled(true);
                btnDelete.setEnabled(true);
                btnUpdate.setEnabled(true);
            }

            if (student.getId() == 0)
            {
                JOptionPane.showMessageDialog(this, "Data not found");
                emptySpaces();
            }
        }
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int id = Integer.parseInt(tfId.getText());
        StudentController.deleteStudent(id);
        JOptionPane.showMessageDialog(this, "The student " + id + " has been eliminated");
        int lastRow = model.getRowCount() - 1;
        model.removeRow(lastRow);
        emptySpaces();
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnAssing.setEnabled(false);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        model.setNumRows(0);
        btnClear.setEnabled(false);
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
        emptySpaces();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int id = Integer.parseInt(tfId.getText());
        String name = tfName.getText();
        String email = tfMail.getText();
        String password = tfPassword.getText();
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date birtOfDate = dataChooser.getDate();
        String date = dateFormat.format(birtOfDate);
        Student student = new Student(date, id, name, password, email);
        StudentController.updateStudent(student);
        JOptionPane.showMessageDialog(this, "The student " + id + " has been updated");
        int lastRow = model.getRowCount() - 1;
        model.removeRow(lastRow);
        addToTable(id, student.getName(), student.getPassword(), student.getEmail(), student.getDateOfBirth());
        emptySpaces();
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void miClassroomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miClassroomsActionPerformed
        FrmClassroomManagement classrooms = new FrmClassroomManagement(teacherId);
        classrooms.setVisible(true);
        if ("FlatLaf Light".equals(UIManager.getLookAndFeel().getName()))
        {
            classrooms.setStatusCbmiDarkMode(false);
        } else
        {
            classrooms.setStatusCbmiDarkMode(true);
        }
        this.dispose();
    }//GEN-LAST:event_miClassroomsActionPerformed

    private void cmbClassroomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClassroomsActionPerformed
        cmbClassrooms.getActionCommand();
    }//GEN-LAST:event_cmbClassroomsActionPerformed

    private void addToTable(int id, String name, String password, String mail, String dateOfBirth) {
        String[] info = new String[5];
        info[0] = String.valueOf(id);
        info[1] = password;
        info[2] = name;
        info[3] = mail;
        info[4] = dateOfBirth;
        model.addRow(info);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ThemeController.setFlatLightLafTheme();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmStudentManagement(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssing;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBoxMenuItem cbmiDarkMode;
    private javax.swing.JComboBox<String> cmbClassrooms;
    private com.toedter.calendar.JDateChooser dataChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelId;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenu menuView;
    private javax.swing.JMenuItem miClassrooms;
    private javax.swing.JMenuItem mnMail;
    private javax.swing.JMenu mnManage;
    private javax.swing.JMenu mnStudentSystem;
    private javax.swing.JMenuItem mniAbout;
    private javax.swing.JMenuItem mniLogOut;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfMail;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPassword;
    // End of variables declaration//GEN-END:variables

    public boolean getStatusCbmiDarkMode() {
        return cbmiDarkMode.isSelected();
    }

    public void setStatusCbmiDarkMode(boolean isSelected) {
        this.cbmiDarkMode.setSelected(isSelected);
    }

    private void addToTableBtnNew(int id) {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date birtOfDate = dataChooser.getDate();
        String date = dateFormat.format(birtOfDate);
        String[] info = new String[5];
        info[0] = String.valueOf(id);
        info[1] = tfPassword.getText();
        info[2] = tfName.getText();
        info[3] = tfMail.getText();
        info[4] = date;
        model.addRow(info);
    }

    private void emptySpaces() {
        tfId.setText("");
        tfName.setText("");
        tfPassword.setText("");
        tfMail.setText("");
        Date date = new Date();
        dataChooser.setDate(date);
    }

    private void fillCmbClassrooms() {

        ArrayList<String> classrooms;
        classrooms = readClassrooms(teacherId);
        System.out.println(teacherId);
        if (classrooms != null)
        {
            cmbClassrooms.addItem("Classrooms");
            for (String classroom : classrooms)
            {
                cmbClassrooms.addItem(classroom);
            }
        }
    }

}
