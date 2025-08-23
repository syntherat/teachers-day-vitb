## Day 25 - Problem 1: B. Tavas and SaDDas ✅

### Problem Description

A **lucky number** is a number consisting only of digits `4` and `7`.
Examples: `4, 47, 744` are lucky; `5, 17, 467` are not.

Given a lucky number `n`, find its **1-based index** in the sorted list of all lucky numbers.

---

### Input

* A single lucky number `n` (`1 ≤ n ≤ 10^9`).

---

### Output

* Print the index of `n` among all lucky numbers.

---

### Examples

**Input 1:**

```
4
```

**Output 1:**

```
1
```

**Input 2:**

```
7
```

**Output 2:**

```
2
```

**Input 3:**

```
77
```

**Output 3:**

```
6
```

---

### Explanation

Lucky numbers form a sequence sorted as:

```
4, 7, 44, 47, 74, 77, 444, ...
```

* `4` is 1st
* `7` is 2nd
* `77` is 6th

---

### Approach

1. Count how many lucky numbers exist with fewer digits.

    * With `i` digits, there are `2^i` lucky numbers.
2. Treat the given lucky number as a **binary string**:

    * `4 → 0`
    * `7 → 1`
3. Compute its binary value (offset within numbers of same length).
4. Add to count and shift to 1-based index.

---

### Complexity

* **Time Complexity:** O(d), where `d = number of digits` (≤ 10).
* **Space Complexity:** O(1).

---

### Files

* [`Main.java`](Main.java) — Java solution

---

That’s another **classic Codeforces binary trick problem** solved ✅