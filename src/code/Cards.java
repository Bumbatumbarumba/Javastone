/* Created by Bartosz Kosakowski
 * 12/20/2017
 * Abstract class Card that outlines the basic characteristics of each card
 */
package code;

public abstract class Cards {
	public String cardName;
	public int manaCost;
	public int attack;
	public int health;
	public String heroClass;
	//races: beast, demon, dragon, elemental, mech, murloc, pirate, totem 
	public String race;
	//basic keywords: battlecry, charge, choose one, combo, counter, deathrattle,
	//devine shield, enrage, freeze, immune, mega-windfury, overload, poisonous,
	//secret, silenced, stealth, spell damage, taunt, windfury
	public String keyword;
	//make sure to add a keyword icon variable, to represent the deathrattle skull,
	//poisonous icon, etc (make it an image type, if possible)
	//also make sure to add a rarity variable, make it an image type if possible
	public String rarity;
	//summoning sickness being true means that the minion must wait until the player's
	//next turn before attacking
	public boolean summoningSickness;
	
	//getters for the fields
	public String getCardName(){
		return cardName;
	}
	public int getManaCost(){
		return manaCost;
	}
	public int getAttack(){
		return attack;
	}
	public int getHealth(){
		return health;
	}
	public String getHeroClass(){
		return heroClass;
	}
	public String getRace(){
		return race;
	}
	public String getKeyword(){
		return keyword;
	}
	public String getRarity(){
		return rarity;
	}
	
	//setters for manaCost, attack, health, and keyword vars, since no other
	//aspect of a card can be changed; the keyword can be changed to "silenced",
	//if a silence effect minion targets it
	public void setManaCost(int newCost){
		manaCost = newCost;
	}
	public void setAttack(int newAttack){
		attack = newAttack;
	}
	public void setHealth(int newHealth){
		health = newHealth;
	}
	public void setKeyword(String newKeyword){
		keyword = newKeyword;
	}
	
	//different card effects (eg, draw a card, charge, etc)
	public boolean canAttack(){
		return !summoningSickness;
	}
	
	public void drawCard(){
		//put code here to draw cards
	}
}//end of Card class




