import java.util.Scanner;

public class nomer9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a + 1;

        while (true) {
            int p = 1;

            if (b < 2) {
                p = 0;
            } else {
                for (int i = 2; i * i <= b; i++) {
                    if (b % i == 0) {
                        p = 0;
                        break;
                    }
                }
            }

            if (p == 1) {
                System.out.println(b);
                break;
            }

            b++;
        }
    }
}