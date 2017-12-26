/* Created by Bartosz Kosakowski
 * 25/12/2017
 * Rather than toss this into the GameBoard class, I think it is 
 * much better to make a class to handle stuff on a per player
 * basis, since we can just have two instances of a player, and
 * then manipulate each player instance separately
 */

package code;

import java.util.ArrayList;
import java.util.List;

public class Player {
	public int mana = 0;
	public List<Cards> hand = new ArrayList<Cards>();
	public List<Cards> board = new ArrayList<Cards>();
	public int hp = 30;
	public int armor = 0;
	
	public int getHP(){
		return this.hp;
	}//end of getHP
	
	//player one functions 
	public void addCardToHand(Cards card){
		if (hand.size() < 10){
			hand.add(card);
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
	public void putMinionOnBoard(Cards minion){
		if (board.size() < 7){
			board.add(minion);
			board.remove(minion);
		}
		else{
			//we need to let the player know the board is full
		}
	}//end of playMinion1

}
