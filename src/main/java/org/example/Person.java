package org.example;

public class Person {
   private String name;
   private String cardType;
   private boolean isAffiliate;
   private boolean isOver2YearsCustomer;

   public Person(String name, String cardType, boolean isAffiliate, boolean isOver2YearsCustomer) {
      this.name = name;
      this.cardType = cardType;
      this.isAffiliate = isAffiliate;
      this.isOver2YearsCustomer = isOver2YearsCustomer;
   }

   public double calculateDiscount(double amount, boolean isPhone) {
      double discount = 0.0;

      if (!isPhone) {
         if (cardType.equalsIgnoreCase("gold")) {
            discount = amount * 0.3;
         } else if (cardType.equalsIgnoreCase("silver")) {
            discount = amount * 0.2;
         } else if (isAffiliate) {
            discount = amount * 0.1;
         } else if (isOver2YearsCustomer) {
            discount = amount * 0.05;
         }
      }

      double billDiscount = Math.floor(amount / 200) * 5;
      discount += billDiscount;

      return discount;
   }

   public double calculateNetPayableAmount(double amount, boolean isPhone) {
      double discount = calculateDiscount(amount, isPhone);
      return amount - discount;
   }
}

