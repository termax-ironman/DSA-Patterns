public class P15 {
    public static void main(String[] args) {

        /*
        * 2 1
        * 1 3
        * 0 5
        * 1 3
        * 2 1
        * */
        int n = 6;
        int sp = n/2;
        int st = 1;
        int p = 1;
        for(int i = 1; i <= n ; i++) {
            if(n % 2 == 0) {
                System.out.println("please provide odd number");
                break;
            } else {
                int g = p;
                for (int j = 1; j <= sp; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= st; j++) {
                    int mid1 = st / 2;
                    System.out.print(g);
                    if (j > mid1) {
                        --g;
                    } else {
                        ++g;
                    }
                }

                if (i <= n / 2) {
                    sp--;
                    st = st + 2;
                    p++;
                } else {
                    sp++;
                    st = st - 2;
                    p--;
                }
                System.out.println();
            }
        }
    }
}
