import javax.swing.JOptionPane;

public class For_loops {
public static void main(String[] args) {
	//Write a for loop to do each the following:
for (int i = 0; i < 101; i++) {
	System.out.println(i);
}
for (int i = 100; i > 0; i--) {
	System.out.println(i);
}
for (int i = 0; i < 101; i++) {
if (i%2 == 0) {
	System.out.println(i);
}
}
	for (int i = 0; i < 100; i++) {
		if (i%2 == 1) {
			System.out.println(i);
		}
	}


		///1. Display all numbers from 0 to 100
		///2. Display all numbers from 100 to 0
		///3. Display all even numbers from 2 to 100
		///4. Display all odd numbers from 1 to 99
		//5. Display all numbers from 1 to 500. If the number is odd, print “odd” next to the number. If the number is even, print “even” next to the number.
		   //  Ex:	
		         // 1 is odd
		         // 2 is even
		          //3 is odd
		         // 4 is even
		         // 5 is odd...etc.
	for (int i = 0; i < 501; i++) {
		if (i %2 == 0) {
		System.out.println(i + " is even");
		}
			else {
				System.out.println(i + " is odd");
			}
		
		
		
		}
		
		
	}

		//6. Display all multiples of 7 from 0 to 777.
		//7. Print all the years you were alive and how old you were in each. e.g. “In 1979, i was 2 years old.” (for a really old person)

		//Nested For-Loops

		//Write nested for loops (a for loop inside another for loop) to do the following:

		//1. Display this output:

		         // 0  0
		         // 0  1
		         // 0  2
		         // 1  0
		          //1  1
		         // 1  2
		         // 2  0
		          //2  1
		          //2  2

		//2. Display the numbers 1 through 9 in a 3x3 square grid like this:

		         // 1  2  3
		         // 4  5  6
		         // 7  8  9

		//3. Display the numbers 1 through 100 in a 10x10 square grid.

		//4. Display the following output:

		         // *
		         // *  *
		         //*  *  *
		          //*  *  *  *
		          //*  *  *  *  *
		          //*  *  *  *  *  *
}

