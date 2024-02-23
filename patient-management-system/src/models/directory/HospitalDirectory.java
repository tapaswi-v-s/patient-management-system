package models.directory;

import models.Hospital;
import utils.Data;

public class HospitalDirectory extends Directory<Hospital> {
    public HospitalDirectory() {
        this.records = Data.getInstance().hospitals;
    }
}
