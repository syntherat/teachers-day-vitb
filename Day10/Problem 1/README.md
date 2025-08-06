## Day 10 - Problem 1: A. Nearly Lucky Number ✅

### Problem Description
Petya loves lucky numbers — numbers composed only of digits **4** and **7**.

He defines a number as **"nearly lucky"** if the **count of lucky digits in it** is either **4 or 7**.

---

### Problem Input
- A single integer `n` (1 ≤ n ≤ 10^18)
- Input must be read as a string to avoid overflow.

---

### Problem Output
- Print `"YES"` if the count of lucky digits (4 and 7) in `n` is 4 or 7.
- Otherwise, print `"NO"`.

---

### Examples

**Example 1:**
```

Input:
40047

Output:
NO

```
**Explanation:** Lucky digits: 4, 4, 7 → count = 3 → Not 4 or 7 → ❌

---

**Example 2:**
```

Input:
7747774

Output:
YES

```
**Explanation:** Lucky digits count = 7 → ✅

---

**Example 3:**
```

Input:
1000000000000000000

Output:
NO

````
**Explanation:** No lucky digits → ❌

---

### Approach

- Convert number to string.
- Count how many digits are `'4'` or `'7'`.
- If count is 4 or 7, it's nearly lucky.

---

### Algorithm

1. Read input as string.
2. Initialize `luckyCount = 0`.
3. Loop through each digit:
   - If digit is `'4'` or `'7'`, increment `luckyCount`.
4. Check if `luckyCount == 4 || luckyCount == 7`.
5. Print `YES` or `NO`.

---

### Time and Space Complexity

- **Time:** O(d), where d = number of digits (max 18)
- **Space:** O(1)

---

### Sample Test Cases

```java
// Case 1
Input: 44444444
Output: YES

// Case 2
Input: 123456789
Output: NO

// Case 3
Input: 474747
Output: NO
````

---

### Files

* [`Main.java`](Main.java) — Full working Java solution

---

✅ *A neat combination of strings and digit logic! Keep going — you're crushing these Codeforces A problems! 💪*