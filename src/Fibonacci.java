import javax.swing.JOptionPane;

public class Fibonacci {

public static void main(String[] args) {
	 
long low = 0;
	
	long high = 1;
	
	long next = 0;
	
	for (int i = 0; i < 100; i++) {
		
	next = low;
	
	low = high;
	
	high = next;
	
	high = next + low;
	
	System.out.println(next);
	
	}

}

}
