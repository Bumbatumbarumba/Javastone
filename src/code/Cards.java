/* Created by Bartosz Kosakowski
 * 12/20/2017
 * Abstract class Card that outlines the basic characteristics of each card
 */
package code;

/**
 * Minion card fields:
 * cardName
 * manaCost
 * attack
 * health
 * heroClass
 * race
 * keyword
 * rarity
 * summoningSickness
 */
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
	
	
	/* by creating these generic actions, even though a minion may not possess the
	 * ability, we can make our life easier, since we can play a minion and call every
	 * one of these functions, instead of checking whether the minion has an effect
	 */
	public void battlecry(){
		/* generic battlecry is to do nothing when the creature is summoned,
		 * so when we call someMinion.battlecry() upon it being played, nothing
		 * will happen; otherwise we can override this method whenever a
		 * battlecry needs to occur
		 */
		//pass
	}//end of battlecry
	
	public void deathrattle(){
		/* generic deathrattle is to do nothing when the creature dies,
		 * so when we call someMinion.deathrattle() upon it dying, nothing
		 * will happen; otherwise we can override this method whenever a
		 * deathrattle needs to occur
		 */
		//pass
	}//end of deathrattle
	
	//the aura effect means that the minion affects other things when in play,
	//eg direwolf alpha giving adjacent minions +1 attack
	public void aura(){
		//pass
	}//end of aura
}//end of Card class




