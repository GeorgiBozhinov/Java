import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        String[] items = inputLine.split(" ");

        int[] arr = Arrays.stream(items).
                mapToInt(e -> Integer.parseInt(e)).toArray();

        int sum = 0;
        String temp = "";
        String temp2 = "";

        if (arr.length == 1){
            System.out.print(arr[0]);
            
            
            

        }else if(arr.length == 2){
            sum += arr[0];
            sum += arr[1];
            System.out.print(arr[0] + arr[1]);
            System.out.println(sum);
            //System.out.println("What");

        } else{
            for(int x = 0; x <= arr.length - 1; x++) {
                sum += arr[x] + arr[x + 1];

                if (x != arr.length - 1) {
                    temp += String.valueOf(sum);
                    temp += ", ";
                    System.out.print(temp);
                }else{
                    temp += String.valueOf(sum);
                    System.out.print(temp);
                }

            }
        }

        //System.out.print(temp);
    }
}


