//Write a program to swap two numbers without third variable

class SwapTwoNumbers{
    public static void main(String[] args){
        int num1 = 7;       // Sample variable 1
        int num2 = 3;       // Sample variable 2
        System.out.println(String.format("Numbers before swap: %d %d",num1,num2));
        //Begin swap
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
        //End swap
        System.out.println(String.format("Numbers after swap: %d %d",num1,num2));
    }
}
