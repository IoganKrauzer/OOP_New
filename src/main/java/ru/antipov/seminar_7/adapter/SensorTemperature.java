package ru.antipov.seminar_7.adapter;

public interface SensorTemperature {

    int getIdentifier();   // Уникальный индентификатор датчика.
    double temperature(); // Средняя температура.
}
