package Number_Games;

import java.util.Scanner;

public class NumberGames {

    public void GuessTheNumber(Scanner scanner) {
        int numberToGuess = (int) (Math.random() * 100) + 1;
        System.out.println("Welcome to Guess the Number!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it! Enter 0 to exit the game.");
        int userGuess = -1;
        while (userGuess != numberToGuess) {
            userGuess = scanner.nextInt();
            if (userGuess != 0) {
                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number!");
                } else {
                    System.out.println("Sorry, that's not the correct number. Try again or enter 0 to exit the game.");
                }
            } else {
                System.out.println("The number I chose was " + numberToGuess + ". You have exited the game.");
                break;
            }
        }
    }

    public void HigherorLower(Scanner scanner) {
        int number = (int) (Math.random() * 100) + 1;
        System.out.println("Welcome to Higher or Lower!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it! Enter 0 to exit the game.");
        int userGuess = -1;
        while (userGuess != 0) {
            userGuess = scanner.nextInt();
            if (userGuess == 0) {
                System.out.println("The number I chose was " + number + ". You have exited the game.");
                break;
            } else if (userGuess < number) {
                System.out.println("Higher! Try again or enter 0 to exit the game.");
            } else if (userGuess > number) {
                System.out.println("Lower! Try again or enter 0 to exit the game.");
            } else {
                System.out.println("Congratulations! You guessed the number!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        NumberGames game = new NumberGames();
        System.out.println("Welcome to Number Games!");
        System.out.println("Choose a game to play:");
        System.out.println("1. Guess the Number");
        System.out.println("2. Higher or Lower");
        System.out.println("Enter 0 to exit the program.");
        System.out.print("Enter your choice (1 or 2): ");
        int gameChoice = scanner.nextInt();
        switch(gameChoice)
        {
            case 1:
                game.GuessTheNumber(scanner);
                break;
            case 2:
                game.HigherorLower(scanner);
                break;
            case 0:
                System.out.println("Exiting the program. Goodbye!");
                break;         
        }
        scanner.close();
    }
}
