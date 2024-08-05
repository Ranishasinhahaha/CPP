import java.util.Scanner;
import java.util.Arrays;

public class NumberOccurrences {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter numbers separated by spaces
        System.out.println("Enter a list of numbers separated by spaces:");
        String input = scanner.nextLine();

        // Split the input string into an array of strings
        String[] numberStrings = input.split(" ");
        int[] numbers = new int[numberStrings.length];
        
        // Convert the string array to an int array
        for (int i = 0; i < numberStrings.length; i++) {
            numbers[i] = Integer.parseInt(numberStrings[i]);
        }
        
        // Find the maximum value to determine the size of the counting array
        int max = Arrays.stream(numbers).max().orElse(0);
        int min = Arrays.stream(numbers).min().orElse(0);

        // Create a counting array with a size enough to hold all possible values
        int[] counts = new int[max - min + 1];

        // Count occurrences of each number
        for (int number : numbers) {
            counts[number - min]++;
        }

        // Print the occurrences
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println("Number " + (i + min) + " occurs " + counts[i] + " times");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
