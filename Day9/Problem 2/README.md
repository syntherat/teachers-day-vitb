## Day 9 - Problem 2: A. Team ✅

### Problem Description
Three best friends — Petya, Vasya, and Tonya — are taking part in a programming contest as a team. They will solve a problem only if **at least two of them** are sure about the solution.

You're given the confidence of each friend on each problem. Your task is to find out how many problems the team will solve.

---

### Problem Requirements
- `n` problems are given.
- For each problem, three integers are provided: one for each friend (1 means sure, 0 means unsure).
- The team will solve a problem **if the sum of the three values ≥ 2**.

---

### Examples

**Example 1:**
```

Input:
3
1 1 0
1 1 1
1 0 0

Output:
2

```

**Explanation:**
- Problem 1: Petya & Vasya sure → Taken ✅
- Problem 2: All sure → Taken ✅
- Problem 3: Only Petya sure → Not taken ❌

---

**Example 2:**
```

Input:
2
1 0 0
0 1 1

Output:
1

```

**Explanation:**
- Only Problem 2 has two friends confident.

---

### Constraints
- `1 ≤ n ≤ 1000`
- Each line has exactly 3 values (either 0 or 1)

---

### Solution

**Approach:** Simple Counting with Loop

- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

---

### Algorithm

1. Read integer `n` (number of problems)
2. For each of the `n` lines:
   - Read 3 integers (confidence of Petya, Vasya, Tonya)
   - If their sum is ≥ 2 → increment counter
3. Print the final counter

---

### Edge Cases
```

n = 1, input: 0 0 0 → Output: 0
n = 1, input: 1 1 1 → Output: 1
n = 3, input: 1 0 1, 0 1 1, 1 1 0 → Output: 3

````

---

### Test Cases
```java
// Test Case 1: All confident
Input:
1
1 1 1
Output: 1

// Test Case 2: None confident
Input:
1
0 0 0
Output: 0

// Test Case 3: Mixed
Input:
4
1 0 0
0 1 1
1 1 0
0 0 1
Output: 2
````

---

### Files

* [`Main.java`](Main.java) — Simple Java solution using basic loop and logic

---

✅ *Straightforward logic, just counting who knows enough to proceed. Another problem down in your Codeforces journey! 💻*
