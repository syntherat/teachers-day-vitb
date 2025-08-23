## Day 22 - Problem 1: A. Kefa and First Steps ✅

### Problem Description

Kefa wants to know the length of the **maximum non-decreasing subsegment** in a sequence of integers.
A subsegment is a continuous part of the sequence, and it is considered **non-decreasing** if every next number is greater than or equal to the previous one.

---

### Input

* First line: integer `n` (1 ≤ n ≤ 10⁵)
* Second line: `n` integers `a₁, a₂, …, aₙ` (1 ≤ aᵢ ≤ 10⁹)

---

### Output

* Print a single integer: the length of the longest non-decreasing subsegment.

---

### Examples

**Input 1:**

```
6
2 2 1 3 4 1
```

**Output 1:**

```
3
```

**Input 2:**

```
3
2 2 9
```

**Output 2:**

```
3
```

---

### Approach

**Key Insight**:
We only need to track the current length of a non-decreasing sequence and update the maximum whenever it breaks.

**Algorithm**:

1. Initialize `maxLen = 1`, `currLen = 1`
2. Iterate over the array:

    * If `a[i] >= a[i-1]`: extend current subsegment → `currLen++`
    * Else: reset → `currLen = 1`
3. Update `maxLen` with the maximum found.
4. Print `maxLen`.

---

### Key Implementation Details

* Use `long` for storing input numbers (`aᵢ ≤ 10⁹`)
* Works in **O(n)** time with **O(1)** extra space.

---

### Trace Through Examples

**Example 1: n=6, a={2,2,1,3,4,1}**

```
Step through:
2 -> 2 (non-decreasing) → currLen=2
2 -> 1 (decrease) → reset currLen=1
1 -> 3 (non-decreasing) → currLen=2
3 -> 4 (non-decreasing) → currLen=3
4 -> 1 (decrease) → reset currLen=1
maxLen = 3
```

Result: `3` ✓

**Example 2: n=3, a={2,2,9}**

```
2 -> 2 → currLen=2
2 -> 9 → currLen=3
maxLen = 3
```

Result: `3` ✓

---

### Time and Space Complexity

* **Time Complexity:** O(n)
* **Space Complexity:** O(1)

---

### Files

* [`Main.java`](Main.java) — Java solution

---

📈 *A simple array traversal problem that tracks non-decreasing subsegments efficiently!*