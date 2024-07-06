import java.util.ArrayList;

public class Main {
    public static int solution(int[] input) {
        int maxValue = input[0];
        int indexOfMacValue = 0;

        for (int i = 1; i < input.length; i++) {
            if (input[i] > maxValue){
                maxValue = input[i];
                indexOfMacValue = i;
            }
        }
        return indexOfMacValue;
    }

    public static void equals(int expected, int actual) {
        if (expected != actual) {
            throw new RuntimeException("Wrong result");
        }
    }

    public static void test() {
        equals(solution(new int[]{1, 3, 2, 0}), 1);
    }

    public static void main(String[] args) {
        test();
        System.out.println("Test passed");

    }
}
