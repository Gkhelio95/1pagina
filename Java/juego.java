import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        int[] secretNumbers = {5, 12, 18, 7, 20};
        boolean guessedCorrectly = false;

        System.out.println("Welcome to \"Guess the Secret Number\"!");
        Thread.sleep(2000);
        clearScreen();

        System.out.println("Try to guess a number between 1 and 20. You have 3 attempts.");
        Thread.sleep(2000);
        clearScreen();

        for (int attempt = 1; attempt <= 3; attempt++) {
            int userNumber = 0;
            boolean validInput = false;
            
            // Ask the user for input until a valid number is entered
            while (!validInput) {
                System.out.print("Attempt " + attempt + " - Enter your number: ");
                try {
                    userNumber = scanner.nextInt(); // Try to read a number
                    if (userNumber < 1 || userNumber > 20) {
                        System.out.println("Please enter a number between 1 and 20.");
                    } else {
                        validInput = true; // Exit loop if input is valid
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input. You must enter a number.");
                    scanner.nextLine(); // Clear the buffer
                }
            }

            for (int number : secretNumbers) {
                if (userNumber == number) {
                    guessedCorrectly = true;
                    break;
                }
            }

            if (guessedCorrectly) {
                System.out.println("Correct! You guessed a secret number.");
                break;
            } else if (attempt < 3) {
                System.out.println("Not correct. Try again.");
            }
        }

        if (!guessedCorrectly) {
            System.out.println("Sorry, you didn't guess any of the secret numbers.");
            System.out.print("The secret numbers were: [");
            for (int i = 0; i < secretNumbers.length; i++) {
                System.out.print(secretNumbers[i]);
                if (i < secretNumbers.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }

        scanner.close();
    }

    public static void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
