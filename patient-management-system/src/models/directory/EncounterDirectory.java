package models.directory;

import models.Encounter;
import utils.Data;

public class EncounterDirectory extends Directory<Encounter>{
    public EncounterDirectory() {
        this.records = Data.getInstance().encounters;
    }
}
