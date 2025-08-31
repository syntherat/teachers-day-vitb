## Day 5 - Problem 2: Maximum Depth of Binary Tree ✅

### Problem Description
Given the `root` of a binary tree, return its maximum depth.

A binary tree's **maximum depth** is the number of nodes along the longest path from the root node down to the farthest leaf node.

### Examples

**Example 1:**
```
    3
   / \
  9   20
     /  \
    15   7

Input: root = [3,9,20,null,null,15,7]
Output: 3
```

**Example 2:**
```
Input: root = [1,null,2]
Output: 2
```

### Constraints
- The number of nodes in the tree is in the range [0, 10⁴]
- -100 ≤ Node.val ≤ 100

### Solution

**Approach:** Recursive Depth-First Search (DFS)
- **Time Complexity:** O(n) where n is the number of nodes
- **Space Complexity:** O(h) where h is the height of the tree (O(n) worst case for skewed tree)

**Algorithm:**
1. **Base Case:** If root is null, return 0 (empty tree has depth 0)
2. **Recursive Case:** Calculate depth of left and right subtrees
3. **Return:** 1 + maximum depth of left and right subtrees
4. **Key Insight:** The depth of a tree is 1 plus the maximum depth of its subtrees

**Visual Walkthrough:**
```
For tree [3,9,20,null,null,15,7]:

maxDepth(3):
├── maxDepth(9) → returns 1 (leaf node)
└── maxDepth(20):
    ├── maxDepth(15) → returns 1 (leaf node)  
    └── maxDepth(7) → returns 1 (leaf node)
    └── returns 1 + max(1,1) = 2
└── returns 1 + max(1,2) = 3

Final Result: 3
```

**Why This Works:**
- Each recursive call handles one level of the tree
- Base case handles empty subtrees (null nodes)
- We count nodes, not edges, so we add 1 for the current node
- Maximum of left/right ensures we get the longest path

### Performance
![LeetCode Submission Result](https://github.com/syntherat/teachers-day-vitb/blob/main/Day4/Problem%202/img.png)

**Stats:**
- ✅ **Accepted** (39/39 test cases passed)
- **Runtime:** 0ms (Beats 100.00%)
- **Memory:** 42.43 MB (Beats 88.32%)

### Test Cases
```java
// Test Case 1: Complete binary tree
root = [3,9,20,null,null,15,7]
Expected: 3

// Test Case 2: Right-skewed tree
root = [1,null,2]
Expected: 2

// Test Case 3: Empty tree
root = []
Expected: 0

// Test Case 4: Single node
root = [1]
Expected: 1

// Test Case 5: Left-skewed tree
root = [1,2,null,3,null,4,null]
Expected: 4
```

### Files
- [`Main.java`](Main.java) - Clean recursive solution with test cases

---
*Problem solved on LeetCode! Perfect runtime performance achieved! 🚀*