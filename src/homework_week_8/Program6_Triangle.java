package homework_week_8;

import java.util.Scanner;

public class Program6_Triangle {
    static int j, i;

    public static void main(String[] args) {

        System.out.println("Please enter row number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = 10;
        triangle(n);
        sc.close();
    }

    public static void triangle(int n) {
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }
    }
}
