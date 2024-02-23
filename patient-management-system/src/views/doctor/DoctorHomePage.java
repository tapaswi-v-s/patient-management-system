/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views.doctor;

import controllers.DoctorController;
import controllers.LoginController;
import java.awt.CardLayout;
import javax.swing.JPanel;
import views.LoginPage;
import views.patient.PatientAppointmentPage;

/**
 *
 * @author HP
 */
public class DoctorHomePage extends javax.swing.JPanel {

    JPanel bottomPanel;
    DoctorController doctorController;
    public DoctorHomePage(JPanel bottomPanel, DoctorController doctorController) {
        this.bottomPanel = bottomPanel;
        this.doctorController = doctorController;
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

        btnAddavailabilty = new javax.swing.JButton();
        btnExaminePatients = new javax.swing.JButton();
        btnBrowsePatientDirectory = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnHomePage = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(554, 450));

        btnAddavailabilty.setText("Add Availabilty");
        btnAddavailabilty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddavailabiltyActionPerformed(evt);
            }
        });

        btnExaminePatients.setText("Examine Patients");
        btnExaminePatients.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExaminePatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExaminePatientsActionPerformed(evt);
            }
        });

        btnBrowsePatientDirectory.setText("Browse Patient Directory");
        btnBrowsePatientDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowsePatientDirectoryActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Doctor Home Page");

        btnHomePage.setText("Log Out");
        btnHomePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomePageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnExaminePatients, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBrowsePatientDirectory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddavailabilty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(190, 190, 190))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addComponent(btnHomePage)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnHomePage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(btnAddavailabilty, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnExaminePatients, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnBrowsePatientDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddavailabiltyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddavailabiltyActionPerformed
        bottomPanel.add(new DoctorAvailabilityPage(bottomPanel, doctorController));
        CardLayout cl = (CardLayout) bottomPanel.getLayout();
        cl.next(bottomPanel);
    }//GEN-LAST:event_btnAddavailabiltyActionPerformed

    private void btnExaminePatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExaminePatientsActionPerformed
        bottomPanel.add(new DoctorAppointmentsScreen(bottomPanel, doctorController));
        CardLayout cl = (CardLayout) bottomPanel.getLayout();
        cl.next(bottomPanel);
    }//GEN-LAST:event_btnExaminePatientsActionPerformed

    private void btnBrowsePatientDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowsePatientDirectoryActionPerformed
        bottomPanel.add(new PatientDirectoryPage(bottomPanel, doctorController));
        CardLayout cl = (CardLayout) bottomPanel.getLayout();
        cl.next(bottomPanel);
    }//GEN-LAST:event_btnBrowsePatientDirectoryActionPerformed

    private void btnHomePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomePageActionPerformed
        bottomPanel.removeAll();
        bottomPanel.add(new LoginPage(bottomPanel, new LoginController()));
        CardLayout cl = (CardLayout) bottomPanel.getLayout();
        cl.next(bottomPanel);
    }//GEN-LAST:event_btnHomePageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddavailabilty;
    private javax.swing.JButton btnBrowsePatientDirectory;
    private javax.swing.JButton btnExaminePatients;
    private javax.swing.JButton btnHomePage;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}