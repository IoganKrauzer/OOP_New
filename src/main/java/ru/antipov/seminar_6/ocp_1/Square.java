package ru.antipov.seminar_6.ocp_1;

public class Square implements Shape{

    protected int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }
}
