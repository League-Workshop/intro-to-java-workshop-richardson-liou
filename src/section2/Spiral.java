package section2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot iphone = new Robot ();
		iphone.changeRobot("https://i.guim.co.uk/img/static/sys-images/Guardian/Pix/pictures/2014/4/4/1396571498371/2a8e7b6c-5bc3-4ee3-923d-eb56fd4e9518-2060x1236.jpeg?width=300&quality=85&auto=format&fit=max&s=bf8fa458d1b73bbd039d9ed083c6d899");
		// 5. Set your robot's pen down 
		iphone.penDown();
		
		// 3. Set the robot to go at max speed (100)
		iphone.setSpeed(100);
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		
		for(int i =0; i<75 ;i++) {
			iphone.setPenWidth(i);
			iphone.setRandomPenColor();
			iphone.move(5*i);
			iphone.turn(75);
		}
			// 7. Change the pen color to random
		
			// 6. Move the robot 5 times the loop counter (5*i)
			
			// 2. Turn the robot 360/7 degrees to the right
		
			// 8. Set the pen width to i
			
	}
}
