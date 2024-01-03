package ru.antipov.toy_shop;

public class Toy {

    int id;
    String name;
    int quantity;
    double rate;

    public Toy(int id, String name, int quantity, double weight) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.rate = weight;
    }

    public int getId() {
        return id;
    }

    public void setRate(double weight) {
        this.rate = weight;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return String.format("--------------------\ntoy id: %d | toy name: %s | toy quantity: %d | toy weight: %.1f %%",
                id, name, quantity, rate);
    }
}
