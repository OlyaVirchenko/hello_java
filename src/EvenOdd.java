import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        if(a % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        sc.close();
    }
}
