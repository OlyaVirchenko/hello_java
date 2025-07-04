import java.util.Scanner;

public class ArithmeticExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 4, b = 6;
        int c = a + b;
        int result2 = c + (a + b) * c;

        int result = ((n + 1) * n + 2) * n + 3;

        System.out.println(result);
        System.out.println(result2);
    }
}
