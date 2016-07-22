/*
 * Program to print the sum of two numbers. One number should be int and another should be float
 * The sum of two numbers should be in integer.
 */
public class Assgn1 {

	public static void main(String[] args) {
		
		int numInt	= 2;			// Integer number
		float numFloat = 1.14f;     // Floating point number assigned by casting
		int numAns = 0;
		
		numAns = numInt + (int)numFloat;	// Answer made an Int by explicit casting
		
		System.out.println("\nSum of the two numbers is : " + numAns);

	}

}
