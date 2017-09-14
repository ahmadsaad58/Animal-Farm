

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import javax.sound.sampled.*; 


	/**
	 * Creates the Welcome Screen
	 */

class Farm extends JFrame implements ActionListener, KeyListener, MouseListener
{
	private JLabel welcomeText;
	private JPanel welcomeButtons;
	private boolean on = true; 
	private JButton info; 
	
	/**
	 * Creates the welcome panels with buttons 
	 */
	public Farm()
	{
		//JFrame stuff and music
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setSize(600,600);
		setTitle("WELCOME [ESC] to Close");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.
		music();
		
		//Making the Screen
		welcomeButtons = new JPanel();
		welcomeText = new JLabel("WELCOME TO FARM SIMULATOR", SwingConstants.CENTER); 
		
		//Bottom buttons
		welcomeButtons.setLayout(new FlowLayout(FlowLayout.CENTER));
		welcomeButtons.setBackground(new Color(139,69,19));
		
		//Text
		welcomeText.setBackground(new Color(1,166,17));
		welcomeText.setOpaque(true);
		welcomeText.setFont(new Font("Sans Serif", Font.BOLD, 72));
		welcomeText.setFocusable(true);
        welcomeText.requestFocus();
	
		//Making the Buttons
		 
		info = new JButton("INFO"); 
		
		info.addActionListener(this);
		
		//Adding the Buttons
		
		welcomeButtons.add(info);
		
		//Adding to the JFrame
		welcomeText.addKeyListener(this);
		setLayout(new BorderLayout());
		add(welcomeText, BorderLayout.CENTER);
		add(welcomeButtons,BorderLayout.SOUTH);
		
		welcomeText.addMouseListener(this);
		
		//Visible
		setVisible(true);
	}
	
	/**
	 * When play is pressed, a dialogue shows to name farm or info pops up
	 * @param e the ActionEvent button pressed
	 */
	
	public void actionPerformed(ActionEvent e)
	{
			
		if (e.getSource() == info)
			new Info();
	}
	
	/**
	 * When Escape is pressed program closes
	 * @param e the KeyEvent representing the pressed key
	 */
	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_ESCAPE)
		{
			on = false; 
			this.dispose();
		}
				
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


	/**
	 * Plays music 
	 */
	public void music() 
	{
		
		try 
		{
			AudioInputStream is = AudioSystem.getAudioInputStream(new BufferedInputStream(getClass().getClassLoader().getResourceAsStream("Background.wav")));
			Clip clip = AudioSystem.getClip();
			clip.open(is);
   			
          	if(on)
          	{
          		clip.start();
            	clip.loop(clip.LOOP_CONTINUOUSLY);
          	}              
  		} 
  
  		catch (Exception e) 
  		{
   			System.out.println(e.getMessage());
  		}
 
    }
    
    
	/**
 	* Identifies the location of the mouse click and launches the repaint method
 	* @param event the MouseEvent which triggers the method
 	*/
  	public void mousePressed(MouseEvent event)
   	{  
   		 
   		 String name = JOptionPane.showInputDialog("What's your name?", null);
			new Play(name);
   	}

	/**
 	* Do-nothing methods that are part of the MouseListener Interface
 	*/
	public void mouseReleased(MouseEvent event) {}
	public void mouseClicked(MouseEvent event) 	{}
	public void mouseEntered(MouseEvent event) {}
	public void mouseExited(MouseEvent event) {}

	
}