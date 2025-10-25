import java.util.Random;
import java.util.Scanner;

public class guessing_game {
    public static void main(String[] args){
        Random rand = new Random();
        int numbertoguess = rand.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess A Number between 1 to 100");
        int guessed_number=0;
        int attempts=0;
        while(guessed_number!=numbertoguess){
             guessed_number=sc.nextInt();
            attempts++;
        if(guessed_number>numbertoguess)
        {
            System.out.println("too high");

        }
        else if(guessed_number<numbertoguess)
        {

            System.out.println("too low");

        }
        else if(guessed_number==numbertoguess)
        {
            System.out.println("bingo! got it right");
            break;
        }

        }
        System.out.println("you guessed it in"+attempts+"attempts");
    }
}
