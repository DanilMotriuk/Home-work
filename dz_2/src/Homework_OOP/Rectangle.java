package Homework_OOP;

public class Rectangle {
    private int length;

    private int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public void printToConsole(){
        System.out.println("Our rectangle with parameters: " + "Lenght = " + length + " cm" + " Width = " + width + " cm");

    }

    public void SquareOfRectangle(){
        int square = length * width;
        System.out.println("Square = " + square + " cm^2");
    }

    public void PerimeterOfRectangle(){
        int perimeter = (length + width) * 2;
        System.out.println("Perimeter = " + perimeter + " cm");
    }

}
