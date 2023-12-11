package ru.antipov.seminar_7.observer;

import java.util.Random;

public class VacancyGenerate {

    private static Random random = new Random();
    private Vacancy vacancy;


    private static Vacancy generateVacancy(VacancyType vacancyType){
        return switch (vacancyType){
            case JuniorProgrammer -> new Vacancy("JuniorProgrammer",
                    random.nextInt(35_000, 60_000), 0);
            case MiddleProgrammer -> new Vacancy("MiddleProgrammer",
                    random.nextInt(120_000, 150_000), random.nextInt(1,4));
            case SeniorProgrammer -> new Vacancy("SeniorProgrammer",
                    random.nextInt(220_000, 250_000), random.nextInt(5,8));
            case Cleaner -> new Vacancy("Cleaner",
                    random.nextInt(35_000, 40_000), 0);
            case Cook -> new Vacancy("Cook",
                    random.nextInt(70_000, 90_000), random.nextInt(1,4));
        };
    }

    public static Vacancy generateVacancy(){
        int typeIndex = random.nextInt(5);
        return switch (typeIndex){
            case 0 -> generateVacancy(VacancyType.JuniorProgrammer);
            case 1 -> generateVacancy(VacancyType.MiddleProgrammer);
            case 2 -> generateVacancy(VacancyType.SeniorProgrammer);
            case 3 -> generateVacancy(VacancyType.Cleaner);
            case 4 -> generateVacancy(VacancyType.Cook);
            default -> null;
        };
    }
}
