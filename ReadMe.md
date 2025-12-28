324 - Wiggle Sort

Given an integer array `nums`, reorder it such that `nums[0] < nums[1] > nums[2] < nums[3]...`.

You may assume the input array always has a valid answer.

**Example 1:**

```
Input: nums = [1,5,1,1,6,4]
Output: [1,6,1,5,1,4]
Explanation: [1,4,1,5,1,6] is also accepted.

```

**Example 2:**

```
Input: nums = [1,3,2,2,3,1]
Output: [2,3,1,3,1,2]
```

```java
class Solution {
    public void wiggleSort(int[] nums) {
        int[] op = new int[nums.length];
        Arrays.sort(nums);
        int i = 1;
        int j = nums.length - 1;
        if(j == 0) {
            return;
        }
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
}
```

logic - take extra space of size nums, and sort the nums array

start iterator i from 1 then increment by 2 until it croses the main array length

then if i crosees the nums.length then assign i = 0 then again it will be incremented by 2 till last until j becomes zero.

**88. Merge Sorted Array**

You are given two integer arrays `nums1` and `nums2`, sorted in **non-decreasing order**, and two integers `m` and `n`, representing the number of elements in `nums1` and `nums2` respectively.

**Merge** `nums1` and `nums2` into a single array sorted in **non-decreasing order**.

The final sorted array should not be returned by the function, but instead be *stored inside the array* `nums1`. To accommodate this, `nums1` has a length of `m + n`, where the first `m` elements denote the elements that should be merged, and the last `n` elements are set to `0` and should be ignored. `nums2` has a length of `n`.

**Example 1:**

```
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
```

**Example 2:**

```
Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].

```

**Example 3:**

```
Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
```

```java
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(j >= 0) {
            if(i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else
            nums1[k--] = nums2[j--];
        }
    }
}
```

Given an array of positive integers `nums` and a positive integer `target`, return *the **minimal length** of a subarray whose sum is greater than or equal to* `target`. If there is no such subarray, return `0` instead.

**209. Minimum Size Subarray Sum**

**Example 1:**

```
Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
```

```java
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int a = 0;
        int b = Integer.MAX_VALUE;
        for(int c = 0, d = 0; c < nums.length; c++) {
            a += nums[c];
            while(a >= target) {
                int e = c - d +1;
                if(e < b) {
                    b = e;
                }
                a = a - nums[d];
                d++;
            }
        }
        return b == Integer.MAX_VALUE ? 0 : b;
    }
}
```

we will use two pointer technique

start from first element

we will increment end pointer and sum the array values until we find sum is greater or equal to target

if greater or equal to target check the length of that array using ep - sp +1 then check it less than infine minimum lenggth or not then if less then only assign the value to minLenth, then reduce the sum starting pointer and increment the pointer

return the minLnth if it’s infinite then return 0 else its value

**845. Longest Mountain in Array**

You may recall that an array `arr` is a **mountain array** if and only if:

- `arr.length >= 3`
- There exists some index `i` (**0-indexed**) with `0 < i < arr.length - 1` such that:
    - `arr[0] < arr[1] < ... < arr[i - 1] < arr[i]`
    - `arr[i] > arr[i + 1] > ... > arr[arr.length - 1]`

Given an integer array `arr`, return *the length of the longest subarray, which is a mountain*. Return `0` if there is no mountain subarray.

**Example 1:**

```
Input: arr = [2,1,4,7,3,2,5]
Output: 5
Explanation: The largest mountain is [1,4,7,3,2] which has length 5.
```

```java
class Solution {
    public int longestMountain(int[] arr) {
        int ans = 0;
        for(int i = 1;i < arr.length-1; i++) {
            if(arr[i-1] < arr[i] && arr[i] > arr[i+1]) {
                int left = i;
                int right = i;
                while(left > 0 && arr[left-1] < arr[left]) {
                    left--;
                }
                while(right < arr.length - 1 && arr[right] > arr[right+1]) {
                    right++;
                }
                ans = Math.max(ans, right - left +1);
            }
        }
        return ans;
    }
}
```

First, we iterate through the array to find a **peak element**, where the previous element is smaller than the current element and the next element is also smaller than the current element.

Once a peak is found, we initialize two pointers:

- One pointer moves **left** as long as the previous element is strictly smaller than the current element (uphill).
- Another pointer moves **right** as long as the next element is strictly smaller than the current element (downhill).

This helps us identify the **start and end indices** of the mountain.

The length of the current mountain is calculated as:

```
right -left +1
```

Since there can be multiple mountains in the array, we keep updating the maximum length found so far and return it as the final answer.