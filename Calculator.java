import java.util.*;
public class Calculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        int c=a+b;
        int d=a-b;
        int e=a*b;
        int f=a/b;
        int g=a%b;
        System.out.println("Addition :"+c);
        System.out.println("Subtraction:"+d);
        System.out.println("Multiplication:"+e);
        System.out.println("Division:"+f);
        System.out.println("Modulus:"+g);
    }
}