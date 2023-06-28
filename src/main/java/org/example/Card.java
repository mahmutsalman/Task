package org.example;

public class Card {
    private double disCountPercentage;
    private String cardType;

    //Constructor
    public Card(String cardType) {
        this.cardType = cardType;
        if (cardType.equalsIgnoreCase("gold")) {
            this.disCountPercentage = 0.3;
        } else if (cardType.equalsIgnoreCase("silver")) {
            this.disCountPercentage = 0.2;
        } else {
            this.disCountPercentage = 0.0;
        }
    }

    //get discount percentage
    public double getDisCountPercentage() {
        return disCountPercentage;
    }

}
