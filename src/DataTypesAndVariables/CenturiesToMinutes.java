package DataTypesAndVariables;

import java.util.Scanner;

public class CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int centure = Integer.parseInt(scanner.nextLine());

        double result = 0;
        int years = centure * 100;
        double days = years * 365.2422;
        double hours = days * 24;
        double minutes = hours * 60;

        System.out.printf("%.0f minutes", minutes);

    }
}
