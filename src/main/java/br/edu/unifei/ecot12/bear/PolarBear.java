package br.edu.unifei.ecot12.bear;

public class PolarBear extends Bear {

    public PolarBear(int number_of_legs, String coat, Habitat habitat, int age, String furColor, BearState state) {
        super(number_of_legs, coat, habitat, age, furColor, state);
    }

    public void swimming() {
        System.out.println("Swimming");
    }

    public void huntingSeals() {
        System.out.println("Hunting");
    }


    public Bear clone() {
        PolarBear p = new PolarBear(getNumber_of_legs(), getCoat(), getHabitat(), getNumber_of_legs(), getCoat(),
                getState());
        return p;
    }

    @Override
    public String toString() {
        return super.toString() + "PolarBear []";
    }
}
