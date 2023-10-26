package ru.antipov.seminar_3;

public class Worker extends Employee implements CompareAge{

    int age;

    public Worker(String surName, String name, int salaryRate, int age,  String developDepartment) {
        super(surName, name,  salaryRate, developDepartment);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int calculateSalary() {
        return salaryRate * 40 * 4;
    }

    @Override
    public String toString() {
        return String.format("---------------------------" +
                "\nWorker:" +
                "\nSurname = " + surName +
                "\nName = " + name +
                "\nAge = " + age +
                "\nSalary rate = " + salaryRate + " руб./ч." +
                "\nSalary = " + calculateSalary() + " руб." +
                "\nDevelopment Department = " + developDepartment);
    }
}
