import java.util.Scanner;

public class nomer1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int num;

        do {
            num = in.nextInt();
            count++;
        } while (num >= 0);

        System.out.println(count);
    }
}