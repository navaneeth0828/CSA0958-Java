public class Main {
    public static void main(String[] args) {
        int[] array = { -20, 19, 1, 5, -1, 27, 19, 5 };
        int min = array[0];
        
        for (int index = 1; index < array.length; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }
        
        System.out.println("The minimum of this array is: " + min);
    }
}