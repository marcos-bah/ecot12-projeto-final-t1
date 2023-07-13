package br.edu.unifei.ecot12.bear;

public abstract class Bear extends Animal {
    private int age;
    private String furColor;
    private BearState state;

    public Bear(int number_of_legs, String coat, Habitat habitat,int age, String furColor, BearState state) {
        super(number_of_legs, coat, habitat);
        this.age = age;
        this.furColor = furColor;
        this.state = state;
    }

    public void toggle() {
        state.invert(this);
    }

    public void setState(BearState state) {
        this.state = state;
    }

    public BearState getState() {
        return state;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Bear [" +
                "age=" + age +
                ", furColor='" + furColor + '\'' +
                ", state=" + state +
                ']';
    }
}
