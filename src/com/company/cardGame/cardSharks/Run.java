package com.company.cardGame.cardSharks;

import com.company.cardGame.deck.Card;

import java.util.ArrayList;
import java.util.List;

public class Run {
    private List<Card> cards = new ArrayList<>();
    private boolean isfrozen = false;
//    private Player player;

    public void addCard(Card card) {
        cards.add(card);
    }

    public String displayRun() {
        StringBuilder outPut = new StringBuilder();
        for (Card card : cards) {
            outPut.append(card.display()).append(" ");
        }
        return outPut.toString().toString().trim();
    }



}
