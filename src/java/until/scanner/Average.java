package java.until.scanner;

public class Average {
	
	public static viod main(String[] args)
	{
		int val1, val2, val3;
		String average;
		Scanner scan = new Scanner(System.in);
		
		// get three values from user
		System.out.println("Please enter three integers and " 
		+val1 + val2  + val3 + "I will compute their average");
		val1 = scan.nextInt();
		val2 = scan.nextInt();
		val3 = scan.nextInt();
		
		average = ("val1 + val2 + val3 /3");
		
		System.out.print(average);
		
		

		
	}

}
