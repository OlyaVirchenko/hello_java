package gettters_setters;

import java.util.Scanner;

public class WheelsInheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Implement the Vehicle class
        class Vehicle {
            protected String brand;
            protected int year;

            public void setBrand(String brand) {
                this.brand = brand;
            }

            public void setYear(int year) {
                this.year = year;
            }

            public String getBrand() {
                return brand;
            }

            public int getYear() {
                return year;
            }

            public void displayInfo() {
                System.out.println(getBrand() + " (" + getYear() + ")");
            }

        }

        // TODO: Implement the Car class (extends Vehicle)
        class Car extends Vehicle {
            protected int numDoors;

            public void setNumDoors(int numDoors) {
                this.numDoors = numDoors;
            }

            public int getNumDoors() {
                return numDoors;
            }

            @Override
            public void displayInfo() {
                super.displayInfo();
                System.out.println("Number of doors: " + getNumDoors());
            }
        }

        // TODO: Implement the Motorcycle class (extends Vehicle)
        class Motorcycle extends Vehicle {
            protected boolean hasSidecar;

            public void setHasSidecar(boolean hasSidecar) {
                this.hasSidecar = hasSidecar;
            }

            public boolean isHasSidecar() {
                return hasSidecar;
            }

            @Override
            public void displayInfo() {
                super.displayInfo();
                System.out.println("Has sidecar: " + isHasSidecar());
            }
        }

        // Read input and create appropriate vehicle object
        String vehicleType = scanner.nextLine();
        String brand = scanner.nextLine();
        int year = Integer.parseInt(scanner.nextLine());

        if (vehicleType.equals("Car")) {
            int numDoors = Integer.parseInt(scanner.nextLine());
            // TODO: Create a Car object and call displayInfo()
            Car car = new Car();
            car.setBrand(brand);
            car.setYear(year);
            car.setNumDoors(numDoors);
            car.displayInfo();
        } else if (vehicleType.equals("Motorcycle")) {
            boolean hasSidecar = Boolean.parseBoolean(scanner.nextLine());
            // TODO: Create a Motorcycle object and call displayInfo()
            Motorcycle motorcycle = new Motorcycle();
            motorcycle.setBrand(brand);
            motorcycle.setYear(year);
            motorcycle.setHasSidecar(hasSidecar);
            motorcycle.displayInfo();
        }

        scanner.close();
    }
}
