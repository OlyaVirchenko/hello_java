import java.util.Scanner;

public class CheckingDivisibility {
    // Метод для проверки делимости на 3
    public static boolean isDivisibleByThree(int number) {
        return number % 3 == 0;
    }

    // Метод для проверки делимости на 5
    public static boolean isDivisibleByFive(int number) {
        return number % 5 == 0;
    }

    // Метод для проверки делимости на 3 и 5 одновременно
    public static boolean isDivisibleByBoth(int number) {
        return isDivisibleByThree(number) && isDivisibleByFive(number);
    }

    // Основной метод программы
    public static void main(String[] args) {
        // Создаем объект для ввода данных
        Scanner scanner = new Scanner(System.in);

        // Выводим приглашение для пользователя
        System.out.print("Введите целое число: ");

        // Считываем введенное число
        int number = scanner.nextInt();

        // Проверяем условия и выводим результат
        if (isDivisibleByBoth(number)) {
            System.out.println("FizzBuzz");
        } else if (isDivisibleByThree(number)) {
            System.out.println("Fizz");
        } else if (isDivisibleByFive(number)) {
            System.out.println("Buzz");
        } else {
            System.out.println("None");
        }

        // Закрываем сканер
        scanner.close();
    }
}

