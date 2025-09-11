import java.util.Scanner;
public class UnsignedRightShiftExample{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int result= a>>>2;
        System.out.println("a>>>2= "+result);
        sc.close();
    }
}
