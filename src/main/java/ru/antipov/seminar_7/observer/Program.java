package ru.antipov.seminar_7.observer;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        Publisher publisher = new JobAgency();

        Company google = new Company("Google", publisher, VacancyGenerate.generateVacancy());
        Company yandex = new Company("Yandex", publisher, VacancyGenerate.generateVacancy());
        Company gb = new Company("GB", publisher, VacancyGenerate.generateVacancy());

        Observer client1 = EmployeeFabric.generateJobSeekers();
        Observer client2 = EmployeeFabric.generateJobSeekers();
        Observer client3 = EmployeeFabric.generateJobSeekers();
        Observer client4 = EmployeeFabric.generateJobSeekers();
        System.out.println(client1);
        System.out.println(client2);
        System.out.println(client3);
        System.out.println(client4);

        publisher.registerObserver(client1);
        publisher.registerObserver(client2);
        publisher.registerObserver(client3);
        publisher.registerObserver(client4);

        google.needEmployee();
        yandex.needEmployee();
        gb.needEmployee();
        }
        }









//    ArrayList<Observer> testList = EmployeeFabric.generateListOfEmployees(5);
//        System.out.println(testList.toString()
//                .replace(",", " ")
//                .replace("[","")
//                .replace("]", ""));
//
//                Vacancy vacancy1 = VacancyGenerate.generateVacancy();
//                System.out.println(vacancy1);
//



//        Publisher publisher = new JobAgency();
//        Company google = new Company("Google", publisher, 120_000);
//        Company yandex = new Company("Yandex", publisher, 95_000);
//        Company gb = new Company("GB", publisher, 98_000);
//
//        Student student1 = new Student("Student #1");
//        Master master1 = new Master("Master #1");
//        Master master2 = new Master("Master #2");
//
//        publisher.registerObserver(student1);
//        publisher.registerObserver(master1);
//        publisher.registerObserver(master2);
//
//        for (int i = 0; i < 3; i++) {
//            google.needEmployee();
//            yandex.needEmployee();
//            gb.needEmployee();
