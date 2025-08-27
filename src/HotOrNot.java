import java.util.Scanner;

public class HotOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Declare and initialize the array
        double[] temps= new double[n];
        double sum = 0;
        double highest = 0;
        int sumAbove = 0;

        // Read temperature values
        for (int i = 0; i < n; i++) {
            temps[i] = sc.nextDouble();
            sum += temps[i];

            if (temps[i] > highest) {
                highest = temps[i];
            }

            if (temps[i] > 30.0) {
                sumAbove += 1;
            }
        }
        // Calculate average, highest, and count above 30.0°C
        double average = sum / n;
        // Print results
        System.out.println("Average: " + String.format("%.1f", average));
        System.out.println("Highest: " + highest);
        System.out.println("Above 30.0°C: " + sumAbove);

        sc.close();
    }
}
