public class Dog {
    private String name, breed, barkNoise = "Woof"; 
    private double weight;

    public Dog(String name, String breed, double weight) { this.name = name; this.breed = breed; this.weight = weight; }
    public void bark() { System.out.println(barkNoise); }
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Golden Retriever", 30.5);
        System.out.println("Dog Name: " + dog.name + "\nBreed: " + dog.breed + "\nWeight: " + dog.weight + " kg");
        dog.bark();
    }
}