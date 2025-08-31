## Day 32 - Problem 2: A. Divisibility Problem ➗

### Problem Description

You are given two positive integers `a` and `b`.  
In **one move**, you can **increase `a` by 1**.  
Your task is to find the **minimum number of moves** required to make `a` divisible by `b`.

If `a` is already divisible by `b`, then the answer is `0`.

---

### Input

- First line: integer `t` (1 ≤ t ≤ 10⁴) — number of test cases  
- Next `t` lines: two integers `a` and `b` (1 ≤ a, b ≤ 10⁹)

---

### Output

- For each test case, print the **minimum number of moves** to make `a` divisible by `b`.

---

### Examples

**Input**
```

5
10 4
13 9
100 13
123 456
92 46

```

**Output**
```

2
5
4
333
0

```

---

### Approach

1. If `a % b == 0`, output `0`
2. Otherwise, output `b - (a % b)` to determine how many increments are needed to reach the next multiple of `b`

---

### Complexity

- **Time Complexity:** O(1) per test case  
- **Space Complexity:** O(1)

---

### Files

- `Main.java` — Java solution for the divisibility problem