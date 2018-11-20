package section3;

import javax.swing.JOptionPane;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class StephenHawking {
	
	public static void main(String[] args) {
		
	String billy;// 1. make a main method and put steps 2, 3 & 4 inside it
	
	for(int m = 0; m<200;m++) {// 4. Use a for loop to repeat steps #2 and #3, a lot of times
	
	billy=JOptionPane.showInputDialog("Give me a sentence.");// 2. ask the user for a sentence
	
	speak(billy);// 3. call the speak method below and send it the sentence
	}
	}

	
	
	
	
	
	
	
	/* Don’t change this…. */
	static void speak(String words) {
		try {
		Runtime.getRuntime().exec("say " + words).waitFor();
		}
		 catch (Exception e) {
			 e.printStackTrace();
		 }
	}

}
