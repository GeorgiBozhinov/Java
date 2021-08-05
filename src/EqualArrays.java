import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        String inputLine2 = scanner.nextLine();

        String[] items = inputLine.split(" ");
        String[] items2 = inputLine2.split(" ");

        int[] arr = Arrays.stream(items).
                mapToInt(e -> Integer.parseInt(e)).toArray();

        int[] arr2 = Arrays.stream(items2).
                mapToInt(e -> Integer.parseInt(e)).toArray();

        boolean isTrue = false;
        int sum = 0;

        for(int x = 0; x < arr.length; x++){
            if(arr[x] == arr2[x]){
                sum += arr[x];
            }else{
                isTrue = true;
                System.out.format("Arrays are not identical. Found difference at %d index.", x);
                break;
            }
        }

        if(!isTrue){
            System.out.format("Arrays are identical. Sum: %d", sum);
        }
    }
}
