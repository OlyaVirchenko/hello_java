import java.util.Scanner;

public class MathWizardry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] parts = input.split(" ");

        double num1 = Double.parseDouble(parts[0]);
        String operator = parts[1];
        double num2 = Double.parseDouble(parts[2]);


//        int num1 = sc.nextInt();
//        String str = sc.nextLine();
//        char ch = str.charAt(0);
//        int num2 = sc.nextInt();

        double res = 0;
        switch(operator) {
            case "+":
                res = plus(num1, num2);
                break;
            case "-":
                res = minus(num1, num2);
                break;
            case "*":
                res = mul(num1, num2);
                break;
            case "/":
                res = div(num1, num2);
                break;
            default:
                System.out.println("Invalid operator");
        }

        System.out.println(res);
    }

    public static double plus(double num1, double num2) {
        return num1 + num2;
    }

    public static double minus(double num1, double num2) {
        return num1 - num2;
    }

    public static double mul(double num1, double num2) {
        return num1 * num2;
    }

    public static double div(double num1, double num2) {
        return num1 / num2;
    }
}
