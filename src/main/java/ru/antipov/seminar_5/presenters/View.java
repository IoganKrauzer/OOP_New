package ru.antipov.seminar_5.presenters;

import ru.antipov.seminar_5.models.Table;

import java.util.Collection;

public interface View {

    void showTables (Collection<Table> tables);

    void registerObserver(ViewObserver observer);

    void showReservationTableResult(int reservationNumber);
}
