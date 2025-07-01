import java.util.Scanner;

public class Age_Stage {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        // Read the integer
        int age = sc.nextInt();

        if (age > 0 && age < 13) {
            System.out.println("Child");
        } else if (age > 12 && age < 18) {
            System.out.println("Teenager");
        } else if (age > 17 && age < 60) {
            System.out.println("Adult");
        } else if (age > 59 && age <= 100) {
            System.out.println("Senior Citizen");
        }

        sc.close();
    }
}
