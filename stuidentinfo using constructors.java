import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    int subject1Marks, subject2Marks, subject3Marks;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public Student(String name, int rollNo, int subject1Marks, int subject2Marks, int subject3Marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks;
        this.subject3Marks = subject3Marks;
    }

    public String checkPassFail(int marks) {
        if (marks >= 49) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks in Subject 1: " + subject1Marks + " - " + checkPassFail(subject1Marks));
        System.out.println("Marks in Subject 2: " + subject2Marks + " - " + checkPassFail(subject2Marks));
        System.out.println("Marks in Subject 3: " + subject3Marks + " - " + checkPassFail(subject3Marks));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name for student 1: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter roll number for student 1: ");
        int rollNo1 = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        Student student1 = new Student(name1, rollNo1);

        System.out.print("Enter name for student 2: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter roll number for student 2: ");
        int rollNo2 = scanner.nextInt();
        System.out.print("Enter marks for subject 1: ");
        int subject1Marks = scanner.nextInt();
        System.out.print("Enter marks for subject 2: ");
        int subject2Marks = scanner.nextInt();
        System.out.print("Enter marks for subject 3: ");
        int subject3Marks = scanner.nextInt();
        scanner.close();

        Student student2 = new Student(name2, rollNo2, subject1Marks, subject2Marks, subject3Marks);

        student1.displayStudentInfo();
        System.out.println();
        student2.displayStudentInfo();
    }
}