package ru.antipov.seminar_7.singleton;

public class Settings {

    private static Settings instance;

    public static Settings getInstance(){
        if (instance == null){
            instance = new Settings();
            instance.param1 = "A";
            instance.param2 = 2;
            instance.param3 = true;
        }
        return instance;
    }

    private Settings(){

    }

    private String param1;
    private int param2;
    private boolean param3;
}
