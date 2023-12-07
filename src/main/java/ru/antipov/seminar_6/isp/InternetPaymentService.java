package ru.antipov.seminar_6.isp;

public class InternetPaymentService extends PaymentSrv implements WebMoneyPaymentService,
        CreditCardPaymentService, PhoneMumberPaymentService {

    @Override
    public void payWebMoney(int amount) {
        System.out.printf("InternetProvider pay by WebMoney %d", amount);
    }

    @Override
    public void payCreditCard(int amount) {
        System.out.printf("InternetProvider pay by Credit Card %d", amount);
    }

    @Override
    public void payPhoneNumber(int amount) {
        System.out.printf("InternetProvider pay by Phone Number %d\n", amount);
    }
}
