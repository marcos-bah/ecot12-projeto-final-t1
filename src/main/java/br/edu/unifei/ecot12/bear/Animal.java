package br.edu.unifei.ecot12.bear;

public abstract class Animal {
    private int number_of_legs = 0;
    private String coat;
    private Habitat habitat;

    public Animal(int number_of_legs, String coat, Habitat habitat) {
        this.number_of_legs = number_of_legs;
        this.coat = coat;
        this.habitat = habitat;
    }

    protected abstract Animal clone();

    public int getNumber_of_legs() {
        return number_of_legs;
    }

    public void setNumber_of_legs(int number_of_legs) {
        this.number_of_legs = number_of_legs;
    }

    public String getCoat() {
        return coat;
    }

    public void setCoat(String coat) {
        this.coat = coat;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Animal [number_of_legs=" + number_of_legs + ", coat=" + coat + ", habitat=" + habitat.toString() + "]";
    }
}
