import java.util.Scanner;

public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        boolean flag = true;

        for (int i = 0; i < arr.length - 1; i++) {
            int res = arr[i].compareTo(arr[i+1]);
            if (res > 0) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
