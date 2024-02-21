package models;

import models.user.Doctor;
import models.user.Patient;

import java.util.Date;

public class Appointment {
    Doctor doctor;
    Patient patient;
    Date date;
    String timeSlot;
    String note;
    Hospital hospital;

    public Appointment(
            Doctor doctor, Patient patient, Date date,
            String timeSlot, String note, Hospital hospital) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
        this.timeSlot = timeSlot;
        this.hospital = hospital;
        this.note = note;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Date getDate() {
        return date;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
