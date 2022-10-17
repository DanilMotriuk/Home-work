package Homework_OOP;

public class Main {
    public static void main(String[] args) {
        {
            Rectangle a = new Rectangle(10, 5);
            a.printToConsole();
            a.SquareOfRectangle();
            a.PerimeterOfRectangle();
        }
        System.out.println();
        {
            Circle b = new Circle(4);
            b.printToConsole();
            b.PerimeterOfCircle();
            b.SquareOfCircle();
        }
        System.out.println();
        {
            System.out.println("Let's create our dog!");
            Dog myDog = new Dog("Sharik");
            myDog.setAge(5);
            myDog.setHeight(60);
            myDog.setWeight(15);
            myDog.printToConsole();

        }
        System.out.println();
        {
            Point point1 = new Point(9, 4);
            Point point2 = new Point(11, 28);
            System.out.printf("Start value:\nX1 = %f\nY1 = %f\n", point1.getX(), point1.getY());
            System.out.printf("X2 = %f\nY2 = %f\n", point2.getX(), point2.getY());
            System.out.printf("distance = %f\n", point1.getDistance(point2));
        }
    }
}
