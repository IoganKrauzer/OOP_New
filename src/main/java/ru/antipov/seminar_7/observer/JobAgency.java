package ru.antipov.seminar_7.observer;

import java.util.ArrayList;
import java.util.Collection;

public class JobAgency implements Publisher{

    private Collection<Observer> observers = new ArrayList<>();


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void sendOffer(String companyName, int salary) {
//        System.out.printf("Компания %s предлагает зарплату - %d", companyName, salary);
        for (Observer observer: observers){
            observer.receiveOffer(companyName, salary);
        }
    }
}
