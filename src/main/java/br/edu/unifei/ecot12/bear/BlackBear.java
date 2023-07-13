package br.edu.unifei.ecot12.bear;

public class BlackBear extends Bear {

    private Park park;

    public Park getPark() {
        return park;
    }

    public void setPark(Park park) {
        this.park = park;
    }

    public BlackBear(int number_of_legs, String coat, Habitat habitat, int age, String furColor, BearState state,
            Park park) {
        super(number_of_legs, coat, habitat, age, furColor, state);
        this.park = park;
    }

    public void forageForFood() {
        System.out.println("Forage For Food");
    }

    public Bear clone() {
        BlackBear b = new BlackBear(getNumber_of_legs(), getCoat(), getHabitat(), getNumber_of_legs(), getCoat(),
                getState(), park);

        return b;
    }

    @Override
    public String toString() {
        return super.toString() + "BlackBear [park=" + park + "]";
    }
}
