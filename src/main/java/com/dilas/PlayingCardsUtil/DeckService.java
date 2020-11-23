package com.dilas.PlayingCardsUtil;

import com.dilas.PlayingCardsUtil.model.Card;
import com.dilas.PlayingCardsUtil.model.Deck;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DeckService {
    public Deck getShuffledDeck(Deck deck){
        deck.setCards(shuffleCards(deck.getCards()));
        return deck;
    }

    public List<Card> shuffleCards(List<Card> cards){
        Collections.shuffle(cards);
        return cards;
    }
}


