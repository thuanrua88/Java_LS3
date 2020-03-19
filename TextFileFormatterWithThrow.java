package Java_LS2;
import java.io.*;
import java.util.Formatter;

public class TextFileFormatterWithThrow {
    public static void main(String[] args)
        throws FileNotFoundException{
        Formatter out = new Formatter(new File("out.txt"));
        int num1 = 123;
        double num2 = 1.23;
        String name = "thuan";
        out.format("Hi %s,%n", name);
        out.format("The sum of %d and %.2f is %.2f%n", num1, num2, num1 + num2);
        out.close();
        System.out.println("Done");
    }
}
