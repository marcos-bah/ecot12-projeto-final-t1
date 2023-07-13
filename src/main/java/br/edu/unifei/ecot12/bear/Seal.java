package br.edu.unifei.ecot12.bear;

public class Seal extends Animal {
    private boolean canSwim;
    private double weight;

    public Seal(int number_of_legs, String coat, Habitat habitat, boolean canSwim, double weight) {
        super(number_of_legs, coat, habitat);
        this.canSwim = canSwim;
        this.weight = weight;
    }

    public boolean getCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + "Seal [canSwim=" + canSwim + ", weight=" + weight + "]";
    }

    @Override
    public Animal clone() {
        Seal clonedSeal = new Seal(getNumber_of_legs(), getCoat(), getHabitat(), canSwim, weight);
        return clonedSeal;
    }
}
