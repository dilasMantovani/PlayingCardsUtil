package com.dilas.PlayingCardsUtil.controller;

import com.dilas.PlayingCardsUtil.DeckService;
import com.dilas.PlayingCardsUtil.model.Deck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deck")
public class DeckController {

    @Autowired
    DeckService deckService;

    @GetMapping()
    public ResponseEntity<Deck> getStandardShuffledDeck(@RequestParam("isShuffled") Boolean isShuffled, @RequestParam("hasJoker")  Boolean hasJoker, @RequestParam("numberOfDecks")  Integer numberOfDecks){
        Deck deck = new Deck(hasJoker, numberOfDecks);

        if(isShuffled)
            deck = deckService.getShuffledDeck(deck);

        return new ResponseEntity<Deck>(deck, HttpStatus.OK);
    }
}
