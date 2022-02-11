package com.company;

import java.util.Random;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        String invoiceNumber = "Invoice Number: 53858";
        String name = "Ulla Terkelsen";
        String amountNumber = "33689,20";
        String paymentMethod = "Credit Card";
        String date = "Date: 10th of February 2022";
        String place = "TV2, Kabul";
        System.out.printf("%35s\n%35s\nName: %29s\nAmount:%28s\nPayment Method:%20s\n\n %34s",invoiceNumber,date, name, amountNumber, paymentMethod,place);
    }
}
