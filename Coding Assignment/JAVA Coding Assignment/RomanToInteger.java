import java.util.Scanner;

public class RomanToInteger {
    // Function to convert a Roman numeral to an integer
    public static int romanToInt(String s) {
        int result = 0;   // Initialize the result to 0
        int prevValue = 0;  // Initialize the previous value to 0

        // Loop through the Roman numeral string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = getValue(s.charAt(i));  // Get the integer value of the current Roman numeral character

            // Compare the current value with the previous value
            if (currentValue < prevValue) {
                result -= currentValue;  // Subtract if current value is less than previous
            } else {
                result += currentValue;  // Add if current value is greater than or equal to previous
            }

            prevValue = currentValue;  // Update the previous value for the next iteration
        }

        return result;  // Return the final result
    }

    // Function to get the integer value of a Roman numeral character
    public static int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;  // Return 0 for invalid characters (shouldn't happen in a valid Roman numeral)
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String input = scanner.nextLine();

        int result = romanToInt(input.toUpperCase());  // Convert input to uppercase and call romanToInt function
        System.out.println("The integer equivalent is: " + result);  // Print the result
    }
}



