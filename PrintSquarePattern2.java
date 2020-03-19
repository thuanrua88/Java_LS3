package Java_LS2;
import  java.util.Scanner;

public class PrintSquarePattern2 {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        size = input.nextInt();
        for (int row = 1; row <= size; row++){
            for (int col = 1; col <= size; col++){
                if ((row % 2) == 0){
                    System.out.print(" ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
        input.close();
    }
}
