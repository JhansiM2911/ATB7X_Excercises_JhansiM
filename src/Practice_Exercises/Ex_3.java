package Practice_Exercises;

import java.util.Scanner;

public class Ex_3 {

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        int a = Scan.nextInt();
        int b = Scan.nextInt();
       // int c = Scan.nextInt();
        int sum = a+b;
        int substract = a-b;
        int multiply = a*b;
        int division = a/b;

        System.out.println(sum);
        System.out.println(substract);
        System.out.println(multiply);
        System.out.println(division);

// Close the scanner
        Scan.close();


    }
}
