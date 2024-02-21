package models;

public class House {
    String houseName;
    City city;

    public House(String houseName, City city) {
        this.houseName = houseName;
        this.city = city;
    }

    public String getHouseName() {
        return houseName;
    }

    public City getCity() {
        return city;
    }
}
