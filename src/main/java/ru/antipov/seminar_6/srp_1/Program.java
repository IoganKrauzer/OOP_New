package ru.antipov.seminar_6.srp_1;

public class Program {
    public static void main(String[] args) {

        Square square = new Square(new Point(1, 1),5);
        System.out.println("Площадь фигуры: " + square.getArea());
        SquareDrawer squareDrawer = new SquareDrawer(square, 2);
        squareDrawer.draw();
    }
}
