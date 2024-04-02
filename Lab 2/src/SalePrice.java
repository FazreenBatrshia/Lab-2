import java.util.Scanner;

public class SalePrice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Read input from user
		System.out.println("Enter the Original Price (MYR):");
		double originalPrice = scanner.nextDouble();
		
		System.out.println("Enter the Percentage Discount (%):");
		double percentDiscount = scanner.nextDouble();
		
		// Calculate Discounted Price
		double discountedPrice = originalPrice * (percentDiscount / 100);
		
		// Calculate Price After Discount
		double salePrice = originalPrice - discountedPrice;
		
		// Display Sale Price
		System.out.println("Sale Price (MYR):" + salePrice);
	}

}
