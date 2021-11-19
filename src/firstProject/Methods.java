package firstProject;

public class Methods {
	
	public static void main(String [] args) {
		
		sayHi("World");
		sayHi("Dave");
		
		int myNum = cube(3);
		System.out.println(myNum);
	}

	public static void sayHi(String name) {
		System.out.println("Hello " + name);
	}
	
	
	public static int cube(int numberToCube) {
		return (numberToCube * numberToCube * numberToCube);
	}
}
