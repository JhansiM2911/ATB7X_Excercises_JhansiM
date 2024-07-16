package Practice_Exercises;

import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        // Taking integer input
        System.out.print("Enter an integer: ");
        int number = Scan.nextInt();
        System.out.println("You entered: " + number);

        // Taking double input
        System.out.print("Enter a double: ");
        double decimalNumber = Scan.nextDouble();
        System.out.println("You entered: " + decimalNumber);

        // Taking string input
        System.out.print("Enter a string: ");
        String text = Scan.next();
        System.out.println("You entered: " + text);

        // Close the scanner
        Scan.close();



    }
}
