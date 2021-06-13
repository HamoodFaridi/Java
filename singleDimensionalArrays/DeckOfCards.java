package singleDimensionalArrays;


public class DeckOfCards {
	
	/* Randomly select 4 random cards from the deck of cards.
	 * Ace, 1-9, Jack, Queen, King as card ranks.
	 * Spades, Hearts, Diamonds, and Clubs as card suits.
	*/
	public static void main(String[] args) {
		int[] deck = new int[52];
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8",
				"9", "10", "Jack", "Queen", "King"};
		
		// Initialize the deck
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
		
		// Shuffle the cards
		for (int i = 0; i < deck.length; i++) {
			int index = (int) (Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
		
		// Randomly select 4 cards and display
		
		for (int i = 0; i < 4; i++) {
//			int randomIndex = (int) (Math.random() * deck.length);
//			String suit = suits[randomIndex / 13];
//			String rank = ranks[randomIndex % 13];
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			System.out.println("Selected card is " + rank + " of " + suit);
		}
	}
}
