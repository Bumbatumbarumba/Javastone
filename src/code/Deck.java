/* Created by Bartosz Kosakowski
 * 12/20/2017
 * Deck class is basically just an array list with some bonus
 * stuff on top
 */
package code;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;
import java.util.Comparator;

public class Deck {
	private static List<Cards> baseDeck = new ArrayList<Cards>();
	private static List<Cards> useDeck = new ArrayList<Cards>();
	private static int deckSize = 0;
	
	/* when we choose a card from the creat deck menu, we add it to
	 * our deck, and then increment deckSize by one
	 */
	public static void addCard(Cards card){
		baseDeck.add(card);
		sortDeck();
		deckSize += 1;
	}//end of addCard
	
	/* we want to keep the base deck unchanged and instead do stuff
	 * to a COPY of the base deck, that way we can restore the used up
	 * deck after each match
	 */
	public static void fillUseDeck(){
		for (int i = 0; i < baseDeck.size(); i++){
			useDeck.add(baseDeck.get(i));
		}
	}//end of fillUseDeck
	
	public static void sortDeck(){
		//sorts the baseDeck first by mana cost, then alphabetically
		Collections.sort(baseDeck, new CardComparator());
		
		//figure this out eventually lol
		//look at 2xb3 lab 2
		
	}//end of sortDeck
	
	//used to shuffle the baseDeck when the game starts 
	public static void shuffleDeck(){
		int deckSize = baseDeck.size();
		Random rand = new Random();
		rand.nextInt();
		for (int i = 0; i < deckSize; i++){
			int change = i + rand.nextInt(deckSize-1);
			swap(i, change);
		}
	}//end of shuffleDeck
	
	private static void swap(int i, int change){
		Cards helper = baseDeck.get(i);
		baseDeck.set(i, baseDeck.get(change));
		baseDeck.set(change, helper);
	}//end of swap
	
	/* when a card is drawn we must return the card from the top of
	 * the deck (the 29th card, since we count starting at 0), then
	 * remove it from useDeck, then reduce deckSize by 1
	 */
	public static Cards drawCard(){
		Cards drawnCard = useDeck.get(deckSize);
		useDeck.remove(deckSize);
		deckSize -= 1;
		return drawnCard;
	}//end of drawCard
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
