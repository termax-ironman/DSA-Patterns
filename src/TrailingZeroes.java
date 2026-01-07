public class TrailingZeroes {
    public static int trailingZeroes(int n) {
        int zc = 0;
        while (n > 0) {
            n = n / 5;
            zc += n;
        }
        return zc;
    }

    public static void main(String[] args) {
        System.out.println(trailingZeroes(30));
    }
}