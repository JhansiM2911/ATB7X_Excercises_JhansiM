package Practice_Exercises;

import java.util.Scanner;

public class ex_6palindromestring {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();

            // Convert the input string to lowercase and remove non-alphanumeric characters
            String cleanedString = inputString.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

            // Reverse the cleaned string
            String reversedString = new StringBuilder(cleanedString).reverse().toString();

            // Check if the cleaned string is equal to its reversed version
            if (cleanedString.equals(reversedString)) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is not a palindrome.");
            }
        }
    }

