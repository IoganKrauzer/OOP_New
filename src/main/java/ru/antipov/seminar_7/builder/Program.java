package ru.antipov.seminar_7.builder;

public class Program {

    public static void main(String[] args) {

        /*
        fluent interface pattern
         */
            StringBuilder stringBuilder = new StringBuilder("Hey");
            String str = stringBuilder
                    .append("123")
                    .append("121")
                    .delete(2, 5)
                    .toString();
        System.out.println(str);

        Order order = new OrderBuilder()
                .setProductName("Voda")
                .setPrice(200)
                .setSign(true)
                .build();

    }
}
