package War;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	public ArrayList<Card> cards = new ArrayList<Card>();
	
	public void shuffle() {
		Collections.shuffle(cards); 
	}
	
	public Card draw() {
		return cards.remove(0);
	}
		
	// Build a deck of cards
	
	public void buildDeck() {
		
	String[] cardSuite = {"Hearts", "Diamonds", "Spades", "Clubs"};
	String[] cardType = {"2","3","4","5","6","7","8","9","10", "Jack", "Queen", "King", "Ace"};
	int[] cardValue = {2,3,4,5,6,7,8,9,10,11,12,13,14};
	
		for (int s = 0; s < 4; s++) {
			for (int i = 0; i < 13; i++) {
				String addCardType = cardType[i] + " of " + cardSuite[s];
					int addCardValue = cardValue[i];
								
					Card c = new Card(addCardType, addCardValue);
					cards.add(c);
								
			}						
		}
	}		
}

