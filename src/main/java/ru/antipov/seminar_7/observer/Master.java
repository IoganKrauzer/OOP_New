package ru.antipov.seminar_7.observer;

public class Master implements Observer {

    private String name;
    private int salary = 80_000;

    public Master(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String companyName, int salary) {
        if (this.salary <= salary) {
            System.out.printf("Специалист %s: Мне нужна эта работа! Компания: %s; Зарплата: %d\n",
                    name, companyName, salary);
            this.salary = salary;
        } else {
            System.out.printf("Специалист %s: Я найду работу получше! Компания: %s; Зарплата: %d\n",
                    name, companyName, salary);
        }
    }
}
