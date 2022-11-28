package com.company.cardGame.cardSharks;
import com.company.cardGame.actor.Player;
import com.company.cardGame.console.UI;
import com.company.cardGame.deck.Card;
import com.company.cardGame.deck.Deck;
import com.company.cardGame.deck.PlayerDeck;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

// TODO: 11/28/2022 welcome and start game actions 
public class Game {
    private List<Run> playerRuns = new ArrayList<>();
    private Match match;
    private boolean isActive = true;

    public Game() {
        int playerCount = UI.getInt("number of players", 1, 2, "invalid selection");
        for (int count = 0; count < playerCount; count++) {
            Player newPlayer = new Player("Player" + (count + 1) + ": ");
            playerRuns.add(new Run(newPlayer));
            System.out.println(newPlayer.getName());
        }
        UI.spaces();
    }

    public void playGame() {

    }



}
