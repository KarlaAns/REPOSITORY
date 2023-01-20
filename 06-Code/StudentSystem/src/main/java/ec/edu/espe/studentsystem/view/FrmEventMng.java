package ec.edu.espe.studentsystem.view;

import com.formdev.flatlaf.FlatLightLaf;
import ec.edu.espe.studentsystem.controller.ThemeController;
import java.awt.EventQueue;
import javax.swing.UIManager;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class FrmEventMng extends javax.swing.JFrame {

    /**
     * Creates new form FrmMain
     */
    public FrmEventMng() {
        initComponents();
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
        btnAdd = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnStudentSystem = new javax.swing.JMenu();
        mniHome = new javax.swing.JMenuItem();
        mniAbout = new javax.swing.JMenuItem();
        mniLogOut = new javax.swing.JMenuItem();
        mnManage = new javax.swing.JMenu();
        MnItmAdd = new javax.swing.JMenuItem();
        MnItmSearch = new javax.swing.JMenuItem();
        MnItmUpd = new javax.swing.JMenuItem();
        MnItmDelete = new javax.swing.JMenuItem();
        menuView = new javax.swing.JMenu();
        cbmiDarkMode = new javax.swing.JCheckBoxMenuItem();
        menuHelp = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 60)); // NOI18N
        jLabel1.setText("Event Managment");

        btnAdd.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SpecialEventIcon.png"))); // NOI18N

        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnSearch)
                        .addGap(42, 42, 42)
                        .addComponent(btnUpdate)
                        .addGap(39, 39, 39)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnSearch)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addGap(246, 246, 246))
        );

        mnStudentSystem.setText("StudentSystem");

        mniHome.setText("Home");
        mniHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHomeActionPerformed(evt);
            }
        });
        mnStudentSystem.add(mniHome);

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

        MnItmAdd.setText("Add Event");
        MnItmAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnItmAddActionPerformed(evt);
            }
        });
        mnManage.add(MnItmAdd);

        MnItmSearch.setText("Search Event");
        MnItmSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnItmSearchActionPerformed(evt);
            }
        });
        mnManage.add(MnItmSearch);

        MnItmUpd.setText("Update Event");
        MnItmUpd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnItmUpdActionPerformed(evt);
            }
        });
        mnManage.add(MnItmUpd);

        MnItmDelete.setText("Delete Event");
        MnItmDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnItmDeleteActionPerformed(evt);
            }
        });
        mnManage.add(MnItmDelete);

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
        menuHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHelpActionPerformed(evt);
            }
        });
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 55, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 public void setStatusCbmiDarkMode(boolean isSelected) {
        this.cbmiDarkMode.setSelected(isSelected);
    }
    private void mniHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHomeActionPerformed
        FrmEventMng main = new FrmEventMng();
        main.setVisible(true);
        System.out.println(UIManager.getLookAndFeel().getName());
        if ("FlatLaf Light".equals(UIManager.getLookAndFeel().getName())) {
            main.setStatusCbmiDarkMode(false);
        } else {
            main.setStatusCbmiDarkMode(true);
        }
        this.dispose();
    }//GEN-LAST:event_mniHomeActionPerformed

    private void mniAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAboutActionPerformed

        FrmAboutUs mniAbout = new FrmAboutUs();
        mniAbout.setVisible(true);

        if ("FlatLaf Light".equals(UIManager.getLookAndFeel().getName())) {
            mniAbout.setStatusCbmiDarkMode(false);
        } else {
            mniAbout.setStatusCbmiDarkMode(true);
        }
        this.dispose();
    }//GEN-LAST:event_mniAboutActionPerformed

    private void cbmiDarkModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmiDarkModeActionPerformed
        if (cbmiDarkMode.isSelected()) {
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    ThemeController.setDarkTheme();
                }
            });
        } else {
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    ThemeController.setFlatLightLafTheme();
                }
            });
        }
    }//GEN-LAST:event_cbmiDarkModeActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        FrmPrincipal btnBack = new FrmPrincipal();
        btnBack.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        FrmCreateEvent btnAdd = new FrmCreateEvent();
        btnAdd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        FrmUpdateEvent mniUpdate = new FrmUpdateEvent();
        mniUpdate.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        FrmSearchEvent btnSearch = new FrmSearchEvent();
        btnSearch.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void MnItmAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnItmAddActionPerformed
        // TODO add your handling code here:
        FrmCreateEvent btnAdd = new FrmCreateEvent();
        btnAdd.setVisible(true);
        if ("FlatLaf Light".equals(UIManager.getLookAndFeel().getName())) {
            btnAdd.setStatusCbmiDarkMode(false);
        } else {
            btnAdd.setStatusCbmiDarkMode(true);
        }
        this.dispose();
    }//GEN-LAST:event_MnItmAddActionPerformed

    private void MnItmSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnItmSearchActionPerformed
        // TODO add your handling code here:
        FrmSearchEvent btnSearch = new FrmSearchEvent();
        btnSearch.setVisible(true);
        if ("FlatLaf Light".equals(UIManager.getLookAndFeel().getName())) {
            btnSearch.setStatusCbmiDarkMode(false);
        } else {
            btnSearch.setStatusCbmiDarkMode(true);
        }
        this.dispose();
    }//GEN-LAST:event_MnItmSearchActionPerformed

    private void MnItmUpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnItmUpdActionPerformed
        // TODO add your handling code here:
        FrmUpdateEvent mniUpdate = new FrmUpdateEvent();
        mniUpdate.setVisible(true);
        if ("FlatLaf Light".equals(UIManager.getLookAndFeel().getName())) {
            mniUpdate.setStatusCbmiDarkMode(false);
        } else {
            mniUpdate.setStatusCbmiDarkMode(true);
        }
        this.dispose();
    }//GEN-LAST:event_MnItmUpdActionPerformed

    private void MnItmDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnItmDeleteActionPerformed
        // TODO add your handling code here:
        FrmDeleteEvent mniDelete = new FrmDeleteEvent();
        mniDelete.setVisible(true);
        if ("FlatLaf Light".equals(UIManager.getLookAndFeel().getName())) {
            mniDelete.setStatusCbmiDarkMode(false);
        } else {
            mniDelete.setStatusCbmiDarkMode(true);
        }
        this.dispose();
    }//GEN-LAST:event_MnItmDeleteActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        FrmDeleteEvent mniDelete = new FrmDeleteEvent();
        mniDelete.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void mniLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLogOutActionPerformed
        // TODO add your handling code here:
        FrmLogIn login = new FrmLogIn();
        login.setVisible(true);
        if ("FlatLaf Light".equals(UIManager.getLookAndFeel().getName())) {
            login.setStatusCbmiDarkMode(false);
        } else {
            login.setStatusCbmiDarkMode(true);
        }
        this.dispose();
    }//GEN-LAST:event_mniLogOutActionPerformed

    private void menuHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHelpActionPerformed
        FrmHelp newHelp = new FrmHelp();
        newHelp.setVisible(true);
        if ("FlatLaf Light".equals(UIManager.getLookAndFeel().getName())) {
            newHelp.setStatusCbmiDarkMode(false);
        } else {
            newHelp.setStatusCbmiDarkMode(true);
        }
        this.dispose();
    }//GEN-LAST:event_menuHelpActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        setTheme();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEventMng().setVisible(true);
            }
        });
    }

    private static void setTheme() {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MnItmAdd;
    private javax.swing.JMenuItem MnItmDelete;
    private javax.swing.JMenuItem MnItmSearch;
    private javax.swing.JMenuItem MnItmUpd;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBoxMenuItem cbmiDarkMode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenu menuView;
    private javax.swing.JMenu mnManage;
    private javax.swing.JMenu mnStudentSystem;
    private javax.swing.JMenuItem mniAbout;
    private javax.swing.JMenuItem mniHome;
    private javax.swing.JMenuItem mniLogOut;
    // End of variables declaration//GEN-END:variables
}
