## Day 21 - Problem 2: A. Bit++ ✅

### Problem Description

Implement an interpreter for the Bit++ programming language, which has exactly one variable `x` and two operations:

- **Operation `++`**: Increases the value of variable x by 1
- **Operation `--`**: Decreases the value of variable x by 1

A statement consists of exactly one operation and one variable x, written as:
- `++x` or `x++` (both increment x)
- `--x` or `x--` (both decrement x)

Given a program with n statements, execute all statements starting with x = 0 and find the final value.

---

### Input

- First line: integer `n` (1 ≤ n ≤ 150) - number of statements
- Next n lines: each contains one statement (either `++x`, `x++`, `--x`, or `x--`)

---

### Output

- Print single integer: final value of variable x

---

### Examples

**Input 1:**
```
1
++x
```

**Output 1:**
```
1
```

**Input 2:**
```
2
x++
--x
```

**Output 2:**
```
0
```

---

### Approach

**Key Insight**: Both `++x` and `x++` have the same effect (increment), and both `--x` and `x--` have the same effect (decrement). The difference between pre/post increment doesn't matter since we only care about the final value.

**Algorithm**:
1. Initialize x = 0
2. For each statement:
    - If it contains `++`: increment x
    - If it contains `--`: decrement x
3. Return final value of x

---

### Key Implementation Details

- Use `contains()` method to check for `++` or `--` in the statement
- No need to parse the exact position of operators
- Both pre and post increment/decrement have the same net effect

---

### Trace Through Examples

**Example 1:**
```
Initial: x = 0
Statement: "++x" → contains "++" → x = 0 + 1 = 1
Final: x = 1
```

**Example 2:**
```
Initial: x = 0
Statement 1: "x++" → contains "++" → x = 0 + 1 = 1
Statement 2: "--x" → contains "--" → x = 1 - 1 = 0
Final: x = 0
```

---

### Programming Language Concepts

**Pre vs Post Increment/Decrement**:
- `++x` (pre-increment): increment x, then use value
- `x++` (post-increment): use value, then increment x
- `--x` (pre-decrement): decrement x, then use value
- `x--` (post-decrement): use value, then decrement x

**Note**: Since we only care about the final value and don't use the intermediate results, pre and post operations have identical effects in this problem.

---

### Time and Space Complexity

- **Time Complexity:** O(n × m) where m is average statement length
- **Space Complexity:** O(1) - only using variables

---

### Sample Test Cases

```java
Input: 3 / ++x / x++ / x++
Output: 3 (three increments)

Input: 4 / ++x / --x / x++ / x--  
Output: 0 (two increments, two decrements)

Input: 1 / --x
Output: -1 (one decrement from 0)

Input: 5 / ++x / ++x / ++x / --x / --x
Output: 1 (three increments, two decrements)
```

---

### Alternative Implementation

```java
// More explicit parsing approach
if (statement.equals("++x") || statement.equals("x++")) {
    x++;
} else if (statement.equals("--x") || statement.equals("x--")) {
    x--;
}
```

Both approaches work, but using `contains()` is more concise.

---

### Files

* [`Main.java`](Main.java) — Java solution

---

🔢➕➖ *A simulation problem about programming language interpretation!*