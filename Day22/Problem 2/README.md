## Day 22 - Problem 2: A. Valera and Plates ✅

### Problem Description

Valera has `m` clean bowls and `k` clean plates.
He plans meals for the next `n` days, eating exactly one dish each day.

* **Type 1 dish**: must be eaten from a bowl.
* **Type 2 dish**: can be eaten from either a bowl or a plate.

When Valera finishes eating, he leaves a dirty bowl/plate behind. He cannot eat from dirty ones, so if there are no suitable clean dishes available, he must **wash one**.

Find the **minimum number of washes** Valera needs to do over `n` days.

---

### Input

* First line: three integers `n`, `m`, `k` (1 ≤ n, m, k ≤ 1000)
* Second line: `n` integers `a₁, a₂, …, aₙ` (1 ≤ aᵢ ≤ 2)

    * If `aᵢ = 1`: type 1 dish (bowl required)
    * If `aᵢ = 2`: type 2 dish (bowl or plate)

---

### Output

* Print a single integer: the **minimum number of washes**.

---

### Examples

**Input 1:**

```
3 1 1
1 2 1
```

**Output 1:**

```
1
```

**Input 2:**

```
4 3 1
1 1 1 1
```

**Output 2:**

```
1
```

**Input 3:**

```
3 1 2
2 2 2
```

**Output 3:**

```
0
```

**Input 4:**

```
8 2 2
1 2 1 2 1 2 1 2
```

**Output 4:**

```
4
```

---

### Approach

**Key Insight**:
Type 1 dishes **must** use bowls.
Type 2 dishes **prefer plates first** (to save bowls for when they are strictly needed).

**Algorithm**:

1. For each day:

    * If dish = 1:

        * Use bowl if available, else wash.
    * If dish = 2:

        * Prefer plate if available, else bowl if available, else wash.
2. Keep count of washes.

---

### Key Implementation Details

* Always allocate **plates for type 2 dishes first**.
* Increment `washes` only when no suitable clean dish is available.
* Works in **O(n)** time with simple greedy logic.

---

### Trace Through Examples

**Example 1: n=3, m=1, k=1, dishes={1,2,1}**

```
Day 1: dish=1 → use bowl (m=0)
Day 2: dish=2 → use plate (k=0)
Day 3: dish=1 → no bowls left → wash++
Total washes = 1
```

Result: `1` ✓

**Example 3: n=3, m=1, k=2, dishes={2,2,2}**

```
Day 1: dish=2 → use plate (k=1)
Day 2: dish=2 → use plate (k=0)
Day 3: dish=2 → use bowl (m=0)
Total washes = 0
```

Result: `0` ✓

---

### Time and Space Complexity

* **Time Complexity:** O(n)
* **Space Complexity:** O(1)

---

### Files

* [`Main.java`](Main.java) — Java solution

---

🍽️ *A greedy resource allocation problem balancing bowls and plates efficiently!*