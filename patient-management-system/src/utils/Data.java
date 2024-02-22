package utils;

import models.*;
import models.enums.DoctorType;
import models.enums.Gender;
import models.enums.UserType;
import models.enums.VitalSign;
import models.user.Doctor;
import models.user.Patient;
import models.user.Person;

import java.util.ArrayList;
import java.util.List;

public class Data {

    private static Data single_instance = null;

    public Data() {}

    public static synchronized Data getInstance(){
        if (single_instance == null)
            single_instance = new Data();

        return single_instance;
    }

    public List<Patient> patients = new ArrayList<>(){{
        add(new Patient("Dimitri", "Peres", "A-",
                Gender.MALE, "", 24, VitalSign.BLOOD_OXYGEN, null));
        add(new Patient("Sam", "Bahadur", "B-",
                Gender.MALE, "", 33, null, null));
        add(new Patient("Vicky", "Kaushal", "O+",
                Gender.MALE, "", 28, VitalSign.BODY_TEMPERATURE, null));
        add(new Patient("Katrina", "Kaushal", "A+",
                Gender.FEMALE, "", 36, VitalSign.HEART_RATE, null));
        add(new Patient("Rajesh", "Patel", "B-",
                Gender.MALE, "", 82, null, null));
    }};

    public List<Hospital> hospitals = new ArrayList<>(){{
        add(new Hospital("Apollo", List.of("Ahmedabad", "Baroda")));
        
        add(new Hospital("Humber River Hospital", List.of("Toronto", "Hamilton")));
        
        add(new Hospital("Mount Sinai Hospital", List.of("Toronto", "Missisauga")));
        
        add(new Hospital("North York General Hospital", List.of("Vancouver", "Calgary")));
        
        add(new Hospital("Michael Garron Hospital", List.of("Calgary", "Edmonton")));
        
        add(new Hospital("The Scarborough Hospital", List.of("Montreal", "Ottawa")));
    }};

    public List<Person> people = new ArrayList<>(){{
        add(new Person("Tapaswi", "Satyapanthi", "A+", "tapaswi","pwd",
                26, UserType.ADMIN, Gender.MALE, null));
    }};

    public List<Doctor> doctors = new ArrayList<>(){{
        
        add(new Doctor("Alex", "Chan", "A+", "alex","pwd",34,
                Gender.MALE, DoctorType.CARDIOLOGIST, hospitals.get(0)));
        
        add(new Doctor("Dan", "Sood", "A+", "dan","pwd",40,
                Gender.MALE, DoctorType.CARDIOLOGIST, hospitals.get(0)));
        
        add(new Doctor("Orit", "Segal", "B+", "orit","pwd",35,
                Gender.MALE, DoctorType.DENTIST, hospitals.get(0)));
        
        add(new Doctor("May", "Chen", "A+", "may","pwd",30,
                Gender.MALE, DoctorType.DENTIST, hospitals.get(1)));
        
        add(new Doctor("Poonam", "Batra", "A+", "poonam","pwd",28,
                Gender.MALE, DoctorType.GENERAL, hospitals.get(1)));
        
        add(new Doctor("Kim", "Johnson", "A+", "kim","pwd",38,
                Gender.MALE, DoctorType.GENERAL, hospitals.get(2)));
        
        add(new Doctor("David", "Serile", "A+", "david","pwd",52,
                Gender.MALE, DoctorType.GYNAECOLOGIST, hospitals.get(2)));
        
        add(new Doctor("Susan", "Au", "A+", "susan","pwd",27,
                Gender.MALE, DoctorType.GYNAECOLOGIST, hospitals.get(3)));
        
        add(new Doctor("Tripler", "Pell", "A+", "tripler","pwd",37,
                Gender.MALE, DoctorType.ONCOLOGIST, hospitals.get(3)));
        
        add(new Doctor("Karl", "Iglar", "A+", "karl","pwd",55,
                Gender.MALE, DoctorType.ONCOLOGIST, hospitals.get(4)));
        
        add(new Doctor("Angela", "Wong", "A+", "angela","pwd",42,
                Gender.MALE, DoctorType.ORTHOPAEDIC, hospitals.get(4)));
        
        add(new Doctor("Trudy", "Chernin", "A+", "trudy","pwd",39,
                Gender.MALE, DoctorType.ORTHOPAEDIC, hospitals.get(4)));
    }};

    public List<Encounter> encounters = new ArrayList<>(){{

    }};

    public List<Appointment> activeAppointments = new ArrayList<>(){{

    }};

    public List<Appointment> pastAppointments = new ArrayList<>(){{

    }};

}
