import java.util.Scanner;

public class SequenceLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int num = sc.nextInt();

        while(num != 0) {
            count += 1;
            num = sc.nextInt();
        }

        System.out.println(count);
    }
}
