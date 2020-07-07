package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot t = new Robot();
	
	

	void go() {
		t.penDown();
		
		
		// 4. Make the robot move as fast as possible
		t.setSpeed(100);
		
	

		// 5. Set the pen width to 5
		t.setPenWidth(5);

		// 6. Use a for loop to repeat steps #7 to #8, four times...
		for (int sides = 0; sides < 4; sides += 1) {
			t.setRandomPenColor();
			drawSquare();
			t.turn(90);
		}
		

			// 7. Set the pen color to random
	
			// 1. Call the drawSquare() method
	
	
			// 8. Turn the robot 90 degrees to the right

	}

	
	void drawSquare() {
		//JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */
	for (int sides = 0; sides < 4; sides += 1) {
		
		t.move(150);
		t.turn(90);
	}
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



