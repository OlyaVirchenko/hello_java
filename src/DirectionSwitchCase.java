import java.util.Scanner;

public class DirectionSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String direction;
        switch (n) {
            case 1:
                direction = "up";
                break;
            case 2:
                direction = "down";
                break;
            case 3:
                direction = "left";
                break;
            case 4:
                direction = "right";
                break;
            case 0:
                direction = "do not";
                System.out.println(direction + " move");
                break;
            default:
                direction = "error";
                System.out.println("error!");
        }

        if (direction != "error" && direction != "do not") {
            System.out.println("move " + direction);
        }

    }
}
