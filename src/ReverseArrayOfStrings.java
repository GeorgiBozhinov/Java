import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        String[] items = inputLine.split(" ");

        for(int i = items.length-1; i >= 0; i--){
            if(i != 0){
                System.out.print(items[i] + " ");
            }else{
                System.out.print(items[i]);
            }
        }
    }
}
