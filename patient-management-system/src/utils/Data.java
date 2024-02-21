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
        add(new Hospital("Apollo", List.of("Ahmedabad, Baroda")));
    }};

    public List<Person> people = new ArrayList<>(){{
        add(new Person("Tapaswi", "Satyapanthi", "A+", "tapaswi","pwd",
                26, UserType.ADMIN, Gender.MALE, null));
    }};

    public List<Doctor> doctors = new ArrayList<>(){{
        add(new Doctor("Tarak", "Mehta", "A+", "tarak","pwd",34,
                Gender.MALE, DoctorType.CARDIOLOGIST, hospitals.get(0)));
    }};

    public List<Encounter> encounters = new ArrayList<>(){{

    }};

    public List<Appointment> activeAppointments = new ArrayList<>(){{

    }};

    public List<Appointment> pastAppointments = new ArrayList<>(){{

    }};

}
