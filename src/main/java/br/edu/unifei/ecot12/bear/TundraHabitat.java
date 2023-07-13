package br.edu.unifei.ecot12.bear;

public class TundraHabitat extends Habitat{
    private boolean permafrost;
    private String lowGrowingPlants;

    public TundraHabitat(String habitatType, String climate, boolean permafrost, String lowGrowingPlants) {
        super(habitatType, climate);
        this.permafrost = permafrost;
        this.lowGrowingPlants = lowGrowingPlants;
    }

    public boolean isPermafrost() {
        return permafrost;
    }

    public void setPermafrost(boolean permafrost) {
        this.permafrost = permafrost;
    }

    public String getLowGrowingPlants() {
        return lowGrowingPlants;
    }

    public void setLowGrowingPlants(String lowGrowingPlants) {
        this.lowGrowingPlants = lowGrowingPlants;
    }

    public void endureceColdConditions() {
        System.out.println("Endurece Cold Conditions");
    }

    public void digThroughSnow() {
        System.out.println("Dig ThroughSnow");
    }

    @Override
    public String toString() {
        return super.toString() + "TundraHabitat [permafrost=" + permafrost + ", lowGrowingPlants=" + lowGrowingPlants + "]";
    }
}
