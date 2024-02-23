package controllers;

import models.Appointment;
import models.Hospital;
import models.user.Doctor;
import models.user.Patient;
import models.user.Person;
import utils.Data;

import java.util.List;

public class AdminController {
    // Person of type admin
    Person person;

    Data data;

    public AdminController(Person person) {
        this.person = person;
        data = Data.getInstance();
    }

    /// ================ GET =================
    public List<Hospital> getAllHospitals(){
        return data.hospitals;
    }

    public List<Doctor> getAllDoctors(){
        return data.doctors;
    }

    public List<Patient> getAllPatients(){
        return data.patients;
    }

    public List<Appointment> getAllAppointments(){
        data.activeAppointments.addAll(data.pastAppointments);
        return data.activeAppointments;
    }
    /// ======================================




    /// ================ ADD =================
    public boolean addHospital(Hospital hospital){
        return data.hospitals.add(hospital);
    }

    public boolean addDoctor(Doctor doctor){
        return data.doctors.add(doctor);
    }

    public boolean addPatient(Patient patient){
        return data.patients.add(patient);
    }

    public boolean addActiveAppointment(Appointment appointment){
        return data.activeAppointments.add(appointment);
    }

    public boolean addPastAppointment(Appointment appointment){
        return data.pastAppointments.add(appointment);
    }
    /// ======================================

    /// ================ UPDATE =================
    public boolean updateHospital(Hospital hospital){
        for (Hospital h : data.hospitals) {
            if(h == hospital) {
                h = hospital;
                return true;
            }
        }
        return false;
    }

    public boolean updateDoctor(Doctor doctor){
        for (Doctor d : data.doctors) {
            if(d == doctor) {
                d = doctor;
                return true;
            }
        }
        return false;
    }

    public boolean updatePatient(Patient patient){
        for (Patient p : data.patients) {
            if(p == patient) {
                p = patient;
                return true;
            }
        }
        return false;
    }

    public boolean updateActiveAppointment(Appointment appointment){
        for (Appointment a : data.activeAppointments) {
            if(a == appointment) {
                a = appointment;
                return true;
            }
        }
        return false;
    }
    /// =========================================


    /// ================ DELETE =================

    public boolean deleteHospital(Hospital hospital){
        return data.hospitals.remove(hospital);
    }

    public boolean deleteDoctor(Doctor doctor){
        return data.doctors.remove(doctor);
    }

    public boolean deletePatient(Patient patient){
        return data.patients.remove(patient);
    }

    public boolean deleteAppointment(Appointment appointment){
        boolean value = false;
        value = data.activeAppointments.remove(appointment);
        if(value)
            return value;
        else{
            value = data.pastAppointments.remove(appointment);
        }
        return value;
    }

    public boolean clearAllPastAppointment(){
        data.pastAppointments.clear();
        return true;
    }

    /// =========================================

}
