import java.util.Scanner;

public class PerimeterRectangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Read the user input
		System.out.println("Enter the width(meter):");
		double width = scanner.nextDouble();
		System.out.println("Enter the height(meter):");
		double height = scanner.nextDouble();
		
		// Calculate perimeter
		double perimeter = (2 * width) + (2 * height);
		
		// Calculate Area
		double area = width * height;
		
		// Calculate diagonal
		// formula : d = √(l² + w²)
		double diagonal = Math.sqrt((width * width) + (height * height));

		// Display result
		System.out.println("Perimeter of rectangle is " + perimeter);
		System.out.println("Area of rectangle is " + area);
		System.out.println("Diagonal of rectangle is " + diagonal);
		

	}

}
