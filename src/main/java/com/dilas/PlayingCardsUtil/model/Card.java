package com.dilas.PlayingCardsUtil.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Card {
    private Name name;
    private Suit suit;
}
