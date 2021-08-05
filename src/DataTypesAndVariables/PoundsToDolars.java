package DataTypesAndVariables;

import java.util.Scanner;

public class PoundsToDolars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer britishPound = Integer.parseInt(scanner.nextLine());

        Double dolar = britishPound * 1.31;

        System.out.printf("%.3f", dolar);
    }
}
