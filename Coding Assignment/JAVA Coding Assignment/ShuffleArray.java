import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Create an array with values (1, 2, 3, 4, 5, 6, 7)
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};

        // Call the shuffleArray method to shuffle the original array
        int[] shuffledArray = shuffleArray(Arrays.copyOf(originalArray, originalArray.length));

        // Print the original and shuffled arrays
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Shuffled Array: " + Arrays.toString(shuffledArray));
    }

    public static int[] shuffleArray(int[] array) {
        Random rand = new Random();

        // Iterate through the array in reverse order
        for (int i = array.length - 1; i > 0; i--) {
            // Generate a random index between 0 and i (inclusive)
            int index = rand.nextInt(i + 1);

            // Swap array[i] and array[index]
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }

        return array; // Return the shuffled array
    }
}