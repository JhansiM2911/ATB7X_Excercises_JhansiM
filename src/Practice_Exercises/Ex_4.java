package Practice_Exercises;

import java.util.Objects;
import java.util.Scanner;

public class Ex_4 {

    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value: ");

        int a = input.nextInt();
        System.out.print("Enter b value: ");

        int b = input.nextInt();
        System.out.print("Enter the operator (+, -, *, /): ");
        String operator = input.nextLine();
        int sum = a+b;
        int subtract = a-b;
        int multiply = a*b;
        int divide = a/b;

        //String operator = input.nextLine();
     //   System.out.print("Enter the operator (+, -, *, /): ");
     //   String operator = input.nextLine();
//        Thread.sleep(5000);
        if (operator.equals("sum"))
        {
            System.out.println("choosen operator =" +operator);
            System.out.println("ouput of sum = "+sum);
        }

        else if (operator.equals("subtract"))
        {
            System.out.println("choosen operator =" +operator);
            System.out.println("ouput of subtract = "+subtract);
        }
        else if (operator.equals("multiply"))
        {
            System.out.println("choosen operator =" +operator);
            System.out.println("ouput of multiply = "+multiply);
        }
        else if (operator.equals("divide"))
        {
            System.out.println("choosen operator =" +operator);
            System.out.println("ouput of divide = "+divide);
        }
        else
        {
            System.out.println("choosen operator not valid " +operator);

            System.out.println("ouput id null");

        }
        // Close the scanner
        input.close();
    }

}
