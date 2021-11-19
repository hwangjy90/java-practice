package firstProject;

public class App {
	public static void main (String [] args) {
		String characterName = "Tom";
		int characterAge = 50;
		char grade = 'A';
		double gpa = 3.9;
		
		
		System.out.println("His name is " + characterName);
		System.out.println("and he is " + characterAge);
		System.out.println("Hello \nWorld");
		System.out.println("Hello \"World\"");
		
		System.out.println(characterName.toUpperCase());
		System.out.println(characterName.contains("om"));
		System.out.println(characterName.charAt(2));
		
		System.out.println(Math.pow(gpa, 2));
		
	
	}

}
