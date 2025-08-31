## Day 3 - Problem 2: Invert Binary Tree ✅

### Problem Description
Given the `root` of a binary tree, invert the tree, and return *its root*.

### Examples

**Example 1:**
```
Input: root = [4,2,7,1,3,6,9]
Output: [4,7,2,9,6,3,1]
```

**Example 2:**
```
Input: root = [2,1,3]
Output: [2,3,1]
```

**Example 3:**
```
Input: root = []
Output: []
```

### Constraints
- The number of nodes in the tree is in the range [0, 100].
- -100 ≤ Node.val ≤ 100

### Solution

**Approach:** Recursive Tree Traversal with Child Swapping
- **Time Complexity:** O(n)
- **Space Complexity:** O(h) where h is the height of the tree

**Algorithm:**
1. **Base Case:** If the current node is null, return null
2. **Swap Children:** Exchange the left and right children of the current node
3. **Recursive Calls:** Recursively invert the left and right subtrees
4. **Return Root:** Return the current node (which is now inverted)

**Key Insight:** Inverting a binary tree means creating a mirror image by swapping left and right children at every node. This can be done efficiently with a simple recursive approach.

**Visual Walkthrough:**
```
Original Tree:        Inverted Tree:
4                     4
/ \                   / \
2   7        →        7   2
/ \ / \               / \ / \
1  3 6  9             9  6 3  1

Step 1: At node 4, swap children 2↔7
Step 2: At node 7, swap children 6↔9  
Step 3: At node 2, swap children 1↔3
Step 4: Leaf nodes (1,3,6,9) have no children to swap
```

### Performance
![LeetCode Submission Result](https://github.com/syntherat/teachers-day-vitb/blob/main/Day3/Problem%202/img.png)

**Stats:**
- ✅ **Accepted** (77/77 test cases passed)
- **Runtime:** 0ms (Beats 100.00%)
- **Memory:** 41.16 MB (Beats 62.77%)

### TreeNode Definition
```java
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
```

### Test Cases
```java
// Test Case 1: [4,2,7,1,3,6,9] → [4,7,2,9,6,3,1]
// Test Case 2: [2,1,3] → [2,3,1]  
// Test Case 3: [] → []
```

### Files
- [`Main.java`](Main.java) - Complete solution with TreeNode definition and test cases

---
*Problem solved on LeetCode! Perfect 100% runtime performance! 🚀*