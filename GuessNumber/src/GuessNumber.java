import java.util.Scanner;
import java.util.Random;
public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		int number = rand.nextInt(10);
		System.out.println(number); //for testing
		
		
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number from 0 to 10: ");
		int guess = in.nextInt();
		
		
		if (guess == number) {
			System.out.print("You win!");
		}
		else {
			System.out.print("You loose!");
		}
		
		
		
	}

}
