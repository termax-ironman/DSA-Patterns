public class P16 {
    public static void main(String[] args) {
        /*INCOMPLETE
        * 1 5 1
        * 2 3 2
        * 3 1 3
        * 4 0 4
        * */
        int n = 6;
        int sp = (2*n) - 3;
        for(int i = 1; i <= (2*n)-1; i++) {
            //stars
            int m = 1;
            for(int j = 1; j <=i; j++) {
                System.out.print(m++);
            }
            //spaces
            for(int j = 1; j <=sp; j++) {
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j <= i; j++) {
                System.out.print(--m);
            }
            sp = sp - 2;
            if(sp < 0) {
                sp = 0;
            }
            System.out.println();
        }
    }
}


