package models.user;

import models.Hospital;
import models.enums.DoctorType;
import models.enums.Gender;
import models.enums.UserType;

public class Doctor extends Person{

    DoctorType type;
    Hospital hospital;

    public Doctor(String fName, String lName, String bloodGroup, String uName, String pwd,
                  double age, Gender gender, DoctorType type, Hospital hospital) {
        super(fName, lName, bloodGroup, uName, pwd, age, UserType.DOCTOR, gender, null);
        this.type = type;
        this.hospital = hospital;
    }


    public DoctorType getType() {
        return type;
    }

    public Hospital getHospital() {
        return hospital;
    }
}
