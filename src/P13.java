public class P13 {
    public static void main(String[] args) {
        int n = 5;
        int first = 0;
        int second = 1;
        for(int i = 1; i<= n; i++) {
            for(int j = 1; j <= i; j++ ) {
                System.out.print(first+" ");
                int next = first + second;
                first = second;
                second = next;
            }
            System.out.println();
        }
    }
}