import com.sun.jdi.PathSearchingVirtualMachine;

public class P9 {
    public static void main(String[] args) {
        int n = 5;

//*				*
//	*		*
//		*
//	*		*
//*				*

        //0 1 4 1
        //1 1 2 1
        //2 1 (if i == n/2)
        //1 1 2 1
        //0 1 4 1

        for(int i = 1; i<=n;i++ ) {
            for(int j = 1; j <= n; j++) {
                if(i == j) {
                    System.out.print("*\t");
                } else if(i + j == n +1) {
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
