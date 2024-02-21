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

    public PatientController(Patient patient) {
        this.patient = patient;
    }

    public List<Hospital> getAllHospitals(){
        List<Hospital> list = new ArrayList<>();
        for (Hospital h : Data.getInstance().hospitals) {
            if(h.getCities().contains(patient.getHouse().getCity().getName()))
                list.add(h);
        }
        return list;
    }
    public List<Doctor> getAllDoctors(DoctorType doctorType){
        List<Doctor> list = new ArrayList<>();
        for (Doctor d : Data.getInstance().doctors) {
            if(d.getType() == doctorType)
                list.add(d);
        }
        return list;
    }

    public List<DoctorType> getAllDoctorType(){
        return List.of(DoctorType.values());
    }

    public boolean bookAppointment(Doctor doctor, Date date, String timeSlot, Hospital hospital){
        // Adding new appointment to the database
        Data.getInstance().activeAppointments
                .add(new Appointment(doctor, patient, date, timeSlot, hospital));
        return true;
    }

    public List<Appointment> getAppointments(){
        List<Appointment> apts = new ArrayList<>();
        for (Appointment apt : Data.getInstance().activeAppointments) {
            if(apt.getPatient() == this.patient)
                apts.add(apt);

        }
        return apts;
    }

    public boolean cancelAppointment(Appointment appointment){
        for (Appointment apt : Data.getInstance().activeAppointments) {
            if(apt == appointment)
                return Data.getInstance().activeAppointments.remove(apt);
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
}
