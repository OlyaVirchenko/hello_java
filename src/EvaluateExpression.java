import java.util.Scanner;

public class EvaluateExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();


        double result = a * 10.5 + b * 4.4 + (c + d) / 2.2;

        System.out.println(result);


        sc.close();
    }
}
