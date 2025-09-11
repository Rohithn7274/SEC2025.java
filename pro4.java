import java.util.Scanner;

public class pro4 {

    static void unipolarNRZ(int[] data) {
        System.out.println("Unipolar NRZ Encoding:");
        for (int bit : data) {
            if (bit == 1) System.out.print("+1 ");
            else System.out.print("0 ");
        }
        System.out.println();
    }

    static void polarNRZ(int[] data) {
        System.out.println("Polar NRZ Encoding:");
        for (int bit : data) {
            if (bit == 1) System.out.print("+1 ");
            else System.out.print("-1 ");
        }
        System.out.println();
    }

    static void manchester(int[] data) {
        System.out.println("Manchester Encoding:");
        for (int bit : data) {
            if (bit == 1) System.out.print("+1,-1\t");
            else System.out.print("-1,+1\t");
        }
        System.out.println();
    }

    static void differentialManchester(int[] data) {
        System.out.println("Differential Manchester Encoding:");
        int lastLevel = 1;
        for (int bit : data) {
            if (bit == 0) {
                lastLevel = -lastLevel;
                System.out.print((lastLevel == 1 ? "+1,-1" : "-1,+1") + "\t");
            } else {
                System.out.print((lastLevel == 1 ? "+1,-1" : "-1,+1") + "\t");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of bits in the data:");
        int n = sc.nextInt();

        int[] data = new int[n];
        System.out.println("Enter the binary data bits (0s and 1s):");
        for (int i = 0; i < n; i++) {
            int bit = sc.nextInt();
            if (bit != 0 && bit != 1) {
                System.out.println("Invalid input. Only 0s and 1s are allowed.");
                sc.close();
                return;
            }
            data[i] = bit;
        }

        System.out.println("Choose a line coding technique:");
        System.out.println("1. Unipolar NRZ");
        System.out.println("2. Polar NRZ");
        System.out.println("3. Manchester");
        System.out.println("4. Differential Manchester");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        System.out.println();  

        switch (choice) {
            case 1:
                unipolarNRZ(data);
                break;
            case 2:
                polarNRZ(data);
                break;
            case 3:
                manchester(data);
                break;
            case 4:
                differentialManchester(data);
                break;
            default:
                System.out.println("Invalid choice. Please select a number between 1 and 4.");
        }

        sc.close();
    }
}
