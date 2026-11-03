import java.util.Scanner;

public class nomer6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = 0;
        int current = 25;

        while (current <= n) {

            if (current % 2 == 0) {
                sum += current;
            }
            current++;
        }


        System.out.println(sum);
    }
}