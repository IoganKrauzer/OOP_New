package ru.antipov.seminar_6.ocp_1;

import java.util.List;

public class CalcAreaService {

    private List<Shape> shapes;

    public List<Shape> getShapes() {
        return shapes;
    }

    public CalcAreaService(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public void processAll(){
        double sumArea = 0;
        for (Shape shape: shapes){
            sumArea += shape.getArea();
        }
        System.out.printf("Сумма площадей всех фигур: %.1f\n", sumArea);
    }
}
