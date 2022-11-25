package com.company.cardGame.cardSharks;
import com.company.cardGame.console.UI;
import com.company.cardGame.deck.Card;
import com.company.cardGame.deck.Deck;
import com.company.cardGame.deck.PlayerDeck;

public class Game {
    private Card card1;
    private Card card2;
    private boolean isActive = true;


    public void startGame() {
        while (isActive) {
            Deck cardDeck = new PlayerDeck();
            cardDeck.shuffle();
            card1 = cardDeck.deal();
            System.out.println(card1.display());
            System.out.println("Is the next card (l)ower or (h)igher?");
            String input = UI.scanner.nextLine();
            card2 = cardDeck.deal();
            System.out.println(card2.display());

            if (input.toLowerCase().equals("h") && card1.getFaceValue() < card2.getFaceValue()) {
                System.out.println("Your correct");

            } else if (input.toLowerCase().equals("l") && card1.getFaceValue() > card2.getFaceValue()) {
                System.out.println("Your correct");

            } else {
                System.out.println("loser");
            }

            System.out.println("Continue Playing? y/n?");
            String quit = UI.scanner.nextLine();
            if (quit.toLowerCase().equals("n")) {
                isActive = false;
            }
        }
    }


}
