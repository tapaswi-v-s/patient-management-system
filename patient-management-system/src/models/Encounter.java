package models;

import models.user.Doctor;
import models.user.Patient;

public class Encounter {
    Doctor doctor;
    Patient patient;

    public Encounter(Doctor doctor, Patient patient) {
        this.doctor = doctor;
        this.patient = patient;
    }
}
