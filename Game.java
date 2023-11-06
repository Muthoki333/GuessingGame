import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        GuessNumber();

    }

    public static void GuessNumber() {
        int x = 0;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(50);
        do {

            System.out.println("Guess a number between 1 and 50");
            int guess = sc.nextInt();


            if (guess < number) {
                System.out.println("Your guess is too low ");
                System.out.println("Try again");
            } else if(guess>number) {
                System.out.println("Your guess is too high");
                System.out.println("Try again");
            }else{
                System.out.println("Well done!");
                System.out.println("Your number is the correct guess");
            }
            x++;
        } while (x < 6);
        System.out.println("The correct number is" + number);
    }
}
