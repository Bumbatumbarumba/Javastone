/* Created by Bartosz Kosakowski
 * 12/20/2017
 * Deck class is basically just an array list with some bonus
 * stuff on top
 */
package code;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Deck {
	static List<Cards> deck = new ArrayList<Cards>();
	
	public static void addCard(Cards card){
		deck.add(card);
		sortDeck();
	}//end of addCard
	
	public static void sortDeck(){
		//sorts the deck first by mana cost, then alphabetically
		Collections.sort(deck, new CardComparator());
	}//end of sortDeck
	
	//used to shuffle the deck when the game starts 
	public static void shuffleDeck(){
		int deckSize = deck.size();
		Random rand = new Random();
		rand.nextInt();
		for (int i = 0; i < deckSize; i++){
			int change = i + rand.nextInt(deckSize-1);
			swap(i, change);
		}
	}//end of shuffleDeck
	
	private static void swap(int i, int change){
		Cards helper = deck.get(i);
		deck.set(i, deck.get(change));
		deck.set(change, helper);
	}//end of swap
}//end of Deck class

//used to compare two objects based on mana cost
class CardComparator implements Comparator<Cards>{
	@Override
	public int compare(Cards card1, Cards card2) {
		if (card1.getManaCost() <= card2.getManaCost())
			return 0;
		else
			return 1;
	}//end of compare
}//end of CardComparator
