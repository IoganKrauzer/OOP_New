package ru.antipov.seminar_2;

public class Cat implements Feeding{

    private String name;
    private int appetite;

    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    @Override
    public boolean eat(int food){
        if (appetite <= food) {
            System.out.printf("%s поел и доволен!\n", name);
            return true;
        }
        else {
            System.out.printf("%s остался голодным...\n", name);
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }
}
