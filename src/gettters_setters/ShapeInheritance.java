package gettters_setters;

import java.util.Scanner;

class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Define the derived class Rectangle
class Rectangle extends Shape {
    protected double length;
    protected double width;
    public Rectangle(String name, double length, double width) {
        super(name); // Обязательный вызов конструктора родителя
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}


public class ShapeInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the rectangle's name, length, and width from the user
        String name = sc.nextLine();
        double length = sc.nextDouble();
        double width = sc.nextDouble();

        // Create an instance of the Rectangle class
        Rectangle rectangle = new Rectangle(name, length, width);


        // Print the rectangle's name and area
        System.out.println(name);
        System.out.println(rectangle.getArea());
    }
}
