
import java.util.Scanner;
    public class Task1 {

        public static void main(String[] args) {
            int attempt = 1;
            int guessedNumberByUser = 0;
            int expectedNumber = (int) (Math.random() * 99 + 1);
            Scanner userInput = new Scanner(System.in);
            System.out.println("Welcome to Number Guessing Game \nYou Will Be Asked To Guess A Number To Win The Game \nYou have Maximum 5 Attempt Limit ");

            do {
                System.out.print("Enter a guess number between 1 to 100\n");
                if (userInput.hasNextInt()) {
                    guessedNumberByUser = userInput.nextInt();
                    if (guessedNumberByUser == expectedNumber) {
                        System.out.println("Your Number is right. You Win the Game!");
                        System.out.println(" It took you " + attempt + " attempts to guess the number.");
                        break;
                    } else if (guessedNumberByUser < expectedNumber) {
                        System.out.println("Your Guess Number is Smaller.");
                    } else if (guessedNumberByUser > expectedNumber) {
                        System.out.println("Your Guess Number is Greater.");
                    }
                    if (attempt == 5) {
                        System.out.println("You have exceeded the maximum attempt. Try Again");
                        break;
                    }
                    attempt++;
                } else {
                    System.out.println("Guessed number is not a valid integer");
                    break;
                }
            } while (guessedNumberByUser != expectedNumber);
        }
    }


