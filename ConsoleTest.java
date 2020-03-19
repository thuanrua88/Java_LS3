package Java_LS2;
import java.io.Console;
import java.util.Scanner;

public class ConsoleTest {
    public static void main(String[] args) {
        Console con = System.console();
        if (con == null){
            System.err.println("Console Object is not available.");
            System.exit(1);
        }
        String name = con.readLine("Enter your name : ");
        con.printf("Hello %s%n", name);
        Scanner input = new Scanner(con.reader());
        con.printf("Enter an interger: ");
        int anInt = input.nextInt();
        con.printf("The interger entered is %d%n", anInt);
        con.printf("Enter a floatint point name: ");
        double aDouble = input.nextDouble();
        con.printf("The floating point number entered is %f%n", aDouble);
        input.close();
    }
}
