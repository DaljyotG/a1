import java.util.Scanner;

public class errors {

	public static void main(String[] args) {
		String Name; // Name of the user
		int number;
		int numSq;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter your name, please: ");
		Name = scan.next();

		System.out.print("what is your favourite number? ");
		number = scan.nextInt();

		numSq = number * number;

		System.out.print(Name + " the square of your number is " + numSq);

	}
}
