import java.util.Scanner;

public class MinToHours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int h = min / 60;
        int newMin = min % 60;
        System.out.println(h + " hours and " + newMin + " minutes");
        sc.close();
    }
}
