package War;

import java.util.ArrayList;

public class Player {
	
	public ArrayList<Card> hand = new ArrayList<Card>();
	int score = 0;
	String name = "";
	
	public int getScore() {
		return score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void describe(Card c) {
		System.out.print(c.name + " is worth " + c.value + " points.");
	}
	
	public Card flip() {
		return hand.remove(hand.size() - 1);
	}
	
	public Card draw(Deck d) {
		return d.draw();
	}
	
	public void incrementScore () {
		score += 1;	
	}

}
