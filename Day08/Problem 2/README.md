## Day 8 - Problem 2: A. Beautiful Matrix ✅

### Problem Description
You’re given a 5×5 matrix consisting of 24 zeros and a single number one. A matrix is considered **beautiful** if the '1' is located at the center of the matrix (row 3, column 3 using 1-based indexing).

You are allowed to perform the following transformations:
1. Swap two neighboring rows.
2. Swap two neighboring columns.

Determine the **minimum number of moves** required to make the matrix beautiful.

---

### Problem Requirements
- Matrix size: 5 x 5
- Only one cell contains a `1`, rest are `0`
- A valid move is either:
  - Swapping two adjacent rows
  - Swapping two adjacent columns
- Output the minimum number of moves to bring the `1` to the center of the matrix

---

### Examples

**Example 1:**
```

Input:
0 0 0 0 0
0 0 0 0 0
0 1 0 0 0
0 0 0 0 0
0 0 0 0 0

Output:
1

```

**Example 2:**
```

Input:
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 1 0 0
0 0 0 0 0

Output:
1

```

**Example 3:**
```

Input:
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 1
0 0 0 0 0

Output:
3

```

---

### Constraints
- Only one `1` in the matrix
- Time limit: 2 seconds
- Memory limit: 256 MB

---

### Solution

**Approach:** Manhattan Distance

- **Time Complexity:** O(1) — constant time, since input is always 5x5
- **Space Complexity:** O(1)

---

### Algorithm

1. Iterate through each cell in the 5x5 matrix.
2. When `1` is found at position `(i, j)` (0-indexed):
   - Calculate moves needed = `|i - 2| + |j - 2|`
   - This is the **Manhattan Distance** to the center `(2, 2)`
3. Output the result.

---

### Edge Cases
```

If 1 is already at the center → Output: 0
If 1 is at a corner → Output: 4 (2 row moves + 2 column moves)
If 1 is one step away → Output: 1

````

---

### Test Cases
```java
// Test Case 1: 1 is already in center
Input:
0 0 0 0 0
0 0 0 0 0
0 0 1 0 0
0 0 0 0 0
0 0 0 0 0
Output: 0

// Test Case 2: 1 is in top-left
Input:
1 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
Output: 4

// Test Case 3: 1 is at (3,4)
Input:
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 1
0 0 0 0 0
Output: 3
````

---

### Files

* [`Main.java`](Main.java) — Java solution using Manhattan Distance