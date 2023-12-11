package ru.antipov.seminar_7.observer;

import java.util.Random;

public class Vacancy {

    private String vacancyType;
    private int salary;
    private int workExperience;

    public Vacancy(String vacancyType, int salary, int workExperience) {
        this.vacancyType = vacancyType;
        this.salary = salary;
        this.workExperience = workExperience;
    }

    public String getVacancyType() {
        return vacancyType;
    }

    public int getSalary() {
        return salary;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    @Override
    public String toString() {
        return "\n----------------------------\nVacancy: "
                + vacancyType +
                "\nSalary: " + salary +
                "\nWorkExperience: " + workExperience
                + "\n----------------------------\n";
    }
}
