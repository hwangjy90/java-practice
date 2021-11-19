package firstProject;

import java.util.Scanner;

public class Scan {
	public static void main(String [] args) {
		Scanner keyboardInput = new Scanner(System.in);
		System.out.print("Enter Your Name: ");
		String name = keyboardInput.nextLine(); /* waits until the user enters the name */
		
		System.out.print("Enter Your Age: ");
		int age = keyboardInput.nextInt();
		
		System.out.println("Hey " + name + "!" + " You are " + age + " years old.");
	}
}
