import java.util.Scanner;

public class Paint {
	public static void main(String[] args) {
		final int COVERAGE = 350; // paint covers 350 sq ft/gal

		// Declare integers length, width, and height;

		int length, width, height;

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

		System.out.println("Total sqft: " + totalSqft);

		// about the dimensions of each wall

		// compute the amount of paint needed

		paintNeeded = totalSqft / COVERAGE;

		// print the length, width, height of the room and the

		System.out.println(
				"length: " + length + " width: " + width + " height: " + height + " is the dimensions of the room");

		System.out.println("number of gallons paint needed: " + paintNeeded);

		// number of gallons of paint needed as a two-line output labeled

		// Appropriately as per format below

		// _ gallons of paint needed to paint a room _ feet wide by

		// _ feet long by _ feet high with _ doors and _ windows.
		scan.close();
	}
}
