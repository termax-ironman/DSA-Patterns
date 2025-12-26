package Array.sorting;

import java.util.Arrays;

public class LargestNumber {

    public static String largestNumber(int[] nums) {
        String[] numsarray = new String[nums.length];
        for(int i =0; i < nums.length; i++ ) {
            numsarray[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(numsarray, (a, b) -> (b+a).compareTo(a+b));
        StringBuilder ln = new StringBuilder();
        for(int i =0; i < numsarray.length; i++ ) {
            ln.append(numsarray[i]);
        }
        return ln.charAt(0) == '0' ? "0" : ln.toString();
    }

    public static void main(String[] args) {
        int[] arr = {56,21,787,32,12453,9};
        System.out.println(largestNumber(arr));
    }
    /*
    testcases - {0,0,0,0}
    result - 0
    test1 - {3,4,54,63,2}
    result - 6354432
    test2 - {55,2,112,34,21,56}
    result - 565534221112
    test3 - {56,21,787,32,12453,9}
    result - 978756322112453
     */

}
