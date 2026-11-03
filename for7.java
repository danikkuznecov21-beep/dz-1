import java.util.Scanner;

public class for7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i] + " ");
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
