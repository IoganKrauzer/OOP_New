package ru.antipov.seminar_5.models;


import java.util.Date;

public class Reservation {

    private static int counter = 1000;
    private final int id;
    private final Table table;
    private Date date;
    private String surname;

    public int getId() {
        return id;
    }

    public Table getTable() {
        return table;
    }

    public Reservation(Table table, Date date, String surname) {
        this.date = date;
        this.surname = surname;
        this.table = table;
        id = ++counter;
    }

    @Override
    public String toString() {
        return String.format("Reservation: | %d | %s | %s | %s |", id, table, date, surname);
    }
}
