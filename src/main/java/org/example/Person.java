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

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getCardType() {
      return cardType;
   }

   public void setCardType(String cardType) {
      this.cardType = cardType;
   }

   public boolean isAffiliate() {
      return isAffiliate;
   }

   public void setAffiliate(boolean affiliate) {
      isAffiliate = affiliate;
   }

   public boolean isOver2YearsCustomer() {
      return isOver2YearsCustomer;
   }

   public void setOver2YearsCustomer(boolean over2YearsCustomer) {
      isOver2YearsCustomer = over2YearsCustomer;
   }
}

