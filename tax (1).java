import java.util.Scanner;

public class tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary:");
        double basicSalary = sc.nextDouble(); 
        double reducePay = (basicSalary > 50000) ? basicSalary * 0.10 : 0;
        double conveniencePay = basicSalary * 0.05; 
        double finalSalary = basicSalary - reducePay + conveniencePay;
        System.out.println("Final salary: " + finalSalary);
    }
}