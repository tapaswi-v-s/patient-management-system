package controllers;

import models.Appointment;
import models.Encounter;
import models.enums.VitalSign;
import models.user.Doctor;
import models.user.Patient;
import utils.Data;
import utils.Utils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DoctorController {
    Doctor doctor;
    Data data = Data.getInstance();


//     UI: 1 Page for adding appointments,
//     1 for available patients in a particular appointment
//          Display all the patient details and a UI for adding vital sign and setting a note.
//     After examining, close this encounter and add it to history


//     1 Page for navigating the patient directory
//        display all the patient details of a selected patient


    public DoctorController(Doctor doctor) {
        this.doctor = doctor;
    }

    public boolean  addAppointments(Date date, String startTime, String endTime){
        String timeSlot = startTime+" - "+endTime;
        return data.activeAppointments.add(
                new Appointment(doctor, null, date, timeSlot, null,
                        doctor.getHospital()));
    }
    public List<Appointment> getMyAppointments(Date date){
        List<Appointment> list = new ArrayList<>();
        for (Appointment apt : data.activeAppointments) {
            // Logic to check this doctor's appointments who "has" a patient
            if(apt.getDoctor() == this.doctor
                    && apt.getPatient() != null
                    && Utils.sdf.format(apt.getDate()).equals(Utils.sdf.format(date))){
                list.add(apt);
            }
        }
        return list;
    }

    public boolean examinePatient(VitalSign vitalSign, String note, Appointment appointment){
        boolean value = false;
        appointment.getPatient().setVitalSign(vitalSign);
        appointment.getPatient().setNote(note);
        appointment.setNote(note);
        value = data.encounters
                .add(new Encounter(doctor, appointment.getPatient(), appointment));

        // Removing this appointment from active and adding it to past appointments
        value = data.activeAppointments.remove(appointment);
        value = data.pastAppointments.add(appointment);
        return value;
    }

    public List<Patient> getAllPatients(){
        return data.patients;
    }

    // This method will be called after examining a patient
    public void addPatientVitalSign(Patient patient, VitalSign vitalSign, String note){
        patient.setVitalSign(vitalSign);
        patient.setNote(note);
        
    }

    /*public boolean updateMyRecordInDirectory(Doctor doctor){
        for (Doctor d: data.doctors) {
            if(d == this.doctor){
                d = doctor;
                return true;
            }
        }
        return false;
    }*/


}
