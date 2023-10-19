package ru.antipov.seminar_1;

public class PackageOfCigarettes extends Product {

    double nicotine;

    public PackageOfCigarettes(String name, double price, double nicotine) {
        super(name, price);
        this.nicotine = nicotine;
    }

    public double getNicotine() {
        return nicotine;
    }

    public void setNicotine(double nicotine) {
        if (nicotine < 0.2 || nicotine > 1){
            nicotine = 0.4;
        }
        else{
            this.nicotine = nicotine;
        }
    }

    @Override
    public String toString() {
        return "# PackageOfCigarettes: { "
                + "name = " + getName() + " | "
                + "price = " + getPrice() + " | "
                + "nicotine = " + getNicotine()
                + " }\n";
    }
}
