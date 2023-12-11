package ru.antipov.seminar_7.observer;

public interface Observer {

    void receiveOffer(String companyName, Vacancy vacancy);
    String getType();
    int getWorkExperience();
    String getName();
    int getSalary();



}
