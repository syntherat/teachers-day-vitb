## Day 2 - Problem 2: Same Tree ✅

### Problem Description
Given the roots of two binary trees `p` and `q`, write a function to check if they are the same or not.

Two binary trees are considered the same if they are **structurally identical**, and the nodes have the **same value**.

### Examples

**Example 1:**
```
Tree p:    1        Tree q:    1
          / \                 / \
         2   3               2   3

Input: p = [1,2,3], q = [1,2,3]
Output: true
```

**Example 2:**
```
Tree p:    1        Tree q:    1
          /                    \
         2                      2

Input: p = [1,2], q = [1,null,2]
Output: false
```

**Example 3:**
```
Tree p:    1        Tree q:    1
          / \                 / \
         2   1               1   2

Input: p = [1,2,1], q = [1,1,2]
Output: false
```

### Constraints
- The number of nodes in both trees is in the range `[0, 100]`
- `-10⁴ ≤ Node.val ≤ 10⁴`

### Solution

**Approach:** Recursive Depth-First Search (DFS)
- **Time Complexity:** O(min(m,n)) where m and n are the number of nodes in each tree
- **Space Complexity:** O(min(m,n)) due to recursion stack (worst case: height of tree)

**Algorithm:**
1. **Base Cases:**
    - If both nodes are `null` → return `true` (both trees ended)
    - If one is `null` and other isn't → return `false` (different structure)
    - If both exist but have different values → return `false`

2. **Recursive Case:**
    - If current nodes match, recursively check left and right subtrees
    - Return `true` only if both left subtrees AND right subtrees are identical

**Key Insight:** Two trees are the same if their roots match AND their left subtrees match AND their right subtrees match.

### Performance
![LeetCode Submission Result](https://github.com/syntherat/teachers-day-vitb/blob/main/Day2/Problem%202/img.png)

**Stats:**
- ✅ **Accepted**
- **Runtime:** 0ms (Beats 100.00%)
- **Memory:** 40.88 MB (Beats 93.73%)

### Files
- [`Main.java`](Main.java) - Complete runnable solution with test cases

### Related Topics
- **Tree Traversal**
- **Depth-First Search (DFS)**
- **Recursion**
- **Binary Tree**

### Difficulty Level
🟢 **Easy**

---
*Problem solved on LeetCode - Binary Tree fundamentals mastered! 🌳*