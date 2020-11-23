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
            for (Name cardName : Name.values()) {
                if(!cardName.toString().equals("JOKER")) {
                    cards.add(new Card(cardName, Suit.DIAMONDS));
                    cards.add(new Card(cardName, Suit.SPADES));
                    cards.add(new Card(cardName, Suit.HEARTS));
                    cards.add(new Card(cardName, Suit.CLUBS));
                }
            }
            if(hasJoker) {
                cards.add(new Card(Name.JOKER, null));
                cards.add(new Card(Name.JOKER, null));
            }
        }
    }
}
