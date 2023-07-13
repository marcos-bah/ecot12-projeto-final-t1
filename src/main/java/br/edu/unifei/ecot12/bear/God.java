package br.edu.unifei.ecot12.bear;

import java.util.ArrayList;

public class God {
    private ArrayList<Animal> animais = new ArrayList<Animal>();

    public void multiply() {
        for (Animal animal : animais) {
            Animal clone = animal.clone();
            System.out.println("Clone: " + clone.toString());
            System.out.println("----------------------------------------");
        }
    }

    public ArrayList<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(ArrayList<Animal> animais) {
        this.animais = animais;
    }

    public God() { }

}
