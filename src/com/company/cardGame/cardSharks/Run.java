package com.company.cardGame.cardSharks;

import com.company.cardGame.actor.Actor;
import com.company.cardGame.deck.Card;

import java.util.ArrayList;
import java.util.List;

public class Run {
    private List<Card> cards = new ArrayList<>();
    private boolean isfrozen = false;
    private boolean canSwapFirstCard;
    private Actor player;

    public Run(Actor player) {
        this.player = player;
    }



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

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public boolean isIsfrozen() {
        return isfrozen;
    }

    public void setIsfrozen(boolean isfrozen) {
        this.isfrozen = isfrozen;
    }

    public boolean isCanSwapFirstCard() {
        return canSwapFirstCard;
    }

    public void setCanSwapFirstCard(boolean canSwapFirstCard) {
        this.canSwapFirstCard = canSwapFirstCard;
    }

    public Actor getPlayer() {
        return player;
    }

    public void setPlayer(Actor player) {
        this.player = player;
    }
}
