import java.util.Scanner;

public class SumInRange {
//    public static long sumInRange(int from, int to) {
//       long res = 0;
//        for (int i = from; i < to ; i++) {
//            res += i;
//        }
//        return res;
//    }

    /* Do not change code below */
    public static void main(String[] args) {
//        final Scanner scanner = new Scanner(System.in);
//
//        int from = scanner.nextInt();
//        int to = scanner.nextInt();
//
//        System.out.println(sumInRange(from, to));

        int var1 = 100;
        int var2 = 0;

        switch (var1) {
            case 100:
                var2 += var1;
            case 200:
                var2 += var1 / 4;
                break;
            case 300:
                var2 += var1 / 10;
                break;
        }
        System.out.println(var2);
    }
}
