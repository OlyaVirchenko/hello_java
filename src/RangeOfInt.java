import java.util.Scanner;

public class RangeOfInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 5) {
            System.out.println("LOW");
        } else if (n == 5) {
            System.out.println("MID");
        } else {
            System.out.println("HIGH");
        }
    }
}
