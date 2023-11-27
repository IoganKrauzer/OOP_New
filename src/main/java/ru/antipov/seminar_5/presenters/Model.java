package ru.antipov.seminar_5.presenters;

import ru.antipov.seminar_5.models.Table;
import java.util.Collection;
import java.util.Date;

public interface Model {

    Collection<Table> loadTables();

    int reservationTable (Date reservationDate, int tableNo, String surname);

    int changeReservationTable (int oldReservation, Date reservationDate, int tableNo, String surname);
}
