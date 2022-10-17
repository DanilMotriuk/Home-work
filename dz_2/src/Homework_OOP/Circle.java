package Homework_OOP;

public class Circle {
    private static final double PI = 3.14;

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public void printToConsole(){
        System.out.println("Our circle with parameters: " + "Radius = " + radius + " cm " + "Const PI = " + PI);

    }

    public void SquareOfCircle(){
        double a = radius * radius * PI;
        System.out.println("Square of Circle = " + a + " cm^2");
    }

    public void PerimeterOfCircle(){
        double b = 2 * (radius * PI);
        System.out.println("Perimeter of Circle = " + b + " cm");
    }
}
