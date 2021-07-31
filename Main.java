package War;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
			
	Scanner myObj = new Scanner(System.in);
		
		// Add Players
		System.out.print("Hello, please enter the name of the first player: ");
		String playerOne = myObj.nextLine();
		Player p1 = new Player();
		p1.setName(playerOne);
				
		System.out.println(" ");
		System.out.print("Hello, please enter the name of the second player: ");
		String playerTwo = myObj.nextLine();
		Player p2 = new Player();
		p2.setName(playerTwo);
		System.out.println(" ");
		
		myObj.close();
				
		//Build & Shuffle Deck | Uncomment below to see shuffled deck.
		
		Deck gameDeck = new Deck();
		
		gameDeck.buildDeck();
		gameDeck.shuffle();
				
//		System.out.println("size " + gameDeck.cards.size());
//		for (int i = 0; i < 52; i++) {
//		System.out.println(i + ": " + gameDeck.cards.get(i).name + " ");
//		}
				
		// Build Player Hands
		
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				p1.hand.add(gameDeck.draw());
			}
			else if (i % 2 != 0)  {
				p2.hand.add(gameDeck.draw());
			}
		}
		
		//Play Game
		
		for (int i = 0; i < 26; i++) {
			System.out.println("Round " + i);
						
			Card p1Card = p1.flip();
				int p1p = p1Card.value;
				String p1S = p1Card.name;
			Card p2Card = p2.flip();
				int p2p = p2Card.value;
				String p2S = p2Card.name;
			
			
			if (p1p > p2p) {
				p1.incrementScore();
				System.out.println(p1S + " vs " + p2S);
//				System.out.println(p1p + " vs " + p2p);
//				p1.describe(p1Card);
//				System.out.print(" vs ");
//				p2.describe(p2Card);
				System.out.println(" " + p1.name + "'s score: " + p1.getScore());
			}
			else if (p2p > p1p) {
				p2.incrementScore();
				System.out.println(p1S + " vs " + p2S);
//				System.out.println(p1p + " vs " + p2p);
//				p2.describe(p2Card);
//				System.out.print(" vs ");
//				p1.describe(p1Card);
				System.out.println(p2.name + "'s score: " + p2.getScore());
			}
			else {
				System.out.println("Tie");
			}
			System.out.println("---");
		}
		
		//Evaluate Winner
		
		if (p1.score > p2.score) {
			System.out.println(p1.name + " is the WINNER!");
		}
		else if (p2.score > p1.score) {
			System.out.println(p2.name + " is the WINNER!");
		}
		else {
			System.out.println("TIE GAME");
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
		
		}
}
