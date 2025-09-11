import java.util.Scanner;
public class LogicalAndExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        boolean hasLicense = true;
        if (age > 18 && hasLicense) {
            System.out.println("Eligible to drive.");
        } else {
            System.out.println("Not Eligible to drive.");
        }
        sc.close();
    }
}