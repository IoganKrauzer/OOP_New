package ru.antipov.seminar_7.adapter;

import java.time.LocalDateTime;

public class MeteoStore {

    boolean save(MeteoSensor meteoSensor) {
        System.out.printf("Saving data from sensor [%d] at %s%n temperature - %.2f; humidity - %.2f; pressure - %.2f",
        meteoSensor.getId(),
        meteoSensor.getDateTime(),
        meteoSensor.getTemperature(),
        meteoSensor.getHumidity(),
        meteoSensor.getPressure());
        return true;
    }

    /*boolean save(SensorTemperature meteoSensor) {
        System.out.println("Saving data from sensor [%d] at %s%n temperature - ");
        meteoSensor.getIdentifier();
        meteoSensor.temperature();
        LocalDateTime.now();
        return true;
    }*/
}
