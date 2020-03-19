package Java_LS2;
import java.io.*;
import java.util.Scanner;

public class ScannerWithCatch {
    public static void main(String[] args) {
        int num1;
        double num2;
        String name;
        try {
            Scanner input = new Scanner(new File("in.txt"));
            num1 = input.nextInt();
            num2 = input.nextDouble();
            name = input.next();
            System.out.printf("Hi %s, the sum of %d and %.2f is %.2f%n", name, num1, num2, num1 + num2);
            input.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
