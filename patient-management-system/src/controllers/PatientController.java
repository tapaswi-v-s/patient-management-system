/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import models.Appointment;
import models.Hospital;
import models.enums.DoctorType;
import models.user.Doctor;
import models.user.Patient;
import utils.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PatientController {
    Patient patient;
    Data data;

    public PatientController(Patient patient) {
        this.patient = patient;
        data = Data.getInstance();
    }

    public Patient getPatient() {
        return patient;
    }

    public boolean bookAppointment(Doctor doctor, Date date, String timeSlot, Hospital hospital){
        // Adding new appointment to the database
        for (Appointment a : data.activeAppointments) {
            if(a.getDoctor() == doctor && a.getTimeSlot().toLowerCase()
                    .equals(timeSlot.toLowerCase())){
                a.setPatient(this.patient);
                return true;
            }
        }
        return false;
    }

    public List<Appointment> getMyActiveAppointments(){
        List<Appointment> list = new ArrayList<>();
        for (Appointment apt : data.activeAppointments) {
            if(apt.getPatient() == this.patient)
                list.add(apt);
        }
        return list;
    }

    public List<Appointment> getMyPastAppointments(){
        List<Appointment> list = new ArrayList<>();
        for (Appointment apt : data.pastAppointments) {
            if(apt.getPatient() == this.patient)
                list.add(apt);
        }
        return list;
    }

    public boolean cancelAppointment(Appointment appointment){
        for (Appointment apt : data.activeAppointments) {
            if(apt == appointment) {
                apt.setPatient(null);
                return true;
            }
        }
        return false;
    }

    public Patient getAllPatientDetails(){
        return this.patient;
    }

    public boolean updateDetails(Patient patient){
        if(patient != null) {
            this.patient = patient;
            return true;
        }
        return false;
    }




    /// ========= For populating dropdowns in the UI =======

    // Function to get doctors based on hospital and doctortype
    public List<Doctor> getDoctors(Hospital hospital, DoctorType doctorType){
        List<Doctor> list = new ArrayList<>();
        for (Doctor d : data.doctors) {
            if(d.getHospital() == hospital){
                if(doctorType == null){
                    list.add(d);
                }else{
                    if(d.getType() == doctorType){
                        list.add(d);
                    }
                }
            }
        }
        return list;
    }

    // Function to get hospitals in a city
    public List<Hospital> getHospitals(){
        List<Hospital> list = new ArrayList<>();
        for (Hospital h : data.hospitals) {
            if(h.getCities().stream().map(String::toLowerCase)
                    .toList().contains(patient.getAddress().getCity().getName().toLowerCase())){
                list.add(h);
            }
        }
        return list;
    }

    public List<Appointment> getAvailableAppointments(Doctor doctor, Date date){
        List<Appointment> list = new ArrayList<>();
        for (Appointment a : data.activeAppointments) {
            if(a.getDoctor() == doctor && a.getPatient() == null){
                list.add(a);
            }
        }
        return list;
    }

    public List<Hospital> getAllHospitals(){
        return data.hospitals;
    }
}
