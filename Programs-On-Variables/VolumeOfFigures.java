//Write a program to find the volume of a square, rectangle and circle
import java.util.Scanner;

class VolumeOFFigures {
    public static double findVolumeCube(double side){
        return side*side*side;
    }
    public static double findVolumeCylinder(double radius, double height){
        return Math.PI*Math.pow(radius, 2)*height;
    }
    public static double findVolumeSphere(double radius){
        return (4*Math.PI*Math.pow(radius, 3)/3);
    }

    public static void main(String[] args){
        System.out.println("Enter your choice: \n(Please enter values in cm)");
        System.out.println("1. Find volume of cube\n2. Find volume of cylinder\n3. Find volume of sphere");
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();

        if(choice.equals("1")){
            System.out.println("Enter the side of the cube: ");
            double side = scan.nextDouble();
            System.out.printf("The volume of cube of side %s is %s",Double.toString(side),Double.toString(findVolumeCube(side)));
        }
        else if(choice.equals("2")){
            System.out.println("Enter the height and radius of the cylinder: ");
            double height = scan.nextDouble();
            double radius = scan.nextDouble();
            System.out.printf("The volume of the sphere of height %s and radius %s is %s", Double.toString(height), Double.toString(radius), Double.toString(findVolumeCylinder(radius,height)));
        }
        else if(choice.equals("3")){
            System.out.println("Enter the radius of the sphere: ");
            double radius = scan.nextDouble();
            System.out.printf("The volume of sphere of radius %s is %s",Double.toString(radius),Double.toString(findVolumeSphere(radius)));
        }
        scan.close();
    }
}
