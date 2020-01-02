package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Put all of the game code inside the main method (below) 
	public static void main(String[] args) {
		Random rand = new Random();
		ImageIcon dragon = new ImageIcon("src/section4/derp.jpeg");		
		
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		JOptionPane.showInputDialog("Welcome, what is your name?");
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
int playerHealth = (100);
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
int dragonHealth = (100);		
		// 4. Create a variable to hold the damage the player's attack does each round
int playerDamage = (0);		
		// 5. Create a variable to hold the damage the dragon's attack does each round
int dragonDamage = (0);
		
		// 6.  Delete the slashes at the beginning of the next line. 

while(playerHealth>0 && dragonHealth>0) {    //this line of code keeps the battle going until someone's health reaches 0 
		
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
String attack =	JOptionPane.showInputDialog ("What attack will you do? The powerful KAMEHAMEHA WAVE, or the all mighty RASENGAN? Choose wisely.");
		// 9. If they typed in "yell":
		if (attack.equals("rasengan")) {
			int randNum = rand.nextInt(40);
			dragonHealth= dragonHealth - randNum;
		}
			//-- Find a random number between 0 and 10 and store it in dragonDamage
			
			//-- Subtract that number from the dragon's health variable 
			
		// 10. If they typed in "kick":
		if(attack.equals("Kamehameha")) {
			int random = rand.nextInt(45);
			playerHealth = playerHealth - random;
		}
			//-- Find a random number between 0 and 25 and store it in dragonDamage
			
			dragonDamage = rand.nextInt(25);
			dragonHealth = dragonHealth - dragonDamage;
			//-- Subtract that number from the dragon's health variable
			
			

		// 11.  Find a random number between 0 and 35 and store it in playerDamage
		playerDamage = rand.nextInt(35);
		playerHealth = playerHealth - playerDamage;
		// 12. Subtract this number from the player's health
		
		
		
		// 13. If the user's health is less than or equal to 0
		if (playerHealth <= (0)) {
			JOptionPane.showMessageDialog(null," Congratualations you are the first person to lose to the dragon.");
		}
			//-- Tell the user that they lost
			
		
		// 14. Else if the dragon's health is less than or equal to 0
		if (dragonHealth <= (0 )) {
			JOptionPane.showMessageDialog(null, "WOW, you defeated the dragon now you shall enter his cave and take his gold.");
			JOptionPane.showMessageDialog(null, "AAAAAAAHH the gold is too heavy, you fall down the cliff and die.");
		}
			//-- Tell the user that the dragon is dead and they took a ton of gold!
			
	   //  15.  Else
			
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
		else {
			JOptionPane.showMessageDialog(null, "Your health is " + playerHealth + (". The dragon has "+ dragonHealth + " health."));
		}
		}
	}
}

