324 - Wiggle Sort

```java
Input: nums = [1,5,1,1,6,4]
Output: [1,6,1,5,1,4]
Explanation: [1,4,1,5,1,6] is also accepted.
```

logic - take extra space of size nums, and sort the nums array

start iterator i from 1 then increment by 2 until it croses the main array length

then if i crosees the nums.length then assign i = 0 then again it will be incremented by 2 till last until j becomes zero.

**88. Merge Sorted Array**

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

**209. Minimum Size Subarray Sum**

```java
Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
```

we will use two pointer technique

start from first element

we will increment end pointer and sum the array values until we find sum is greater or equal to target

if greater or equal to target check the length of that array using ep - sp +1 then check it less than infine minimum lenggth or not then if less then only assign the value to minLenth, then reduce the sum starting pointer and increment the pointer

return the minLnth if it’s infinite then return 0 else its value

**845. Longest Mountain in Array**

```java
Input: arr = [2,1,4,7,3,2,5]
Output: 5
Explanation: The largest mountain is [1,4,7,3,2] which has length 5.
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

**674. Longest Continuous Increasing Subsequence**

```
Input: nums = [1,3,5,4,7]
Output: 3
Explanation: The longest continuous increasing subsequence is [1,3,5] with length 3.
Even though [1,3,5,7] is an increasing subsequence, it is not continuous as elements 5 and 7 are separated by element
4.
```

simple

we need to iterate throuh out the array and check if current element is more than the previous element or not till when it is more we will track that counter and store it in ans variable if current element is less than the previous then we will set the array length counter to 1.

return the ans