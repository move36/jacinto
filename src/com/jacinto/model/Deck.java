package com.jacinto.model;

import com.jacinto.model.Card.Rank;
import com.jacinto.model.Card.Suit;

public class Deck {

	private static final Card[] CARDS;

	static {

		CARDS = new Card[52];
		CARDS[0] = new Card(Suit.DIAMONDS, Rank.ACE);
		CARDS[1] = new Card(Suit.DIAMONDS, Rank.TWO);
		CARDS[2] = new Card(Suit.DIAMONDS, Rank.THREE);
		CARDS[3] = new Card(Suit.DIAMONDS, Rank.FOUR);
		CARDS[4] = new Card(Suit.DIAMONDS, Rank.FIVE);
		CARDS[5] = new Card(Suit.DIAMONDS, Rank.SIX);
		CARDS[6] = new Card(Suit.DIAMONDS, Rank.SEVEN);
		CARDS[7] = new Card(Suit.DIAMONDS, Rank.EIGHT);
		CARDS[8] = new Card(Suit.DIAMONDS, Rank.NINE);
		CARDS[9] = new Card(Suit.DIAMONDS, Rank.TEN);
		CARDS[10] = new Card(Suit.DIAMONDS, Rank.JACK);
		CARDS[11] = new Card(Suit.DIAMONDS, Rank.QUEEN);
		CARDS[12] = new Card(Suit.DIAMONDS, Rank.KING);

		CARDS[13] = new Card(Suit.HEARTS, Rank.ACE);
		CARDS[14] = new Card(Suit.HEARTS, Rank.TWO);
		CARDS[15] = new Card(Suit.HEARTS, Rank.THREE);
		CARDS[16] = new Card(Suit.HEARTS, Rank.FOUR);
		CARDS[17] = new Card(Suit.HEARTS, Rank.FIVE);
		CARDS[18] = new Card(Suit.HEARTS, Rank.SIX);
		CARDS[19] = new Card(Suit.HEARTS, Rank.SEVEN);
		CARDS[20] = new Card(Suit.HEARTS, Rank.EIGHT);
		CARDS[21] = new Card(Suit.HEARTS, Rank.NINE);
		CARDS[22] = new Card(Suit.HEARTS, Rank.TEN);
		CARDS[23] = new Card(Suit.HEARTS, Rank.JACK);
		CARDS[24] = new Card(Suit.HEARTS, Rank.QUEEN);
		CARDS[25] = new Card(Suit.HEARTS, Rank.KING);

		CARDS[26] = new Card(Suit.SPADES, Rank.ACE);
		CARDS[27] = new Card(Suit.SPADES, Rank.TWO);
		CARDS[28] = new Card(Suit.SPADES, Rank.THREE);
		CARDS[29] = new Card(Suit.SPADES, Rank.FOUR);
		CARDS[30] = new Card(Suit.SPADES, Rank.FIVE);
		CARDS[31] = new Card(Suit.SPADES, Rank.SIX);
		CARDS[32] = new Card(Suit.SPADES, Rank.SEVEN);
		CARDS[33] = new Card(Suit.SPADES, Rank.EIGHT);
		CARDS[34] = new Card(Suit.SPADES, Rank.NINE);
		CARDS[35] = new Card(Suit.SPADES, Rank.TEN);
		CARDS[36] = new Card(Suit.SPADES, Rank.JACK);
		CARDS[37] = new Card(Suit.SPADES, Rank.QUEEN);
		CARDS[38] = new Card(Suit.SPADES, Rank.KING);

		CARDS[39] = new Card(Suit.CLUBS, Rank.ACE);
		CARDS[40] = new Card(Suit.CLUBS, Rank.TWO);
		CARDS[41] = new Card(Suit.CLUBS, Rank.THREE);
		CARDS[42] = new Card(Suit.CLUBS, Rank.FOUR);
		CARDS[43] = new Card(Suit.CLUBS, Rank.FIVE);
		CARDS[44] = new Card(Suit.CLUBS, Rank.SIX);
		CARDS[45] = new Card(Suit.CLUBS, Rank.SEVEN);
		CARDS[46] = new Card(Suit.CLUBS, Rank.EIGHT);
		CARDS[47] = new Card(Suit.CLUBS, Rank.NINE);
		CARDS[48] = new Card(Suit.CLUBS, Rank.TEN);
		CARDS[49] = new Card(Suit.CLUBS, Rank.JACK);
		CARDS[50] = new Card(Suit.CLUBS, Rank.QUEEN);
		CARDS[51] = new Card(Suit.CLUBS, Rank.KING);

	}

}
