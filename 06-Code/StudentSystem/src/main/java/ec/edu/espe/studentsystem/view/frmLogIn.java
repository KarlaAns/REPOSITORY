
package ec.edu.espe.studentsystem.view;

import ec.edu.espe.studentsystem.controller.Theme;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme;
import java.awt.EventQueue;
import javax.swing.UIManager;

/**
 *
 * @author NW USER
 */
public class FrmLogIn extends javax.swing.JFrame {

    /**
     * Creates new form frmLogIn
     */
    public FrmLogIn() {
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
        txtID = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnStudentSystem = new javax.swing.JMenu();
        mniHome = new javax.swing.JMenuItem();
        mniAbout = new javax.swing.JMenuItem();
        mniLogOut = new javax.swing.JMenuItem();
        mnManage = new javax.swing.JMenu();
        menuView = new javax.swing.JMenu();
        cbmiDarkMode = new javax.swing.JCheckBoxMenuItem();
        menuHelp = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnSubmit.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnSubmit.setText("Submit");

        lblID.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblID.setText("ID:");

        lblPass.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblPass.setText("Password:");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 60)); // NOI18N
        jLabel1.setText("Log In");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtID)
                        .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                    .addComponent(lblPass, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lblID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lblPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnSubmit)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1001, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbmiDarkModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmiDarkModeActionPerformed
        if (cbmiDarkMode.isSelected())
        {
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    Theme.setDarkTheme();
                }
            });
        } else
        {
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    Theme.setFlatLightLafTheme();
                }
            });
        }
    }//GEN-LAST:event_cbmiDarkModeActionPerformed

    private void mniHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHomeActionPerformed
        FrmMain main = new FrmMain();
        main.setVisible(true);
        System.out.println(UIManager.getLookAndFeel().getName());
        if("FlatLaf Light".equals(UIManager.getLookAndFeel().getName())){
            main.setStatusCbmiDarkMode(false);
        }else{
            main.setStatusCbmiDarkMode(true);
        }
        this.dispose();
    }//GEN-LAST:event_mniHomeActionPerformed
    private void mniAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAboutActionPerformed

        FrmAboutUs mniAbout = new FrmAboutUs();
        mniAbout.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mniAboutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            //UIManager.setLookAndFeel(new FlatLightLaf());
            FlatLightFlatIJTheme.setup();
            FlatLaf.updateUI();

        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JCheckBoxMenuItem cbmiDarkMode;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblPass;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenu menuView;
    private javax.swing.JMenu mnManage;
    private javax.swing.JMenu mnStudentSystem;
    private javax.swing.JMenuItem mniAbout;
    private javax.swing.JMenuItem mniHome;
    private javax.swing.JMenuItem mniLogOut;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables

    public boolean getStatusCbmiDarkMode() {
        return cbmiDarkMode.isSelected();
    }

    public void setStatusCbmiDarkMode(boolean isSelected) {
        this.cbmiDarkMode.setSelected(isSelected);
    }
}
