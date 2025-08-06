## Day 11 - Problem 2: A. Word ✅

### Problem Description

Vasya noticed that many people write words with mixed cases (e.g., `HoUsE`) and wanted to fix it automatically.  
He created a rule:

- If the word contains **more uppercase letters**, convert the entire word to uppercase.
- Otherwise (including when counts are equal), convert it to lowercase.

---

### Input

- A single word `s` (1 ≤ |s| ≤ 100) — consists of uppercase and lowercase English letters.

---

### Output

- The corrected word according to Vasya’s rule.

---

### Examples

**Input 1:**

```

HoUse

```

**Output 1:**

```

house

```

**Input 2:**

```

ViP

```

**Output 2:**

```

VIP

```

**Input 3:**

```

maTRIx

```

**Output 3:**

```

matrix

````

---

### Approach

- Loop through each character of the string.
- Count the number of uppercase and lowercase letters.
- Compare the counts:
  - If uppercase > lowercase → output `toUpperCase()`
  - Else → output `toLowerCase()`

---

### Time and Space Complexity

- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

---

### Sample Test Cases

```java
// Case 1
Input: HeLLo
Output: hello

// Case 2
Input: PYThON
Output: PYTHON

// Case 3
Input: codE
Output: code
````

---

### Files

* [`Main.java`](Main.java) — Java implementation

---

✅ *Great problem for practicing string manipulation and character classification in Java.* 🚀