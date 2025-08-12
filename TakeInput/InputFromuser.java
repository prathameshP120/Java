package TakeInput;
import java.util.Scanner;

public class InputFromuser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking array input (element by element)
        int arr[] = new int[4];
        System.out.println("Enter 4 values (one by one):");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements:");
        for (int ele : arr) {
            System.out.println(ele);
        }

        sc.nextLine(); // 🛑 Important: Consume the leftover newline

        // Taking space-separated input
        System.out.println("Enter space-separated numbers:");
        String line = sc.nextLine();           // e.g., "10 20 30"
        String[] parts = line.split(" ");
        int[] num = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            num[i] = Integer.parseInt(parts[i]);
        }

        System.out.println("Parsed space-separated numbers:");
        for (int n : num) {
            System.out.println(n);
        }
    }
}
