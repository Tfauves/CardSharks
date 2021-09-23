package com.company.cardGame.cardSharks;

import com.company.cardGame.deck.Card;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> cards = new ArrayList<>();
    private int bet = 0;
//    private Player player;

    public void addCard(Card card) {
        cards.add(card);
    }

    public String displayHand() {
        String outPut = "";
        for (Card card : cards) {
            outPut += card.display() + " ";
        }
        return outPut.toString().trim();
    }

}
