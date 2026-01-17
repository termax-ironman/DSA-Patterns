import java.util.Scanner;

public class P14 {
    public static void main(String[] args) {
        int n = 10;
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for(int i = 1; i <= n ; i++) {
            int res = x * i;
            System.out.println(x+" "+"* "+ i +" = "+res);
        }
    }
}
