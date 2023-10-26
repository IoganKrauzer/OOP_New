package ru.antipov.seminar_3;

public abstract class Employee implements Comparable<Employee> {

    protected String name;
    protected String surName;
    protected int salaryRate;
    protected String developDepartment;


    public Employee(String surName, String name, int salaryRate, String developDepartment) {
        this.surName = surName;
        this.name = name;
        this.salaryRate = salaryRate;
        this.developDepartment = developDepartment;

    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getSalaryRate() {
        return salaryRate;
    }

    public String getDevelopDepartment(){
    return developDepartment;
}

    public abstract int calculateSalary();

    @Override
    public String toString() {
        return String.format("---------------------------" +
                "\nEmployee:" +
                "\nName = " + name +
                "\nSurname = '" + surName +
                "\nSalary rate = " + salaryRate +
                "\nDevelopment Department = " + developDepartment);
    }

    @Override
    public int compareTo(Employee o) {
        int surNameRes = surName.compareTo(o.surName);
        if (surNameRes == 0 ){
            return name.compareTo(o.name);
        }
        return surNameRes;
    }
}
