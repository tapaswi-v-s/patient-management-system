package models;

import models.user.Doctor;
import models.user.Patient;

public class Encounter {
    Doctor doctor;
    Patient patient;

    Appointment appointment;

    public Encounter(Doctor doctor, Patient patient, Appointment appointment) {
        this.doctor = doctor;
        this.patient = patient;
        this.appointment = appointment;
    }
}
