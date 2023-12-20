package ru.antipov.exceptions_final;

public class DataCountException extends Exception {
    int i;

    public int getI() {
        return i;
    }

    public DataCountException(String message, int i) {
        super(message);
        this.i = i;
    }
}
