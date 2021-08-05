import java.util.Arrays;
import java.util.Scanner;

public class PrintNumberInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());

        String[] nums = new String[length];

        for(int i = 0; i < length; i++){
            int number = Integer.parseInt(scanner.nextLine());

            nums[i] = String.valueOf(number);
        }


        for(int i = nums.length-1; i>=0; i--){

            if(i != 0){
                System.out.print(nums[i] + " ");
            }else{
                System.out.print(nums[i]);
            }
        }

//        String text = String.join(" ", nums);
//        System.out.println(text);
    }
}
