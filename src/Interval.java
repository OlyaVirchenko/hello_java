import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        boolean result = (a > -15 && a <= 12) ||(a > 14 && a < 17) || (a >= 19);
        System.out.println(result);
    }
}
