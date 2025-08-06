## Day 12 - Problem 1: A. Boy or Girl ✅

### Problem Description

A user on the internet wants to determine the gender of another user based on the uniqueness of characters in their username.

**Rule:**
- If the number of **distinct characters** in the username is **odd**, assume it's a **boy** → `IGNORE HIM!`
- If the number is **even**, assume it's a **girl** → `CHAT WITH HER!`

---

### Input

- A single string `s` (1 ≤ |s| ≤ 100), containing only **lowercase** English letters.

---

### Output

- If user is considered female → print `CHAT WITH HER!`
- If user is considered male → print `IGNORE HIM!`

---

### Examples

**Input 1:**
```

wjmzbmr

```
**Output 1:**
```

CHAT WITH HER!

```

**Input 2:**
```

xiaodao

```
**Output 2:**
```

IGNORE HIM!

```

**Input 3:**
```

sevenkplus

```
**Output 3:**
```

CHAT WITH HER!

````

---

### Approach

- Use a `HashSet<Character>` to store all distinct characters.
- The size of the set gives the number of distinct characters.
- Apply modulus check to determine output.

---

### Time and Space Complexity

- **Time Complexity:** O(n)
- **Space Complexity:** O(k), where k is number of distinct characters (max 26 for lowercase letters)

---

### Sample Test Cases

```java
// Case 1
Input: abcabc
Output: CHAT WITH HER!

// Case 2
Input: abcdefg
Output: IGNORE HIM!
````

---

### Files

* [`Main.java`](Main.java) — Java solution for the problem.

---

✅ *Great beginner-level string + set problem for practicing logic-based decisions.* 🚀