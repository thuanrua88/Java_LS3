package Java_LS2;

public class SumAverageRunningNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int lowerbound = 1;
        int upperbound = 1000;
        double average;

        for (int number = lowerbound; number <= upperbound; ++number){
            sum += number;
        }
        average = (double)sum / (upperbound - lowerbound +1);
        System.out.println("The sum from " + lowerbound + " to " + upperbound + " is " + sum);
        System.out.println("The average is : " + average);

        int count = 0;
        sum = 0;
        if (lowerbound % 2 == 0){
            lowerbound ++;
        }
        for (int number = lowerbound; number <= upperbound; number += 2){
            ++count;
            sum += number;
        }
        average = (double)sum / count;
        System.out.println("The sum of odd number is : " + sum);
        System.out.println("The average of odd number is : " + average);
    }
}
