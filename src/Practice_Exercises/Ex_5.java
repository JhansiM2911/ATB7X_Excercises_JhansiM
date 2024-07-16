package Practice_Exercises;

import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        int sum = a + b;
        int subtract = a - b;
        int multiply = a * b;
        int divide = a / b;

        System.out.print("Enter the operator (+, -, *, /): ");
        String operator = input.next();
Thread.sleep(5000);

        int result = 0;
        switch (operator) {
            case "+":
                result = sum;
                break;
            case "-":
                result = subtract;
                break;
            case "*":
                result = multiply;
                break;
            case "/":
                result = divide;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println("Result: " + result);

        input.close();
    }
}


