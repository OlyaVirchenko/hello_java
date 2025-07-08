import java.util.Scanner;

public class LargestElemen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int max = 0;
        while (num != 0) {
            if(max < num) {
                max = num;
            }
            num = sc.nextInt();
        }


        System.out.println(max);
    }
}
