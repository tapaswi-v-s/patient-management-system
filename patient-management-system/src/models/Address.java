package models;

public class Address {
    String houseName;
    City city;

    public Address(String houseName, City city) {
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

//Commit check