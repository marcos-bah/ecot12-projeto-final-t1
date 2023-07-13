package br.edu.unifei.ecot12.bear;

import java.util.ArrayList;

public class ForestHabitat extends Habitat {
    private float treeDensity;
    private String undergrowth;
    ArrayList<Tree> trees = new ArrayList<Tree>();

    public ForestHabitat(String habitatType, String climate, float treeDensity, String undergrowth,
            ArrayList<Tree> trees) {
        super(habitatType, climate);
        this.treeDensity = treeDensity;
        this.undergrowth = undergrowth;
        this.trees = trees;
    }

    public void forageForFood() {
        System.out.println("Forage For Food");
    }

    public void navigateThroughUndergrowth() {
        System.out.println("Navigate Through Undergrowth");
    }

    public float getTreeDensity() {
        return treeDensity;
    }

    public void setTreeDensity(float treeDensity) {
        this.treeDensity = treeDensity;
    }

    public String getUndergrowth() {
        return undergrowth;
    }

    public void setUndergrowth(String undergrowth) {
        this.undergrowth = undergrowth;
    }

    public ArrayList<Tree> getTrees() {
        return trees;
    }

    public void setTrees(ArrayList<Tree> trees) {
        this.trees = trees;
    }

    @Override
    public String toString() {
        return super.toString() + "ForestHabitat [treeDensity=" + treeDensity + ", undergrowth=" + undergrowth + ", trees=" + trees + "]";
    }
}
