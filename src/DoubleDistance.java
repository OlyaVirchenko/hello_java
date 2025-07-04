import java.util.Scanner;

public class DoubleDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double distance = sc.nextDouble();
        double time = sc.nextDouble();
        double speed = distance / time;

        System.out.println(speed);
        sc.close();
    }
}
