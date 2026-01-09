public class P8 {
    public static void main(String[] args) {
        int n = 5;
        /*
        * 4 1
        * 3 1
        * 2 1
        * 1 1
        * */
        int sp = n-1;
        int st = 1;
        for(int i = 1;i <=n ;i++) {
            for(int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j<= st; j++) {
                System.out.print("*");
            }
            sp--;
            System.out.println();
        }
    }
}
