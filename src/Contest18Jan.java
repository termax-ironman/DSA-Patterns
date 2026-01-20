public class Contest18Jan {
    public static int maxCapacity(int[] costs, int[] capacity, int budget) {
        int i = 0;
        int j = costs.length -1;
        int wb = 0;
        int a = 0;
        int b = 0;
        int max = 0;
        while(i < costs.length) {
            if(costs[i] <= budget-1) {
                max = costs[i];
                a = i;
            }
        }
        i = 0;
        int fl = 0;
        while(i < costs.length) {
            wb = costs[i] + costs[j];
            if(wb <= budget-1 && wb > max) {
                fl++;
                a = i;
                b = j;
            }
            j--;
            if(j == i) {
                i++;
                j = costs.length-1;
            }
            if(i == costs.length-1) {
                break;
            }
        }
        if(fl > 0) {
            return capacity[a] + capacity[b];
        } else {
            return capacity[a];
        }
    }

    public static void main(String[] args) {
        System.out.println(maxCapacity(new int[] {3,5,7,4},new int[]{2,4,3,6},7));
    }
}
