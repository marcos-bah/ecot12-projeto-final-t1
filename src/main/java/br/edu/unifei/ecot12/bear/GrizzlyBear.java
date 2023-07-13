package br.edu.unifei.ecot12.bear;

public class GrizzlyBear extends Bear{

    public GrizzlyBear(int number_of_legs, String coat, Habitat habitat, int age, String furColor, BearState state) {
        super(number_of_legs, coat, habitat, age, furColor, state);
    }

    public void fishForSalmon() {
        System.out.println("Fish For Salmon");
    }

    public void climbTrees() {
        System.out.println("Climb Trees");
    }

    public Bear clone() {
        GrizzlyBear g = new GrizzlyBear(getNumber_of_legs(), getCoat(), getHabitat(), getNumber_of_legs(), getCoat(),
                getState());
        return g;
    }

    @Override
    public String toString() {
        return super.toString() + "GrizzlyBear []";
    }
}
