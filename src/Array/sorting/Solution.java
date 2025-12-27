package Array.sorting;

import java.util.Arrays;

class Solution {
    public static void wiggleSort(int[] nums) {
        int[] op = new int[nums.length];
        Arrays.sort(nums);
        int i = 1;
        int j = nums.length - 1;
        while(j >= 0) {
            op[i] = nums[j];
            i = i+2;
            if(i >= nums.length) {
                i = 0;
            }
            j--;
        }
        int h = 0;
        for(int k: op) {
            nums[h] = k;
            h++;
        }
    }

    public static void main(String[] args) {
        wiggleSort(new int[] {1,5,1,1,6,4}) ;
    }
}
