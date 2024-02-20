package models.directory;

import models.Hospital;

import java.util.ArrayList;
import java.util.List;

public class HospitalDirectory extends Directory<Hospital> {
    public HospitalDirectory(List<Hospital> hospitals) {
        this.records = hospitals;
    }

    public HospitalDirectory() {
        this.records = new ArrayList<>();
    }
}
