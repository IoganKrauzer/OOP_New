package ru.antipov.seminar_6.ocp_1;

public class Circle implements Shape {


    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }


}
