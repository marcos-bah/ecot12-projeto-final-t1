package br.edu.unifei.ecot12.bear;

public class Human extends Animal {
    private String name;
    private int age;
    private City city;
    private Bear watch;

    public Human(int number_of_legs, String coat, Habitat habitat, String name, int age, City city, Bear watch) {
        super(number_of_legs, coat, habitat);
        this.name = name;
        this.age = age;
        this.city = city;
        this.watch = watch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Bear getWatch() {
        return watch;
    }

    public void setWatch(Bear watch) {
        this.watch = watch;
    }

    public Human clone() {
        Human h = new Human(age, name, getHabitat(), name, age, city, watch);
        return h;
    }

    @Override
    public String toString() {
        return super.toString() + "Human [name=" + name + ", age=" + age + ", city=" + city + ", watch=" + watch + "]";
    }
}
