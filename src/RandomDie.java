import java.util.Random;

/**
 * Simulates random die rolls
 * 
 * @author Daljyot
 */
public class RandomDie

{

	public static void main(String[] args)

	{

		int die1, die2;
		int totalRoll;

		die1 = diceRoll();
		System.out.println("Die1 roll: " + die1);

		die2 = diceRoll();
		System.out.println("Die2 roll: " + die2);

		totalRoll = (die1 + die2);
		System.out.println("Total Roll:" + totalRoll);

	}

	/**
	 * Single roll of a dice
	 * 
	 * @return the number rolled by the dice
	 */
	public static int diceRoll() {
		Random genertator = new Random();
		int die;
		die = genertator.nextInt(6) + 1;
		return die;
	}

}
