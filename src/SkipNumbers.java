import java.util.Scanner;

public class SkipNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean scipMode = false;
        for (int i = 2; i <= n; i++) {
           if (i == 10) {
               scipMode = true;
               i += 4;
               continue;
           }

           if (scipMode) {
               if (i > n) {
                   break;
               } else {
                   scipMode = false;
                   continue;
               }
           }
           if (i % 2 == 0 &&( i != n || i != n - 1)) {
               System.out.print(i + " ");
           } else if (i % 2 == 0 && (i == n || i == n - 1)) {
               System.out.print(i);
           }
        }
    }
}
