import java.util.Scanner;

public class SpeedCarClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inc = sc.nextInt();
        // Instantiate a Car object here and use the drive method
        // Use displaySpeed to print the current speed
        Car1 car = new Car1();
        car.drive(inc);
        car.displaySpeed();

        sc.close();
    }
}

class Car1 {
    private int speed;

    public Car1() {
        // Initialize the speed field here
        this.speed = 0;
    }

    public void drive(int increase) {
        // Write a method that takes an integer as argument
        // and adds it to the 'speed'.
        // Use a condition to check if the speed becomes greater than 200
        // if so, cap the speed at 200
        this.speed += increase;
        if (this.speed > 200) {
            this.speed = 200;
        }
    }

    public void displaySpeed() {
        // Write a method that prints the current speed
        System.out.println(this.speed);
    }
}
