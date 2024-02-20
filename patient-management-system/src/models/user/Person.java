package models.user;

import models.House;
import models.enums.Gender;
import models.enums.Role;

public class Person {
    String fName;
    String lName;
    String bloodGroup;
    double age;
    Role role; // "Null" if this person is not a user of this system but just random person.
    Gender gender;

    House house;

    public Person(String fName, String lName, String bloodGroup, double age, Role role, Gender gender) {
        this.fName = fName;
        this.lName = lName;
        this.bloodGroup = bloodGroup;
        this.age = age;
        this.role = role;
        this.gender = gender;
    }

    public Person() {}

    public Patient convertToPatient(){
        return new Patient(fName, lName, bloodGroup, gender, "", age, null);
    }
}
