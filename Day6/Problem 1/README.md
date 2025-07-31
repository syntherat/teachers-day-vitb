## Day 6 - Problem 1: Maximum Subarray ✅

### Problem Description
Given an integer array `nums`, find the subarray with the largest sum, and return its sum.

### Examples

**Example 1:**
```
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
```

**Example 2:**
```
Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
```

**Example 3:**
```
Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
```

### Constraints
- 1 ≤ nums.length ≤ 10⁵
- -10⁴ ≤ nums[i] ≤ 10⁴

### Solution

**Approach:** Kadane's Algorithm (Dynamic Programming)
- **Time Complexity:** O(n) - single pass through array
- **Space Complexity:** O(1) - constant extra space

**Algorithm:**
1. **Initialize:** Set both maxSoFar and maxEndingHere to first element
2. **Iterate:** For each element, decide whether to start fresh or extend current subarray
3. **Local Decision:** maxEndingHere = max(current element, maxEndingHere + current element)
4. **Global Update:** maxSoFar = max(maxSoFar, maxEndingHere)
5. **Key Insight:** At each position, either start new subarray or extend existing one

**Visual Walkthrough:**
```
Input: [-2,1,-3,4,-1,2,1,-5,4]

i=0: maxEndingHere=-2, maxSoFar=-2
i=1: maxEndingHere=max(1, -2+1)=1, maxSoFar=max(-2,1)=1
i=2: maxEndingHere=max(-3, 1-3)=-2, maxSoFar=max(1,-2)=1
i=3: maxEndingHere=max(4, -2+4)=4, maxSoFar=max(1,4)=4
i=4: maxEndingHere=max(-1, 4-1)=3, maxSoFar=max(4,3)=4
i=5: maxEndingHere=max(2, 3+2)=5, maxSoFar=max(4,5)=5
i=6: maxEndingHere=max(1, 5+1)=6, maxSoFar=max(5,6)=6
i=7: maxEndingHere=max(-5, 6-5)=1, maxSoFar=max(6,1)=6
i=8: maxEndingHere=max(4, 1+4)=5, maxSoFar=max(6,5)=6

Result: 6 (subarray [4,-1,2,1])
```

### Performance
![LeetCode Submission Result](https://github.com/syntherat/teachers-day-vitb/blob/main/Day6/Problem%201/img.png)

**Stats:**
- ✅ **Accepted** (210/210 test cases passed)
- **Runtime:** 1ms (Beats 99.54%)
- **Memory:** 56.93 MB (Beats 70.34%)

### Test Cases
```java
// Test Case 1: Mixed positive/negative numbers
nums = [-2,1,-3,4,-1,2,1,-5,4]
Expected: 6

// Test Case 2: Single element
nums = [1]
Expected: 1

// Test Case 3: All positive numbers
nums = [5,4,-1,7,8]
Expected: 23

// Test Case 4: All negative numbers
nums = [-3,-2,-5,-1]
Expected: -1
```

### Files
- [`Main.java`](Main.java) - Optimal Kadane's algorithm implementation

---
*Problem solved on LeetCode! Maximum subarray sum found efficiently! 🚀*