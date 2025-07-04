import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int remainder = n % 2;
        int triple = remainder * 3;

        System.out.println(remainder);
        System.out.println(triple);

        sc.close();
    }
}
