package ru.antipov.seminar_1;

public class BottleOfWater extends  Product {

    double volume;

    public BottleOfWater(String name, double price, double volume) {
        super(name, price);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        if (volume < 0 || volume > 1){
            volume = 0.5;
        }
        else {
            this.volume = volume;
        }
    }

    @Override
    public String toString() {
        return "# BottleOfWater: { "
                + "name = " + getName() + " | "
                + "price = " + getPrice() + " | "
                + "volume = " + getVolume()
                + " }\n";
    }
}
