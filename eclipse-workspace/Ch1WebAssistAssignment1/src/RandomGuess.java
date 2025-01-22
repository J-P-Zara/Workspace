//Jessie Zarate 8/15 Chapter 1 - Web Assist 1

import javax.swing.JOptionPane;

public class RandomGuess {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"the number is "+
			(1+(int)(Math.random()*10)));

	}

}
