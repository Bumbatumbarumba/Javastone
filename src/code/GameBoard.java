/* Created by Bartosz Kosakowski
 * 12/20/2017
 * Used to keep track of the game state, ie the board state,
 * available mana crystals, whose turn it is, time lefter for
 * a turn, cards in player's hand, cards in players deck, hp,
 * armor
 */
package code;

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

}