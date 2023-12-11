package ru.antipov.seminar_7.observer;

import java.util.ArrayList;
import java.util.Collection;

public class JobAgency implements Publisher{

    private ArrayList<Observer> observers = new ArrayList<>();


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {

        observers.remove(observer);
    }


    @Override
    public boolean checkVacancyType(Observer observer, Vacancy vacancy) {
            if (observer.getType().equals(vacancy.getVacancyType())){
                return true;
            }
        return false;
        }

    @Override
    public boolean checkWorkExperience(Observer observer, Vacancy vacancy) {
        if (observer.getWorkExperience() >= vacancy.getWorkExperience()){
            return true;
        }
        return false;
    }

    @Override
    public void sendOffer(String companyName, Vacancy vacancy ) {

        for (Observer observer: observers){
            if ((checkVacancyType(observer, vacancy))  && (checkWorkExperience(observer, vacancy))){
                observer.receiveOffer(companyName, vacancy);
            }
            else {
                System.out.println(observer.getName() + " - нет соответствия условиям. "
                                + "Профессия: " + observer.getType() + " | Зарплата: " + observer.getSalary()
                                + " | Опыт работы: " + observer.getWorkExperience()
                                +"\nВакансия: " + vacancy );
            }
        }
    }
}
