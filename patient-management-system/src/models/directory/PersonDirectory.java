package models.directory;

import models.user.Person;
import utils.Data;

public class PersonDirectory extends Directory<Person>{
    public PersonDirectory() {
        this.records = Data.getInstance().people;
    }
}
