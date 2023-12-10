package ru.antipov.seminar_7.observer;

public interface Publisher {

    void registerObserver (Observer observer);
    void removeObserver (Observer observer);
    void sendOffer(String companyName, int salary);
}
