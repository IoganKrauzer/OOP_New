package ru.antipov.seminar_6.srp_2;

public class Program {

    public static void main(String[] args) {

        InputFromConsole inputFromConsole = new InputFromConsole();
        SaveToJson saveToJson = new SaveToJson();
        Order order1 = new Order();
        Order order2 = new Order();

        inputFromConsole.fillOrderFieldsFromConsole(order1);
        inputFromConsole.fillOrderFieldsFromConsole(order2);
        saveToJson.saveOrderToJson(order1);
        saveToJson.saveOrderToJson(order2);

    }
}
