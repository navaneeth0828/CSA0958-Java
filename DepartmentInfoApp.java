import java.util.Scanner;
class Department {
    String departmentName;
    int numEmployees;
    String[] employeeNames;
    double[] employeeSalaries;
    public Department(String departmentName, int numEmployees) {
        this.departmentName = departmentName;
        this.numEmployees = numEmployees;
        this.employeeNames = new String[numEmployees];
        this.employeeSalaries = new double[numEmployees];
    }
    public void inputEmployeeDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details for department: " + departmentName);
        for (int i = 0; i < numEmployees; i++) {
            System.out.print("Enter name of employee " + (i + 1) + ": ");
            employeeNames[i] = sc.nextLine();
            System.out.print("Enter salary of " + employeeNames[i] + ": ");
            employeeSalaries[i] = sc.nextDouble();
            sc.nextLine(); 
        }
    }
    public void displayEmployeeDetails() {
        System.out.println("\nDepartment: " + departmentName);
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee Name: " + employeeNames[i] + ", Salary: " + employeeSalaries[i]);
        }
    }
}
public class DepartmentInfoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of departments: ");
        int numDepartments = sc.nextInt();
        sc.nextLine(); 
        Department[] departments = new Department[numDepartments];
        for (int i = 0; i < numDepartments; i++) {
            System.out.print("\nEnter the name of department " + (i + 1) + ": ");
            String departmentName = sc.nextLine();
            System.out.print("Enter number of employees in " + departmentName + ": ");
            int numEmployees = sc.nextInt();
            sc.nextLine(); 
            departments[i] = new Department(departmentName, numEmployees);
            departments[i].inputEmployeeDetails();
        }
        System.out.println("\n--- Department Information ---");
        for (Department department : departments) {
            department.displayEmployeeDetails();
        }
        sc.close();
    }
}