package ru.antipov.seminar_4;

import java.util.ArrayList;

public class Program {

//    public static void loadingUploading(Box box1, Box box2){
//        if (box1.compareType(box2)){
//            box2.addFruitInBox(box1.basketType());
//            box1.deleteFruit();
//            System.out.println("Фрукт был успешно переложен");
//        }
//        else {
//            System.out.println("Корзины с фруктами несопостовимы");
//        }
//    }

//    public static void loadingUploading(Box box1, Box box2) {
//        box2.addFruitInBox(box1.getFruit());
//        box1.deleteFruit();
//        System.out.println("Фрукт был успешно переложен");
//    }
//        else
//
//    {
//        System.out.println("Корзины с фруктами несопостовимы");
//    }


    public static void main(String[] args) {

        ArrayList<Fruit> fruitBasket = FruitBasket.generateBasket(10);
        System.out.println("--------------------------");
        System.out.println("Корзина с фруктами: " + fruitBasket.toString().replace("[","").replace("]", ""));

        Box<Apple> box1 = new Box<>();
        Box<Orange> box2 = new Box<>();
//        Box<Apple> box3 = new Box<>();
//        Box<Orange> box4 = new Box<>();

        for (Fruit fruit: fruitBasket){
            if (fruit instanceof Apple){
                box1.addFruitInBox((Apple) fruit);
            }
            else {
                box2.addFruitInBox((Orange) fruit);
            }
        }
//        box3.addFruitInBox(new Apple());

        System.out.println("--------------------------");
        System.out.println("Коробка 1: " + box1.toString().replace("[","").replace("]", ""));
        System.out.println("Коробка 2: " + box2.toString().replace("[","").replace("]", ""));
        System.out.printf("\nКоробка с яблоками весит: %.2f", box1.getWeight());
        System.out.printf("\nКоробка с апельсинами весит: %.2f", box2.getWeight());


//        System.out.printf("\nКоробка с яблоками весит: %.2f", box3.getWeight());
//        System.out.printf("\nКоробка с апельсинами весит: %.2f", box4.getWeight());
        System.out.println("\n--------------------------");
        String resultOfCompare = box1.compareWeight(box2) ? "Коробки имеют одинаковый вес" : "Вес у коробок разный";
        System.out.println(resultOfCompare);
//
//        loadingUploading(box1, box3);
//        loadingUploading(box1, box2);
//
//        System.out.printf("\nКоробка с яблоками весит: %.2f", box1.getWeight());
//        System.out.printf("\nКоробка с апельсинами весит: %.2f", box2.getWeight());
//        System.out.printf("\nКоробка с яблоками весит: %.2f", box3.getWeight());
//        System.out.printf("\nКоробка с апельсинами весит: %.2f", box4.getWeight());


    }
}
