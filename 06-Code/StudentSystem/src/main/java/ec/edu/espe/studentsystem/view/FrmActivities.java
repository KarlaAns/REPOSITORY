/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.studentsystem.view;

import ec.edu.espe.studentsystem.controller.Theme;
import java.awt.EventQueue;
import javax.swing.UIManager;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class FrmActivities extends javax.swing.JFrame {

    /**
     * Creates new form FrmActivities
     */
    public FrmActivities() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        mnStudentSystem = new javax.swing.JMenu();
        mniAbout = new javax.swing.JMenuItem();
        mniLogOut = new javax.swing.JMenuItem();
        mnManage = new javax.swing.JMenu();
        mnEnrollment = new javax.swing.JMenuItem();
        menuView = new javax.swing.JMenu();
        cbmiDarkMode = new javax.swing.JCheckBoxMenuItem();
        menuHelp = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        mnEnrollment.setText("Enrollment");
        mnEnrollment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEnrollmentActionPerformed(evt);
            }
        });
        mnManage.add(mnEnrollment);

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
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 539, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mniAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAboutActionPerformed
        //frmAboutUs newMniAbout = new frmAboutUs();
        //newMniAbout.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mniAboutActionPerformed

    private void mnEnrollmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEnrollmentActionPerformed
        FrmEnrollment frmEnrollment = new FrmEnrollment();
        frmEnrollment.setVisible(true);
        System.out.println(UIManager.getLookAndFeel().getName());
        if("FlatLaf Light".equals(UIManager.getLookAndFeel().getName())){
            //frmActivities.setStatusCbmiDarkMode(false);
        }else{
            //frmActivities.setStatusCbmiDarkMode(true);
        }
        this.dispose();
    }//GEN-LAST:event_mnEnrollmentActionPerformed

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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Theme.setFlatLightLafTheme();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmActivities().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem cbmiDarkMode;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenu menuView;
    private javax.swing.JMenuItem mnEnrollment;
    private javax.swing.JMenu mnManage;
    private javax.swing.JMenu mnStudentSystem;
    private javax.swing.JMenuItem mniAbout;
    private javax.swing.JMenuItem mniLogOut;
    // End of variables declaration//GEN-END:variables

    public boolean getStatusCbmiDarkMode() {
        return cbmiDarkMode.isSelected();
    }

    public void setStatusCbmiDarkMode(boolean isSelected) {
        this.cbmiDarkMode.setSelected(isSelected);
    }

}
