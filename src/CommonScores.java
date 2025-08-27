import java.util.Scanner;

public class CommonScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take two integers n and m – the number of scores in each set
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Take two arrays a and b – the score sets
        int[] a = new int[n];
        int[] b = new int[m];

        for(int i=0; i<n; i++) {
            a[i] = scanner.nextInt();
        }

        for(int i=0; i<m; i++) {
            b[i] = scanner.nextInt();
        }

        int commonScores = findCommonScores(a, b);

        // Print out the number of common scores
        System.out.println(commonScores);
    }

    public static int findCommonScores(int[] a, int[] b) {
        boolean[] found = new boolean[101]; // так как числа <= 100
        int count = 0;

        // Отмечаем все элементы первого массива
        for (int num : a) {
            found[num] = true;
        }

        // Проверяем элементы второго массива
        for (int num : b) {
            if (found[num]) {
                count++;
                found[num] = false; // чтобы не считать дубликаты
            }
        }
        return count;
    }
}


