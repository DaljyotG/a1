
public class RandomDie 
{
	public static void main (String[] args)
	{
		Die die1, die2;
		int sum;
		
		die1 = new Die();
		die2 = new Die();
		
		die1.roll();
		die2.roll();
		sum= die1.roll() + die2.roll();
		
		System.out.println ("Die One: " + die1 + ", Die Two: " + die2);
		System.out.println ("Sum: " + sum );
		
		sum= die1.roll() + die2.roll();
		System.out.println("Die One: " + die1 + ", Die Two: " + die2);
		System.out.println ("New sum: " + sum);
		
		 
		
	

	
	}
}
