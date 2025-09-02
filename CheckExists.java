import java.util.Scanner;

public class CheckExists {
    public static void main(String[] args) {
        int[] arr = {0, 2, 2, 1, 2, 0, 3, 2, 2, 3, 0, 1, 1, 2, 1, 0};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        int x = sc.nextInt();
        boolean found = false;
        for (int num : arr) {
            if (num == x) {
                found = true;
                break;
            }
        }
        System.out.println(x + " exists: " + found);
    }
}