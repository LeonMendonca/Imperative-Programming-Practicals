//Write a program to swap two numbers without third variable
import java.util.Scanner;

class SwapTwoNumbers{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st and 2nd number: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(String.format("Numbers before swap: %d %d",num1,num2));
        //Begin swap
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
        //End swap
        System.out.println(String.format("Numbers after swap: %d %d",num1,num2));
        scan.close();
    }
}
