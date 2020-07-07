package section3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
		//String input = JOptionPane.showInputDialog("How is the weather?");
				//JOptionPane.showMessageDialog(null, "The weather is "+input);
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		String input = JOptionPane.showInputDialog("Who do you not like?");
		JOptionPane.showMessageDialog(null, "You totally have a crush on "+input);
		// 3. Ask the user for the name of their best friend
		input = JOptionPane.showInputDialog("Who is your best friend?");
		JOptionPane.showMessageDialog(null,  input+" is as sweet as candy!");

		// 4. Tell them their best friend is as sweet as candy

	} 
}



