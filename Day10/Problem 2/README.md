## Day 10 - Problem 2: A. Helpful Maths ✅

### Problem Description
Xenia is learning to add. She can only understand sums where numbers are arranged in **non-decreasing order**.

You are given a valid sum of digits `1`, `2`, and `3` connected by `+` signs (like `"3+2+1"`). Your task is to **rearrange** them so that the digits are in ascending order.

---

### Input
- A non-empty string `s` consisting of digits `1`, `2`, `3`, and the `'+'` character.
- Maximum length of `s` is 100.

---

### Output
- Print the rearranged sum in non-decreasing order of the digits.

---

### Examples

**Example 1:**
```

Input:
3+2+1

Output:
1+2+3

```

**Example 2:**
```

Input:
1+1+3+1+3

Output:
1+1+1+3+3

```

**Example 3:**
```

Input:
2

Output:
2

````

---

### Approach

- Split the string by `"+"` to extract digits.
- Sort the digits (as strings).
- Join the sorted digits back using `"+"`.

---

### Algorithm

1. Use `split("\\+")` to extract numbers from the input.
2. Use `Arrays.sort()` to sort the digits.
3. Use `String.join("+", sortedArray)` to reconstruct the sum.
4. Output the result.

---

### Time and Space Complexity

- **Time:** O(n log n), due to sorting (where n is the number of digits).
- **Space:** O(n)

---

### Sample Test Cases

```java
// Case 1
Input: 2+3+1
Output: 1+2+3

// Case 2
Input: 1+1+1
Output: 1+1+1

// Case 3
Input: 3+3+2+2+1+1
Output: 1+1+2+2+3+3
````

---

### Files

* [`Main.java`](Main.java) — Full working Java solution

---

✅ *Simple string manipulation with sorting. Great exercise for building Java basics! 🚀*