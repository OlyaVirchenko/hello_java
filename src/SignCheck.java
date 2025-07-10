import java.util.Scanner;

public class SignCheck {
    public static int sign(int number) {
        int res;
        if (number > 0) {
            res = 1;
        } else if (number < 0) {
            res = -1;
        } else {
            res = 0;
        }
        return res;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sign(n));
    }
}
