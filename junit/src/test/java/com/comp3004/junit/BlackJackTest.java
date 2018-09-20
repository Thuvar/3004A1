package com.comp3004.junit;

import junit.framework.TestCase;

public class BlackJackTest extends TestCase {
	
	//See if cards are there
	public void TestDeck() {
		Deck playingDeck = new Deck();
		playingDeck.createNewDeck();
		
		System.out.println(playingDeck);
	}
	
	//Shuffle Test
	public void TestShuffle() {
		Deck playingDeck = new Deck();
		playingDeck.createNewDeck();
		playingDeck.shuffle();
		
	}
}
