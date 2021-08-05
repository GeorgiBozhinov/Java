package DataTypesAndVariables;

import java.util.Scanner;

public class MetersToKilom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Double meters = Double.parseDouble(scanner.nextLine());

        double kilometers = meters / 1000;

        System.out.printf("%.2f", kilometers);



    }
}
