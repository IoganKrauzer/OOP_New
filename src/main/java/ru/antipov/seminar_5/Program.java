package ru.antipov.seminar_5;

import ru.antipov.seminar_5.models.TableModel;
import ru.antipov.seminar_5.presenters.BookingPresenter;
import ru.antipov.seminar_5.views.BookingView;
import java.util.Date;

public class Program {
    public static void main(String[] args) {

        TableModel tableModel = new TableModel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableModel, bookingView);
        bookingPresenter.updateTablesUI();
        bookingView.reservationTable(new Date(), 3, "Васильянов");
        bookingView.reservationTable(new Date(), 2, "Король Васильянов");
        tableModel.check();
        bookingView.changeReservationTable(1001, new Date(), 3, "Васильянов");
        tableModel.check();

    }
}
