import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String res = (n % 2 == 0) ? "even" : "odd";

        System.out.println(res);
    }
}
