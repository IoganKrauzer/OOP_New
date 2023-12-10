package ru.antipov.seminar_7.factory;

public class Freelancer extends Employee{


    public Freelancer(String name, String surName, double salary) {
        super(name, surName, salary);
    }

    @Override
    public double calculateSalary() {
        return 20.8 * 8 * salary;
    }



}
