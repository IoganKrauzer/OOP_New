package ru.antipov.seminar_3;

public class Freelancer extends Employee {

    private int workHoursPerMonth;
    public Freelancer(String surName, String name,  int salaryRate,
                      int workHoursPerMonth, String developDepartment) {
        super(surName, name, salaryRate, developDepartment);
        this.workHoursPerMonth = workHoursPerMonth;
    }

    @Override
    public int calculateSalary() {
        return salaryRate * workHoursPerMonth;
    }

    @Override
    public String toString() {
        return String.format("---------------------------" +
                "\nFreelancer:" +
                "\nSurname = " + surName +
                "\nName = " + name +
                "\nSalary rate = " + salaryRate + " руб./ч." +
                "\nSalary = " + calculateSalary() + " руб." +
                "\nWork hours per month: " + workHoursPerMonth +
                "\nDevelopment Department = " + developDepartment);
    }
}
