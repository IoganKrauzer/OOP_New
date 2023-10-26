package ru.antipov.seminar_3;

import java.util.Comparator;

public class SalaryComporator implements Comparator <Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o2.calculateSalary(), o1.calculateSalary());
    }
}
