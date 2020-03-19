package Java_LS2;
import java.util.Scanner;

public class ScannerNextLineTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string (with space): ");
        String str = input.nextLine();
        System.out.printf("%s%n", str);
        input.close();
    }
}
