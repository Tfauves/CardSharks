package com.company;
import com.company.cardGame.Card;
import com.company.cardGame.Deck;
import com.company.cardGame.StandardDeck;

import java.util.Scanner;


public class Game {
    public Scanner scanner = new Scanner(System.in);
    private Card card1;
    private Card card2;


    public void startGame() {

        Deck cardDeck = new StandardDeck();
        cardDeck.shuffle();
        card1 = cardDeck.deal();
        System.out.println(card1.display());
        System.out.println("Is the next card (l)ower or (h)igher?");
        String input = scanner.nextLine();
        card2 = cardDeck.deal();
        System.out.println(card2.display());

        if (input.toLowerCase().equals("h") && card1.getFaceValue() < card2.getFaceValue()) {
            System.out.println("Your correct");

        }
        else if (input.toLowerCase().equals("l") && card1.getFaceValue() > card2.getFaceValue()) {
            System.out.println("Your correct");

        } else {
            System.out.println("loser");
        }

        System.out.println("Continue Playing? y/n?");
        String quit = scanner.nextLine();
        if (quit.toLowerCase().equals("y")) {
            System.exit(0);
        }
    }


}
