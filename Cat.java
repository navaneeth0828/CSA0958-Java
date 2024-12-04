import java.util.Scanner;
class Cat {
    int catAge;
    String catName;
    public Cat(String name) {
        catName = name;
    }
    public void setAge(int age) {
        catAge = age;
    }
    public int getAge() {
        return catAge;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the cat: ");
        String catName = scanner.nextLine();
        Cat myCat = new Cat(catName);

        System.out.print("Enter the age of the cat: ");
        int age = scanner.nextInt();
        myCat.setAge(age);

        System.out.println("Cat name: " + myCat.catName);
        System.out.println("Cat age: " + myCat.getAge());
    }
}