import java.util.Scanner;

public class GroundhogsParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cups = sc.nextInt();
        boolean isWeekend = sc.nextBoolean();



        System.out.println(((cups >= 10 && cups <= 20) && !isWeekend) || ((cups >= 15 && cups <= 25) && isWeekend));
    }
}
