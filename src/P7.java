public class P7 {
    public static void main(String[] args) {
        int n = 5;

        /*
         *
          *
           *
            *
             *
        */
        /*
        * 0 1
        * 1 1
        * 2 1
        * 3 1
        * 4 1
        * 5 1
        * */

        int sp = 1;
        int st = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j< i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
