## Day 16 - Problem 1: B. Xenia and Ringroad ✅

### Problem Description

Xenia lives in a city with houses arranged in a **circular ringroad**:
- Houses are numbered 1 through n in clockwise order
- House n connects back to house 1 (forming a circle)
- Moving between adjacent houses takes 1 unit of time
- Xenia starts at house 1 and must complete tasks at specific houses **in the given order**
- Find the minimum time needed to complete all tasks

---

### Input

- First line: two integers `n` and `m` (2 ≤ n ≤ 10⁵, 1 ≤ m ≤ 10⁵)
    - `n`: number of houses on the ringroad
    - `m`: number of tasks
- Second line: m integers a₁, a₂, ..., aₘ (1 ≤ aᵢ ≤ n)
    - Houses where Xenia needs to complete tasks (in order)

---

### Output

- Print a single integer — the minimum time needed to complete all tasks

---

### Examples

**Input 1:**
```
4 3
3 2 3
```

**Output 1:**
```
6
```

**Input 2:**
```
4 3
2 3 3
```

**Output 2:**
```
2
```

---

### Approach

Since houses are arranged in a **circle** and Xenia must visit them **in the given order**, she should always move **clockwise** (as going counter-clockwise would take longer or the same time).

**Key Formula:**
For moving from house `current` to house `next` on a circular ringroad with n houses:
```
clockwise_distance = (next - current + n) % n
```

**Why this formula works:**
- If `next > current`: normal distance is `next - current`
- If `next < current`: we go around the circle = `n - current + next = (next - current + n)`
- The `% n` handles both cases uniformly

---

### Step-by-Step Solution

1. Start at house 1
2. For each task house in sequence:
    - Calculate clockwise distance using the formula
    - Add to total time
    - Update current position
3. Return total time

---

### Trace Through Example 1

**Input:** n=4, tasks=[3,2,3]

- Start at house 1
- Go to house 3: `(3-1+4) % 4 = 6 % 4 = 2` units
- Go to house 2: `(2-3+4) % 4 = 3 % 4 = 3` units
- Go to house 3: `(3-2+4) % 4 = 5 % 4 = 1` unit

**Total:** 2 + 3 + 1 = 6 ✓

---

### Trace Through Example 2

**Input:** n=4, tasks=[2,3,3]

- Start at house 1
- Go to house 2: `(2-1+4) % 4 = 5 % 4 = 1` unit
- Go to house 3: `(3-2+4) % 4 = 5 % 4 = 1` unit
- Go to house 3: `(3-3+4) % 4 = 4 % 4 = 0` units (already there!)

**Total:** 1 + 1 + 0 = 2 ✓

---

### Time and Space Complexity

- **Time Complexity:** O(m) - process each task once
- **Space Complexity:** O(1) - only use a few variables

---

### Key Insights

- **Circular arithmetic**: Use `(next - current + n) % n` for clockwise distance
- **Always clockwise**: Since we must visit in order, clockwise is always optimal
- **Handle wraparound**: The formula automatically handles going from house n to house 1

---

### Files

* [`Main.java`](Main.java) — Java solution

---

🏠➡️ *A classic circular array problem with modular arithmetic!*