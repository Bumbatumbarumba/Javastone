/* Created by Bartosz Kosakowski
 * 12/20/2017
 * Deck class is basically just an array list with some bonus
 * stuff on top
 */
package code;

import java.util.ArrayList;

public class Deck {
	ArrayList<Cards> deck = new ArrayList<Cards>();
	
	public void addCard(Cards card){
		deck.add(card);
		sortDeck(deck);
	}
	
	public void sortDeck(ArrayList<Cards> deck){
		//sorts the deck first by mana cost, then alphabetically
	}
}
