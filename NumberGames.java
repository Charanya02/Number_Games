package Number_Games;

import java.util.Scanner;

public class NumberGames {

    public void checkGuess(int userGuess, int numberToGuess) {
        if (userGuess == numberToGuess) {
            System.out.println("Congratulations! You guessed the number!");
        } else {
            System.out.println("Sorry, that's not the correct number. Try again or enter 0 to exit the game.");
        }
    }

    public void GuessTheNumber(Scanner scanner) {
        int numberToGuess = (int) (Math.random() * 100) + 1;
        System.out.println("Welcome to Guess the Number!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it! Enter 0 to exit the game.");
        int userGuess = -1;
        while (userGuess != numberToGuess) {
            userGuess = scanner.nextInt();
            if (userGuess != 0) {
                checkGuess(userGuess, numberToGuess);
            } else {
                System.out.println("The number I chose was " + numberToGuess + ". You have exited the game.");
                break;
            }
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        NumberGames game = new NumberGames();
        game.GuessTheNumber(scanner);
        scanner.close();
    }
}
