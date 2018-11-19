package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
Robot messi =new Robot();
	void go() {
	messi.setSpeed(100);	// 4. Make the robot move as fast as possible

	messi.penDown();
	
	messi.setPenWidth(5);	// 5. Set the pen width to 5

	for(int i = 0;i<4;i++) {	// 6. Use a for loop to repeat steps #7 to #8, four times...

		messi.setRandomPenColor();	// 7. Set the pen color to random
	
		// 1. Call the drawSquare() method
	
			messi.turn(90);// 8. Turn the robot 90 degrees to the right
			drawSquare();
	}

	}
	
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */
		for(int i=0;i<4;i++){
		messi.move(100);
		messi.turn(90);
	}
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



