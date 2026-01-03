/*
*  42531 -- position index turns into realnumber and value turns into index of new number
*  valid number means if it contains 3 numbers then it should contain 123 in anyorder
*  35241
*
*
* EXTRA::
* int num = 42531;

int[] arr = String.valueOf(num)
                  .chars()
                  .map(c -> c - '0')
                  .toArray();
* */

import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ans = solution(scanner.nextInt());
        System.out.println(ans);
    }

    private static int solution(int i) {
        if(i == 0) {
            return 0;
        } else {
            int ans = 0;
            int dup = i;
            int count = 1;
            int iterator = 0;
            while(dup != 0) {
                int rem = dup % 10;
                iterator = rem;
                ans = (int)(ans + count * Math.pow(10,iterator-1));
                dup = dup / 10;
                count++;
            }
            return ans;
        }
    }
}
