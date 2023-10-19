package ru.antipov.seminar_1;

public class CanOfBeer extends Product {

    private double volume;
    private double alcohol;

    public CanOfBeer(String name, double price, double volume, double alcohol) {
        super(name, price);
        this.volume = volume;
        this.alcohol = alcohol;
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

    public double getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(double alcohol) {
        if(alcohol < 3 || alcohol > 6){
            alcohol = 4.5;
        }
        else{
            this.alcohol = alcohol;
        }
    }

    @Override
    public String toString() {
        return "# CanOfBeer: { "
                + "name = " + getName() + " | "
                + "price = " + getPrice() + " | "
                + "volume = " + getVolume() + " | "
                + "alcohol = " + getAlcohol()
                + " }\n";
    }
}

