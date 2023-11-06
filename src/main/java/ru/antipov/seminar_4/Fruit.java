package ru.antipov.seminar_4;

public abstract class Fruit {

    private final float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {

        return weight;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "weight=" + weight +
                '}';
    }
}
