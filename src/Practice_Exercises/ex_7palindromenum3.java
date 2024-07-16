package Practice_Exercises;

import java.util.Scanner;

public class ex_7palindromenum3 {
    public static boolean isPalindrome(int num) {
        // Handle negative numbers and numbers ending in 0 (except 0 itself)
        if (num < 0 || (num != 0 && num % 10 == 0)) {
            return false;
        }

        int reversed = 0;
        int original = num;
        int digits = (int) Math.log10(num) + 1;

        for (int i = 0; i < digits; i++) {
            int remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }
    }
}


