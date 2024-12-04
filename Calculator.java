import java.util.Scanner;
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();
        if ((num1 == (int) num1) && (num2 == (int) num2)) {
            System.out.println("Sum of the two numbers: " + calculator.add((int) num1, (int) num2));
            System.out.println("Multiplication of the two numbers: " + calculator.multiply((int) num1, (int) num2));
        } else {
            System.out.println("Sum of the two numbers: " + calculator.add(num1, num2));
            System.out.println("Multiplication of the two numbers: " + calculator.multiply(num1, num2));
        }
        scanner.close();
    }
}
