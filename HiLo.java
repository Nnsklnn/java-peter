import java.util.Scanner;

public class HiLo{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String playAgain = "";
		do {
			int theNumber = (int)(Math.random() * 10 + 1);
			//System.out.println("Java number is " + theNumber);
			int guess = 0;
			int numberOfTries = 0;
			
			while (guess != theNumber){
				System.out.print("Guess a number between 1 and 10 : ");
				guess = scan.nextInt();
				numberOfTries++;
				if (guess < theNumber)
					System.out.println(guess + " is low. Try again.");
				else if(guess > theNumber)
					System.out.println(guess + " is high. Try again.");
				else { 
					System.out.println(guess + " is correct. You win!");
					System.out.println("It took you "+ numberOfTries + " tries!");
					}
			}
			System.out.println("Would you like to play again (y/n)?");
			playAgain = scan.next();
		} while (playAgain.equalsIgnoreCase("y"));
		System.out.println("Thank you for playing! Goodbye.");
		scan.close();
	}
}
