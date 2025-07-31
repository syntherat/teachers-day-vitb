## Day 6 - Problem 2: Reverse Linked List ✅

### Problem Description
Given the `head` of a singly linked list, reverse the list, and return the reversed list.

### Examples

**Example 1:**
```
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
```

**Example 2:**
```
Input: head = [1,2]
Output: [2,1]
```

**Example 3:**
```
Input: head = []
Output: []
```

### Constraints
- The number of nodes in the list is the range [0, 5000]
- -5000 ≤ Node.val ≤ 5000

### Solution

**Approach:** Iterative Three-Pointer Technique
- **Time Complexity:** O(n) - visit each node exactly once
- **Space Complexity:** O(1) - constant extra space

**Algorithm:**
1. **Initialize Pointers:** Set `prev = null`, `curr = head`
2. **Iterate Through List:** While current node exists
3. **Store Next:** Save `curr.next` before breaking the link
4. **Reverse Link:** Point `curr.next` to `prev`
5. **Move Pointers:** Advance `prev` and `curr` forward
6. **Return New Head:** `prev` becomes the new head

**Key Insight:** We need to reverse the direction of each `next` pointer. Use three pointers to keep track of previous, current, and next nodes to avoid losing references.

**Visual Walkthrough:**
```
Original: 1 -> 2 -> 3 -> 4 -> 5 -> null

Step 1: prev=null, curr=1, next=2
        null <- 1    2 -> 3 -> 4 -> 5 -> null

Step 2: prev=1, curr=2, next=3
        null <- 1 <- 2    3 -> 4 -> 5 -> null

Step 3: prev=2, curr=3, next=4
        null <- 1 <- 2 <- 3    4 -> 5 -> null

Step 4: prev=3, curr=4, next=5
        null <- 1 <- 2 <- 3 <- 4    5 -> null

Step 5: prev=4, curr=5, next=null
        null <- 1 <- 2 <- 3 <- 4 <- 5

Result: [5,4,3,2,1]
```

### Performance
![LeetCode Submission Result](https://github.com/syntherat/teachers-day-vitb/blob/main/Day6/Problem%202/img.png)

**Stats:**
- ✅ **Accepted** (28/28 test cases passed)
- **Runtime:** 0ms (Beats 100.00%)
- **Memory:** 13.23 MB (Beats 90.67%)

### Test Cases
```java
// Test Case 1: Multiple nodes
head = [1,2,3,4,5]
Expected: [5,4,3,2,1]

// Test Case 2: Two nodes
head = [1,2]
Expected: [2,1]

// Test Case 3: Empty list
head = []
Expected: []

// Test Case 4: Single node
head = [1]
Expected: [1]
```

### Files
- [`Main.java`](Main.java) - Optimal iterative solution with ListNode definition

---
*Problem solved on LeetCode! Linked list reversed efficiently! 🚀*