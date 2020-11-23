package com.dilas.PlayingCardsUtil.model;

import lombok.Data;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Data
public class Deck {
    List<Card> cards;

    public Deck(boolean hasJoker, Integer numberOfDecks) {
        cards = new LinkedList<Card>();
        for(int i = 0; i < numberOfDecks; i++){
            cards.add(new Card("Ace",Suit.DIAMONDS));
            cards.add(new Card("Ace",Suit.SPADES));
            cards.add(new Card("Ace",Suit.HEARTS));
            cards.add(new Card("Ace",Suit.CLUBS));

            cards.add(new Card("2",Suit.DIAMONDS));
            cards.add(new Card("2",Suit.SPADES));
            cards.add(new Card("2",Suit.HEARTS));
            cards.add(new Card("2",Suit.CLUBS));

            cards.add(new Card("3",Suit.DIAMONDS));
            cards.add(new Card("3",Suit.SPADES));
            cards.add(new Card("3",Suit.HEARTS));
            cards.add(new Card("3",Suit.CLUBS));

            cards.add(new Card("4",Suit.DIAMONDS));
            cards.add(new Card("4",Suit.SPADES));
            cards.add(new Card("4",Suit.HEARTS));
            cards.add(new Card("4",Suit.CLUBS));

            cards.add(new Card("5",Suit.DIAMONDS));
            cards.add(new Card("5",Suit.SPADES));
            cards.add(new Card("5",Suit.HEARTS));
            cards.add(new Card("5",Suit.CLUBS));

            cards.add(new Card("6",Suit.DIAMONDS));
            cards.add(new Card("6",Suit.SPADES));
            cards.add(new Card("6",Suit.HEARTS));
            cards.add(new Card("6",Suit.CLUBS));

            cards.add(new Card("7",Suit.DIAMONDS));
            cards.add(new Card("7",Suit.SPADES));
            cards.add(new Card("7",Suit.HEARTS));
            cards.add(new Card("7",Suit.CLUBS));

            cards.add(new Card("8",Suit.DIAMONDS));
            cards.add(new Card("8",Suit.SPADES));
            cards.add(new Card("8",Suit.HEARTS));
            cards.add(new Card("8",Suit.CLUBS));

            cards.add(new Card("9",Suit.DIAMONDS));
            cards.add(new Card("9",Suit.SPADES));
            cards.add(new Card("9",Suit.HEARTS));
            cards.add(new Card("9",Suit.CLUBS));

            cards.add(new Card("10",Suit.DIAMONDS));
            cards.add(new Card("10",Suit.SPADES));
            cards.add(new Card("10",Suit.HEARTS));
            cards.add(new Card("10",Suit.CLUBS));

            cards.add(new Card("Jack",Suit.DIAMONDS));
            cards.add(new Card("Jack",Suit.SPADES));
            cards.add(new Card("Jack",Suit.HEARTS));
            cards.add(new Card("Jack",Suit.CLUBS));

            cards.add(new Card("Queen",Suit.DIAMONDS));
            cards.add(new Card("Queen",Suit.SPADES));
            cards.add(new Card("Queen",Suit.HEARTS));
            cards.add(new Card("Queen",Suit.CLUBS));

            cards.add(new Card("King",Suit.DIAMONDS));
            cards.add(new Card("King",Suit.SPADES));
            cards.add(new Card("King",Suit.HEARTS));
            cards.add(new Card("King",Suit.CLUBS));

            if(hasJoker) {
                cards.add(new Card("Joker", null));
                cards.add(new Card("Joker", null));
            }
        }
    }
}
