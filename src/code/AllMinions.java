/* Created by Bartosz Kosakowski
 * 12/20/2017
 * One file to hold all minions cards 
 */
package code;

//I dunno if I want to add some accessory functions at this point,
//so I have this class here in case I ever want to
public class AllMinions {
	//do something maybe
}//end of AllMinions

//=================================== Every minion ===================================

//A

//B

//C
class ChillwindYeti extends Cards{
	ChillwindYeti(){
		this.cardName = "Chillwind Yeti";
		this.manaCost = 4;
		this.attack = 4;
		this.health = 5;
		this.heroClass = "Neutral";
		this.keyword = "None";
		this.rarity = "Common";
		this.summoningSickness = true;
	}//end of ChillwindYeti constructor
}//end of ChillwindYeti class

//D

//E

//F

//G

//H

//I

//J

//K

//L

//M

//N
class NoviceEngineer extends Cards{
	NoviceEngineer(){
		this.cardName = "Novice Engineer";
		this.manaCost = 2;
		this.attack = 1;
		this.health = 1;
		this.heroClass = "Neutral";
		this.keyword = "Battlecry";
		this.rarity = "Common";
		this.summoningSickness = true;
	}//end of StonetuskBoar constructor
	
	//draws a card to the player's hand
	public void battlecry(){
		GameBoard.addCardToHand1(Deck.drawCard());
	}
}//end of StonetuskBoar class

//O

//P

//Q

//R

//S
class StonetuskBoar extends Cards{
	StonetuskBoar(){
		this.cardName = "Stonetusk Boar";
		this.manaCost = 1;
		this.attack = 1;
		this.health = 1;
		this.heroClass = "Neutral";
		this.keyword = "None";
		this.rarity = "Common";
		this.summoningSickness = false;
	}//end of StonetuskBoar constructor
}//end of StonetuskBoar class

//T

//U

//V

//W
class Wisp extends Cards{
	Wisp(){
		this.cardName = "Wisp";
		this.manaCost = 0;
		this.attack = 1;
		this.health = 1;
		this.heroClass = "Neutral";
		this.keyword = "None";
		this.rarity = "Common";
		this.summoningSickness = true;
	}//end of Wisp constructor
}//end of Wisp class

//X

//Y

//Z


