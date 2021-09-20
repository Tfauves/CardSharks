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
        System.out.println(card1);
        System.out.println("Is the next card (l)ower or (h)igher?");
        String input = scanner.nextLine();
    }

}
