## Day 12 - Problem 2: A. Stones on the Table ✅

### Problem Description

You are given `n` stones placed in a row. Each stone is either:
- Red (R)
- Green (G)
- Blue (B)

**Goal:** Remove the **minimum number of stones** such that **no two neighboring stones have the same color**.

---

### Input

- First line: integer `n` (1 ≤ n ≤ 50) — number of stones
- Second line: string `s` of length `n`, representing colors of stones

---

### Output

- Print a single integer — minimum number of stones to remove.

---

### Examples

**Input 1:**
```

3
RRG

```
**Output 1:**
```

1

```

**Input 2:**
```

5
RRRRR

```
**Output 2:**
```

4

```

**Input 3:**
```

4
BRBG

```
**Output 3:**
```

0

````

---

### Explanation

- You only need to count how many **consecutive** same-colored stones there are.
- Each such occurrence means **one stone must be removed**.

---

### Approach

1. Read integer `n` and string `s`
2. Traverse the string from the second character
3. Compare each stone to the one before it
4. If they’re the same, increment a counter
5. Output the counter at the end

---

### Time and Space Complexity

- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

---

### Sample Test Case

```java
Input: 6, RRGGBB
Output: 2
// Remove 1 R and 1 G → result: RGBB → remove 1 B → final: RGB
// Total = 3
````

---

### Files

* [`Main.java`](Main.java) — Java implementation

---

✅ *Excellent string traversal and counting problem. Great for beginners to understand greedy removal strategy.* 🚀