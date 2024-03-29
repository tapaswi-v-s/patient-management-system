package controllers;

import models.Appointment;
import models.Hospital;
import models.enums.DoctorType;
import models.user.Doctor;
import models.user.Patient;
import models.user.Person;
import utils.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonController {
    Person person;

    public PersonController(Person person) {
        this.person = person;
    }

//    This is only for creating an appointment object. Not to add in the database
//    This will use to pass the appointment as an argument
    public Appointment createAppointment(Doctor doctor, Date date, String timeSlot, Hospital hospital){
        // Creating appointment object without patient.
        return new Appointment(doctor, null, date, timeSlot, "", hospital);
    }


    public boolean register(Appointment appointment, Person person){
        this.person = person;
        Data.getInstance().people.add(person);

        Patient patient = person.convertToPatient();
        Data.getInstance().patients.add(person.convertToPatient());
        appointment.setPatient(patient);

        return bookAnAppointment(appointment);
    }

    public List<Hospital> getAllHospitals(){
        return Data.getInstance().hospitals;
    }

    public List<Doctor> getAllDoctors(Hospital hospital, DoctorType doctorType){
        List<Doctor> list = new ArrayList<>();
        for (Doctor doctor : Data.getInstance().doctors) {
            if(doctorType == null){
                if(doctor.getHospital() == hospital){
                    list.add(doctor);
                }
            }else{
                if(doctor.getHospital() == hospital && doctor.getType() == doctorType){
                    list.add(doctor);
                }
            }
        }
        return list;
    }
    
    public List<Appointment> getAvailableAppointments(Doctor doctor, Date date){
        List<Appointment> list = new ArrayList<>();
        for (Appointment a : Data.getInstance().activeAppointments) {
            if(a.getDoctor() == doctor && a.getPatient() == null){
                list.add(a);
            }
        }
        return list;
    }

    public boolean bookAnAppointment(Appointment appointment){
        return Data.getInstance().activeAppointments.add(appointment);
    }

}
