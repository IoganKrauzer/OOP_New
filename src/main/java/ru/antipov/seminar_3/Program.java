package ru.antipov.seminar_3;


import java.util.ArrayList;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {

        Employee [] employees = EmployeesFabric.generateEmployees(15);
        for (Employee e: employees){
            System.out.println(e);
        }

        System.out.println("---------------------------");
        System.out.println("----DEVELOP DEP CMPRTR-----");
        Arrays.sort(employees, new DevelopDepComporator());
        for (Employee e: employees){
            System.out.println(e);
        }

        System.out.println("---------------------------");
        System.out.println("-----SALARY COMPORATOR-----");
        Arrays.sort(employees, new SalaryComporator());
        for (Employee e: employees){
            System.out.println(e);
        }

        ArrayList<CompareAge> compareAge = new ArrayList<>();
        int i =0;
        while (i < 10){
            try {
                var emp = (CompareAge) EmployeesFabric.generateEmployee();
                if (!(emp instanceof Freelancer)) {
                    compareAge.add(i, emp);
                    i++;
                }
            }
           catch (ClassCastException ignored){
           }
        }

        System.out.println("---------------------------");
        System.out.println("------AGE COMPORATOR-------");
        compareAge.sort(new AgeComporator());
        for (CompareAge c: compareAge){
            System.out.println(c);
        }

        System.out.println("---------------------------");
        System.out.println("-----COMPARABLE for FI-----");
        Arrays.sort(employees);
        for (Employee e: employees){
            System.out.println(e);
        }
    }
}
