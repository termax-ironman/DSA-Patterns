public class P6 {
    public static void main(String[] args) {
        int n = 5;
/*
* * *  * * *
* *      * *
*          *
* *      * *
* * *  * * *
*/
//        3 1 3
//        2 3 2
//        1 5 1
//        2 3 2
//        3 1 3
        int st1 = n/2 + 1;
        int sp = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= st1; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= sp; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= st1; j++){
                System.out.print("*");
            }
            if(i <= n/2) {
                st1--;
                sp = 2 *i + 1;
            } else {
                st1++;
                sp = sp - 2;
            }
            System.out.println();
        }
    }
}
