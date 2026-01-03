import java.util.Scanner;

/*
*
* number is 12345 if i want to rotate it by 2 digits then
* 45123 will be the answer
* if i want to rotate it by 467 digits then it will also rotate by only 2 digits
* if i want to rotate it -78 times then it will rotate Mod (length of digit - 78 % 5) times
* 12345
* -3
* 45123
* */
public class RotateNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int num = scanner.nextInt();
        System.out.println(rot(num,k));
    }

    private static int rot(int num, int k) {
        int len = String.valueOf(num).length();

        k = k % len;
        if(k < 0) {
            k = k + len;
        }

        int divisor = (int) Math.pow(10, k);
        int right = num % divisor;
        int left = num / divisor;

        return right * (int) Math.pow(10, len - k) + left;

    }
}
