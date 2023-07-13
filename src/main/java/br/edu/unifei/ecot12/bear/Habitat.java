package br.edu.unifei.ecot12.bear;

public abstract class Habitat {
    private String habitatType;
    private String climate;

    public Habitat(String habitatType, String climate) {
        this.habitatType = habitatType;
        this.climate = climate;
    }

    public String getHabitatType() {
        return habitatType;
    }

    public void setHabitatType(String habitatType) {
        this.habitatType = habitatType;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    @Override
    public String toString() {
       return  "Habitat [climate=" + climate + ", habitatType=" + habitatType + "]";
    }
}
