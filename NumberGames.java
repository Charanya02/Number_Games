package Number_Games;

import java.util.Scanner;

public class NumberGames {

    public void guessTheNumber(Scanner scanner) {
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

    public void higherOrLower(Scanner scanner) {
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

    public void stonePaperScissor(Scanner scanner) {
        System.out.println("Welcome to Stone Paper Scissors!");
        System.out.println("Enter your choice (stone[1], paper[2], scissors[3]) or 'exit[0]' to quit");
        int userChoice = scanner.nextInt();
        while (userChoice != 0) {
            int computerChoice = (int) (Math.random() * 3) + 1;
            if (userChoice == computerChoice) {
                System.out.println("It's a tie! Try again or press 0 to exit");
            } else {
                if (userChoice == 1 && computerChoice == 2) {
                    System.out.println("Computer chose Paper and you chose Stone. You lose!");
                } else if (userChoice == 1 && computerChoice == 3) {
                    System.out.println("Computer chose Scissors and you chose Stone. You win!");
                } else if (userChoice == 2 && computerChoice == 1) {
                    System.out.println("Computer chose stone and you chose paper. You win!");
                } else if (userChoice == 2 && computerChoice == 3) {
                    System.out.println("Computer chose scissor and you chose paper. You lose!");
                } else if (userChoice == 3 && computerChoice == 1) {
                    System.out.println("Computer chose stone and you chose scissor. You lose!");
                } else {
                    System.out.println("Computer chose paper and you chose scissor. You win!");
                }

            }
            userChoice = scanner.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        NumberGames game = new NumberGames();
        System.out.println("Welcome to Number Games!");
        System.out.println("Choose a game to play:");
        System.out.println("1. Guess the Number");
        System.out.println("2. Higher or Lower");
        System.out.println("3. Rock Paper Scissors");
        System.out.println("Enter 0 to exit the program.");
        System.out.print("Enter your choice (1 or 2 or 3): ");
        int gameChoice = scanner.nextInt();
        while (gameChoice != 0) {
            if (gameChoice == 1)
                game.guessTheNumber(scanner);
            else if (gameChoice == 2)
                game.higherOrLower(scanner);
            else
                game.stonePaperScissor(scanner);
            System.out.println("Choose a game to play:");
            System.out.println("1. Guess the Number");
            System.out.println("2. Higher or Lower");
            System.out.println("3. Rock Paper Scissors");
            System.out.println("Enter 0 to exit the program.");
            System.out.print("Enter your choice (1 or 2 or 3): ");
            gameChoice = scanner.nextInt();
        }
        System.out.println("Exiting the program. Goodbye!");
        scanner.close();
    }
}
