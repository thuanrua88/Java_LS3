package Java_LS2;
import java.util.Scanner;

public class Add2Interger {
    public static void main(String[] args) {
        int number1, number2, sum;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first interger: ");
        number1 = input.nextInt();
        System.out.print("Enter second interger: ");
        number2 = input.nextInt();

        sum = number1 + number2;

        System.out.println("The sum is : " + sum);
        input.close();
    }
}
