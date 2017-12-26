/* Created by Bartosz Kosakowski
 * 25/12/2017
 * Holds all the stuff related to drawing the board, the deck
 * creation screen, and whatever other stuff I think of eventually
 */
package code;

import javax.swing.JFrame;
//draws whatever stuff needs to be drawn
public class DrawGameStuff extends JFrame{
	public static void main (String [] args){
		BoardGUI.createBoard();
	}//end of main method
}//end of DrawGameStuff

//draws the game board
class BoardGUI extends JFrame{
	public static BoardGUI bgui = new BoardGUI();
	
	public static void createBoard(){
		bgui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bgui.setSize(500, 500);
		bgui.setVisible(true);
		bgui.setTitle("Board");
	}//end of createBoard
}//end of BoardGUI class
