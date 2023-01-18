
package ec.edu.espe.studentsystem.view;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import ec.edu.espe.studentsystem.controller.MongoConection;
import ec.edu.espe.studentsystem.controller.Theme;
import ec.edu.espe.studentsystem.model.GradeReport;
import ec.edu.espe.studentsystem.model.Subject;
import java.awt.EventQueue;
import java.util.ArrayList;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class FrmEnrollment extends javax.swing.JFrame {
    
    DefaultTableModel model;
    private int id = 0;
    private String password = "";

    /**
     * Creates new form FrmEnrollment
     */
    public FrmEnrollment(int id) {
        this.id = id;
        initComponents();
        model = new DefaultTableModel();
        model.addColumn("Subjects");
        model.addColumn("Average");
        this.jTable1.setModel(model);
        viewData();
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblAverageTotal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnStudentSystem = new javax.swing.JMenu();
        mniAbout = new javax.swing.JMenuItem();
        mniLogOut = new javax.swing.JMenuItem();
        mnManage = new javax.swing.JMenu();
        mnActivity = new javax.swing.JMenuItem();
        menuView = new javax.swing.JMenu();
        cbmiDarkMode = new javax.swing.JCheckBoxMenuItem();
        menuHelp = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subjects", "Average"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Average Total:");

        lblAverageTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(362, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(69, 69, 69)
                        .addComponent(lblAverageTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 267, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(269, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAverageTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(88, Short.MAX_VALUE))
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
        mnStudentSystem.add(mniLogOut);

        jMenuBar1.add(mnStudentSystem);

        mnManage.setText("Manage");

        mnActivity.setText("Activity");
        mnActivity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnActivityActionPerformed(evt);
            }
        });
        mnManage.add(mnActivity);

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
        FrmAboutUs newMniAbout = new FrmAboutUs();
        newMniAbout.setVisible(true);
        this.dispose();
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

    private void mnActivityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnActivityActionPerformed
        FrmStudentsActivities frmActivities = new FrmStudentsActivities(id);
        frmActivities.setVisible(true);
        System.out.println(UIManager.getLookAndFeel().getName());
        if("FlatLaf Light".equals(UIManager.getLookAndFeel().getName())){
            frmActivities.setStatusCbmiDarkMode(false);
        }else{
            frmActivities.setStatusCbmiDarkMode(true);
        }
        this.dispose();
    }//GEN-LAST:event_mnActivityActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Theme.setFlatLightLafTheme();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEnrollment(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem cbmiDarkMode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAverageTotal;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenu menuView;
    private javax.swing.JMenuItem mnActivity;
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

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    private void viewData() {
        String collection = "subjects";
        Gson gson = new Gson();
        
        MongoCollection<Document> subjectCollection = MongoConection.getConnection(collection);
        Bson bsonFilter = Filters.eq("studentId", id);
        Document doc = subjectCollection.find(Filters.and(bsonFilter)).first();
        String studentDoc = doc.toJson();
        Subject subjects = gson.fromJson(studentDoc, Subject.class);
        
        for(int i = 0; i < subjects.getGradesReport().size(); i++){
            String []info = new String[2];
            info[0] = subjects.getGradesReport().get(i).getSubject();
            info[1] = String.valueOf(subjects.getGradesReport().get(i).getAverage());
            model.addRow(info);
        }
        
        double averageTotal = 0;
        for(int i = 0; i < subjects.getGradesReport().size(); i++){
            averageTotal += subjects.getGradesReport().get(i).getAverage();
        }
        lblAverageTotal.setText(String.valueOf(averageTotal/subjects.getGradesReport().size()));
    }

}
