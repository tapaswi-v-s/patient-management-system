/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views.patient;

import controllers.PatientController;
import models.Appointment;
import models.Hospital;
import models.user.Doctor;
import utils.StringUtils;

import javax.swing.*;
import java.awt.*;
import java.util.Date;
import java.util.List;
import models.enums.DoctorType;
import utils.Utils;

public class PatientAppointmentPage extends javax.swing.JPanel {

    JPanel bottomPanel;
    PatientController patientController;
    List<Doctor> doctors;
    List<Hospital> hospitals;
    List<Appointment> appointments;

    /**
     * Creates new form PatientAppointmentPage
     * @param patientController
     */
    public PatientAppointmentPage(JPanel bottomPanel, PatientController patientController) {
        this.patientController = patientController;
        this.bottomPanel = bottomPanel;
        initComponents();
        txtDate.setMinSelectableDate(new Date());
        txtDate.setDate(new Date());
        populateFields();
    }

    private void populateFields(){
        hospitals = patientController.getHospitals();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        model.addAll(hospitals.stream().map(Hospital::getName).toList());
        drpHospital.setModel(model);
        drpHospital.setSelectedIndex((drpHospital.getItemCount() > 0) ? 0 : -1);

        DefaultComboBoxModel<String> model1 = new DefaultComboBoxModel<>();
        model1.addAll(StringUtils.getDoctorCategory());
        drpDoctorCategory.setModel(model1);
        drpDoctorCategory.setSelectedIndex((drpDoctorCategory.getItemCount() > 0) ? 0 : -1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        drpHospital = new javax.swing.JComboBox<>();
        drpDoctorCategory = new javax.swing.JComboBox<>();
        drpDoctor = new javax.swing.JComboBox<>();
        drpTimeSlot = new javax.swing.JComboBox<>();
        btnBook = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtDate = new com.toedter.calendar.JDateChooser();
        btnBack = new javax.swing.JButton();

        jLabel1.setText("Hospital :");

        jLabel2.setText("Doctor Category :");

        jLabel3.setText("Doctor :");

        jLabel4.setText("Date :");

        jLabel5.setText("Time Slot :");

        drpHospital.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Humber River Hospital", "Mount Sinai Hospital", "North York General Hospital", "Michael Garron Hospital", "The Scarborough Hospital" }));
        drpHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drpHospitalActionPerformed(evt);
            }
        });

        drpDoctorCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cardiologist", "Orthopaedic", "Pediatrician", "Gynaecologist", "Oncologist", "General", "Dentist", " " }));
        drpDoctorCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drpDoctorCategoryActionPerformed(evt);
            }
        });

        drpDoctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<select doctor>" }));
        drpDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drpDoctorActionPerformed(evt);
            }
        });

        drpTimeSlot.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<select time>" }));

        btnBook.setText("Book");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Patient Appointment Page");

        txtDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtDateChanged(evt);
            }
        });

        btnBack.setText("← Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(drpHospital, javax.swing.GroupLayout.Alignment.TRAILING, 0, 1, Short.MAX_VALUE)
                            .addComponent(drpDoctor, javax.swing.GroupLayout.Alignment.TRAILING, 0, 179, Short.MAX_VALUE)
                            .addComponent(drpTimeSlot, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(drpDoctorCategory, 0, 179, Short.MAX_VALUE)
                            .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnBack)
                        .addGap(72, 72, 72)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(btnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drpHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drpDoctorCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drpDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(drpTimeSlot, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnBook)
                .addContainerGap(123, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        boolean response = patientController.bookAppointment(
                doctors.get(drpDoctor.getSelectedIndex()),
                txtDate.getDate(),
                (String) drpTimeSlot.getSelectedItem(),
                hospitals.get(drpHospital.getSelectedIndex())
        );
        System.out.println("Response: "+response);

        if(response){
            // TODO: Show Positive Response in JOptionPane Message
            Utils.showDialog(this, "Appointment Booked!", null);
        }else{
            Utils.showDialog(this, null, "Something Went Wrong");
        }
    }//GEN-LAST:event_btnBookActionPerformed

    private void drpDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drpDoctorActionPerformed
        
        if(doctors != null && doctors.size() > 0){
        // Fetching Available Appointments
        appointments = patientController.getAvailableAppointments(
                doctors.get(drpDoctor.getSelectedIndex()), txtDate.getDate());

        // Setting available appointment times
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        model.addAll(appointments.stream().map(Appointment::getTimeSlot).toList());
        drpTimeSlot.setModel(model);
        drpTimeSlot.setSelectedIndex((drpTimeSlot.getItemCount() > 0) ? 0 : -1);
            
        }
    }//GEN-LAST:event_drpDoctorActionPerformed

    private void drpHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drpHospitalActionPerformed
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        doctors = patientController.getDoctors(
                    patientController.getHospitals().get(drpHospital.getSelectedIndex()), null)
                .stream().toList();
        model.addAll(doctors.stream().map(doctor -> doctor.getfName()+" "+doctor.getlName()).toList());
        drpDoctor.setModel(model);
        drpDoctor.setSelectedIndex((drpDoctor.getItemCount() > 0) ? 0 : -1);

    }//GEN-LAST:event_drpHospitalActionPerformed

    private void drpDoctorCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drpDoctorCategoryActionPerformed
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        doctors = patientController.getDoctors(
                    patientController.getHospitals().get(drpHospital.getSelectedIndex()),
                    DoctorType.values()[drpDoctorCategory.getSelectedIndex()])
                .stream().toList();
        model.addAll(doctors.stream().map(doctor -> doctor.getfName()+" "+doctor.getlName()).toList());
        drpDoctor.setModel(model);
        drpDoctor.setSelectedIndex((drpDoctor.getItemCount() > 0) ? 0 : -1);
    }//GEN-LAST:event_drpDoctorCategoryActionPerformed

    private void txtDateChanged(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtDateChanged
        
        if(doctors!=null && !doctors.isEmpty()){
            
        // Fetching Available Appointments
            appointments = patientController.getAvailableAppointments(
                    doctors.get(drpDoctor.getSelectedIndex()),
                    txtDate.getDate());

        // Setting available appointment times
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            model.addAll(appointments.stream().map(Appointment::getTimeSlot).toList());
            drpTimeSlot.setModel(model);
            drpTimeSlot.setSelectedIndex((drpTimeSlot.getItemCount() > 0) ? 0 : -1);
        }
        
    }//GEN-LAST:event_txtDateChanged

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        bottomPanel.remove(this);
        CardLayout cl = (CardLayout) bottomPanel.getLayout();
        cl.previous(bottomPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBook;
    private javax.swing.JComboBox<String> drpDoctor;
    private javax.swing.JComboBox<String> drpDoctorCategory;
    private javax.swing.JComboBox<String> drpHospital;
    private javax.swing.JComboBox<String> drpTimeSlot;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private com.toedter.calendar.JDateChooser txtDate;
    // End of variables declaration//GEN-END:variables
}