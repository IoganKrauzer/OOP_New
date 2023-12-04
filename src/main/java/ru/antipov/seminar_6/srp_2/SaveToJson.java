package ru.antipov.seminar_6.srp_2;

import java.io.FileWriter;
import java.io.IOException;

public class SaveToJson {


    private static int number = 0;

    public SaveToJson() {
    }

    public void saveOrderToJson(Order order){
        number++;
        String fileName = "order #" + number + ".json";
        try (FileWriter writer = new FileWriter(fileName, false)){
            writer.write("{\n");
            writer.write("\"clientName\":\" " + order.getClientName() + "\",\n");
            writer.write("\"product\":\" " + order.getProduct() + "\",\n");
            writer.write("\"qnt\": " + order.getQnt() + ",\n" );
            writer.write("\"price\": " + order.getPrice() + "\n");
            writer.write("}\n");

        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
