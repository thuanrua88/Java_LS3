package Java_LS2;

public class EX1_3 {
    public static void main(String[] args) {
        int lowerbound = 1, upperbound = 1000;
        int sumOdd  = 0;
        int sumEven = 0;
        int absDiff;
        int number = lowerbound;
        while (number <= upperbound){
            if (number % 2 == 0){
                sumEven += number;
            }else {
                sumOdd += number;
            }
            number ++ ;
        }
//        if (sumOdd > sumEven){
//            absDiff = sumOdd - sumEven;
//        }else {
//            absDiff = sumOdd - sumEven;
//        }
        absDiff = (sumOdd > sumEven) ? (sumOdd - sumEven) : (sumEven - sumOdd);
        System.out.println("The sum of odd number from " + lowerbound + " to " + upperbound + " is " + sumOdd);
        System.out.println("The sum of even number from " + lowerbound + " to " + upperbound + " is " + sumEven);
        System.out.println("The absolute difference between the two sum is :  " + absDiff);
    }
}
