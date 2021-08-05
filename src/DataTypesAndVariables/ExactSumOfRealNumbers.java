package DataTypesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer numRows = Integer.parseInt(scanner.nextLine());
        BigDecimal sum = new BigDecimal(0);

        for(int i = 0; i < numRows; i++) {
            BigDecimal input = new BigDecimal(scanner.nextLine());
            sum = sum.add(input);
        }

        System.out.println(sum);
    }
}
