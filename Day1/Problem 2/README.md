## Day 1 - Problem 2: Remove Linked List Elements ✅

### Problem Description
Given the `head` of a linked list and an integer `val`, remove all the nodes of the linked list that has `Node.val == val`, and return *the new head*.

### Examples

**Example 1:**
```
Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]
```

**Example 2:**
```
Input: head = [], val = 1
Output: []
```

**Example 3:**
```
Input: head = [7,7,7,7], val = 7
Output: []
```

### Constraints
- The number of nodes in the list is in the range [0, 10⁴].
- 1 ≤ Node.val ≤ 50
- 0 ≤ val ≤ 50

### Solution

**Approach:** Dummy Node with Two Pointers
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

**Algorithm:**
1. Create a dummy node pointing to the head to handle edge cases uniformly
2. Use two pointers: `prev` (last kept node) and `curr` (current examining node)
3. For each node:
    - If `curr.val == val`: Remove by setting `prev.next = curr.next`
    - If `curr.val != val`: Keep by moving `prev = curr`
    - Always advance `curr = curr.next`
4. Return `dummy.next` as the new head

**Key Insight:** The dummy node eliminates the need for special handling when the head itself needs to be removed.

**Visual Walkthrough:**
```
Initial: dummy -> 1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6 (val = 6)
         prev     curr

Step 1:  dummy -> 1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6 (keep 1)
                  prev curr

Step 2:  dummy -> 1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6 (keep 2)
                       prev curr

Step 3:  dummy -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 (remove 6)
                       prev    curr

Result:  dummy -> 1 -> 2 -> 3 -> 4 -> 5
```

### Performance
![LeetCode Submission Result](https://github.com/syntherat/teachers-day-vitb/blob/main/Day1/Problem2/img.png)

**Stats:**
- ✅ **Accepted**
- **Runtime:** 1ms (Beats 93.47%)
- **Memory:** 45.43 MB (Beats 82.09%)

### Files
- [`Main.java`](Main.java) - Complete runnable solution with test cases

---
*Problem solved on LeetCode - Day 1 of the Teacher's Day coding challenge! 🚀*