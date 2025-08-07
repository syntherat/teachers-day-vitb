## Day 14 - Problem 2: A. Presents ✅

### Problem Description

Petya loves gifts. Each of his `n` friends gives **exactly one gift**, and each receives **exactly one gift**.

Given a list where the `i-th` element tells **who received the gift from friend `i`**, you need to reverse the mapping:
- For each friend `i`, determine **who gave the gift to friend `i`**.

---

### Input

- First line: integer `n` (1 ≤ n ≤ 100) — number of friends.
- Second line: `n` space-separated integers: `p₁ p₂ ... pₙ`, where `pᵢ` is the number of the friend who received the gift from friend `i`.

---

### Output

- Print `n` space-separated integers: the `i-th` number should equal the friend who gave a gift to friend `i`.

---

### Example

**Input**
```

4
2 3 4 1

```

**Output**
```

4 1 2 3

````

**Explanation:**

- Friend 1 gave gift to friend 2 → result[2] = 1
- Friend 2 gave gift to friend 3 → result[3] = 2
- Friend 3 gave gift to friend 4 → result[4] = 3
- Friend 4 gave gift to friend 1 → result[1] = 4

So, we reverse the mapping using array indexing.

---

### Approach

1. Initialize an array `result[n]`
2. For each index `i`, store:  
   `result[p[i] - 1] = i + 1`
3. Print the `result` array

---

### Time and Space Complexity

- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

---

### Sample Test Case

```java
Input:
3
3 1 2

Output:
2 3 1
````

---

### Files

* [`Main.java`](Main.java) — Java solution

---

🎁 *Simple reverse-mapping array trick — elegant and efficient!*