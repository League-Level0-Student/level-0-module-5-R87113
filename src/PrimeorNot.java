import javax.swing.JOptionPane;

public class PrimeorNot {
public static void main(String[] args) {
	
	String number = JOptionPane.showInputDialog("Number");
	int Number = Integer.parseInt(number);
	 for (int i = 2; i < Number; i++) {
		
		if(Number % i == 0 ) {			
	JOptionPane.showMessageDialog(null, "Your number isn't prime!");
	System.exit(0);	
		}  
	 }
	 JOptionPane.showMessageDialog(null, "Your number is prime!");
}
}
