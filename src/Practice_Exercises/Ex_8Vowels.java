package Practice_Exercises;

import java.util.Scanner;

public class Ex_8Vowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Input Word: ");
        String InputString = input.nextLine();

       String CleanedString = InputString.toLowerCase();

        if (containsVowels(CleanedString)) {
            System.out.println("The word contains vowels.");
        } else {
            System.out.println("The word does not contain vowels.");
        }
    }

    public static boolean containsVowels(String word) {
        String vowels = "aeiou";
        for (char c : word.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                return true; // Found a vowel
            }
        }
        return false; // No vowels found
    }

    }
