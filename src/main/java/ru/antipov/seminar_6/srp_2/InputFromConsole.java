package ru.antipov.seminar_6.srp_2;

import java.util.Scanner;

public class InputFromConsole {

    private Scanner scanner = new Scanner(System.in);


    public InputFromConsole() {
    }

    public void fillOrderFieldsFromConsole(Order order){
        String clientName = prompt("Имя клиента: ");
        order.setClientName(clientName);
        String product = prompt("Продукт: ");
        order.setProduct(product);
        int qnt = Integer.parseInt(prompt("Кол-во: "));
        order.setQnt(qnt);
        int price = Integer.parseInt(prompt("Цена: "));
        order.setPrice(price);
    }

    public String prompt(String message){
        System.out.println(message);
        return scanner.nextLine();
    }
}
