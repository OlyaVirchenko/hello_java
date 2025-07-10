import java.util.Scanner;

class Calculator {
    public static void subtractTwoNumbers(long a, long b) {
        long res = a - b;
        System.out.println(res);
    }

    public static void sumTwoNumbers(long a, long b) {
        long res = a + b;
        System.out.println(res);
    }

    public static void divideTwoNumbers(long a, long b) {
        if (b % 2 != 0) {
            long res = a / b;
            System.out.println(res);
        } else {
            System.out.println("Division by 0!");
        }

    }

    public static void multiplyTwoNumbers(long a, long b) {
        long res = a * b;
        System.out.println(res);
    }

    public static void power(long n, long p) {
        long number = n;
        long power = p;
        long result = 1;
        while (power > 0) {
            if (p % 2 != 0) {
                result *= number;
            }
            power /= 2;
            number *= number;
        }
        System.out.println(result);
    }
}

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextLong();
        String operator = sc.next();
        long num2 = sc.nextLong();

        switch (operator) {
            case "^":
                Calculator.power(num1, num2);
                break;
            case "+":
                Calculator.sumTwoNumbers(num1, num2);
                break;
            case "-":
                Calculator.subtractTwoNumbers(num1, num2);
                break;
            case "/":
                Calculator.divideTwoNumbers(num1, num2);
                break;
            case "*":
                Calculator.multiplyTwoNumbers(num1, num2);
                break;
            default:
                break;
        }
    }
}
