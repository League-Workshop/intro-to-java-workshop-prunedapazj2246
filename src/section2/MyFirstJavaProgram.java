package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		Robot billy = new Robot();// START HERE
		billy.setPenColor(Color.BLUE);
		billy.penDown();
		billy.setSpeed(200);
		for(int i=0;i<360;i++) {
		billy.move(2);	
		billy.turn(360/360);
	
		
		
	}
}
}