## Day 32 - Problem 1: A. Gravity Flip 🧲

### Problem Description

Little Chris built a box of toy cubes. There are `n` columns, each column having a certain number of cubes stacked vertically. Initially, **gravity pulls down**.

When Chris **switches gravity**, it now **pulls all cubes to the right**, causing the configuration to "sort" itself — like cubes falling to the rightmost side of the box.

Your task is to **simulate the gravity flip** and print the new configuration.

---

### Input

- First line: integer `n` (1 ≤ n ≤ 100) — number of columns
- Second line: `n` integers `a₁, a₂, ..., aₙ` (1 ≤ aᵢ ≤ 100) — height of cubes in each column

---

### Output

- Print `n` integers: the heights of the columns **after gravity flips to the right**

---

### Examples

**Input**
```

4
3 2 1 2

```

**Output**
```

1 2 2 3

```

**Input**
```

3
2 3 8

```

**Output**
```

2 3 8

```

---

### Approach

1. Read the array of column heights
2. Simulate gravity flip → just **sort the array in non-decreasing order**
3. Print the result

---

### Complexity

- **Time Complexity:** O(n log n)  
- **Space Complexity:** O(1)

---

### Files

- `Main.java` — Java solution to simulate gravity flip