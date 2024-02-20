package models.directory;

import models.Encounter;
import models.Hospital;

import java.util.ArrayList;
import java.util.List;

public class EncounterDirectory extends Directory<Encounter>{
    public EncounterDirectory(List<Encounter> encounters) {
        this.records = encounters;
    }

    public EncounterDirectory() {
        this.records = new ArrayList<>();
    }
}
