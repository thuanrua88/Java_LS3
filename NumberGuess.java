package Java_LS2;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        int secretNumber;
        int numberIn;
        int trialNumber = 0;
        boolean done = false;

        Scanner input = new Scanner(System.in);
        secretNumber = (int)(Math.random()*100);

        while (!done){
            ++trialNumber;
            System.out.print("Enter your guess (between 0 to 99): ");
            numberIn = input.nextInt();
            if (numberIn == secretNumber){
                System.out.println("Conguration");
                done = true;
            } else  if (numberIn < secretNumber){
                System.out.println("Try high !");
            } else {
                System.out.println("Try lower !");
            }
        }
        System.out.println("You got it " + trialNumber + " trial !");
        input.close();
    }
}
