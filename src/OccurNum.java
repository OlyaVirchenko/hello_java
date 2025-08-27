import java.util.Scanner;

public class OccurNum {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < num - 1; i++) {
            if ((arr[i] == n && arr[i+ 1] == m) || (arr[i] == m && arr[i + 1] == n)) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
