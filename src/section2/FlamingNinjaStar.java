package section2;

import org.jointheleague.graphical.robot.Robot;

public class FlamingNinjaStar {
	
	public static void main(String[] args) {

		int baseSize = 300;		//the size of the black part of the star
		int flameSize = 200;		//the length of the flaming arms
		
		Robot billy = new Robot();
				billy.penDown();// 1. Make a new robot, and set it's pen down.

				
				
		billy.setX(500);// *14. Use the methods setX and setY to move the ninja star into the center of the screen
		billy.setY(300);
		// *15. Make some adjustments to see what other kinds of shapes you can make.

		billy.setSpeed(200);// 12. Set the robot speed to 100

		for (int i = 0; i<25;i++){// 13. Use a for loop to repeat all of the code below 25 times

		billy.turn(360/8);	// 2. Turn the robot 1/8 of a circle
		
			billy.move(64);// 3. Move the robot 64 pixels

			billy.turn(-40);// 4. Turn the robot 40 degrees to the LEFT. (Negative numbers will turn the robot counter-clockwise.)
			billy.setRandomPenColor();
			billy.move(flameSize);// 5. Move the robot the distance in the variable flameSize
			
			billy.turn(170);// 6. Turn the robot 170 degrees
			
			billy.move(flameSize);// 7. Move the robot the distance in the variable flameSize (again)
			
			billy.turn(64);// 8. Turn the robot 64 degrees to the right
			billy.setRandomPenColor();
			billy.move(baseSize);// 9. Move the robot the distance in the variable baseSize
		}
			// 10. Check that your shape is the same as Figure 1. This is one arm of the ninja star.
			
			// 11. Color your ninja star like Figure 2.
		
	}

}


