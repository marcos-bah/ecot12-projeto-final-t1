package br.edu.unifei.ecot12.bear;

public class Ocean {
    private String name;
    private float depth;
    private float temperature;

    public Ocean(String name, float depth, float temperature) {
        this.name = name;
        this.depth = depth;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Ocean [name=" + name + ", depth=" + depth + ", temperature=" + temperature + "]";
    }
}
