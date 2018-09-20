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
	
	// Support file input
	public void TestFileInput() {
		
	}
	// Support console input
	public void TestConsoleInput() {
		
	}
	// 2 cards are visible for players
	public void TestTwoCards() {
		
	}
	
	// 1 card visible from dealer
	public void TestDealerCard() {
		
	}
	
	// player can hit
	public void TestPlayerHit() {
		
	}
	// player can stand
	public void TestPlayerStand() {
		
	}
	// hand of player shown wen turn done
	public void TestPlayerShown() {
		
	}
	// if dealer has <=16 or soft 17 hits
	public void TestDealerScore() {
		
	}
	//dealer can hit repeatedly
	public void TestDealerHit() {
		
	}
	// dealer cards shown end of turn
	public void TestDealerShow() {
		
	}
	//dealer busts, player wins
	// ace is 1
	// JQK is 10
	// Player blackjack detected
	//Dealer blackjack detected
	
}
