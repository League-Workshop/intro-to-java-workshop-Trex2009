package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	
		
//		Robot r = new Robot();
//		r.move(200);
//		r.turn(90);
		
		Robot t = new Robot();
		t.penDown();
		t.setRandomPenColor();
		t.setPenWidth(100);
		t.setSpeed(100);
		t.sparkle();
		
//		t.move(150);
//		t.turn(90);
//		t.move(150);
//		t.turn(90);
//		t.move(150);
//		t.turn(90);
//		t.move(150);
//		t.turn(90);
//		
		
//		for(int sides = 0; sides < 4; sides += 1) {
//			
//			t.move(150);
//			t.turn(90);
//			
//		}
		
		for(int sides = 0; sides < 3; sides += 1) {
			
			t.move(150);
			t.turn(0);
		
		}
		
		
		




		
		
		
	}
	
}
