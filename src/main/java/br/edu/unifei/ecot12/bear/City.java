package br.edu.unifei.ecot12.bear;

public class City {
    private String name;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public City(String name, String location) {
        this.name = name;
        this.location = location;
    }

    @Override
    public String toString() {
        return "City [name=" + name + ", location=" + location + "]";
    }
}
