package section3;

import javax.swing.JOptionPane;

public class SpellEncyclopedia {
public static void main(String[] args) {
	speak ("spell encyclopedia");
	String word = JOptionPane.showInputDialog("spell the word that I just said");
			if (word.equals("encyclopedia")){
	JOptionPane.showMessageDialog(null, "Correct!");
				
}
			else {
				JOptionPane.showMessageDialog(null, "Wrong!");
			}
}













static void speak(String words) {
	try {
	Runtime.getRuntime().exec("say " + words).waitFor();
	}
	 catch (Exception e) {
		 e.printStackTrace();
	 }
}
}
















