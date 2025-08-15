## Day 19 - Problem 1: A. Night at the Museum ✅

### Problem Description

Grigoriy works as a night security guard at a museum with a special device called **Embosser**:
- A **circular wheel** with lowercase English letters a-z arranged in order
- A **pointer** that can rotate clockwise or counterclockwise
- Initially points to letter **'a'**
- For each letter in a given name, find minimum rotations needed to reach it
- Calculate the **total minimum rotations** required to print the entire name

---

### Input

- Single line containing a **non-empty string** (max 100 characters)
- String consists of only **lowercase English letters**

---

### Output

- Print one integer — **minimum total rotations** needed

---

### Examples

**Input 1:**
```
zeus
```

**Output 1:**
```
18
```

**Input 2:**
```
map
```

**Output 2:**
```
35
```

**Input 3:**
```
ares
```

**Output 3:**
```
34
```

---

### Approach

**Circular Distance Calculation**: For each character, calculate the minimum distance between current position and target position on a circle of 26 letters.

**Key Formula**: For positions on a circle of size 26:
- **Clockwise distance**: `(target - current + 26) % 26`
- **Counterclockwise distance**: `(current - target + 26) % 26`
- **Minimum**: `min(clockwise, counterclockwise)`

---

### Algorithm

1. Start at position 0 (letter 'a')
2. For each character in the string:
    - Convert character to position: `c - 'a'`
    - Calculate clockwise and counterclockwise distances
    - Add minimum distance to total rotations
    - Update current position to target position
3. Return total rotations

---

### Trace Through Example 1: "zeus"

**Starting position**: 'a' (position 0)

1. **'z' (position 25)**:
    - Clockwise: (25 - 0 + 26) % 26 = 25
    - Counterclockwise: (0 - 25 + 26) % 26 = 1 ← **minimum**
    - Total: 1, Current: 25

2. **'e' (position 4)**:
    - Clockwise: (4 - 25 + 26) % 26 = 5 ← **minimum**
    - Counterclockwise: (25 - 4 + 26) % 26 = 21
    - Total: 1 + 5 = 6, Current: 4

3. **'u' (position 20)**:
    - Clockwise: (20 - 4 + 26) % 26 = 16 ← **minimum**
    - Counterclockwise: (4 - 20 + 26) % 26 = 10
    - Total: 6 + 10 = 16, Current: 20

4. **'s' (position 18)**:
    - Clockwise: (18 - 20 + 26) % 26 = 24
    - Counterclockwise: (20 - 18 + 26) % 26 = 2 ← **minimum**
    - Total: 16 + 2 = 18

**Final result**: 18 ✓

---

### Why the Formula Works

**Circular Arithmetic**:
- Adding 26 handles negative numbers (ensures positive result)
- Modulo 26 handles overflow (keeps result in range 0-25)
- Works for any circular arrangement

**Example**: From position 2 to position 24
- Clockwise: (24 - 2) = 22 steps
- Counterclockwise: (2 - 24 + 26) = 4 steps ← shorter!

---

### Key Insights

1. **Always choose shorter path**: Between clockwise and counterclockwise
2. **Circular distance**: Use modular arithmetic for wraparound
3. **Greedy approach**: Each character independently uses minimum rotations
4. **Position tracking**: Update current position after each character

---

### Time and Space Complexity

- **Time Complexity:** O(n) - process each character once
- **Space Complexity:** O(1) - only use a few variables

---

### Edge Cases

- **Single character**: Distance from 'a' to target
- **Same character repeated**: 0 rotations for repeats
- **Adjacent letters**: 1 rotation
- **Opposite letters**: 13 rotations (halfway around circle)

---

### Sample Test Cases

```java
Input: "a" → Output: 0 (already at 'a')
Input: "z" → Output: 1 (counterclockwise from 'a' to 'z')
Input: "az" → Output: 2 (0 + 1 + 1)  
Input: "abcdefghijklmnopqrstuvwxyz" → Output: 25 (one full clockwise rotation)
```

---

### Files

* [`Main.java`](Main.java) — Java solution

---

🎡 *A classic circular array problem with optimal pathfinding!*