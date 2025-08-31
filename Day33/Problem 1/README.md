## Day 33 - Problem 1: A. Kefa and First Steps 📈

### Problem Description

Kefa runs a business for `n` days. On the `i-th` day he earns `aᵢ` money.  
He wants to find the **length of the longest non-decreasing subsegment** in his earnings list.

A subsegment is a **continuous** segment of the array.  
A subsegment is **non-decreasing** if for every `i`, `a[i] <= a[i+1]`.

---

### Input

- First line: integer `n` (1 ≤ n ≤ 10⁵)  
- Second line: `n` integers `a₁, a₂, ..., aₙ` (1 ≤ aᵢ ≤ 10⁹)

---

### Output

- Print a single integer — the **length of the longest non-decreasing subsegment**

---

### Examples

**Input**
```

6
2 2 1 3 4 1

```

**Output**
```

3

```

**Input**
```

3
2 2 9

```

**Output**
```

3

```

---

### Approach

1. Iterate through the array while tracking the current non-decreasing subsegment length.
2. If `a[i] >= a[i-1]`, extend the segment.
3. If `a[i] < a[i-1]`, reset the segment length.
4. Keep track of the maximum segment length encountered.

---

### Complexity

- **Time Complexity:** O(n)  
- **Space Complexity:** O(1)

---

### Files

- `Main.java` — Java solution that finds longest non-decreasing subsegment