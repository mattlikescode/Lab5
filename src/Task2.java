import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = rand.nextInt(100) + 1;
            System.out.println("Number #" + i + ": " + numbers[i]);
        }

        int smallest = numbers[0];
        int largest = numbers[0];

        for (int num : numbers) {
            if (num < smallest) smallest = num;
            if (num > largest) largest = num;
        }

        System.out.println("   -------------------   ");
        System.out.println("Smallest element: " + smallest);
        System.out.println("Largest element: " + largest);
    }
}
