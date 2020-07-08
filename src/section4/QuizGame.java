package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		
		
		// 1.  Create a variable to hold the user's score 
	    int n = 0;
	    
	    String Kashyyyk = JOptionPane.showInputDialog("What planet is home of Chewbacca and the Wookies?");
	    
	    if (Kashyyyk.equalsIgnoreCase("Kashyyyk")) {
	    	JOptionPane.showMessageDialog(null, "You got it right (Wookie sounds)");
	    	n++;
	    }
	    	String darthTyranus = JOptionPane.showInputDialog("Who is Darth Tyranus also know as?");
	    	
	    	if (darthTyranus.equalsIgnoreCase("Count Dooku")) {
	    		JOptionPane.showMessageDialog(null, "You got it right!");
	    		n++;
	    	}
	    	String ovg = JOptionPane.showInputDialog("How many times does Obi-Wan shoot General Grievous?");
	    	
	    	if (ovg.equalsIgnoreCase("5 times")) {
	    		JOptionPane.showMessageDialog(null, "You got it right!");
	    		n++;
	    	}
	    	JOptionPane.showMessageDialog(null, "if you got them all right then you won!");
	    
	    
		// 2.  Ask the user a question 
		
		// 3.  Use an if statement to check if their answer is correct
		
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
	    
	    //int score = 0;
	    // score++
	    // score--
	    // score += 5;
	    // score -= 10;
		
	}
}
