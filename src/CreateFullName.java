import java.util.Scanner;

class CreateFullName {
    public static String createFullName(String firstName, String lastName) {
        //String fullName = firstName + " " + lastName;
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        System.out.println(createFullName(firstName, lastName));

        //CreateFullName(firstName, lastName);

    }
}
