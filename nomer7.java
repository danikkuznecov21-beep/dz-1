import java.util.Scanner;

public class nomer7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0;

        do {
            num = num / 10;
            sum = sum + 1;
        } while (num > 0);

        System.out.println(sum);
    }
}
