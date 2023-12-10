package ru.antipov.seminar_7.adapter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public interface MeteoSensor {

    int getId();   // Уникальный индентификатор датчика.
    double getTemperature(); // Средняя температура.
    double getHumidity(); //Фиксировать влажность.
    double getPressure(); // Давление.
    LocalDateTime getDateTime(); // Дата и время.

}
