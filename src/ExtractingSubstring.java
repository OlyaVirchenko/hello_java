import java.util.Scanner;

public class ExtractingSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        String res = str.substring(n1, n2 + 1);

        System.out.println(res);
    }
}
