import java.util.Scanner;

public class StringReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String first = sc.nextLine();

        String result = first.replace('a', 'b');

        System.out.println(result);

    }
}
