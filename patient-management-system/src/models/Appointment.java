package models;

import models.user.Doctor;
import models.user.Patient;

import java.util.Date;

public class Appointment {
    Doctor doctor;
    Patient patient;
    Date date;
    String timeSlot;
    Hospital hospital;

    public Appointment(Doctor doctor, Patient patient, Date date, String timeSlot, Hospital hospital) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
        this.timeSlot = timeSlot;
        this.hospital = hospital;
    }

    public Patient getPatient() {
        return patient;
    }
}
