/* Created by Bartosz Kosakowski
 * 25/12/2017
 * Holds all the stuff related to drawing the board, the deck
 * creation screen, and whatever other stuff I think of eventually
 */
package code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//draws whatever stuff needs to be drawn
@SuppressWarnings("serial")
public class DrawGameStuff extends JFrame{
	public static void main (String [] args){
		MainMenu.createMainMenu();
	}//end of main method
}//end of DrawGameStuff

//draws the game board
@SuppressWarnings("serial")
class MainMenu extends JFrame{
	private static MainMenu startScreen = new MainMenu();
	private static Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	
	private static JButton exitButton = new JButton("Exit Game");
	private static JButton deckBuildScreen = new JButton("Build Decks");
	private static JButton findMatchScreen = new JButton("Find match");
	private static CloseGame closeGame = new CloseGame();
	private static BuildDeckScreen buildDeckScreen = new BuildDeckScreen();
	private static FindMatchScreen fms = new FindMatchScreen();
	
	//organizes creating the board a bit more by tossing in the 
	//stuff related to making buttons appear on the screen
	public static void setUpButtons(){
		startScreen.add(exitButton);
		startScreen.add(deckBuildScreen);
		startScreen.add(findMatchScreen);
		exitButton.addActionListener(closeGame);
		deckBuildScreen.addActionListener(buildDeckScreen);
		findMatchScreen.addActionListener(fms);
	}//end of setUpButtons
	
	public static void createMainMenu(){
		startScreen.setLayout(new FlowLayout());
		startScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		startScreen.setSize(dim.width, dim.height);
		startScreen.setVisible(true);
		startScreen.setTitle("Board");
		
		setUpButtons();
	}//end of createMainMenu
}//end of MainMenu class


//=================================
//used to close the game
class CloseGame implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e){
		System.exit(0);
	}
}//end of CloseGame class

class BuildDeckScreen implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Make this open a deck building window");
	}
}

class FindMatchScreen implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Make this open the find match screen");
	}
}

/*
//used to let the user know something, eg, bad login credentials, etc
class GenericMessage extends JFrame{
	private GenericMessage msg;
	private JLabel genericMsg;
	private JButton closeMsg;
	
	public GenericMessage(String message){
		msg = new GenericMessage(message);
		
		setLayout(new FlowLayout());
		
		genericMsg = new JLabel(message);
		msg.add(genericMsg);
		
		closeMsg = new JButton("Okay");
		msg.add(closeMsg);
		
		PressOkay e = new PressOkay();
		closeMsg.addActionListener(e);
	}//end of constructor
	
	//this class implements the ActionListener interface so that we can
	//give the "okay" button the ability to close just the message window
	public class PressOkay implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			msg.dispose();
		}
	}//end of PressOkay
	
	public void createMessage(String title){
		msg.pack();
		msg.setLocationRelativeTo(null);
		msg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		msg.setSize(500, 500);
		msg.setVisible(true);
		msg.setTitle(title);
	}//creates the message window
}//end of GenericMessage class
*/
