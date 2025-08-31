## Day 35 - Problem 1: A. XXXXX ❌

### Problem Description

Ehab loves number theory but **hates a number `x`**.  
Given an array `a`, find the length of the **longest subarray** such that the **sum of its elements is NOT divisible by `x`**.

You may remove any number of elements from the beginning or the end of the array to form such a subarray.

---

### Input

- First line: Integer `t` — number of test cases (1 ≤ t ≤ 5)  
- For each test case:
  - Two integers `n` and `x` (1 ≤ n ≤ 10⁵, 1 ≤ x ≤ 10⁴)
  - A line of `n` integers `a₁, a₂, ..., aₙ` (0 ≤ aᵢ ≤ 10⁴)

---

### Output

- For each test case, print the **length of the longest subarray** whose sum is **not divisible** by `x`
- If such a subarray doesn't exist, print `-1`

---

### Examples

**Input**
```

3
3 3
1 2 3
3 4
3 4 2
2 2
2 6

```

**Output**
```

2
3
-1

```

---

### Approach

1. First, compute the **total sum** of the array.  
2. If the total sum is **not divisible by `x`**, the whole array is valid → print `n`
3. Otherwise:
   - Try removing minimal elements from the start (`left`) or end (`right`) to make the sum not divisible by `x`
   - Skip leading and trailing elements divisible by `x`
   - The result will be `n - min(left + 1, n - right)`
4. If all elements are divisible by `x` → print `-1`

---

### Complexity

- **Time Complexity:** O(n) per test case  
- **Space Complexity:** O(n)

---

### Files

- `Main.java` — Java implementation of the problem logic