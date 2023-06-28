package org.example;

public class Calculator {

    public static double calculateDiscount(Person person, int amount, boolean isPhone) {
        double discount = 0.0;

        if (!isPhone) {
            discount = amount * person.getCard().getDisCountPercentage();
        }

        int billDiscount = (amount / 200) * 5;
        discount += billDiscount;

        return discount;
    }

    //Method for calculating net payable amount
    public static double calculateNetPayableAmount(Person person, int amount, boolean isPhone) {
        double discount = calculateDiscount(person, amount, isPhone);
        return amount - discount;
    }
}
