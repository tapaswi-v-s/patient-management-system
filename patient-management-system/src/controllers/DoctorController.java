package controllers;

import models.enums.VitalSign;
import models.user.Patient;

import java.util.List;

public class DoctorController {

    // UI: 1 Page for adding appointments,
    // 1 for available patients in a particular appointment
    //      Display all the patient details and a UI for adding vital sign and setting a note.
    // After examining, close this encounter and add it to history


//     1 Page for navigating the patient directory
//        display all the patient details of a selected patient
    public void  addAppointments(){

    }
    public void  getAllAppointments(){

    }

    public void browsePatientDirectory(){

    }

    public Patient getPatientDetails(){
        return null;
    }

    // This method will be called after examining a patient
    public void addPatientVitalSign(Patient patient, VitalSign vitalSign, String note){
        patient.setVitalSign(vitalSign);
        patient.setNote(note);
    }

    public boolean updateMyRecordInDirectory(){
        return false;
    }


}
