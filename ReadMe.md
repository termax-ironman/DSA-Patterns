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

```
for (end = 0 → n) {
add nums[end]

while (condition satisfied) {
    update answer
    remove nums[start]
    start++
}
}
```

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

**1423. Maximum Points You Can Obtain from Cards**

**Example 1:**

```
Input: cardPoints = [1,2,3,4,5,6,1], k = 3
Output: 12
Explanation: After the first step, your score will always be 1. However, choosing the rightmost card first will maximize your total score. The optimal strategy is to take the three cards on the right, giving a final score of 1 + 6 + 5 = 12.
```

you need to print the difference between totalsum- ((n-k) subarray’s min sum) then only we can find the maximum of k numbers.

# [**1979. Find Greatest Common Divisor of Array**](https://leetcode.com/problems/find-greatest-common-divisor-of-array/)

Given an integer array `nums`, return *****the **greatest common divisor** of the smallest number and largest number in* `nums`.

The **greatest common divisor** of two numbers is the largest positive integer that evenly divides both numbers.

**Example 1:**

```
Input: nums = [2,5,6,9,10]
Output: 2
Explanation:
The smallest number in nums is 2.
The largest number in nums is 10.
The greatest common divisor of 2 and 10 is 2.
```

take min and and max using Arrays.sort(nums) then find gcd.

**Longest Substring with K Uniques**

You are given a string **s** consisting only lowercase alphabets and an integer **k**. Your task is to find the **length** of the **longest substring** that contains exactly **k** distinct characters.

**Note :** If no such substring exists, return **-1**.

**Examples:**

```
Input:s = "aabacbebebe", k = 3
Output: 7
Explanation: The longest substring with exactly 3 distinct characters is "cbebebe", which includes 'c', 'b', and 'e'.

```

```
Input: s = "aaaa", k = 2
Output: -1
Explanation: There's no substring with 2 distinct characters.

```

```
Input:s = "aabaaab", k = 2
Output: 7
Explanation:The entire string "aabaaab" has exactly 2 unique characters 'a' and 'b', making it the longest valid substring.
```

```
for windowEnd = 0 → n-1
add right character to map

while map.size() > K
    remove left character from map
    move windowStart++

update maxLength
```

**3. Longest Substring Without Repeating Characters**

Given a string `s`, find the length of the **longest** **substring** without duplicate characters.

**Example 1:**

```
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.

```

**Example 2:**

```
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

```

**Example 3:**

```
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
```

O(n^2)(set)

```java
for end from 0 to n-1:
	while s[end] is already in set:
	remove s[start] from set
	start++
add s[end] to set
update max_length = max(max_length, end - start + 1)
```

O(n) (map)

```java
for end = 0 → n-1
    if current char seen before
        move start to max(start, lastSeen[char] + 1)

    update lastSeen[char] = end
    update maxLen
```

**904. Fruit Into Baskets**

You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array `fruits` where `fruits[i]` is the **type** of fruit the `ith` tree produces.

You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:

- You only have **two** baskets, and each basket can only hold a **single type** of fruit. There is no limit on the amount of fruit each basket can hold.
- Starting from any tree of your choice, you must pick **exactly one fruit** from **every** tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
- Once you reach a tree with fruit that cannot fit in your baskets, you must stop.

Given the integer array `fruits`, return *the **maximum** number of fruits you can pick*.

**Example 1:**

```
Input: fruits = [1,2,1]
Output: 3
Explanation: We can pick from all 3 trees.

```

**Example 2:**

```
Input: fruits = [0,1,2,2]
Output: 3
Explanation: We can pick from trees [1,2,2].
If we had started at the first tree, we would only pick from trees [0,1].

```

**Example 3:**

```
Input: fruits = [1,2,3,2,2]
Output: 4
Explanation: We can pick from trees [2,3,2,2].
If we had started at the first tree, we would only pick from trees [1,2].
```

```java
for end from 0 to n-1
    add fruits[end] to map

    while map.size() > 2
        remove fruits[start] from map
        start++

    update max length
```