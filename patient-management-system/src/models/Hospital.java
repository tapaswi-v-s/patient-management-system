package models;

import java.util.List;

public class Hospital {
    String name;
    List<String> cities;
    public Hospital(String name, List<String> cities) {
        this.name = name;
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }
    
    
}
