## Day 1 - Problem 1: Two Sum ✅

### Problem Description
Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.

You may assume that each input would have **exactly one solution**, and you may not use the same element twice.

You can return the answer in any order.

### Examples

**Example 1:**
```
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
```

**Example 2:**
```
Input: nums = [3,2,4], target = 6
Output: [1,2]
```

**Example 3:**
```
Input: nums = [3,3], target = 6
Output: [0,1]
```

### Constraints
- 2 ≤ nums.length ≤ 10⁴
- -10⁹ ≤ nums[i] ≤ 10⁹
- -10⁹ ≤ target ≤ 10⁹
- Only one valid answer exists.

### Solution

**Approach:** Brute Force (Nested Loops)
- **Time Complexity:** O(n²)
- **Space Complexity:** O(1)

**Algorithm:**
1. Use two nested loops to check all possible pairs
2. For each element, compare it with every element that comes after it
3. Return the indices when sum equals target

### Performance
![LeetCode Submission Result](https://github.com/syntherat/teachers-day-vitb/blob/main/Day1/Problem%201/img.png)

**Stats:**
- ✅ **Accepted**
- **Runtime:** 38ms (Beats 43.43%)
- **Memory:** 45.00 MB (Beats 46.68%)

### Files
- [`Main.java`](Main.java) - Complete runnable solution with test case

---
*Problem solved on LeetCode - Day 1 of the Teacher's Day coding challenge! 🚀*