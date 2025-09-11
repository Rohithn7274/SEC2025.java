import java.util.Scanner;
public class IncDec{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        System.out.println("Original: "+x);
        System.out.println("Post Increment: "+(x++));
        System.out.println("After Post Increment: "+x);
        System.out.println("Pre-Increment: "+(++x));
        System.out.println("Post Decrement: "+(x--));
        System.out.println("Pre- Decrement: "+(--x));
    }
}