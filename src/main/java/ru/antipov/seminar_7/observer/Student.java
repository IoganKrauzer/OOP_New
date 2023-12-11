package ru.antipov.seminar_7.observer;

import java.util.ArrayList;

public class Student implements Observer {

    protected String name;
    protected int salary;
    protected String typeOfWork;
    protected int workExperience;


    public Student(String name, int salary, String typeOfWork, int workExperience) {
        this.name = name;
        this.salary = salary;
        this.typeOfWork = typeOfWork;
        this.workExperience = workExperience;
    }


    @Override
    public String getType() {
        return typeOfWork;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public int getWorkExperience() {
        return workExperience;
    }

    @Override
    public void receiveOffer(String companyName, Vacancy vacancy) {
        if (this.salary <= vacancy.getSalary()) {
            if (this.salary <= vacancy.getSalary()) {
                System.out.printf("Студент %s: Мне нужна эта работа! Компания: %s; Зарплата: %d; Вакансия: %s\n",
                        name, companyName, vacancy.getSalary(), vacancy.getVacancyType());
            } else {
                System.out.printf("Студент %s: Я найду работу получше! Компания: %s; Зарплата: %d; Вакансия: %s\n",
                        name, companyName, vacancy.getSalary(), vacancy.getVacancyType());
            }
        }
    }

    @Override
    public String toString() {
        return "\nName: " + name + " | Salary: " + salary + " | WorkExperience: " + workExperience +
                "\nPrefer Vacancies: " + typeOfWork + "\n----------------------------";
    }
}

