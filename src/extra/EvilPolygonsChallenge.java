package extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot Rob = new Robot();
	Rob.penDown();
		//2. Set the speed to 100
Rob.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "hello", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Red","Green", "Blue"}, 0);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if(colorChoice == 0) {
			Rob.setPenColor(Color.RED);
		}
		if(colorChoice == 1) {
			Rob.setPenColor(Color.GREEN);
		}
		if(colorChoice == 2) {
			Rob.setPenColor(Color.BLUE);
		}
		//4. Ask the use how many polygons they want to be drawn.
		String ok = JOptionPane.showInputDialog("How many polygons do you want?");
		//5. Use the robot to draw the number of polygons the user requested.
		int okay = Integer.parseInt(ok);
		//6. Make it so your shapes do not overlap
	
		//7. Challenge: add more colors to the Option Dialog.
		for (int i = 0; i < okay; i++) {
			Rob.move(100);
			Rob.turn(90);
			Rob.move(100);
			Rob.turn(90);
			Rob.move(100);
			Rob.turn(90);
			Rob.move(300);
			Rob.turn(90);
		}
	}
}

