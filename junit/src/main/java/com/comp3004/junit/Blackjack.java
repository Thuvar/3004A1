package com.comp3004.junit;

public class Blackjack {

	public static void main(String[] args) {
		
		System.out.println("Now Playing Blackjack");
		
		Deck playingDeck = new Deck();
		playingDeck.createNewDeck();
		
		System.out.println(playingDeck);

	}

}
