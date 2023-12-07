package ru.antipov.seminar_6.isp;

public interface PaymentService {

    void payWebMoney (int amount);
    void payCreditCard (int amount);
    void payPhoneNumber (int amount);
}
