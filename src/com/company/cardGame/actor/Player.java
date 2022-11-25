package com.company.cardGame.actor;

import com.company.cardGame.cardSharks.Run;
import com.company.cardGame.deck.PlayerDeck;

public class Player {
    private String name;
    private PlayerDeck playerDeck;
    private Run run;
    private boolean isTurn;
    private int matchWins;
    private int gameWins;

    public Player() {};

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerDeck getPlayerDeck() {
        return playerDeck;
    }

    public void setPlayerDeck(PlayerDeck playerDeck) {
        this.playerDeck = playerDeck;
    }

    public Run getRun() {
        return run;
    }

    public void setRun(Run run) {
        this.run = run;
    }

    public boolean isTurn() {
        return isTurn;
    }

    public void setTurn(boolean turn) {
        isTurn = turn;
    }

    public int getMatchWins() {
        return matchWins;
    }

    public void setMatchWins(int matchWins) {
        this.matchWins = matchWins;
    }

    public int getGameWins() {
        return gameWins;
    }

    public void setGameWins(int gameWins) {
        this.gameWins = gameWins;
    }
}
