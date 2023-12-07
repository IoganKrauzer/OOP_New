package ru.antipov.seminar_6.isp;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<PhoneMumberPaymentService> paymentServices = new ArrayList<>();

        paymentServices.add(new InternetPaymentService());
//        paymentServices.add(new CustomPaymentService());

        for (PhoneMumberPaymentService paymentService : paymentServices){
            paymentService.payPhoneNumber(2000);
        }

    }
}
