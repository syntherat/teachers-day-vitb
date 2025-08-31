## Day 31 - Problem 2: D. Constructing the Array 🧱

### Problem Description

You are given an array of size `n` filled with zeros.  
Perform `n` actions in which you always select the longest contiguous subsegment of zeros (leftmost in case of ties), and assign the current index `i` to the **middle** of that subsegment.

- If the segment length is **odd**, place `i` at the exact center
- If **even**, place `i` at the left-middle index

You repeat this `n` times until the array is fully filled.

---

### Input

- First line: `t` — number of test cases (1 ≤ t ≤ 10⁴)
- Each test case contains one integer `n` (1 ≤ n ≤ 2⋅10⁵)

**Total sum of all `n` in test cases ≤ 2⋅10⁵**

---

### Output

- For each test case, print the final array (after `n` actions)

---

### Example

**Input**
```

3
3
4
5

```

**Output**
```

2 1 3
2 1 3 4
3 1 2 4 5

```

---

### Approach

1. Use a **priority queue** (max heap) to always extract the largest zero segment (by length, then left index)
2. Compute the mid index of each segment
3. Place the current action number `i` at that mid
4. Push the left and right remaining segments back to the queue (if they exist)

---

### Complexity

- **Time Complexity:** O(n log n) per test case (due to heap operations)  
- **Space Complexity:** O(n) per test case

---

### Files

- `Main.java` — Java implementation of array construction using segment division