import java.util.Scanner;

public class DecrementAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        a--;
        b--;
        c--;
        d--;

        System.out.println(a + " " + b + " " + c + " " + d);
    }
}
