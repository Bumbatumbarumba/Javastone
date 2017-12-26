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
	public static int totalTurns = 0;
	public static int maxTurns = 0;
	
	//make a timer based off of this link:
	//http://www.rgagnon.com/javadetails/java-0144.html
	//prolly best to use the jswing one since we need it to do stuff
	//with actionlistener
	
	/* NOTE:
	 * It is prolly smarter to make a separate Player class (which I did)
	 * than to toss everything into one this class, so figure out how to
	 * modify this to reflect this change
	 * 
	 * well, the more I think about it, the more either solution seems okay
	 * (ie, player class vs tossing everything here and making it static),
	 * although I am slightly leaning towards tossing it in here
	 */

	// player one stuff
	public static int p1mana = 0;
	public static List<Cards> player1hand = new ArrayList<Cards>();
	public static List<Cards> player1board = new ArrayList<Cards>();
	public static int p1hp = 30;
	public static int p1armor = 0;
	
	// player two stuff
	public static int p2mana = 0;
	public static List<Cards> player2hand = new ArrayList<Cards>();
	public static List<Cards> player2board = new ArrayList<Cards>();
	public static int p2hp = 30;
	public static int p2armor = 0;
	
	//simply used to change the turn
	public static void changeTurn(){
		if (playerTurn == 1)
			playerTurn = 2;
		else
			playerTurn = 1;
	}//end of changeTurn
	
	//run this after every time a player's HP is reduced
	public static void checkWinner(){
		if (p1hp <= 0 && p2hp <= 0){
			//tie happens 
		}
		if (p1hp <= 0){
			//player 1 wins
		}
		if (p2hp <= 0){
			//player 2 wins
		}
	}
	
	//player one functions 
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
	}//end of addCardToHand1
	
	//if the board has enough space (ie, max 7 minions), we put the minion 
	//on the board and remove a card from the player's hand
	public static void playMinion1(Cards minion){
		if (player1board.size() < 7){
			player1board.add(minion);
			player1hand.remove(minion);
		}
		else{
			//we need to let the player know the board is full
		}
	}//end of playMinion1
	
}//end of gameBoard class