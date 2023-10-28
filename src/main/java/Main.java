import java.util.Scanner;
import java.util.Random;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int answer = random.nextInt(20) + 1;

        while (true) {
            System.out.print("Guess a number between 1 and 20: ");
            int guess = in.nextInt();
            if (guess == answer) {
                System.out.println("You got it!");
                break;
            }
            else if (guess > answer) {
                System.out.println("Too high...");
            }
            else {
                System.out.println("Too low...");
            }
        }
    }
}
