package models.directory;

import models.user.Doctor;
import utils.Data;

public class DoctorDirectory extends Directory<Doctor> {

    public DoctorDirectory(Doctor doctor) {
        this.records = Data.getInstance().doctors;
    }
}
