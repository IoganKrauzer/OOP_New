package ru.antipov.seminar_7.observer;

public class Program {

    public static void main(String[] args) {

        Publisher publisher = new JobAgency();
        Company google = new Company("Google", publisher, 120_000);
        Company yandex = new Company("Yandex", publisher, 95_000);
        Company gb = new Company("GB", publisher, 98_000);

        Student student1 = new Student("Student #1");
        Master master1 = new Master("Master #1");
        Master master2 = new Master("Master #2");

        publisher.registerObserver(student1);
        publisher.registerObserver(master1);
        publisher.registerObserver(master2);

        for (int i = 0; i < 3; i++) {
            google.needEmployee();
            yandex.needEmployee();
            gb.needEmployee();
        }
    }
}
