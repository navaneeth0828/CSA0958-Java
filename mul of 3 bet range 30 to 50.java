import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end range: ");
        int end = scanner.nextInt();
        
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
       
        scanner.close();
    }
}
