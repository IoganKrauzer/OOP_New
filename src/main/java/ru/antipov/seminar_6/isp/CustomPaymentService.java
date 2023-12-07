package ru.antipov.seminar_6.isp;

public class CustomPaymentService extends PaymentSrv implements WebMoneyPaymentService, CreditCardPaymentService {

    @Override
    public void payWebMoney(int amount) {
        System.out.printf("CustomProvider pay by WebMoney %d", amount);
    }

    @Override
    public void payCreditCard(int amount) {
        System.out.printf("CustomProvider pay by Credit Card %d", amount);
    }
}
