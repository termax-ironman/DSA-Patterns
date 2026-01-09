public class P10 {
    public static void main(String[] args) {
        /*
        * 2 1 -1 0
        * 1 1 1 1
        * 0 1 3 1
        * 1 1 1 1
        * 2 1 -1 0
        *
        * */
        int n = 5;
        int sp1 = n/2;
        int st1 = 1;
        int sp2 = -1;
        int st2 = 0;

        for(int i = 1; i<= n; i++) {
            for(int j = 1; j <= sp1; j++) {
                System.out.print("\t");
            }
            for(int j = 1; j <= st1; j++) {
                System.out.print("*\t");
            }
            for(int j = 1; j<= sp2; j++) {
                System.out.print("\t");
            }
            for(int j = 1; j<= st2; j++) {
                System.out.print("*\t");
            }
                if(i <= n/2) {
                sp1--;
                sp2 = sp2 +2;
                st2 = 1;
            } else {
                sp1++;
                sp2 = sp2 - 2;
            }
            if(i == n-1) {
                st2--;
            }
            System.out.println();
        }

    }
}
