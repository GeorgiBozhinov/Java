import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        String[] items = inputLine.split(" ");

        int[] arr = Arrays.stream(items).
                mapToInt(e -> Integer.parseInt(e)).toArray();

        int sum = 0;

        for (int x = 0; x < arr.length; x++){
            if(arr[x] % 2 == 0){
                sum += arr[x];
            }
        }

        System.out.println(sum);
    }
}
