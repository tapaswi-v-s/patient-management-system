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
import java.util.Date;
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
        add(new Patient("Tapaswi", "Patel", "A-",
                Gender.MALE,"root", "root", null, 24,
                VitalSign.BLOOD_OXYGEN,
                new Address("10 Tuxedo Crt", new City("Scarborough", "Scarb"))));
        add(new Patient("Sam", "Bahadur", "B-",
                Gender.MALE,"root1", "root1", null, 33, null,
                new Address("20 Suit Crt", new City("Scarborough", "Markham"))));
        add(new Patient("Vicky", "Kaushal", "O+",
                Gender.MALE, "root2", "root2", null, 28, VitalSign.BODY_TEMPERATURE,
                new Address("20 Tux", new City("York", "Ellsemere"))));
        add(new Patient("Katrina", "Kaushal", "A+",
                Gender.FEMALE, "root3", "root3", null, 36, VitalSign.HEART_RATE,
                new Address("40 McCowan Rd", new City("Toronto", "GTA"))));
        add(new Patient("Rajesh", "Patel", "B-",
                Gender.MALE,"root4", "root4", null, 82, null,
                new Address("40 Yonge St", new City("Toronto", "GTA"))));
    }};

    public List<Hospital> hospitals = new ArrayList<>(){{
        add(new Hospital("Apollo", List.of("Ahmedabad", "Baroda")));
        
        add(new Hospital("Humber River Hospital", List.of("Toronto", "Hamilton")));
        
        add(new Hospital("Mount Sinai Hospital", List.of("Toronto", "Missisauga")));
        
        add(new Hospital("North York General Hospital", List.of("Scarborough", "Calgary")));
        
        add(new Hospital("Michael Garron Hospital", List.of("Calgary", "Edmonton")));
        
        add(new Hospital("The Scarborough Hospital", List.of("Scarborough", "Ottawa")));
    }};

    public List<Person> people = new ArrayList<>(){{
        add(new Person("Tapaswi", "Satyapanthi", "A+", "tapaswi","pwd",
                26, UserType.ADMIN, Gender.MALE, new Address("40 McCowan Rd", new City("Toronto", "GTA"))));
        add(new Person("Rachita", "Shah", "B+", "rachita","shah",
                26, UserType.ADMIN, Gender.FEMALE, new Address("40 McCowan Rd", new City("Toronto", "GTA"))));
        add(new Person("Kush", "Parmar", "o-", "kush","parmar",
                26, UserType.ADMIN, Gender.MALE, new Address("40 McCowan Rd", new City("Toronto", "GTA"))));
    }};

    public List<Doctor> doctors = new ArrayList<>(){{
        
        add(new Doctor("Alex", "Chan", "A+", "alex","pwd",34,
                Gender.MALE, DoctorType.CARDIOLOGIST, hospitals.get(0), new Address("40 McCowan Rd", new City("Toronto", "GTA"))));
        
        add(new Doctor("Dan", "Sood", "A+", "dan","pwd",40,
                Gender.MALE, DoctorType.CARDIOLOGIST, hospitals.get(0), new Address("40 McCowan Rd", new City("Toronto", "GTA"))));
        
        add(new Doctor("Orit", "Segal", "B+", "orit","pwd",35,
                Gender.MALE, DoctorType.DENTIST, hospitals.get(0), new Address("40 McCowan Rd", new City("Toronto", "GTA"))));
        
        add(new Doctor("May", "Chen", "A+", "may","pwd",30,
                Gender.MALE, DoctorType.DENTIST, hospitals.get(1), new Address("40 McCowan Rd", new City("Toronto", "GTA"))));
        
        add(new Doctor("Poonam", "Batra", "A+", "poonam","pwd",28,
                Gender.MALE, DoctorType.GENERAL, hospitals.get(1), new Address("40 McCowan Rd", new City("Toronto", "GTA"))));
        
        add(new Doctor("Kim", "Johnson", "A+", "kim","pwd",38,
                Gender.MALE, DoctorType.GENERAL, hospitals.get(2), new Address("40 McCowan Rd", new City("Toronto", "GTA"))));
        
        add(new Doctor("David", "Serile", "A+", "david","pwd",52,
                Gender.MALE, DoctorType.GYNAECOLOGIST, hospitals.get(2), new Address("40 McCowan Rd", new City("Toronto", "GTA"))));
        
        add(new Doctor("Susan", "Au", "A+", "susan","pwd",27,
                Gender.MALE, DoctorType.ONCOLOGIST, hospitals.get(3), new Address("40 McCowan Rd", new City("Toronto", "GTA"))));
        
        add(new Doctor("Tripler", "Pell", "A+", "tripler","pwd",37,
                Gender.MALE, DoctorType.ONCOLOGIST, hospitals.get(3), new Address("40 McCowan Rd", new City("Toronto", "GTA"))));
        
        add(new Doctor("Karl", "Iglar", "A+", "karl","pwd",55,
                Gender.MALE, DoctorType.ONCOLOGIST, hospitals.get(4), new Address("40 McCowan Rd", new City("Toronto", "GTA"))));
        
        add(new Doctor("Angela", "Wong", "A+", "angela","pwd",42,
                Gender.MALE, DoctorType.ORTHOPAEDIC, hospitals.get(4), new Address("40 McCowan Rd", new City("Toronto", "GTA"))));
        
        add(new Doctor("Trudy", "Chernin", "A+", "trudy","pwd",39,
                Gender.MALE, DoctorType.ORTHOPAEDIC, hospitals.get(4), new Address("40 McCowan Rd", new City("Toronto", "GTA"))));
    }};

    public List<Encounter> encounters = new ArrayList<>(){{

    }};

    public List<Appointment> activeAppointments = new ArrayList<>(){{
        add(new Appointment(doctors.get(0), patients.get(0), new Date(),
                "10:00 AM - 11:00 AM",null, hospitals.get(3)));
        add(new Appointment(doctors.get(7), null, new Date(),
                "11:00 AM - 12:30 PM",null, hospitals.get(3)));
        add(new Appointment(doctors.get(8), null, new Date(),
                "12:30 PM - 1:00 PM",null, hospitals.get(3)));
        add(new Appointment(doctors.get(8), null, new Date(),
                "1:30 PM - 2:00 PM",null, hospitals.get(3)));
    }};

    public List<Appointment> pastAppointments = new ArrayList<>(){{

    }};

}
