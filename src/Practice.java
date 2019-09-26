import java.util.Random;

import javax.swing.JOptionPane;

public class Practice {
	public static void main(String[] args) {

		Practice skills = new Practice();
		skills.skill1();
		skills.skill2();
		skills.skill3();
		skills.skill4();
		skills.skill5();
	}

	void skill1() {
// Use pop-ups for the following.
// Ask the user how many dimes they have

		String ok = JOptionPane.showInputDialog("How many dimes do you have");

// Tell them how many cents they have (hint multiply by 10)
		int okay = Integer.parseInt(ok);

		okay = okay * 10;

		JOptionPane.showMessageDialog(null, okay);
// Ask the user how tall they are (inches)

		String no = JOptionPane.showInputDialog("How tall are you(in inches)?");

// If they are shorter than 36 inches, tell them to eat their Wheaties

		int nope = Integer.parseInt(no);

		if (nope >= 36) {
			JOptionPane.showMessageDialog(null, "Noice");
		} else {
			JOptionPane.showMessageDialog(null, "Eat your Wheaties");
		}

	}

	void skill2() { // Write a loop to print every third number between 1 and 30 to the console

		for (int i = 0; i < 30; i++) {

			if (i % 3 == 0) {

				System.out.println(i);
			}
		}
	}

	void skill3() { // Get a random number that is less than 20 and print it to the console
		Random yeet = new Random();
		int num = yeet.nextInt(21);
		System.out.println(num);
				
		
// Get another random number that is less than 10 and print it to the console 
int nah = yeet.nextInt(11);
// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 



JOptionPane.showMessageDialog(null, num-nah);
	}

	void skill4() { // In a pop-up, ask the user for the city they live in

// If they answered "San Diego", tell them they live in America's Finest City 
String sometime = JOptionPane.showInputDialog("What city do you live in?");
// Otherwise, tell them to move to San Diego 

if(sometime.equals("San Diego") ) {
	JOptionPane.showMessageDialog(null, "You live in America's Finest City");

}
else {
	JOptionPane.showMessageDialog(null, "You should move to San Diego");
}


// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 
int cars = 3;

if (cars == 3) {
	JOptionPane.showMessageDialog(null, "12");
}
// If there is 1 car, use a pop-up to display the make/model of the car 

// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 

	}

	void skill5() { // In a pop-up, ask the user for the name of their school
String school = JOptionPane.showInputDialog("What is the name of your school?");
// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 
JOptionPane.showMessageDialog(null, school + " is a fantastic school");
	}
}
