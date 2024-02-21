package models.user;

import models.House;
import models.enums.Gender;
import models.enums.UserType;

public class Person {
    String fName;
    String lName;
    String bloodGroup;
    double age;
    UserType userType; // "Null" if this person is not a user of this system but just random person.
    Gender gender;

    House house;

    public Person(String fName, String lName, String bloodGroup, double age, UserType userType, Gender gender, House house) {
        this.fName = fName;
        this.lName = lName;
        this.bloodGroup = bloodGroup;
        this.age = age;
        this.userType = userType;
        this.gender = gender;
        this.house = house;
    }

    public Person() {}

    public Patient convertToPatient(){
        return new Patient(fName, lName, bloodGroup, gender, "", age,
                null, house);
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public double getAge() {
        return age;
    }

    public UserType getUserType() {
        return userType;
    }

    public Gender getGender() {
        return gender;
    }

    public House getHouse() {
        return house;
    }
}
