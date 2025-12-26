package Array.sorting;

import java.util.*;

public class MeetingRooms2GFG {
    public static int minMeetingRooms(int[] start, int[] end) {
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < start.length; i++) {
            list.add(new int[]{start[i], end[i]});
        }
        Collections.sort(list,
                (a, b) -> Integer.compare(a[0], b[0]));

        Queue<int[]> minheap = new PriorityQueue<>((interval1, interval2) ->
                Integer.compare(interval1[1], interval2[1]));

        for (int i = 0; i < list.size(); i++) {
            int[] currentinterval = list.get(i);
            if (!minheap.isEmpty() && currentinterval[0] >= minheap.peek()[1]) {
                minheap.poll();
            }
            minheap.add(currentinterval);
        }
        return minheap.size();
    }

    public static void main(String[] args) {
        int[] start = new int[]{1,5,9,34};
        int[] end = new int[]{3,10,12,56};
        System.out.println(minMeetingRooms(start, end));


        /*
        result - 5
        start - {1,5,9,34}
        end - {3,10,12,56}
        result - 2
         */
    }
}
