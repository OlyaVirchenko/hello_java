import java.util.Scanner;

public class LiquidPressure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double g = 9.8;
        double p = sc.nextDouble();
        double h = sc.nextDouble();

        double result = g * p * h;

        System.out.println(result);
    }
}
