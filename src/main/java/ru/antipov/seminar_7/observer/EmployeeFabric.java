package ru.antipov.seminar_7.observer;

import java.util.ArrayList;
import java.util.Random;

public class EmployeeFabric {

    private static Random random = new Random();

    private static int studentCounter = 0;
    private static int masterCounter = 0;
    private static int cookCounter = 0;


    public static ArrayList<Observer> generateListOfEmployees(int counter) {
        ArrayList<Observer> listOfEmployees = new ArrayList<>();
        for (int i = 0; i < counter; i++) {
            listOfEmployees.add(generateJobSeekers());
        }
        return listOfEmployees;
    }

    public static Observer generateJobSeekers() {
        int typeChoice = random.nextInt(3);
        return switch (typeChoice) {
            case 0 -> generateJobSeekers(EmployeeTypes.Student);
            case 1 -> generateJobSeekers(EmployeeTypes.Master);
            case 2 -> generateJobSeekers(EmployeeTypes.Cook);
            default -> null;
        };
    }

    public static Observer generateJobSeekers(EmployeeTypes employeeTypes) {

        String [] list = {"JuniorProgrammer", "MiddleProgrammer", "SeniorProgrammer", "Cleaner", "Cook"};

        return switch (employeeTypes) {
            case Student -> new Student("Student #" + ++studentCounter, random.nextInt(4_000, 8_001),
                    list[0], random.nextInt(0, 3));
            case Master -> new Master("Master #" + ++masterCounter, random.nextInt(70_000, 120_001),
                    list[random.nextInt(1,3)], random.nextInt(0, 3));
            case Cook -> new Cook("Cook #" + ++cookCounter, random.nextInt(30_000, 90_001),
                    list[random.nextInt(3,5)], random.nextInt(1, 5));
        };
    }




//    private static ArrayList<VacancyType> generateTypeWorksForStudent() {
//
//        VacancyType[] vacancyTypeForStudent = {VacancyType.JuniorProgrammer,
//                VacancyType.MiddleProgrammer, VacancyType.Cleaner};
//        int counterForTypes = random.nextInt(1, 3);
//        ArrayList<VacancyType> preferTypeOfWorks = new ArrayList<>();
//        for (int i = 0; i < counterForTypes; i++) {
//            preferTypeOfWorks.add(vacancyTypeForStudent[i]);
//        }
//        return preferTypeOfWorks;
//    }
//
//    private static ArrayList<VacancyType> generateTypeWorksForMaster() {
//
//        VacancyType[] vacancyTypeForMaster = {VacancyType.JuniorProgrammer,
//                VacancyType.MiddleProgrammer, VacancyType.SeniorProgrammer};
//        int counterForTypes = random.nextInt(1, 3);
//        ArrayList<VacancyType> preferTypeOfWorks = new ArrayList<>();
//        for (int i = 0; i < counterForTypes; i++) {
//            preferTypeOfWorks.add(vacancyTypeForMaster[i]);
//        }
//        return preferTypeOfWorks;
//
//    }
//
//    private static ArrayList<VacancyType> generateTypeWorksForCook() {
//
//        VacancyType[] vacancyTypeForCook = {VacancyType.Cleaner, VacancyType.Cook};
//        int counterForTypes = random.nextInt(1, 2);
//        ArrayList<VacancyType> preferTypeOfWorks = new ArrayList<>();
//        for (int i = 0; i < counterForTypes; i++) {
//            preferTypeOfWorks.add(vacancyTypeForCook[i]);
//        }
//        return preferTypeOfWorks;
//    }

}
