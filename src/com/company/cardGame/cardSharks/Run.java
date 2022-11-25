package com.company.cardGame.cardSharks;

import com.company.cardGame.deck.Card;

import java.util.ArrayList;
import java.util.List;

public class Run {
    private List<Card> cards = new ArrayList<>();
//    private Player player;

    public void addCard(Card card) {
        cards.add(card);
    }

    public String displayRun() {
        String outPut = "";
        for (Card card : cards) {
            outPut += card.display() + " ";
        }
        return outPut.toString().trim();
    }

}
