## Day 5 - Problem 1: Merge Intervals ✅

### Problem Description
Given an array of `intervals` where `intervals[i] = [starti, endi]`, merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

### Examples

**Example 1:**
```
Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
```

**Example 2:**
```
Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
```

### Constraints
- 1 ≤ intervals.length ≤ 10⁴
- intervals[i].length == 2
- 0 ≤ starti ≤ endi ≤ 10⁴

### Solution

**Approach:** Sort and Merge Strategy
- **Time Complexity:** O(n log n) due to sorting
- **Space Complexity:** O(n) for the result array

**Algorithm:**
1. **Sort Intervals:** Sort by start time to group overlapping intervals together
2. **Initialize Result:** Create list to store merged intervals, add first interval
3. **Iterate and Merge:** For each interval, check if it overlaps with the last merged interval
4. **Overlap Check:** Current start ≤ Last end means overlap exists
5. **Merge Logic:** Update end time to max(lastEnd, currentEnd) when overlapping
6. **No Overlap:** Add current interval as new separate interval

**Key Insight:** After sorting by start time, overlapping intervals will be adjacent or close to each other. We only need to check if current interval's start is ≤ previous interval's end.

**Visual Walkthrough:**
```
Input: [[1,3],[2,6],[8,10],[15,18]]

After sorting: [[1,3],[2,6],[8,10],[15,18]] (already sorted)

Step 1: merged = [[1,3]]
Step 2: [2,6] → 2 ≤ 3 (overlap) → merge to [1,6]
Step 3: [8,10] → 8 > 6 (no overlap) → add [8,10]
Step 4: [15,18] → 15 > 10 (no overlap) → add [15,18]

Result: [[1,6],[8,10],[15,18]]
```

### Performance
![LeetCode Submission Result](https://github.com/syntherat/teachers-day-vitb/blob/main/Day5/Problem%201/img.png)

**Stats:**
- ✅ **Accepted** (171/171 test cases passed)
- **Runtime:** 8ms (Beats 85.65%)
- **Memory:** 46.74 MB (Beats 39.60%)

### Test Cases
```java
// Test Case 1: Basic overlapping intervals
intervals = [[1,3],[2,6],[8,10],[15,18]]
Expected: [[1,6],[8,10],[15,18]]

// Test Case 2: Adjacent intervals (touching endpoints)
intervals = [[1,4],[4,5]]
Expected: [[1,5]]

// Test Case 3: No overlapping intervals
intervals = [[1,2],[3,4],[5,6]]
Expected: [[1,2],[3,4],[5,6]]

// Test Case 4: All intervals overlap
intervals = [[1,4],[2,5],[3,6]]
Expected: [[1,6]]
```

### Files
- [`Main.java`](Main.java) - Complete solution with optimized merge algorithm

---
*Problem solved on LeetCode! Efficient interval merging achieved! 🚀*