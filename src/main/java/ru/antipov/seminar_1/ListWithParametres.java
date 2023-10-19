package ru.antipov.seminar_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListWithParametres {

    public  static List<Object> listWithParametres;

    public ListWithParametres(List<Object> listWithParametres) {
        ListWithParametres.listWithParametres = listWithParametres;
    }

    static Scanner sc = new Scanner(System.in);
    private String name;
    private double price;
    private double volume;
    private double nicotine;
    private double fat;
    private double alcohol;

//        static Scanner sc = new Scanner(System.in);
//    public ListWithParametres(String name, double price, double volume, double nicotine, double fat, double alcohol) {
//        this.name = name;
//        this.price = price;
//        this.volume = volume;
//        this.nicotine = nicotine;
//        this.fat = fat;
//        this.alcohol = alcohol;
//    }

    public static List<Object> getListWithParametres() {
        return listWithParametres;
    }

    public static void setListWithParametres(List<Object> listWithParametres) {
        ListWithParametres.listWithParametres = listWithParametres;
    }

    public void parameteresForMilk() {
        System.out.println("Введите наименование товара");
        String name = sc.nextLine();
        System.out.println("Введите цену товара");
        double price = sc.nextDouble();
        System.out.println("Введите объем товара");
        double volume = sc.nextDouble();
        System.out.println("Введите жирность молока");
        double fat = sc.nextDouble();
        listWithParametres.add(0, name);
        listWithParametres.add(1, price);
        listWithParametres.add(2, volume);
        listWithParametres.add(3, fat);

    }

    public void parameteresForWater() {
        System.out.println("Введите наименование товара");
        String name = sc.nextLine();
        System.out.println("Введите цену товара");
        double price = sc.nextDouble();
        System.out.println("Введите объем товара");
        double volume = sc.nextDouble();
        listWithParametres.add(0, name);
        listWithParametres.add(1, price);
        listWithParametres.add(2, volume);
    }

    public void parameteresForCigarettes() {
        System.out.println("Введите наименование товара");
        String name = sc.nextLine();
        System.out.println("Введите цену товара");
        double price = sc.nextDouble();

        listWithParametres.add(0, name);
        listWithParametres.add(1, price);

    }

    public void parameteresForBeer() {
        System.out.println("Введите наименование товара");
        String name = sc.nextLine();
        System.out.println("Введите цену товара");
        double price = sc.nextDouble();
        System.out.println("Введите объем товара");
        double volume = sc.nextDouble();
        System.out.println("Введите количество алкоголя");
        double alcohol = sc.nextDouble();
        listWithParametres.add(0, name);
        listWithParametres.add(1, price);
        listWithParametres.add(2, volume);
        listWithParametres.add(3, alcohol);

    }
}


