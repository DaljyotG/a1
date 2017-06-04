
import java.util.Random;

public class RandomNumbers
{
   
   public static void main(String[] args)
   {
      Random generator = new Random();
      int die1;
      int die2;
      int totalRoll;
     
      die1 = generator.nextInt(6) + 1;
      System.out.println("Die1 roll: " + die1);

      die2 = generator.nextInt(6) + 1;
      System.out.println("Die2 roll: " + die2);

      totalRoll= die1 + die2;
      System.out.println("Total Roll: " + totalRoll);
      
      
      
      
 
   }
}
