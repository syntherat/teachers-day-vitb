## Day 25 - Problem 2: A. Fox And Snake ✅

### Problem Description

You are given a grid of size `n × m`. You need to print a snake pattern where:

* Odd rows (`1, 3, 5, ...`) are completely filled with `#`.
* Even rows alternate:

    * If row number ≡ `2 (mod 4)` → `#` is at the **end** of the row.
    * If row number ≡ `0 (mod 4)` → `#` is at the **start** of the row.

All other cells should be filled with `.`.

---

### Input

* Two integers `n` and `m` (`3 ≤ n, m ≤ 50`).

---

### Output

* Print the grid containing the snake pattern.

---

### Examples

**Input 1:**

```
3 3
```

**Output 1:**

```
###
..#
###
```

**Input 2:**

```
3 4
```

**Output 2:**

```
####
...#
####
```

---

### Explanation

For `n = 3, m = 3`:

* Row 1 → `###`
* Row 2 → `..#` (since it’s row 2 → `#` goes to the right)
* Row 3 → `###`

This creates a snake-like path.

---

### Approach

1. Loop through each row from `1` to `n`.
2. If the row is odd → fill with all `#`.
3. If the row is even:

    * If row % 4 == 2 → `#` goes to the right end.
    * If row % 4 == 0 → `#` goes to the left end.
4. Print row by row.

---

### Complexity

* **Time Complexity:** O(n × m) (each cell printed once).
* **Space Complexity:** O(1).

---

### Files

* [`Main.java`](Main.java) — Java solution