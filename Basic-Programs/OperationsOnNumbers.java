// OperationOnNumbers
import java.util.Scanner;

class OperationOnNumbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers below: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(
            String.format("Their Sum: %s\nTheir Difference: %s\nTheir Product: %s\nTheir Quotient: %s",
                    Integer.toString(num1+num2),
                    Integer.toString(num1-num2),
                    Integer.toString(num1*num2),
                    Integer.toString(num1/num2)
                )
            );
    }
}
