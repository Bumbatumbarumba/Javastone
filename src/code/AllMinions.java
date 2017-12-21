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
}