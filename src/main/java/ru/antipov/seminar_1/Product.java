package ru.antipov.seminar_1;

public class Product {

    private String name;

    private double price;

    public Product (String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 3 ) {
            name = "InvalidName";
        } else {
            this.name = name;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
