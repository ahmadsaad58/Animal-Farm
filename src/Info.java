


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import javax.sound.sampled.*; 


	/**
	 * Creates the Info Panel in a new window 
	 */

class Info extends JFrame implements ActionListener, KeyListener
{
	private JTextArea text;
	
	/**
	 * Creates the Info Panel 
	 */
	public Info()
	{
		//JFrame stuff and music
		setSize(670,650);
		setTitle("INFO [ESC] to Close");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		
		//Making the Screen
		text = new JTextArea(" Farmer Saad wants you to get familiar with his animals on his farm! \n\n The farmer has: \n\t A Cow named Bessie \n\t A Bunny named Bugs \n\t A Bull named Bullie \n\t A Chicken named Jennifer \n\t A Rooster named Rick \n\t A Duck named Don \n\t A Goat named Kyle \n\t A Horse named Kale \n\t A Lamb named Mary \n\t A Pig named Oink \n\t A Pony named Prancer \n\t A Sheep named Wool \n\n Type the animal into the animal search bar \n And get acquainted with Farmer Saad’s farm!"); 
		
			
		//Text
		text.setBackground(new Color(1,166,17));
		text.setOpaque(true);
		text.setFont(new Font("Sans Serif", Font.PLAIN, 22));
		text.setEditable(false);
		text.setFocusable(true);
        text.requestFocus();

		
		//Adding to the JFrame
		text.addKeyListener(this);
		setLayout(new BorderLayout());
		add(text, BorderLayout.CENTER);
		
		
		//Visible
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
	}
	
	/**
	 * When Escape is pressed program closes
	 * @param e the KeyEvent representing the pressed key
	 */
	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_ESCAPE)
			this.dispose();	
	}

	/**
	 * Needed to satisfy the KeyListener
	 * @param e the KeyEvent representing the released key
	 */
	public void keyReleased(KeyEvent e)
	{
		//no code needed here
	}

	/**
	 * Needed to satisfy the KeyListener
	 * @param e not used
	 */
	public void keyTyped(KeyEvent e)
	{
      	//no code needed here
	}

	
}