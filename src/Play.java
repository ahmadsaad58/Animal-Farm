

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;


import javax.sound.sampled.*; 

	/**
	 * Creates the Play Screen to add animals
	 */
class Play extends JFrame implements ActionListener {
	private JButton addAnimal;
	private JPanel button;
	private JPanel back;
	private JPanel names;
	private JTextArea n;  
	private JMenu menu;
	
	/**
	 * Creates the play dialogues
	 *  @param name the String name of the farm
	 */
	public Play(String name){
		//JFrame stuff and music
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setSize(600,600);
		setTitle("PLAY");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		//welcome Message
		JOptionPane.showMessageDialog(null, "Farmer Saad is giving you the farm! Hope you have a fun time learning about his animals, " + name);
		
		//Menu Bar
		menu = new JMenu(name + "'s Farm");
		
		
		
		//Making the Panels
		button = new JPanel();
		back = new JPanel();
		names =  new JPanel(); 
			
			
		menu.setFont(new Font("Sans Serif", Font.PLAIN, 30));
		
		n = new JTextArea(" ANIMALS! \n\n The farmer has: \n\n A Cow named Bessie \n\n A Bunny named Bugs \n\n A Bull named Bullie \n\n A Chicken named Jennifer \n\n A Rooster named Rick \n\n A Duck named Don \n\n A Goat named Kyle \n\n A Horse named Kale \n\n A Lamb named Mary \n\n A Pig named Oink \n\n A Pony named Prancer \n\n A Sheep named Wool");
		n.setFont(new Font("Sans Serif", Font.BOLD, 16));
		 
		
		//Bottom button
		button.setLayout(new FlowLayout(FlowLayout.CENTER));
		button.setBackground(new Color(139,69,19));
		
		//Panel
		back.setLayout(new FlowLayout(FlowLayout.LEFT));
		names.setLayout(new BorderLayout());
		names.add(n, BorderLayout.CENTER);
		
		
	
		//Making the Button
		addAnimal = new JButton("ADD ANIMAL"); 
		addAnimal.addActionListener(this);
		
		//Adding the Button
		button.add(addAnimal);
		
		
		//Adding to the JFrame
		setLayout(new BorderLayout());
		add(menu, BorderLayout.NORTH);
		add(button,BorderLayout.SOUTH);
		add(back, BorderLayout.CENTER);
		add(names, BorderLayout.WEST);
		
        
		
		//Visible
		setVisible(true);
	}
	
	
	/**
	 * When play is pressed, a dialogue shows to name farm or info pops up
	 * @param e the ActionEvent button pressed
	 */
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == addAnimal)
			addM();
		
	}
	
	
	/**
	 * Adds the animal to the screen and plays a sound
	 */
	public void addM() {
		String animal = JOptionPane.showInputDialog("What animal would you like to see?", null);
		
		if (animal != null){	 
			if(animal.equalsIgnoreCase("cow")){
				back.add(new JLabel(new ImageIcon(getClass().getResource("Cow.jpg"))));
					try {
		   				AudioInputStream is = AudioSystem.getAudioInputStream(new BufferedInputStream(getClass().getClassLoader().getResourceAsStream("Cow.wav")));
						Clip clip = AudioSystem.getClip();
						clip.open(is);
	   		        	clip.start();
	               	} 
	   				catch (Exception e) {
	   				System.out.println(e.getMessage());
	  				}
	 		}	
			else if(animal.equalsIgnoreCase("bunny")){
				back.add(new JLabel(new ImageIcon(getClass().getResource("Bunny.jpg"))));
					try {
		   				AudioInputStream is = AudioSystem.getAudioInputStream(new BufferedInputStream(getClass().getClassLoader().getResourceAsStream("Bunny.wav")));
						Clip clip = AudioSystem.getClip();
						clip.open(is);
	   		        	clip.start();
	               	} 
	   				catch (Exception e) {
	   				System.out.println(e.getMessage());
	  				}
			}	
			else if(animal.equalsIgnoreCase("bull")){
				back.add(new JLabel(new ImageIcon(getClass().getResource("Bull.jpg"))));
					try 
					{
		   				AudioInputStream is = AudioSystem.getAudioInputStream(new BufferedInputStream(getClass().getClassLoader().getResourceAsStream("Bull.wav")));
						Clip clip = AudioSystem.getClip();
						clip.open(is);
	   		        	clip.start();
	               	} 
	   				catch (Exception e) {
	   				System.out.println(e.getMessage());
	  				}
			}
			else if(animal.equalsIgnoreCase("chicken")){
				back.add(new JLabel(new ImageIcon(getClass().getResource("Chicken.jpg"))));
					try {
		   				AudioInputStream is = AudioSystem.getAudioInputStream(new BufferedInputStream(getClass().getClassLoader().getResourceAsStream("Chicken.wav")));
						Clip clip = AudioSystem.getClip();
						clip.open(is);
	   		        	clip.start();
	               	} 
	   				catch (Exception e) {
	   				System.out.println(e.getMessage());
	  				}
			}	
			else if(animal.equalsIgnoreCase("rooster")){
				back.add(new JLabel(new ImageIcon(getClass().getResource("Rooster.jpg"))));
					try {
		   				AudioInputStream is = AudioSystem.getAudioInputStream(new BufferedInputStream(getClass().getClassLoader().getResourceAsStream("Rooster.wav")));
						Clip clip = AudioSystem.getClip();
						clip.open(is);
	   		        	clip.start();
	               	} 
	   				catch (Exception e) {
	   				System.out.println(e.getMessage());
	  				}	
			}
			else if(animal.equalsIgnoreCase("duck")){
				back.add(new JLabel(new ImageIcon(getClass().getResource("Duck.jpg"))));
					try {
		   				AudioInputStream is = AudioSystem.getAudioInputStream(new BufferedInputStream(getClass().getClassLoader().getResourceAsStream("Duck.wav")));
						Clip clip = AudioSystem.getClip();
						clip.open(is);
	   		        	clip.start();
	               	} 
	   				catch (Exception e) {
	   				System.out.println(e.getMessage());
	  				}
			}	
			else if(animal.equalsIgnoreCase("goat")){
				back.add(new JLabel(new ImageIcon(getClass().getResource("Goat.jpg"))));
					try {
		   				AudioInputStream is = AudioSystem.getAudioInputStream(new BufferedInputStream(getClass().getClassLoader().getResourceAsStream("Goat.wav")));
						Clip clip = AudioSystem.getClip();
						clip.open(is);
	   		        	clip.start();
	               	} 
	   				catch (Exception e) {
	   				System.out.println(e.getMessage());
	  				}
			}	
			else if(animal.equalsIgnoreCase("horse")){
				back.add(new JLabel(new ImageIcon(getClass().getResource("Horse.jpg"))));
					try {
		   				AudioInputStream is = AudioSystem.getAudioInputStream(new BufferedInputStream(getClass().getClassLoader().getResourceAsStream("Horse.wav")));
						Clip clip = AudioSystem.getClip();
						clip.open(is);
	   		        	clip.start();
	               	} 
	   				catch (Exception e) {
	   				System.out.println(e.getMessage());
	  				}
			}	
			else if(animal.equalsIgnoreCase("lamb")){
				back.add(new JLabel(new ImageIcon(getClass().getResource("Lamb.jpg"))));
					try {
		   				AudioInputStream is = AudioSystem.getAudioInputStream(new BufferedInputStream(getClass().getClassLoader().getResourceAsStream("Lamb.wav")));
						Clip clip = AudioSystem.getClip();
						clip.open(is);
	   		        	clip.start();
	               	} 
	   				catch (Exception e) {
	   				System.out.println(e.getMessage());
	  				}
			}	
			else if(animal.equalsIgnoreCase("pig")){
				back.add(new JLabel(new ImageIcon(getClass().getResource("Pig.jpg"))));
					try {
		   				AudioInputStream is = AudioSystem.getAudioInputStream(new BufferedInputStream(getClass().getClassLoader().getResourceAsStream("Pig.wav")));
						Clip clip = AudioSystem.getClip();
						clip.open(is);
	   		        	clip.start();
	               	} 
	   				catch (Exception e) {
	   				System.out.println(e.getMessage());
	  				}
			}	
			else if(animal.equalsIgnoreCase("pony")){
				back.add(new JLabel(new ImageIcon(getClass().getResource("Pony.jpg"))));
					try {
		   				AudioInputStream is = AudioSystem.getAudioInputStream(new BufferedInputStream(getClass().getClassLoader().getResourceAsStream("Pony.wav")));
						Clip clip = AudioSystem.getClip();
						clip.open(is);
	   		        	clip.start();
	               	} 
	   				catch (Exception e) {
	   				System.out.println(e.getMessage());
	  				}
			}	
			else if(animal.equalsIgnoreCase("sheep")){
				back.add(new JLabel(new ImageIcon(getClass().getResource("Sheep.jpg"))));
					try {
		   				AudioInputStream is = AudioSystem.getAudioInputStream(new BufferedInputStream(getClass().getClassLoader().getResourceAsStream("Sheep.wav")));
						Clip clip = AudioSystem.getClip();
						clip.open(is);
	   		        	clip.start();
	               	} 
	   				catch (Exception e) {
	   				System.out.println(e.getMessage());
	  				}
			}
			else
				JOptionPane.showMessageDialog(null, "Farmer Saad does not have that animal on the farm :(");
			
		}
		
		back.repaint();
		setVisible(true);
	
    }
			
	
}
