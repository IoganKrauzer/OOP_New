package ru.antipov.seminar_6.ocp_1;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new RightTriangle(3, 4));
        shapes.add(new Square(4));
        shapes.add(new Circle(4));

        CalcAreaService calcAreaService = new CalcAreaService(shapes);
        calcAreaService.processAll();
    }


}
