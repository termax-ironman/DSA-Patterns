public class CountPrime204 {
    public static int countPrimes(int n) {
        if (n <= 1) {
            return 0;
        } else if (n == 2) {
            return 2;
        } else {
            int count = 0;
            for (int i = 3; i <= n; i++) {
                count += checkPrime(i);
            }
            return count;
        }
    }
    public static int checkPrime(int i) {
        for(int j = 2; j <= i; j++) {
            if(i % j == 0) {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(countPrimes(5));
    }
}
