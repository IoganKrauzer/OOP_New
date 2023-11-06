package ru.antipov.seminar_4;

import java.util.ArrayList;
import java.util.Random;

public class FruitBasket {

    private static ArrayList<Fruit> fruitsBasket = new ArrayList<>();

    private static Random random = new Random();

    public static Fruit generateFruit() {
        int choices = random.nextInt(1, 3);
        if (choices == 1) {
            return new Apple();
        } else {
            return new Orange();
        }
    }

    public static ArrayList<Fruit> generateBasket(int count) {

        for (int i = 0; i < count; i++) {
            fruitsBasket.add(generateFruit());
        }
        return fruitsBasket;
    }

    @Override
    public String toString() {
        return "FruitBasket{}";
    }
}
