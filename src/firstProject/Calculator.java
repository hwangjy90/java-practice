
package firstProject;

import java.util.Scanner;

public class Calculator {
	public static void main(String [] args) {
		Scanner keyboardInput = new Scanner(System.in);
		
		System.out.print("Enter a number: " );
		double num1 = keyboardInput.nextDouble();
		
		System.out.print("Enter an operator: ");
		String op = keyboardInput.next(); /* next grabs whatever the input without space */
		
		System.out.print("Enter another number: " );
		double num2 = keyboardInput.nextDouble();
		
		if (op.equals("+")) {
			System.out.println ( num1 + num2 );
		}else if (op.equals("-")) {
			System.out.println ( num1 - num2 );
		}else if (op.equals("/")) {
			System.out.println ( num1 / num2 );
		}else if (op.equals("*")) {
			System.out.println ( num1 * num2 );
		} else {
			System.out.println("Invalid Operator");
		}
	}

}
