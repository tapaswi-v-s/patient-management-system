package controllers;

import models.Appointment;
import models.Encounter;
import models.enums.VitalSign;
import models.user.Doctor;
import models.user.Patient;
import utils.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DoctorController {
    Doctor doctor;


    // UI: 1 Page for adding appointments,
    // 1 for available patients in a particular appointment
    //      Display all the patient details and a UI for adding vital sign and setting a note.
    // After examining, close this encounter and add it to history


//     1 Page for navigating the patient directory
//        display all the patient details of a selected patient


    public DoctorController(Doctor doctor) {
        this.doctor = doctor;
    }

    public void  addAppointments(Date date, String startTime, String endTime){
        String timeSlot = startTime+" - "+endTime;
        Data.getInstance().activeAppointments.add(
                new Appointment(doctor, null, date, timeSlot, null,
                        doctor.getHospital()));
    }
    public List<Appointment> getAllAppointments(Date date){
        List<Appointment> list = new ArrayList<>();
        for (Appointment apt : Data.getInstance().activeAppointments) {
            // Logic to check this doctor's appointments who "has" a patient
            if(apt.getDoctor() == this.doctor && apt.getPatient() != null){
                list.add(apt);
            }
        }
        return list;
    }

    public void examinePatient(VitalSign vitalSign, String note, Appointment appointment){
        appointment.getPatient().setVitalSign(vitalSign);
        appointment.getPatient().setNote(note);
        Data.getInstance().encounters
                .add(new Encounter(doctor, appointment.getPatient(), appointment));

        // Removing this appointment from active and adding it to past appointments
        Data.getInstance().activeAppointments.remove(appointment);
        Data.getInstance().pastAppointments.add(appointment);
    }

    public List<Patient> getMyPatients(){
        return Data.getInstance().patients;
    }

    // This method will be called after examining a patient
    public void addPatientVitalSign(Patient patient, VitalSign vitalSign, String note){
        patient.setVitalSign(vitalSign);
        patient.setNote(note);
    }

    public boolean updateMyRecordInDirectory(Doctor doctor){
        for (Doctor d: Data.getInstance().doctors) {
            if(d == this.doctor){
                d = doctor;
                return true;
            }
        }
        return false;
    }


}
