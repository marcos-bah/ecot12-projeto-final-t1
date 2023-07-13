package br.edu.unifei.ecot12.bear;

public class Tree {
    private int age;
    private int height;

    public Tree(int age, int height) {
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Tree [age=" + age + ", height=" + height + "]";
    }
}
