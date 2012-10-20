package com.jacinto.model;

public class Card {

	public enum Suit {
		CLUBS, DIAMONDS, HEARTS, SPADES
		
	}

	public enum Rank {
 		ACE {
			@Override
			int getNumber() {
				return 12;
			}
		}, TWO {
			@Override
			int getNumber() {
				return 0;
			}
		}, THREE {
			@Override
			int getNumber() {
				return 1;
			}
		}, FOUR {
			@Override
			int getNumber() {
				return 2;
			}
		}, FIVE {
			@Override
			int getNumber() {
				return 3;
			}
		}, SIX {
			@Override
			int getNumber() {
				return 4;
			}
		}, SEVEN {
			@Override
			int getNumber() {
				return 5;
			}
		}, EIGHT {
			@Override
			int getNumber() {
				return 6;
			}
		}, NINE {
			@Override
			int getNumber() {
				return 7;
			}
		}, TEN {
			@Override
			int getNumber() {
				return 8;
			}
		}, JACK {
			@Override
			int getNumber() {
				return 9;
			}
		}, QUEEN {
			@Override
			int getNumber() {
				return 10;
			}
		}, KING {
			@Override
			int getNumber() {
				return 11;
			}
		};
 		abstract int getNumber();
 		
	}

	private Suit suit;
	private Rank rank;

	public Card(Suit suit, Rank rank) {
		super();
		if (suit == null || rank == null) {
			throw new RuntimeException("Invalid card values");
		}
		this.suit = suit;
		this.rank = rank;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

}
