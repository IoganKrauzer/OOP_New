package ru.antipov.seminar_7.factory;

public class Worker extends Employee{

    public Worker(String name, String surName, double salary) {
        super(name, surName, salary);
    }
    @Override
    public double calculateSalary() {
        return salary;
    }


}
