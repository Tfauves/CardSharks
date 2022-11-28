package com.company.cardGame.actor;

import com.company.cardGame.cardSharks.Run;
import com.company.cardGame.console.UI;
import com.company.cardGame.deck.Deck;
import com.company.cardGame.deck.PlayerDeck;

import java.io.Console;

public class Player implements Actor {
    private String name;
    private boolean isActivePlayer;
    private int matchesWon = 0;
    private int gamesWon = 0;
    private int actionsCount;
    private Deck deck;

    public Player(String name) {
        this.name = name;
        deck = new PlayerDeck();
    }

    public String getAvailableActions(Run run) {
        actionsCount = 3;
        StringBuilder output = new StringBuilder();
        System.out.println("------------------------------------------------");
        output.append("1. Guess\n2. Freeze");

        return output.toString();
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAction(Run run) {
        System.out.println(run.displayRun());
//        System.out.println(hand.getValue());
        return UI.getInt(getAvailableActions(run), 1, actionsCount, "invalid action");
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public boolean isActivePlayer() {
        return isActivePlayer;
    }

    public void setActivePlayer(boolean activePlayer) {
        isActivePlayer = activePlayer;
    }

    public int getMatchesWon() {
        return matchesWon;
    }

    public void setMatchesWon(int matchesWon) {
        this.matchesWon = matchesWon;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }
}
