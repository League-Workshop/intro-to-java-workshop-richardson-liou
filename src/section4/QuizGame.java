package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = (0);
		// 2.  Ask the user a question 
		speak ("What kind of pizza is the wierdest.");
	String response = JOptionPane.showInputDialog("What kind of pizza is the wierdest.");
		// 3.  Use an if statement to check if their answer is correct
		if (response.equals ("Hawaiian Pizza")) {
			speak ("Wow your a Genius");
			score = score + 1;
			speak ("you have 1 point");
		}
		else {
			speak ("Better Luck next time");
		}
		// 4.  if the user's answer was correct, add one to their score 
		speak ("what is the best kind of hand-sanitizer?");
		String answer = JOptionPane.showInputDialog("What is the best Hand-sanitizer");
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		if (answer.equals ("soap")) {
			speak ("genius. I dont know what to say.");
			speak (" You have a score of "+ score);
			score = score + 1;
		}
		else {
		speak ("hhaaaa. why do people always say that");
		speak ("your score is " + score);
		score = score+1;
		}
	}
		// 6.  After all the questions have been asked, print the user's score 
		static void speak(String words) {
			try {
				Runtime.getRuntime().exec("say " + words).waitFor();
			}
			 catch (Exception e) {
				 e.printStackTrace();
			 }
		
	}
}
