package com.dilas.PlayingCardsUtil.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Card {
    private String name;
    private Suit suit;
}
