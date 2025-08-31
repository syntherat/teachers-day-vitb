## Day 30 - Problem 2: A. Captain Flint and Crew Recruitment ⚓

### Problem Description

Captain Flint is recruiting new crew members. A sailor is considered worthy **if they can express a given number `n` as the sum of four different positive integers**, **at least three of which are “nearly prime”**.

#### Nearly Prime:
A number is nearly prime if it can be expressed as:
- `p * q`, where `1 < p < q` and both `p` and `q` are prime numbers.

Example nearly primes: 6 (2×3), 10 (2×5), 15 (3×5), etc.

---

### Input

- First line: integer `t` (1 ≤ t ≤ 1000) — number of test cases  
- Next `t` lines: each contains one integer `n` (1 ≤ n ≤ 2⋅10⁵)

---

### Output

For each test case:

- Print `"YES"` followed by four **distinct positive integers** that sum to `n` and at least 3 are nearly prime  
- Print `"NO"` if no such combination exists

---

### Examples

**Input**
```

7
7
22
31
36
44
100
258

```

**Output**
```

NO
NO
YES
14 10 6 1
YES
5 6 10 15
YES
6 7 10 21
YES
2 10 33 55
YES
10 21 221 6

```

---

### Approach

- Use base nearly prime numbers: `6, 10, 14`
- Their sum = `30`, so we assume `n = 6 + 10 + 14 + (n - 30)`
- If `n - 30` is different from `6, 10, 14`, we can directly print them with `n - 30`
- Otherwise, to ensure **distinctness**, use alternate sets like `6, 10, 15` or `6, 10, 21`

Special values like `n = 36, 40, 44` are adjusted to avoid duplication.

---

### Complexity

- **Time Complexity:** O(1) per test case  
- **Space Complexity:** O(1)

---

### Files

- `Main.java` — Java implementation for Captain Flint problem