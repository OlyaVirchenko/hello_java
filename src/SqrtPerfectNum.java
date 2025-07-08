import java.util.Scanner;

public class SqrtPerfectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int num = n + 1;

        while (n <= 10000) {

            double sqrt = Math.sqrt(num);

            if (sqrt == Math.floor(sqrt)) {
                System.out.println(num);
                break;
            }

            num ++;
        }
    }
}
