
## Day 13 - Problem 2: A. Football ✅

### Problem Description

Petya loves football and represents player positions as a binary string:
- `'0'` → players of one team
- `'1'` → players of the other team

**A situation is dangerous** if **7 or more players of the same team** are standing **consecutively**.

---

### Input

- A binary string `s` (length ≤ 100) containing only `0` and `1`
- There's at least one `0` and one `1`

---

### Output

- Print `"YES"` if the situation is **dangerous**
- Print `"NO"` otherwise

---

### Examples

**Input 1:**
```

001001

```
**Output 1:**
```

NO

```

**Input 2:**
```

1000000001

```
**Output 2:**
```

YES

````

---

### Approach

1. Read the input string
2. Check if it contains `"0000000"` or `"1111111"`
3. Output `"YES"` if found, else `"NO"`

---

### Time and Space Complexity

- **Time:** O(n) (string scanning)
- **Space:** O(1) (no extra space used)

---

### Sample Test Case

```java
Input: 11111110
Output: YES
````

---

### Files

* [`Main.java`](Main.java) — Java solution

---

✅ *A great problem to practice pattern recognition and string matching.* ⚽