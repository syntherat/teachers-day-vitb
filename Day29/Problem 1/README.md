## Day 29 - Problem 1: A. Three Pairwise Maximums 🔢

### Problem Description

You are given three **positive integers** `x`, `y`, and `z`.  
Your task is to **find three integers** `a`, `b`, and `c` such that:

- `x = max(a, b)`
- `y = max(a, c)`
- `z = max(b, c)`

If it's possible to find such integers `a`, `b`, and `c`, print them. Otherwise, print `"NO"`.

---

### Input

- First line contains a single integer `t` — number of test cases (1 ≤ t ≤ 2⋅10⁴).  
- Each test case contains 3 integers: `x`, `y`, `z` (1 ≤ x, y, z ≤ 10⁹).

---

### Output

For each test case:

- Print `"YES"` and any valid integers `a`, `b`, `c` (1 ≤ a, b, c ≤ 10⁹) satisfying the conditions.  
- Or print `"NO"` if no such values exist.

---

### Examples

**Input**
```

5
3 2 3
100 100 100
50 45 49
10 20 30
1 1000000000 1000000000

```

**Output**
```

YES
3 2 1
YES
100 100 100
NO
NO
YES
1 1 1000000000

```

---

### Approach

1. Find the maximum among x, y, z.
2. If the maximum appears **at least twice**, it's possible to construct such a triplet.
3. Output `a = max`, and select the others as the minimums to satisfy the condition.
4. Otherwise, print `"NO"`.

---

### Complexity

- **Time Complexity:** O(1) per test case  
- **Space Complexity:** O(1)

---

### Files

- `Main.java` — Java solution for the problem