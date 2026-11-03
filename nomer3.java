import java.util.Scanner;

public class nomer3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int num;

        do {
            num = in.nextInt();


            if (num >= 10 && num <= 99) {
                int chislo1 = num % 10;
                int chislo2 = num / 10;
                sum += chislo1 + chislo2;
            }

        } while (num >= 10 && num <= 99);

        System.out.println(sum);
    }
}
