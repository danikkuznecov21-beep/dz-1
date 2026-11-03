import java.util.Scanner;

public class for2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                sum += number;
                count++;
            }
        }

        if (count > 0) {
            System.out.println(sum);
        } else {
            System.out.println("NO");
        }
    }
}
