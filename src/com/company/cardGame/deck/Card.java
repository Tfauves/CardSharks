package com.company.cardGame.deck;

public class Card {
    private final String suit;
    private final int faceValue;
    private boolean isFaceUp = false;

    public Card(String suit, int faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    public String toString() {
        return faceValue + " " + suit ;
    }

    public String display() {
        String outPut = "";
        if (isFaceUp) {
            switch (faceValue) {
                case 14 -> outPut = "AC";
                case 11 -> outPut = "JK";
                case 12 -> outPut = "QU";
                case 13 -> outPut = "KI";
                default -> {
                    outPut = faceValue == 10 ? Integer.toString(faceValue) : " " + faceValue;
                    outPut = outPut + " " + suit;
                }
            };
        } else {
            outPut = "back of card";
        }

        return outPut;
    }

    // TODO: 11/25/2022 test method 
    public void turnCard() {
        setFaceUp(!isFaceUp);
    }

    public int getFaceValue() {
        return faceValue;
    }

    private String getSuit() {
        return suit;
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public void setFaceUp(boolean faceUp) {
        isFaceUp = faceUp;
    }
}