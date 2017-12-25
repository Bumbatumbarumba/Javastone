/* Created by Bartosz Kosakowski
 * 12/20/2017
 * Used to keep track of the game state, ie the board state,
 * available mana crystals, whose turn it is, time lefter for
 * a turn, cards in player's hand, cards in players deck, hp,
 * armor
 */
package code;

import java.util.ArrayList;
import java.util.List;

public class GameBoard {
	// general stuff
	public static int playerTurn = 1;
	public static int turnTime = 75;
	//make a timer based off of this link:
	//http://www.rgagnon.com/javadetails/java-0144.html
	//prolly best to use the jswing one since we need it to do stuff
	//with actionlistener

	// player one stuff
	public static int p1mana = 0;
	public static List<Cards> player1hand = new ArrayList<Cards>();
	public static List<Cards> player1board = new ArrayList<Cards>();
	
	// player two stuff
	public static int p2mana = 0;
	public static List<Cards> player2hand = new ArrayList<Cards>();
	public static List<Cards> player2board = new ArrayList<Cards>();
	
	public static void addCardToHand1(Cards card){
		if (player1hand.size() < 10){
			player1hand.add(card);
		}
		else{
			//card gets drawn but not added
			//I don't think I need to include this, since when a card
			//is drawn, it just gets removed automatically; it is
			//prolly worth keeping for when I want to add a burn animation
		}
	}
	
	public static void playMinion1(Cards minion){
		if (player1board.size() < 7){
			player1board.add(minion);
		}
	}
	
}//end of gameBoard class