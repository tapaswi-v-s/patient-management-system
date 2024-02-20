package models.directory;

import models.user.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonDirectory extends Directory<Person>{
    public PersonDirectory(List<Person> persons) {
        this.records = persons;
    }

    public PersonDirectory() {
        this.records = new ArrayList<>();
    }
}
