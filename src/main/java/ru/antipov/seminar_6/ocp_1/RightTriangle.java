package ru.antipov.seminar_6.ocp_1;

public class RightTriangle implements Shape{

    private int katet1;
    private int katet2;
    private double gipotenuza;

    public RightTriangle(int katet1, int katet2) {
        this.katet1 = katet1;
        this.katet2 = katet2;
        gipotenuza = Math.pow(katet1, 2) + Math.pow(katet2, 2);
    }

    public double getKatet1() {
        return katet1;
    }

    public double getKatet2() {
        return katet2;
    }

    public double getGipotenuza() {
        return gipotenuza;
    }

    @Override
    public double getArea() {
        return katet1 * katet2 / 2.0;
    }
}
