package com.company.cardGame.deck;

import com.company.cardGame.deck.Card;

public interface Deck {
    Card deal();
    void shuffle();

}