package ru.antipov.seminar_7.observer;

public interface Publisher {

    void registerObserver (Observer observer);
    void removeObserver (Observer observer);
    boolean checkVacancyType (Observer observer, Vacancy vacancy);
    boolean checkWorkExperience(Observer observer, Vacancy vacancy);
    void sendOffer(String companyName, Vacancy vacancy);

}
