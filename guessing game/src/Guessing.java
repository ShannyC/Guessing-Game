import java.util.Scanner;

public class Guessing {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Guess a number between 1 through 10");
		int randomNumber = (int)(Math.random()* 10) + 1;
		System.out.println(randomNumber);
		int userGuess = userInput.nextInt();
		if (randomNumber < userGuess)
		{
			System.out.println("Number is to low");
		}
		else if (randomNumber == userGuess)
		{
			System.out.println("Congrats!You guessed the right number.");
		}
		else 
		{
			System.out.println("Number is to high");
		}

	}

}
