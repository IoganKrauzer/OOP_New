package ru.antipov.seminar_4;

import java.util.ArrayList;


public class Box <T extends Fruit> {

    private ArrayList<T> fruits = new ArrayList<>();



    public void addFruitInBox(T fruit){
        fruits.add(fruit);
    }

    public float getWeight(){
        float sumWeight = 0.0f;
        for (Fruit f: fruits){
            sumWeight += f.getWeight();
        }
        return sumWeight;
    }

    public boolean compareWeight(Box other){
        return getWeight() == other.getWeight();
    }

//    public boolean compareType(Box other){
//        return basketType().equals(other.basketType());
//    }

    public T getFruit() {
        return fruits.get(0);
    }

    public void deleteFruit(){
        fruits.remove(0);
    }

//    public ArrayList<T> getFruits() {
//        return fruits;
//    }
//
//    public int boxSize(){
//        return fruits.size();
//    }

    @Override
    public String toString() {
        return ""  + fruits ;
    }


}

