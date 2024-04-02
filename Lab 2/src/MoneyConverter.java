import java.util.Scanner;

public class MoneyConverter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Read input from user
		System.out.println("Welcome to Currency Converter!");
		System.out.println("Enter the amount in Malaysia Ringgit (MYR):");
		double amountInMYR = scanner.nextDouble();
		
		// The exchange rate
		// 1 MYR = 0.210327 USD
		double exchangeRate = 0.210327;

		
		// Convert MYR to USD
		double amountInUSD = amountInMYR * exchangeRate;
		
		// Display the converted amount in USD
        System.out.println("Amount in US Dollar (USD): " + amountInUSD);

        scanner.close(); // Close the scanner
				

	}

}
