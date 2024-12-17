public class Student {
    private int studentId;
    private String name, ssn;
    private double gpa;
    private final int SCHCODE = 34958;

    public Student() { }

    public int getStudentId() { 
        return studentId; 
    }

    public void setStudentId(int x) { 
        studentId = x; 
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentId(12345);
        System.out.println("Student ID: " + student.getStudentId());
    }
}