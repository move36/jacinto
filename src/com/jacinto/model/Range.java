package com.jacinto.model;

public class Range {

	private boolean[][] table;

	public boolean isInRange(int column, int row) {
		return table[column][row];
	}
	public void setRange(int column, int row, boolean value){
		table[column][row] = value;
	}
	public void toggle(int column, int row){
		table[column][row] = !table[column][row];
	}
}
