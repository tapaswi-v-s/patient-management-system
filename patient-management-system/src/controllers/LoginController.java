package controllers;

import models.enums.UserType;
import models.user.Doctor;
import models.user.Patient;
import models.user.Person;
import utils.Data;

import java.util.Arrays;
import java.util.List;

public class LoginController {
    Data data = Data.getInstance();

    public Person handleLogin(String uName, String pwd, UserType userType){
        switch(userType){
            case ADMIN:
                for (Person p : data.people) {
                    if(p.getUserName().equals(uName) && p.getPassword().equals(pwd)){
                        return p;
                    }
                }
                break;
            case DOCTOR:
                for (Doctor d : data.doctors) {
                    if(d.getUserName().equals(uName) && d.getPassword().equals(pwd)){
                        return d;
                    }
                }
                break;
            case PATIENT:
                for (Patient p : data.patients) {
                    if(p.getUserName().equals(uName) && p.getPassword().equals(pwd)){
                        return p;
                    }
                }
                break;
            default:
                return null;
        }
        return null;
    }
}
