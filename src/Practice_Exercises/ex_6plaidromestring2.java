package Practice_Exercises;

import java.util.Scanner;

public class ex_6plaidromestring2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Convert to lowercase and remove non-alphanumeric characters
        String cleanedString = inputString.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        // Reverse the cleaned string using a loop
        String reversedString = "";
        for (int i = cleanedString.length() - 1; i >= 0; i--) {
            reversedString += cleanedString.charAt(i);
        }

        // Check if the cleaned string is equal to its reversed version
        if (cleanedString.equals(reversedString)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}

