import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(gcd(a,b));
    }

    private static int gcd(int a, int b) {
        int max = Math.min(a, b);
        int gcd = 1;
        for(int i = 2; i <= max; i++) {
            if(a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
