import java.util.Scanner;

public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter operation (+, -, *, or /): ");
        String operator = scanner.next();

        int result = 0;

        switch(operator) {
            case "+":
              result = add(num1, num2);
              break;
            case "-":
              result = subtract(num1, num2);
              break;
            case "*":
              result = multiply(num1, num2);
              break;
            case "/":
              result = divide(num1, num2);
              break;
            default:
              System.out.println("Invalid operator. ");
              return;
        }

        System.out.println("Result: " + result);
    }
}
