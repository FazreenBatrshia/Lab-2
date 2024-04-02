
public class CalculateArea {

	public static void main(String[] args) {
		
		// Cuboid P
		// Assign value side cuboid P
		int x = 8;
		int y = 4;
		
		// Calculate Area Shaded on P
		double areaP = x * y;
		
		// Cuboid Q
		int q1 = 4;
		int q2 = 4;
		// Calculate Area Shaded on Q
		double areaQ = q1 * q2;
		
		// Total Area of Shaded Region
		double TotalAreaShaded = areaP + areaQ;
		
		// Display Result
		System.out.println("The total area of the shaded surface is " + TotalAreaShaded + "cm^2");
		
	}

}
