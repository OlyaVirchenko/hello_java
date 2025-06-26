import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String name2 = sc.nextLine();
        int massages = sc.nextInt();
        System.out.println("Привет, " + name + ", это твой помощник " + name2 + ".");
        System.out.println("У тебя " + massages + " новых писем.");
    }
}


