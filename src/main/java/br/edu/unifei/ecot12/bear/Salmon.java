package br.edu.unifei.ecot12.bear;

public class Salmon extends Animal{
    private int size;
    private boolean isWild;

    public Salmon(int number_of_legs, String coat, Habitat habitat, int size, boolean isWild) {
        super(number_of_legs, coat, habitat);
        this.size = size;
        this.isWild = isWild;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean isWild) {
        this.isWild = isWild;
    }

    public void swim() {
        System.out.println("Swim");
    }

    public void jump() {
        System.out.println("Jump");
    }

    public boolean isGoodCatch() {
        if (isWild) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "Salmon [size=" + size + ", isWild=" + isWild + "]";
    }

    @Override
    public Animal clone() {
        Salmon s = new Salmon(getNumber_of_legs(), getCoat(), getHabitat(), size, isWild);
        return s;
    }
}
