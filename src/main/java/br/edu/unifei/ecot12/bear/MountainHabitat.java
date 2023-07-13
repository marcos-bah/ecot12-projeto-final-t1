package br.edu.unifei.ecot12.bear;

public class MountainHabitat extends Habitat{
    private int altitude;
    private String vegetation;

    public MountainHabitat(String habitatType, String climate, int altitude, String vegetation) {
        super(habitatType, climate);
        this.altitude = altitude;
        this.vegetation = vegetation;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public String getVegetation() {
        return vegetation;
    }

    public void setVegetation(String vegetation) {
        this.vegetation = vegetation;
    }

    public void exploreCaves() {
        System.out.println("Explore Caves");
    }

    public void climbSteepSlopes() {
        System.out.println("Climb Steep Slopes");
    }

    @Override
    public String toString() {
        return super.toString() + "MountainHabitat [altitude=" + altitude + ", vegetation=" + vegetation + "]";
    }
}
