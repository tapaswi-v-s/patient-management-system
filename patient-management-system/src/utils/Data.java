package utils;

import models.*;
import models.enums.Gender;
import models.enums.Role;
import models.enums.VitalSign;
import models.user.Doctor;
import models.user.Patient;
import models.user.Person;

import java.util.ArrayList;
import java.util.List;

public class Data {

    static List<Patient> patients = new ArrayList<>(){{
        add(new Patient("Dimitri", "Peres", "A-",
                Gender.MALE, "", 24, VitalSign.BLOOD_OXYGEN));
        add(new Patient("Sam", "Bahadur", "B-",
                Gender.MALE, "", 33, null));
        add(new Patient("Vicky", "Kaushal", "O+",
                Gender.MALE, "", 28, VitalSign.BODY_TEMPERATURE));
        add(new Patient("Katrina", "Kaushal", "A+",
                Gender.FEMALE, "", 36, VitalSign.HEART_RATE));
        add(new Patient("Rajesh", "Patel", "B-",
                Gender.MALE, "", 82, null));
    }};

    static List<Hospital> hospitals = new ArrayList<>(){{
        add(new Hospital("Apollo", List.of("Ahmedabad, Baroda")));
    }};

    static List<Person> people = new ArrayList<>(){{
        add(new Person("Tapaswi", "Satyapanthi", "A+", 26, Role.ADMIN, Gender.MALE));
    }};

    static List<Doctor> doctors = new ArrayList<>(){{
        add(new Doctor("Tarak", "Mehta", 41));
    }};

    static List<Encounter> encounters = new ArrayList<>(){{

    }};

}
