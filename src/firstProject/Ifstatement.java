package firstProject;

public class Ifstatement {
	public static void main(String [] args) {
		boolean isMale = false;
		boolean isTall = false;
		
		if (isMale && isTall) {
			System.out.println("You are a tall male");
		} else if (isMale && !isTall) {
			System.out.println("You are a short male");
		} else if (!isMale && isTall) {
			System.out.println("You are not a male, but are tall");
		} else {
			System.out.println("You are not male and not tall");
		}
		
	}
}
