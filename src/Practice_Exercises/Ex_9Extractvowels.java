package Practice_Exercises;

import java.util.Scanner;

public class Ex_9Extractvowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String InputString = scanner.nextLine();
        String CleanedString = InputString.toLowerCase();

        String vowels = extractVowels(CleanedString);
        System.out.println("Vowels in the word: " + vowels);
    }

    public static String extractVowels(String word) {
        StringBuilder vowels = new StringBuilder();
        String vowelChars = "aeiou";

        for (char c : word.toCharArray()) {
            if (vowelChars.indexOf(c) != -1) {
                vowels.append(c);
            }
        }

        return vowels.toString();
    }
}

