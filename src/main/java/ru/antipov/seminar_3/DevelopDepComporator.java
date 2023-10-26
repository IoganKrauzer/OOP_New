package ru.antipov.seminar_3;

import java.util.Comparator;

public class DevelopDepComporator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getDevelopDepartment().compareTo(o2.getDevelopDepartment());
    }
}
