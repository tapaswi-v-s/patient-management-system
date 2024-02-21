package models.user;

import models.Address;
import models.enums.Gender;
import models.enums.UserType;

public class Person {
    String fName;
    String lName;
    String bloodGroup;
    String userName;
    String password;
    double age;
    UserType userType; // "Null" if this person is not a user of this system but just random person.
    Gender gender;
    Address address;

    public Person(String fName, String lName, String bloodGroup, String uName, String pwd,
                  double age, UserType userType, Gender gender, Address address) {
        this.fName = fName;
        this.lName = lName;
        this.bloodGroup = bloodGroup;
        this.userName = uName;
        this.password = pwd;
        this.age = age;
        this.userType = userType;
        this.gender = gender;
        this.address = address;
    }

    public Person() {}

    public Patient convertToPatient(){
        return new Patient(fName, lName, bloodGroup, gender, "", age,
                null, address);
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

    public Address getHouse() {
        return address;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setHouse(Address address) {
        this.address = address;
    }
}
