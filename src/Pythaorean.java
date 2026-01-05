import java.util.Arrays;
import java.util.Scanner;

public class Pythaorean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] arr = {a,b,c};
        Arrays.sort(arr);
        int line2 = arr[0] * arr[0] + arr[1] * arr[1];
        int line1 = arr[2] * arr[2];

        if(line1 == line2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
