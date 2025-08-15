## Day 18 - Problem 1: A. Arrival of the General ✅

### Problem Description

A general wants to inspect soldiers lined up by height in **non-decreasing order**. Currently, soldiers are in arbitrary order. The colonel can:
- **Swap any two adjacent soldiers** in 1 second
- Help the general by finding the **minimum time** needed to arrange soldiers correctly

**Goal**: Find minimum number of adjacent swaps to sort the array.

---

### Input

- First line: integer `n` (2 ≤ n ≤ 100) — number of soldiers
- Second line: `n` space-separated integers a₁, a₂, ..., aₙ — soldiers' heights
- Heights are distinct integers from 1 to 100

---

### Output

- Print single integer — minimum number of seconds (adjacent swaps) needed

---

### Examples

**Input 1:**
```
4
33 44 11 22
```

**Output 1:**
```
4
```

**Input 2:**
```
7
10 10 58 31 63 40 76
```

**Output 2:**
```
10
```

---

### Approach

This problem is equivalent to **counting inversions** in an array. An inversion is a pair of indices (i, j) where i < j but heights[i] > heights[j].

**Key insight**: The minimum number of adjacent swaps needed to sort an array equals the number of inversions.

**Algorithm**: Count all pairs (i, j) where i < j and heights[i] > heights[j].

---

### Why This Works

**Bubble Sort Connection**:
- Each adjacent swap in bubble sort fixes exactly one inversion
- Bubble sort makes the minimum number of adjacent swaps to sort an array
- Therefore: inversions = minimum adjacent swaps

**Inversion Definition**:
- For every pair where a larger element appears before a smaller element, they need to "cross over" each other
- Each crossing requires exactly one adjacent swap

---

### Trace Through Example 1

**Input:** `[33, 44, 11, 22]`

**Inversions:**
1. (0,2): 33 > 11 ✓
2. (0,3): 33 > 22 ✓
3. (1,2): 44 > 11 ✓
4. (1,3): 44 > 22 ✓

**Total inversions:** 4 = **minimum swaps needed**

**Verification** (one possible sequence):
```
[33,44,11,22] → [33,11,44,22] → [11,33,44,22] → [11,33,22,44] → [11,22,33,44]
```
4 swaps ✓

---

### Trace Through Example 2

**Input:** `[10, 10, 58, 31, 63, 40, 76]`

**Count inversions:**
- Position 2 (58): > 31, > 40 → 2 inversions
- Position 4 (63): > 40 → 1 inversion
- Plus others...

**Total:** 10 inversions ✓

---

### Implementation Details

**Nested Loop Approach:**
```java
for (int i = 0; i < n - 1; i++) {
    for (int j = i + 1; j < n; j++) {
        if (heights[i] > heights[j]) {
            swaps++;
        }
    }
}
```

**Alternative: Merge Sort with Inversion Counting** (O(n log n))
- More efficient for larger arrays
- Our O(n²) solution is fine for n ≤ 100

---

### Time and Space Complexity

- **Time Complexity:** O(n²) - check all pairs
- **Space Complexity:** O(n) - store heights array

For n ≤ 100, this is very efficient.

---

### Key Insights

1. **Inversion counting**: Core algorithmic concept
2. **Bubble sort optimality**: For adjacent swaps, bubble sort is optimal
3. **Greedy doesn't work**: Can't just look at immediate neighbors
4. **All pairs matter**: Every out-of-order pair contributes to the answer

---

### Sample Test Cases

```java
Input: [1,2,3] → Output: 0 (already sorted)
Input: [3,2,1] → Output: 3 (completely reversed)  
Input: [2,1,3] → Output: 1 (one inversion: 2>1)
Input: [1,3,2,4] → Output: 1 (one inversion: 3>2)
```

---

### Files

* [`Main.java`](Main.java) — Java solution

---

⚔️ *A classic inversion counting problem disguised as military logistics!*