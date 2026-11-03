import java.util.Scanner;

public class nomer2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int num;

        do {
            num = in.nextInt();

            if (num > 10) {
                sum = sum + num;
            }

        } while (num % 5 != 0);

        System.out.println(sum);
    }
}