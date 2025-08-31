## Day 29 - Problem 2: A. Domino 🎲

### Problem Description

Valera has `n` dominoes in a row. Each domino has two halves — an upper and a lower half — each containing a number from 1 to 6.  
Valera wants the **sum of the upper halves** and the **sum of the lower halves** to both be even.

He can rotate any domino (swap its upper and lower values) in 1 second. Your task is to find the **minimum time** (number of rotations) required to make both sums even. If it's impossible, print `-1`.

---

### Input

- First line: an integer `n` (1 ≤ n ≤ 100) — number of dominoes  
- Next `n` lines: two integers `xᵢ` and `yᵢ` (1 ≤ xᵢ, yᵢ ≤ 6) — upper and lower values of each domino

---

### Output

- Print a single integer: the **minimum number of rotations** required  
- If it’s impossible to make both sums even, print `-1`

---

### Examples

**Input**
```

2
4 2
6 4

```
**Output**
```

0

```

**Input**
```

1
2 3

```
**Output**
```

-1

```

**Input**
```

3
1 4
2 3
4 4

```
**Output**
```

1

```

---

### Approach

1. Compute the total of all upper and lower values.
2. If both sums are even → No need to rotate → print 0
3. If both sums are odd:
   - We need to rotate one domino where upper is odd and lower is even (or vice versa) → print 1
   - If no such domino exists → impossible → print -1
4. All other combinations are impossible → print -1

---

### Complexity

- **Time Complexity:** O(n)  
- **Space Complexity:** O(1)

---

### Files

- `Main.java` — Java implementation