package models;

public class City {
    String name;
    String community;

    public City(String name, String community) {
        this.name = name;
        this.community = community;
    }

    public String getName() {
        return name;
    }

    public String getCommunity() {
        return community;
    }

    @Override
    public String toString() {
        return "Community: " + community +  ", " + "City: "+ name;
    }
}
