public class PaintDoorsWindows


{
public static void main(String[] args)

{
	final int COVERAGE = 350; // paint covers 350 sq ft/gal
	
	//Declare integers length, width, and height;
	int length;
	int width;
	int height;
	//Declare double totalSqft;
	double totalSqft;
	
	
	//Declare paintNeeded;
	double paintNeeded;
	
	return;
	
	
	
	//Declare and initialize Scanner object
	 
	java.util.Scanner scan = new java.util.Scanner
	
	
	//Prompt for and read in the length of the room
	
	length = scan.nextInt();
	System.out.println("length of the room" + length);
	
	//Prompt for and read in the width of the room
	width = scan.nextInt();
	System.out.println("width of the room" + width);
	
	
	//Prompt for and read in the height of the room 
	height = scan.nextInt();
	System.out.println("height of the room" + height);
	
	
	//Compute the total square feet to be painted --think
	totalSqft = (length + width + height);
	System.out.println("Total sqft: " + totalSqft);
	
	//about the dimensions of each wall 
	
	
	
	// compute the amount of paint needed 
	paintNeeded = (length * width * height) / 350;
	
	//print the length, width, height of the room and the 
	
	System.out.println(paintNeeded + " gallons of paint needed to paint a room " + width + " feet wide by");
	System.out.println( length + " feet long by " height "feet high with" _ doors and _ windows. );
	
	// number of gallons of paint needed as a two-line output labeled

	//Appropriately as per format below 

	// _ gallons of paint needed to paint a room _ feet wide by 
	
	//_ feet long by _ feet high with _ doors and _ windows.
	
	
	
}
}
