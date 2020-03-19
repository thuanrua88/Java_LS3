package Java_LS2;
import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        final double Tax_Rate_Above_20k = 0.1;
        final double Tax_Rate_Above_40k = 0.2;
        final double Tax_Rate_Above_60k = 0.3;

        int taxableIncome;
        double taxPayable;
        Scanner input = new Scanner(System.in);
        taxableIncome = input.nextInt();

        if (taxableIncome <= 20000){
            taxPayable = 0;
        }else if (taxableIncome <= 40000){
            taxPayable = (taxableIncome - 20000) * Tax_Rate_Above_20k;
        }else  if (taxableIncome <= 60000){
            taxPayable = 20000 * Tax_Rate_Above_20k + (taxableIncome - 40000) * Tax_Rate_Above_40k;
        }else {
            taxPayable = 20000 * Tax_Rate_Above_20k + 20000 * Tax_Rate_Above_40k + (taxableIncome - 60000) * Tax_Rate_Above_60k;
        }
        System.out.printf("The income tax payable is : %.2f%n", taxPayable);
        input.close();
    }
}
