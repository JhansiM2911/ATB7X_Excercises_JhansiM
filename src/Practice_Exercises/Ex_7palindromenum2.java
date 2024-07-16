package Practice_Exercises;

import java.util.Scanner;

public class Ex_7palindromenum2 {
    public static boolean isPalindrome(int num) {
        String numStr = Integer.toString(num);
        StringBuilder reversed = new StringBuilder(numStr).reverse();
        return numStr.equals(reversed.toString());
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

