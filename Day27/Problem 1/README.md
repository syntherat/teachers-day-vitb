## Day 27 - Problem 1: A. Lucky Sum of Digits ✅

### Problem Description

A **lucky number** uses only digits `4` and `7`.  
Given an integer `n`, print the **minimum lucky number** whose digit sum equals `n`, or `-1` if impossible.

---

### Input

* Single integer `n` (`1 ≤ n ≤ 10^6`).

---

### Output

* The minimum such lucky number, or `-1`.

---

### Examples

**Input 1**
```

11

```
**Output 1**
```

47

```

**Input 2**
```

10

```
**Output 2**
```

-1

```

---

### Approach

1. The smallest number is the one with the **fewest digits**.
2. To minimize digits, use as many `7`s as possible.  
   Find the largest `cnt7` such that `n - 7*cnt7` is non-negative and divisible by `4`.
3. Let `cnt4 = (n - 7*cnt7) / 4`.  
   The minimal number is `"4"*cnt4 + "7"*cnt7` (placing all `4`s before `7`s yields the smallest among equal-length numbers).
4. If no such `cnt7` exists, print `-1`.

---

### Complexity

* **Time:** `O(n / 7)`  
* **Space:** `O(1)`

---

### Files

* `Main.java` — Java solution