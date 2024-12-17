import java.util.Scanner;
public class UniqueNums {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner in = new Scanner(System.in);
        int num = 0, numValues = 0;
        boolean valid = true;
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            num = in.nextInt();
            numbers[i] = num;
        }
        for (int i = 0; i < 5; i++) {
            valid = true;
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                numValues++;
            }
        }
        System.out.println("Number of unique values: " + numValues);
        in.close();
    }
}