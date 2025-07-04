import java.util.Scanner;

public class DiffDoubles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double res = b - a;

        System.out.println(res);
    }
}
