import java.util.Scanner;

public class nomer5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int count = 0;

        if (n == 0) {
            count = 1;
        } else {
            while (n > 0) {
                n /= 2;
                count++;
            }
        }

        System.out.println(count);
    }
}