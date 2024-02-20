package models.directory;

import models.user.Doctor;

import java.util.ArrayList;
import java.util.List;

public class DoctorDirectory extends Directory<Doctor> {
    public DoctorDirectory(List<Doctor> doctors) {
        this.records = doctors;
    }

    public DoctorDirectory() {
        this.records = new ArrayList<>();
    }
}
