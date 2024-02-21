package models.user;

import models.enums.DoctorType;

public class Doctor extends Person{

    DoctorType type;
    public Doctor(String fName, String lName, double age) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }

    public DoctorType getType() {
        return type;
    }
}
