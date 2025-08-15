## Day 15 - Problem 2: B. Queue at the School ✅

### Problem Description

During a school break, children form a queue where:
- Boys ('B') feel awkward standing in front of girls ('G')
- Every second, if a boy is directly in front of a girl, they swap positions
- Determine the queue arrangement after `t` seconds

**Rule**: At time x, if position i has a boy and position (i+1) has a girl, they swap places.

---

### Input

- First line: two integers `n` and `t` (1 ≤ n, t ≤ 50)
    - `n`: number of children in queue
    - `t`: time in seconds
- Second line: string `s` representing initial arrangement
    - 'B' = boy, 'G' = girl

---

### Output

- Print string representing the queue arrangement after `t` seconds

---

### Examples

**Input 1:**
```
5 1
BGGBG
```

**Output 1:**
```
GBGBG
```

**Input 2:**
```
5 2
BGGBG
```

**Output 2:**
```
GGBBG
```

**Input 3:**
```
4 1
BBGG
```

**Output 3:**
```
BBGG
```

---

### Approach

1. For each second from 1 to t:
    - Scan through the queue from left to right
    - If position i has 'B' and position i+1 has 'G', swap them
    - **Important**: Skip the next position after swapping to avoid double-processing
2. Convert final character array back to string

---

### Key Implementation Details

- Use `char[]` for efficient character swapping
- **Critical**: After swapping at position i, increment i by 1 extra to skip position i+1
- This prevents the same pair from being processed twice in one time step

---

### Trace Through Example 1

Initial: `BGGBG`

**Time 1:**
- i=0: B-G pair → swap → `GBGBG`, skip to i=2
- i=2: G-B pair → no swap
- i=3: B-G pair → swap → `GBGGB`, skip to end

Result: `GBGBG` ✓

---

### Time and Space Complexity

- **Time Complexity:** O(n × t) - scan n positions for t seconds
- **Space Complexity:** O(n) - character array storage

---

### Sample Test Cases

```java
Input: 3 1 / BBG
Output: BBG (no B-G pairs to swap)

Input: 3 1 / BGB  
Output: GBB (B-G at positions 0-1 swap)

Input: 6 3 / BBBGGG
Output: GGGBBB (boys gradually move right)
```

---

### Files

* [`Main.java`](Main.java) — Java solution

---

🚶‍♂️🚶‍♀️ *A simulation problem about queue dynamics and careful iteration!*