## Day 24 - Problem 1: A. Jzzhu and Children ✅

### Problem Description

There are `n` children in Jzzhu’s school, each wants at least a certain number of candies.
Jzzhu distributes candies as follows:

1. The first child in line gets `m` candies.
2. If that child still hasn’t received enough candies, they go to the **end of the line**; otherwise, they leave.
3. Repeat until all children leave.

Your task: determine **which child will be the last one to leave**.

---

### Input

* First line: two integers `n` and `m` (1 ≤ n, m ≤ 100) — number of children and candies given each time.
* Second line: `n` integers `a1, a2, ..., an` (1 ≤ ai ≤ 100) — number of candies each child wants.

---

### Output

* Print the index (1-based) of the last child to leave.

---

### Examples

**Input 1:**

```
5 2
1 3 1 4 2
```

**Output 1:**

```
4
```

---

**Input 2:**

```
6 4
1 1 2 2 3 3
```

**Output 2:**

```
6
```

---

### Explanation

**Example 1 Walkthrough**:

* Child 1: gets 2 candies → leaves.
* Child 2: gets 2, still needs 1 → goes to end.
* Child 3: gets 2 → leaves.
* Child 4: gets 2, still needs 2 → goes to end.
* Child 5: gets 2 → leaves.
* Child 2: gets 2 → leaves.
* Child 4: gets 2 → leaves last.

Answer = 4.

---

### Approach

**Key Insight**:

* A child’s total rounds in the line = `ceil(ai / m)`.
* The last child is the one with the **maximum number of rounds**.
* If multiple children have the same max rounds, the one with the **largest index** is last.

**Algorithm**:

1. Read `n`, `m`, and candies array.
2. For each child `i`, compute `rounds = ceil(ai / m)`.
3. Track the last child with the maximum rounds.
4. Print that child’s index.

---

### Complexity

* **Time Complexity:** O(n) (just a single pass).
* **Space Complexity:** O(1) (only storing variables).

---

### Files

* [`Main.java`](Main.java) — Java solution

---

✅ Another queue simulation solved smartly by ceiling division!