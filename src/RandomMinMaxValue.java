import java.util.Random;

public class RandomMinMaxValue {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 0;
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        // Draw 10 random numbers
        while (count < 10) {
            int randomNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
            System.out.println("Random number " + (count + 1) + ": " + randomNumber);

            // Check for smallest number
            if (randomNumber < smallest) {
                smallest = randomNumber;
            }

            // Check for largest number
            if (randomNumber > largest) {
                largest = randomNumber;
            }

            count++;
        }

        // Print the smallest and largest numbers
        System.out.println("\nSmallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }
}
