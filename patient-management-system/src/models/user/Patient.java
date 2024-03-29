package models.user;

import models.Address;
import models.enums.Gender;
import models.enums.UserType;
import models.enums.VitalSign;

public class Patient extends Person {
    private String note;
    private VitalSign vitalSign;

    public Patient() {}

    public Patient(String fName, String lName, String bloodGroup, Gender gender, String uName, String pwd,
                   String note, double age, VitalSign vitalSign, Address address) {
        super(fName, lName, bloodGroup, uName, pwd, age, UserType.PATIENT, gender, address);
        this.fName = fName;
        this.lName = lName;
        this.bloodGroup = bloodGroup;
        this.gender = gender;
        this.note = note;
        this.age = age;
        this.vitalSign = vitalSign;
        this.address = address;
    }

    public void setVitalSign(VitalSign vitalSign) {
        this.vitalSign = vitalSign;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNote() {
        return note;
    }

    public VitalSign getVitalSign() {
        return vitalSign;
    }
}
