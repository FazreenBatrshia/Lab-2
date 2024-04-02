import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Read input from user
		System.out.println("Body Mass Index (BMI) Calculator");
		
		System.out.println("Please enter your name:");
		String name = scanner.nextLine();
		
		System.out.println("Enter your Weight(Kg):");
		double weight = scanner.nextDouble();
		
		System.out.println("Enter your Height(meter):");
		double height = scanner.nextDouble();
		
		// Calculating BMI //BMI = weight(kg)/height^2(m)
		double bodyMassIndex = weight / (height * height);
		
		// Display BMI user
		System.out.println("Hi " + name);
		System.out.println("Your BMI is:" + bodyMassIndex);
		


	}

}
