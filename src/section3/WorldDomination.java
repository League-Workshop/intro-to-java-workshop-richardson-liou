package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String response = JOptionPane.showInputDialog("DO you know the way of Java?");
				
		// 2. If they say "yes", tell them they will rule the world.
if (response.equals("Yes Master")){
	speak ("I shall kill you for not being on the dark side!!");
}
else {
	speak ("Welcome to the Dark Side! Destroy the Jedi");
}
		// 3. Otherwise, wish them good luck washing dishes.

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