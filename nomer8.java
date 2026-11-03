import java.util.Scanner;

public class nomer8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int minDigit = 10;

        do {
            int digit = n % 10;

            if (digit != 0 && digit < minDigit) {
                minDigit = digit;
            }

            n /= 10;
        } while (n != 0);

        System.out.println(minDigit);
    }
}