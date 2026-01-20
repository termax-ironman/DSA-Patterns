import com.sun.security.jgss.GSSUtil;

public class P15 {
    public static void main(String[] args) {

        /*
        * 2 1
        * 1 3
        * 0 5
        * 1 3
        * 2 1
        * */
        int n = 5;
        int sp = n/2;
        int st = 1;
        for(int i = 1; i <= n ; i++) {
            for(int j =  1; j <= sp; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= st; j++) {
                System.out.print(j);
            }

            if(i <= n/2) {
                sp--;
                st = st + 2;
            } else {
                sp++;
                st = st - 2;
            }
            System.out.println();
        }
    }
}
