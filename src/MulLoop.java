import java.util.Scanner;

public class MulLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int mul = 1;
        for (int i = a; i < b; i++) {
            mul *= i;
        }

        System.out.println(mul);
    }
}
