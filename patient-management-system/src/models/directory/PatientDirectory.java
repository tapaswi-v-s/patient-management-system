package models.directory;

import models.user.Patient;

import java.util.ArrayList;
import java.util.List;

public class PatientDirectory extends Directory<Patient> {
    public PatientDirectory(List<Patient> patients) {
        this.records = patients;
    }

    public PatientDirectory() {
        this.records = new ArrayList<>();
    }
}
