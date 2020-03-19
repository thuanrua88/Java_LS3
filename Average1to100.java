package Java_LS2;

public class Average1to100 {
    public static void main(String[] args) {
        int sum = 0;
        double average;
        for (int number = 1; number <= 100; ++number){
            sum += number;
        }
        average = sum / 100;
        System.out.println("Average is : " + average);
    }
}
