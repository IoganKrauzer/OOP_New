package ru.antipov.seminar_7.observer;

import java.util.Random;



public class Company {


    private String companyName;
    private Publisher jobAgency;
    private Vacancy vacancy;


    public Company(String companyName, Publisher jobAgency, Vacancy vacancy) {
        this.companyName = companyName;
        this.jobAgency = jobAgency;
        this.vacancy = vacancy;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Vacancy getVacancy() {
        return vacancy;
    }

    @Override
    public String toString() {
        return
                "----------------------------\nCompany name: " + companyName + vacancy;
    }

    public void needEmployee(){
        jobAgency.sendOffer(companyName, vacancy);
   }
}
