import java.util.Scanner;

public class FindX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double x = (c - b) / a;

        System.out.println(x);
    }
}
