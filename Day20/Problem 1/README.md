## Day 20 - Problem 1: A. Park Lighting ✅

### Problem Description

Due to coronavirus pandemic, city authorities want citizens to maintain social distance. The mayor wants to light up Semyon's rectangular park at night to keep social distance.

The park is an n×m rectangular table where:
- Each cell represents a square that needs to be lit
- Streets (boundaries between cells) have length 1
- Lanterns can be placed in the middle of streets
- Each lantern lights **exactly 4 adjacent squares** (forming a + shape)

**Goal**: Find the minimum number of lanterns needed to light all squares in the park.

---

### Input

- First line: single integer `t` (1 ≤ t ≤ 10⁴) - number of test cases
- Next t lines: two integers `n, m` (1 ≤ n, m ≤ 10⁴) - park dimensions

---

### Output

- For each test case: print minimum number of lanterns required

---

### Examples

**Input:**
```
5
1 1
1 3
2 2
3 3
5 3
```

**Output:**
```
1
1
1
1
2
```

---

### Approach

The key insight is that we can place lanterns in a regular grid pattern where each lantern is optimally positioned to light 4 squares with minimal overlap.

**Optimal Pattern:**
- Place lanterns every 3 positions in both row and column directions
- This creates a pattern where each lantern lights a + shape of 4 squares
- Minimal overlap between adjacent lanterns

**Formula:**
```
lanterns = ceiling(n/3) × ceiling(m/3)
         = ((n + 2) / 3) × ((m + 2) / 3)  [using integer division]
```

---

### Key Implementation Details

- Use integer division with `(n + 2) / 3` to get ceiling of n/3
- Each lantern optimally covers 4 squares in a + pattern
- Regular 3×3 spacing ensures minimal waste

---

### Trace Through Examples

**Example 1: 1×1 park**
- `(1+2)/3 × (1+2)/3 = 1 × 1 = 1` lantern
- One lantern can light the single square ✓

**Example 2: 1×3 park**
- `(1+2)/3 × (3+2)/3 = 1 × 1 = 1` lantern
- One lantern placed optimally can light all 3 squares ✓

**Example 3: 3×3 park**
- `(3+2)/3 × (3+2)/3 = 1 × 1 = 1` lantern
- One centrally placed lantern can light all 9 squares ✓

**Example 4: 5×3 park**
- `(5+2)/3 × (3+2)/3 = 2 × 1 = 2` lanterns
- Need 2 lanterns to cover the 5×3 area ✓

---

### Visual Pattern

For larger parks, lanterns are placed in a grid pattern:
```
. L .   . L .   . L .
L + L   L + L   L + L  
. L .   . L .   . L .

. L .   . L .   . L .
L + L   L + L   L + L
. L .   . L .   . L .
```
Where L = lit square, + = lantern position, . = street

---

### Time and Space Complexity

- **Time Complexity:** O(t) - constant time per test case
- **Space Complexity:** O(1) - only using variables

---

### Sample Test Cases

```java
Input: 1 / 1 1
Output: 1 (single lantern for single square)

Input: 1 / 2 2  
Output: 1 (one lantern can cover 2×2)

Input: 1 / 4 4
Output: 2 (need 2×1 = 2 lanterns)

Input: 1 / 6 6
Output: 4 (need 2×2 = 4 lanterns)
```

---

### Files

* [`Main.java`](Main.java) — Java solution

---

💡🌃 *An optimization problem about efficient lighting coverage!*