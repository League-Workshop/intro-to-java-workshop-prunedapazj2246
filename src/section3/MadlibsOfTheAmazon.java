package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		String adjective;
		String liquid;
		String bodypart;
	String verb;
	String place;
		

		// Put this sentence in a pop up:
	 JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it...");	// If you find yourself having to cross a piranha-infested river, here's how to do it...
		
	adjective = JOptionPane.showInputDialog("enter in an adjective");	// Get the user to enter an adjective

	liquid = JOptionPane.showInputDialog("enter in a liquid");	// Get the user to enter a type of liquid

	bodypart = JOptionPane.showInputDialog("enter in a body part");// Get the user to enter a body part

	verb = JOptionPane.showInputDialog("enter in a verb");// Get the user to enter a verb

	place = JOptionPane.showInputDialog("enter in a place");	// Get the user to enter a place

		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		
		// Make a pop-up for the final story. You can use \n to go to the next line
	JOptionPane.showMessageDialog(null,                                                                         // Fit the user's words into this sentence, and save it in a String:
			 "Piranhas are more " + adjective + " during the day, so cross the river at" +
			 "night. Piranhas are attracted to fresh " + liquid + "and will most" +
			" likely take a bite out of your " + bodypart + ".if you " + verb + ". Whatever" +
			 "you do, if you have an open wound, try to find another way to get" +
			" back to the " + place + ". Good luck!" );	

	}
}

