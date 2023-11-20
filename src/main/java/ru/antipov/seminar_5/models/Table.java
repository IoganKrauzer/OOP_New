package ru.antipov.seminar_5.models;

import java.util.ArrayList;
import java.util.Locale;

public class Table {

    private static int counter;
    private final int no;
    private final ArrayList<Reservation> reservations = new ArrayList<>();

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public int getNo() {
        return no;
    }

    public Table(){
        no = ++counter;
    }

    /*
    Что за Locale.getDefault()
     */
    @Override
    public String toString() {
        return String.format(Locale.getDefault(), "Столик #%d", no);
    }
}
