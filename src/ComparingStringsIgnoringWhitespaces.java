import java.util.Scanner;

public class ComparingStringsIgnoringWhitespaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        String newStr1 = str1.replace(" ", "");
        String newStr2 = str2.replace(" ", "");

        System.out.println(str1.equals(newStr2));
    }
}
