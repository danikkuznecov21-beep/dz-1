import java.util.Scanner;

public class for3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x % 2 != 0) {
                sum += x;
                count++;
            }
        }

        if (count == 0) {
            System.out.println("NO");
        } else {
            System.out.printf(java.util.Locale.US, "%.2f%n", (double) sum / count);
        }
    }
}
