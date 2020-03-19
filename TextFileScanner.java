package Java_LS2;

import java.util.Scanner;

public class TextFileScanner {
    public static void main(String[] args) {
        int num1;
        double num2;
        String str;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an interger: ");
        num1 = input.nextInt();
        System.out.print("Enter a floating point: ");
        num2 = input.nextDouble();
        System.out.print("Enter a string: ");
        str = input.next();

//        System.out.printf("%s, Sum of %f & %.2f is %.2f%n", str, num1, num2, num1 + num2);
        input.close();
    }
}
