import java.util.Scanner;

public class BusTour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bus = sc.nextInt();
        int bridgesNum = sc.nextInt();

        for (int i = 1; i <=  bridgesNum; i++) {
            int height = sc.nextInt();
            if (height <= bus) {
                System.out.println("Will crash on bridge " + i);
                break;
            } else if (height > bus && i == bridgesNum) {
                System.out.println("Will not crash");
            }
        }
    }
}
