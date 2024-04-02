import java.util.Scanner;

public class MinimumBillsCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Read user input
		System.out.println("Please enter Malaysia Ringgit amount(RM): ");
		int amount = scanner.nextInt();
		
		// Calculate the minimum number of bills
		int rm50Count = amount/50;
		int rm20Count = (amount % 50) / 20;
		int rm10Count = ((amount % 50) % 20) / 10;
		int rm5Count = (((amount % 50) % 20) % 10) / 5;
		int rm1Count = (((amount % 50) % 20) % 10) % 5;
		
		// Display results
		System.out.println("Minimum number of bills");
		System.out.println("RM50 bills: " + rm50Count);
        System.out.println("RM20 bills: " + rm20Count);
        System.out.println("RM10 bills: " + rm10Count);
        System.out.println("RM5 bills: " + rm5Count);
        System.out.println("RM1 bills: " + rm1Count);


	}

}
