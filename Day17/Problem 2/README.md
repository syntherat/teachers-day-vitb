## Day 17 - Problem 2: A. Cheap Travel ✅

### Problem Description

Ann needs to make exactly `n` subway rides and wants to minimize cost. She can buy:
- **Regular tickets**: `a` rubles for 1 ride
- **Special m-ride tickets**: `b` rubles for m rides (can buy multiple)

Find the **minimum total cost** to make exactly n rides.

**Note:** She can use more than n rides if it's cheaper (e.g., if she needs 5 rides but 10-ride tickets are very cheap).

---

### Input

- Single line with four integers: `n`, `m`, `a`, `b` (1 ≤ n, m, a, b ≤ 1000)
    - `n`: number of rides needed
    - `m`: rides per special ticket
    - `a`: cost per regular ticket
    - `b`: cost per m-ride ticket

---

### Output

- Print single integer — minimum cost in rubles

---

### Examples

**Input 1:**
```
6 2 1 2
```

**Output 1:**
```
6
```

**Input 2:**
```
5 2 2 3
```

**Output 2:**
```
8
```

---

### Approach

**Try all possible combinations** of m-ride tickets from 0 to the maximum needed:

1. For each possible number of m-ride tickets (0 to ⌈n/m⌉):
    - Calculate rides covered by m-ride tickets
    - Calculate remaining rides needed (can be 0 if over-covered)
    - Calculate total cost = (m-ride tickets × b) + (remaining rides × a)
    - Track minimum cost

**Key insight:** Sometimes it's cheaper to buy extra rides with m-ride tickets than to buy individual tickets.

---

### Trace Through Examples

**Example 1:** n=6, m=2, a=1, b=2

- **0 m-ride tickets**: 0×2 + 6×1 = 6 rubles
- **1 m-ride ticket**: 1×2 + 4×1 = 6 rubles
- **2 m-ride tickets**: 2×2 + 2×1 = 6 rubles
- **3 m-ride tickets**: 3×2 + 0×1 = 6 rubles (covers 6 rides exactly)

**Minimum:** 6 ✓

**Example 2:** n=5, m=2, a=2, b=3

- **0 m-ride tickets**: 0×3 + 5×2 = 10 rubles
- **1 m-ride ticket**: 1×3 + 3×2 = 9 rubles
- **2 m-ride tickets**: 2×3 + 1×2 = 8 rubles
- **3 m-ride tickets**: 3×3 + 0×2 = 9 rubles (covers 6 rides, 1 wasted)

**Minimum:** 8 ✓

---

### Algorithm Details

**Upper bound for m-ride tickets:**
```java
maxMTickets = (n + m - 1) / m  // This is ceil(n/m)
```

**Cost calculation:**
```java
ridesFromMTickets = mTickets * m
remainingRides = max(0, n - ridesFromMTickets)
cost = mTickets * b + remainingRides * a
```

---

### Alternative Approaches

**Approach 1: Three specific cases**
```java
int option1 = n * a;  // All regular tickets
int option2 = ((n + m - 1) / m) * b;  // Just enough m-ride tickets  
int option3 = (n / m) * b + (n % m) * a;  // Mix optimally
return min(option1, option2, option3);
```

**Our approach is more comprehensive** and handles all edge cases naturally.

---

### Time and Space Complexity

- **Time Complexity:** O(n/m) - try at most ⌈n/m⌉ + 1 combinations
- **Space Complexity:** O(1) - only use a few variables

---

### Edge Cases

- **m-ride tickets are very expensive**: Use all regular tickets
- **Regular tickets are very expensive**: Use only m-ride tickets (even if wasteful)
- **n < m**: Either n regular tickets or 1 m-ride ticket
- **Perfect division**: n is multiple of m

---

### Sample Test Cases

```java
Input: 1 10 5 20 → Output: 5 (1 regular ticket vs 1 m-ride ticket)
Input: 10 3 1 2 → Output: 8 (3 m-ride tickets + 1 regular = 3×2 + 1×1)
Input: 4 2 3 5 → Output: 10 (2 m-ride tickets = 2×5, vs 4×3=12)
```

---

### Files

* [`Main.java`](Main.java) — Java solution

---

🚇 *A classic optimization problem with multiple ticket types!*