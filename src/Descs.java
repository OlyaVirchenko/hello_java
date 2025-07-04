import java.util.Scanner;

public class Descs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, sum, desks;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        sum = a + b + c;
        desks = a / 2 + a % 2 + b / 2 + b % 2 + c / 2 + c % 2;
        System.out.println(desks);
    }
}
