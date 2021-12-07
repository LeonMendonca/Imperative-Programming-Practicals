// Write a program to find the area of square, rectangle and circle

import java.util.Scanner;

class AreaOfFigures {
    public static double findAreaSquare(double side){
        return side*side;
    }
    public static double findAreaRectangle(double length, double breadth){
        return length*breadth;
    }
    public static double findAreaCircle(double radius){
        return Math.PI * radius * radius;
    }

    public static void main(String[] args){
        System.out.println("Enter your choice: ");
        System.out.println("1. Find area of square\n2. Find area of rectangle\n3. Find area of circle");
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();

        if(choice.equals("1")){
            System.out.println("Enter the side of the square: ");
            double side = scan.nextDouble();
            System.out.printf("The area of square of side %s is %s",Double.toString(side),Double.toString(findAreaSquare(side)));
        }
        else if(choice.equals("2")){
            System.out.println("Enter the length and breadth: ");
            double length = scan.nextDouble();
            double breadth = scan.nextDouble();
            System.out.printf("The area of the rectangle of length %s and breadth %s is %s", Double.toString(length), Double.toString(breadth), Double.toString(findAreaRectangle(length,breadth)));
        }
        else if(choice.equals("3")){
            System.out.println("Enter the radius of the circle: ");
            double radius = scan.nextDouble();
            System.out.printf("The area of circle of radius %s is %s",Double.toString(radius),Double.toString(findAreaCircle(radius)));
        }
        scan.close();
    }
}
