package ru.antipov.seminar_5.models;

import ru.antipov.seminar_5.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {

    private Collection<Table> tables;
    @Override
    public Collection<Table> loadTables() {
        if (tables == null){
            tables = new ArrayList<>();
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }


    @Override
    public int reservationTable(Date reservationDate, int tableNo, String surname) {
        for (Table table: loadTables()){
            if (table.getNo() == tableNo){
                Reservation reservation = new Reservation(table, reservationDate, surname);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        throw new RuntimeException("Некорректный номер столика");
    }

    @Override
    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String surname) {

        for (Table table: loadTables()) {
            for (Reservation reservation : table.getReservations()) {
                if (reservation.getId() == oldReservation){
                    table.getReservations().remove(reservation);
                    break;
                }
            }
        }
        return reservationTable(reservationDate, tableNo, surname);
    }

    public void check(){
        for (Table table: loadTables()){
            System.out.println(table.getReservations());
        }
    }
}
