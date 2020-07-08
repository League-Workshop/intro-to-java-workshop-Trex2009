package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
	   String yes =	JOptionPane.showInputDialog("Do you know how to code?");

		// 2. If they say "yes", tell them they will rule the world.
			   
			   
		if (yes.equalsIgnoreCase("yes"))  
			JOptionPane.showMessageDialog(null, "Then you will rule the world");
		else 
			JOptionPane.showMessageDialog(null, "Then good luck washing dishes");

		// 3. Otherwise, wish them good luck washing dishes.
		
		
//		String name = "Trex";
//		
//		int x = 6;
//		
//		if(x == 5) {
//			JOptionPane.showMessageDialog(null, "X is 5!");
//		}
//		else {
//			JOptionPane.showMessageDialog(null, "X is not 5!");
//		}
//		
//		if(name.equals("Cody")){
//			JOptionPane.showMessageDialog(null,"My name is " + name);
//		}
//		else {
//			JOptionPane.showMessageDialog(null, "RAWRRR");
//		}

	}
}

