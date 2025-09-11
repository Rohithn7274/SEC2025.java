import java.util.Scanner;
public class MultiplyAssignExample{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a= sc.nextInt();
        a*=2;
        System.out.println("a= "+a);
        sc.close();
    }
}