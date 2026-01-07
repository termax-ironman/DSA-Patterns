public class P4 {
    public static void main(String[] args) {

        int n = 5;
        for(int i = 1; i <= n ; i++) {
            //spaces 0 1 2 3 4
            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            //starts  5 4 3 2 1
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
