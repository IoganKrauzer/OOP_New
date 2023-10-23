package ru.antipov.seminar_2;

import java.util.Scanner;

public class Plate {

    protected int food;

    public Plate(int food) {
        this.food = food;
    }

    Scanner sc = new Scanner(System.in);

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void showPlateInfo(){
        System.out.printf("На тарелке находится %d ед. еды\n", food);
    }

    public void addFood(){
        System.out.printf("На тарелке оставалось %d ед. еды\n", getFood());
        System.out.println("Сколько ед. еды вы хотите добавить?");
        int foodAdd = sc.nextInt();
        setFood(getFood() + foodAdd);
        System.out.printf("Вы добавили %d ед. еды на тарелку, теперь на тарелке %d ед. еды\n", foodAdd, getFood());
    }
}
