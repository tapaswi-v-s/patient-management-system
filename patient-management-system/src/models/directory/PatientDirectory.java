package models.directory;

import models.user.Patient;
import utils.Data;

public class PatientDirectory extends Directory<Patient> {
    public PatientDirectory() {
        this.records = Data.getInstance().patients;
    }
}
