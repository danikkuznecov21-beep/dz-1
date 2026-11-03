import java.util.Scanner;

public class for1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int x = in.nextInt();
        int ans = -1;

        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                ans = i + 1;
                break;
            }
        }

        if (ans == -1) {
            System.out.println("NO");
        } else {
            System.out.println(ans);
        }
    }
}