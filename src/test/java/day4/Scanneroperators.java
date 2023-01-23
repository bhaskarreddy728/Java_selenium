package day4;
import java.util.Scanner;
public class Scanneroperators {
    public static void main(String[]args){
        System.out.println("Arithematic Operations");
        int a,b,sum,sub,mul,div;
        Scanner sc = new Scanner(System.in);
        System.out.println("Addition of two numbers");
        System.out.println("Enter first number");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();
        sum = a+b;
        System.out.println("Sum of two numbers : "+sum);
        System.out.println("Subtraction of two numbers");
        System.out.println("Enter first number");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();
        sub = a-b;
        System.out.println("Sub of two numbers : "+sub);
        System.out.println("Multiplication of two numbers");
        System.out.println("Enter first number");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();
        mul = a*b;
        System.out.println("mul of two numbers : "+mul);
        System.out.println("Division of two numbers");
        System.out.println("Enter first number");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();
        div = a/b;
        System.out.println("div of two numbers : "+div);


    }
}
6