package org.example;

public class Calculator {
    Person person;
    double bill;
    public double calculateDiscount(Person person,double amount, boolean isPhone) {
        double discount = 0.0;

        if (!isPhone) {
            if (person.getCardType().equalsIgnoreCase("gold")) {
                discount = amount * 0.3;
            } else if (person.getCardType().equalsIgnoreCase("silver")) {
                discount = amount * 0.2;
            } else if (person.isAffiliate()) {
                discount = amount * 0.1;
            } else if (person.isOver2YearsCustomer()) {
                discount = amount * 0.05;
            }
        }

        double billDiscount = Math.floor(amount / 200) * 5;
        discount += billDiscount;

        return discount;
    }

    public double calculateNetPayableAmount(Person person,double amount, boolean isPhone) {
        double discount = calculateDiscount(person,amount, isPhone);
        return amount - discount;
    }
}
