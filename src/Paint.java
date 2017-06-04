import java.util.Scanner;

public class Paint {
	public static void main(String[] args) {
		final int COVERAGE = 350; // paint covers 350 sq ft/gal
		final int DOOR_SQFT = 20;
		final int WINDOW_SQFT = 15;
		// Declare integers length, width, and height;

		int length, width, height, door, window;

		// Declare double totalSqft;

		double totalSqft;

		// Declare paintNeeded;

		double paintNeeded;

		// Declare and initialize Scanner object

		Scanner scan = new Scanner(System.in);

		// Prompt for and read in the length of the room
		System.out.println("What is the length of the room: ");
		length = scan.nextInt();
		System.out.println("length of the room: " + length);

		// Prompt for and read in the width of the room
		System.out.println("What is the width of the room: ");
		width = scan.nextInt();
		System.out.println("width of the room: " + width);

		// Prompt for and read in the height of the room
		System.out.println("What is the height of the room: ");
		height = scan.nextInt();
		System.out.println("height of the room: " + height);

		// Compute the total square feet to be painted --think
		totalSqft = ((length + width) * 2 * height);

		// about the dimensions of each wall

		// print the length, width, height of the room and the

		System.out.println("Enter number of doors ");
		door = scan.nextInt();

		System.out.println("Enter number of windows ");
		window = scan.nextInt();

		totalSqft = (totalSqft - (door * DOOR_SQFT) - (window * WINDOW_SQFT));
		paintNeeded = totalSqft / COVERAGE;

		System.out.println(paintNeeded + " gallons of paint needed to paint a room " + width + " feet wide by");
		System.out.println(
				+length + " feet long by " + height + " feet high with " + door + " doors and " + window + " windows.");

		scan.close();
	}
}
