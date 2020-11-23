# PlayingCardsUtil
The goal of this project is provide random playing cards according to the request necessities.

This service can be used in any standard playing card game. All you have to worry about now is developing the logic of the game.

## Usage example:

GET: http://localhost:8080/deck?isShuffled=true&hasJoker=true&numberOfDecks=1

**isShuffled**: if false, the cards are served in ascendent order, otherwise the cards are randomly served.

**hasJoker**: if false, no joker will be served, otherwise, for each number of deck, there will be 2 jokers.

**numberOfDecks**: It's possible to get as many decks as you want (or the heap allows).
