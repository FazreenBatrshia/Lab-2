
public class AverageNumber {

	public static void main(String[] args) {
		// Declare and assign number value
		double num1 = 5;
		double num2 = 7;
		double num3 = 8;
		
		// Finding average
		double average = num1 / 2;
		double average1 = num2 / 2;
		double average2 = num3 / 2;
		
		// Calculate sum
		double sum = num1 + num2 + num3;
		
		// Average of sum of the three numbers
		double overall_average = sum / 3;
		
		// Multiple lines of text print
		System.out.println("Average of 5 is:" + average);
		System.out.println("Average of 7 is:" + average1);
		System.out.println("Average of 8 is:" + average2);
		
		System.out.println("Sum of the three numbers:" + sum);
		
		System.out.println("Average of the three numbers:" + overall_average);

	}

}
