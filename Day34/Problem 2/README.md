## Day 28 - Problem 13: B. Pashmak and Flowers 🌸🌼

### Problem Description

You are given `n` flowers, each with a beauty value `bᵢ`.  
Pashmak wants to gift Parmida a pair of flowers such that:

1. The **difference of beauty** is maximized  
2. The **number of ways** to pick such a pair is counted

Two ways are **distinct** if the pairs `(i, j)` and `(k, l)` contain different flowers.

---

### Input

- Integer `n` (2 ≤ n ≤ 2⋅10⁵)  
- `n` integers `b₁, b₂, ..., bₙ` (1 ≤ bᵢ ≤ 10⁹)

---

### Output

- Print two numbers:
  - The **maximum beauty difference**
  - The **number of ways** to pick two flowers to achieve that difference

---

### Examples

**Input**
```

5
3 1 2 5 1

```

**Output**
```

4 2

```

---

### Explanation

- Max difference = 5 - 1 = 4  
- `1` appears twice, `5` appears once → ways = `2 × 1 = 2`

---

### Edge Case

If all flowers have the same beauty:  
- Max difference = 0  
- Ways = `nC2 = n * (n - 1) / 2`

---

### Approach

1. Loop through the array to:
   - Find `min`, `max`
   - Count how many times each occurs
2. Compute:
   - `maxDiff = max - min`
   - `ways = minCount × maxCount` (or `nC2` if all equal)

---

### Complexity

- **Time Complexity:** O(n)  
- **Space Complexity:** O(1)

---

### Files

- `Main.java` — Java solution to compute maximum beauty difference and valid pairs