import java.util.Scanner;

public class for6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int answer = a[0];
        int max = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }

            if (count > max) {
                max = count;
                answer = a[i];
            }
        }

        System.out.println(answer);
    }
}
