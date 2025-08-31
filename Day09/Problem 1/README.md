## Day 9 - Problem 1: A. Petya and Strings ✅

### Problem Description
Little Petya received two strings of equal length as a gift. He wants to compare them **lexicographically**, ignoring case sensitivity. Help Petya determine the result of comparing these two strings.

---

### Problem Requirements
- Two strings of equal length (`1 ≤ length ≤ 100`)
- Each string consists of uppercase and lowercase Latin letters
- Comparison must be **case-insensitive**
- Output:
  - `-1` if the first string is lexicographically less than the second
  - `1` if the first string is greater than the second
  - `0` if both strings are equal

---

### Examples

**Example 1:**
```

Input:
aaaa
aaaA

Output:
0

Explanation:
Both strings are equal when converted to lowercase.

```

**Example 2:**
```

Input:
abs
Abz

Output:
-1

Explanation:
After converting to lowercase: "abs" < "abz"

```

**Example 3:**
```

Input:
abcdefg
AbCdEfF

Output:
1

Explanation:
"abcdefg" > "abcdef" in lexicographical order

```

---

### Constraints
- Input strings are guaranteed to be the same length
- All characters are Latin letters (uppercase or lowercase)
- Time limit: 2 seconds
- Memory limit: 256 MB

---

### Solution

**Approach:** Case-insensitive Lexicographical Comparison

- **Time Complexity:** O(n), where `n` is the string length
- **Space Complexity:** O(1)

---

### Algorithm

1. Read the two strings from input.
2. Convert both strings to lowercase using `.toLowerCase()`.
3. Compare the strings using `.compareTo()`:
   - If result < 0 → print `-1`
   - If result > 0 → print `1`
   - If result == 0 → print `0`

---

### Edge Cases
```

Input:
A
a
Output: 0

Input:
a
z
Output: -1

Input:
zzzzz
aaaaa
Output: 1

````

---

### Test Cases
```java
// Test Case 1: Same strings, different case
Input:
Hello
hELLo
Output: 0

// Test Case 2: First string is smaller
Input:
abc
abd
Output: -1

// Test Case 3: First string is greater
Input:
zzz
aab
Output: 1
````

---

### Files

* [`Main.java`](Main.java) — Java implementation using string methods and simple logic

---

✅ *Another easy but elegant string problem solved! Lexicographic comparison made easy with Java’s built-in methods.* 📚