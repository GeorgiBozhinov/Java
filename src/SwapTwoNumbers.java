public class SwapTwoNumbers {
    public static void main(String[] args) {

        int numOne = 2;
        int numTwo = 3;

        numOne += numTwo;
        numTwo = numOne - numTwo;
        numOne = numOne - numTwo;

        System.out.printf("Num one: %d%n", numOne);
        System.out.printf("Num two: %d", numTwo);

    }
}
