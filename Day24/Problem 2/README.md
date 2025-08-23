## Day 24 - Problem 2: A. Xenia and Divisors ✅

### Problem Description

Xenia has a sequence of `n` integers (`n` divisible by 3, each ≤ 7).
She wants to split them into groups of 3 `(a, b, c)` such that:

* `a < b < c`
* `a` divides `b`
* `b` divides `c`

We need to partition the sequence into `n/3` valid groups or print `-1` if impossible.

---

### Input

* First line: integer `n` (3 ≤ n ≤ 99999), divisible by 3.
* Second line: `n` integers ≤ 7.

---

### Output

* If possible: print `n/3` groups of three numbers each, in increasing order.
* If impossible: print `-1`.

---

### Examples

**Input 1:**

```
6
1 1 2 2 2 2
```

**Output 1:**

```
-1
```

---

**Input 2:**

```
6
2 2 1 1 4 6
```

**Output 2:**

```
1 2 4
1 2 6
```

---

### Explanation

Valid triplets are restricted because of the divisor rules:

* `(1, 2, 4)`
* `(1, 2, 6)`
* `(1, 3, 6)`

No other triplets work.

---

### Approach

1. Count occurrences of numbers from 1–7.
2. Greedily form valid groups in this priority:

    * `(1,2,4)`
    * `(1,2,6)`
    * `(1,3,6)`
3. If at any point a required number is missing → output `-1`.
4. If after grouping, leftovers remain → output `-1`.
5. Otherwise, print all formed groups.

---

### Complexity

* **Time Complexity:** O(n) (just counts and grouping).
* **Space Complexity:** O(1) (fixed size frequency array).

---

### Files

* [`Main.java`](Main.java) — Java solution

---

✅ And with this, you now have 6 solid competitive programming problems solved!