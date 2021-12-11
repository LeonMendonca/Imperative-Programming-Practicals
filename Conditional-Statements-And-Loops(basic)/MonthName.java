//Write a program to enter a number from the user and display the month name. If number > 13 then display invalid imput using switch case.
import java.util.Scanner;

public class MonthName {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int monthName = 0;
        System.out.println("Enter a number below to find the month");
        try{
            monthName = scan.nextInt();
        } catch(Exception e){
            System.out.println("[ERROR] The number provided is invalid.");
        }
        switch(monthName){
            case 1:
                System.out.println("The month is January");
                break;
            case 2:
                System.out.println("The month is February");
                break;
            case 3:
                System.out.println("The month is March");
                break;
            case 4:
                System.out.println("The month is April");
                break;
            case 5:
                System.out.println("The month is May");
                break;
            case 6:
                System.out.println("The month is June");
                break;
            case 7:
                System.out.println("The month is July");
                break;
            case 8:
                System.out.println("The month is August");
                break;
            case 9:
                System.out.println("The month is September");
                break;
            case 10:
                System.out.println("The month is October");
                break;
            case 11:
                System.out.println("The month is November");
                break;
            case 12:
                System.out.println("The month is December");
                break;
            default:
                System.out.println("The given number is invalid");
        }
        scan.close();
    }
}
