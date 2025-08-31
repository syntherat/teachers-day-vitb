## Day 3 - Problem 1: Top K Frequent Elements ✅

### Problem Description
Given an integer array `nums` and an integer `k`, return *the* `k` *most frequent elements*. You may return the answer in **any order**.

### Examples

**Example 1:**

```
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
```

**Example 2:**

```
Input: nums = [1], k = 1
Output: [1]
```

### Constraints
- 1 ≤ nums.length ≤ 10⁵
- -10⁴ ≤ nums[i] ≤ 10⁴
- k is in the range [1, the number of unique elements in the array].
- It is **guaranteed** that the answer is **unique**.

### Solution

**Approach:** Hash Map + Min-Heap (Priority Queue)
- **Time Complexity:** O(n log k)
- **Space Complexity:** O(n + k)

**Algorithm:**
1. **Count Frequencies:** Use a HashMap to count the frequency of each element
2. **Min-Heap Construction:** Use a PriorityQueue (min-heap) to maintain the k most frequent elements
3. **Heap Management:** 
   - For each unique element, add it to the heap
   - If heap size exceeds k, remove the element with minimum frequency
   - This ensures we keep only the k most frequent elements
4. **Extract Results:** Poll all elements from the heap to get the final result

**Key Insight:** Using a min-heap of size k is more memory-efficient than sorting all elements, especially when k is much smaller than the number of unique elements.

**Visual Walkthrough:**
```
Input: nums = [1,1,1,2,2,3], k = 2

Step 1: Count frequencies
HashMap: {1→3, 2→2, 3→1}

Step 2: Build min-heap of size k=2
- Add (3,1): heap = [(3,1)]
- Add (2,2): heap = [(3,1), (2,2)]
- Add (1,3): heap = [(2,2), (1,3)], remove (3,1)

Step 3: Extract result
Result: [2, 1] (or [1, 2] - any order)
```

### Performance
![LeetCode Submission Result](https://github.com/syntherat/teachers-day-vitb/blob/main/Day3/Problem%201/img.png)

**Stats:**
- ✅ **Accepted** (22/22 test cases passed)
- **Runtime:** 13ms (Beats 76.46%)
- **Memory:** 48.81 MB (Beats 44.70%)

### Files
- [`Main.java`](Main.java) - Complete solution with test cases

---
*Problem solved on LeetCode! 🚀*