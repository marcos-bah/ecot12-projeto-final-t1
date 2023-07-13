package br.edu.unifei.ecot12.bear;

public class CoastalHabitat extends Habitat {
    private boolean rockyShoreline;
    private String marineFoodSources;
    private Ocean ocean;

    public CoastalHabitat(String habitatType, String climate, boolean rockyShoreline, String marineFoodSources,
            Ocean ocean) {
        super(habitatType, climate);
        this.rockyShoreline = rockyShoreline;
        this.marineFoodSources = marineFoodSources;
        this.ocean = ocean;
    }

    public void fishForSalmon() {
        System.out.println("Fish for Salmon");
    }

    public void exploreTidalPools() {
        System.out.println("Explore Tidal Pools");
    }


    public boolean isRockyShoreline() {
        return rockyShoreline;
    }

    public void setRockyShoreline(boolean rockyShoreline) {
        this.rockyShoreline = rockyShoreline;
    }

    public String getMarineFoodSources() {
        return marineFoodSources;
    }

    public void setMarineFoodSources(String marineFoodSources) {
        this.marineFoodSources = marineFoodSources;
    }

    public Ocean getOcean() {
        return ocean;
    }

    public void setOcean(Ocean ocean) {
        this.ocean = ocean;
    }

    @Override
    public String toString() {
        return super.toString() + "CoastalHabitat [rockyShoreline=" + rockyShoreline + ", marineFoodSources=" + marineFoodSources + "]";
    }


}
