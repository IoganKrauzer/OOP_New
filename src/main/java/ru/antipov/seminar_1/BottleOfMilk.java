package ru.antipov.seminar_1;

public class BottleOfMilk extends  Product {

    double fat;
    double volume;

    public BottleOfMilk(String name, double price,double volume, double fat) {
        super(name, price);
        this.volume = volume;
        this.fat = fat;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        if (fat < 0 || fat > 3.5){
            fat = 1.5;
        }
        else {
            this.fat = fat;
        }
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
        return "# BottleOfMilk: { "
                + "name = " + getName() + " | "
                + "price = " + getPrice() + " | "
                + "volume = " + getVolume() + " | "
                + "fat = " + getFat()
                + " }\n";
    }
}
