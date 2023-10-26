package ru.antipov.seminar_3;

public class PartTimeWorker extends Employee implements CompareAge{

    int age;
    String education;

    public PartTimeWorker(String surName, String name,  int salaryRate, int age,
                          String education, String developDepartment) {
        super(surName, name, salaryRate, developDepartment);
        this.age = age;
        this.education = education;
    }

    public int getAge() {
        return age;
    }



    @Override
    public String toString() {
        return String.format("---------------------------" +
                "\nPartTimeWorker:" +
                "\nSurname = " + surName +
                "\nName = " + name +
                "\nAge = " + age +
                "\nSalary rate = " + salaryRate + " руб./ч." +
                "\nSalary = " + calculateSalary() + " руб." +
                "\nEducation = " + education +
                "\nDevelopment Department = " + developDepartment);
    }

    @Override
    public int calculateSalary() {
        return salaryRate * 20 * 4;
    }
}
