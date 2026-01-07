/*
*
* *
* * *
* * * *
* * * * *
 */

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        prints(sc.nextInt());
    }

    private static void prints(int j) {
        for(int i = 1; i <= j; i++) {
            for(int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
