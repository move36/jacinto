package com.jacinto.model;

public class HoleCards {

	private Card card1;
	private Card card2;
	private int column;
	private int row;

	public HoleCards(Card card1, Card card2) {
		super();
		if (card1 == null || card2 == null) {
			throw new RuntimeException("Invalid card values");
		}

		if (card1.getRank().getNumber() > card2.getRank().getNumber()) {
			this.card1 = card1;
			this.card2 = card2;
		} else {
			this.card1 = card2;
			this.card2 = card1;
		}
		if (isSuited()) {
			column = this.card2.getRank().getNumber();
			row = this.card1.getRank().getNumber();
		} else {
			column = this.card1.getRank().getNumber();
			row = this.card2.getRank().getNumber();
		}

	}

	public boolean isSuited() {
		return card1.getSuit().equals(card2.getSuit());
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

}
