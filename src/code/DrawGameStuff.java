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
public class DrawGameStuff extends JFrame{
	public static void main (String [] args){
		BoardGUI.createBoard();
	}//end of main method
}//end of DrawGameStuff

//draws the game board
class BoardGUI extends JFrame{
	private static BoardGUI bgui = new BoardGUI();
	private static Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	
	public static void createBoard(){
		bgui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bgui.setSize(dim.width, dim.height);
		bgui.setVisible(true);
		bgui.setTitle("Board");
	}//end of createBoard
}//end of BoardGUI class

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
