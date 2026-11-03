import java.util.Scanner;

public class nomer4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int a = in.nextInt();
        int b = in.nextInt();

        int count = 0;


        while (a >= b) {
            a = a - b;
            count++;
        }

        System.out.println(count + " " + a);
    }
}