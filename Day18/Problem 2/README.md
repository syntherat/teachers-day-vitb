## Day 18 - Problem 2: A. Word Capitalization ✅

### Problem Description

**Capitalize a word** by making the first letter uppercase while keeping all other letters unchanged.

**Important**: Only the first letter changes to uppercase - all other letters remain exactly as they were in the input.

---

### Input

- Single line containing a **non-empty word**
- Word consists of lowercase and uppercase English letters
- Word length will not exceed 10³

---

### Output

- Output the word after capitalization (first letter uppercase, rest unchanged)

---

### Examples

**Input 1:**
```
ApPLe
```

**Output 1:**
```
ApPLe
```

**Input 2:**
```
konjac
```

**Output 2:**
```
Konjac
```

---

### Approach

**Simple String Manipulation**:
1. Get the first character and convert it to uppercase
2. Get the rest of the string (from index 1 onwards) unchanged
3. Concatenate them together

**Key insight**: We don't need to modify anything except the first character.

---

### Implementation

```java
String capitalized = Character.toUpperCase(word.charAt(0)) + word.substring(1);
```

**Breakdown**:
- `word.charAt(0)`: Get first character
- `Character.toUpperCase()`: Convert to uppercase
- `word.substring(1)`: Get rest of string from index 1
- `+`: Concatenate the parts

---

### Trace Through Examples

**Example 1:** Input = `"ApPLe"`
- First char: 'A' → `Character.toUpperCase('A')` = 'A'
- Rest: `"pPLe"`
- Result: `"A" + "pPLe"` = `"ApPLe"` ✓

**Example 2:** Input = `"konjac"`
- First char: 'k' → `Character.toUpperCase('k')` = 'K'
- Rest: `"onjac"`
- Result: `"K" + "onjac"` = `"Konjac"` ✓

---

### Edge Cases

**Single character word:**
```java
Input: "a" → Output: "A"
Input: "Z" → Output: "Z"
```

**Already capitalized:**
```java
Input: "Hello" → Output: "Hello" (no change needed)
```

**Mixed case:**
```java
Input: "hELLo" → Output: "HELLo" (only first letter changed)
```

---

### Alternative Approaches

**Approach 1: Character Array**
```java
char[] chars = word.toCharArray();
chars[0] = Character.toUpperCase(chars[0]);
return new String(chars);
```

**Approach 2: StringBuilder**
```java
StringBuilder sb = new StringBuilder(word);
sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
return sb.toString();
```

**Our approach is the most concise and readable.**

---

### Time and Space Complexity

- **Time Complexity:** O(n) - where n is the length of the word (for substring creation)
- **Space Complexity:** O(n) - for the new string created

---

### Key Java Methods Used

- `charAt(index)`: Get character at specific position
- `Character.toUpperCase(char)`: Convert character to uppercase
- `substring(startIndex)`: Get substring from startIndex to end
- String concatenation with `+`

---

### Sample Test Cases

```java
Input: "programming" → Output: "Programming"
Input: "JAVA" → Output: "JAVA"  
Input: "a" → Output: "A"
Input: "CoDeFoRcEs" → Output: "CoDeFoRcEs"
Input: "x" → Output: "X"
```

---

### Files

* [`Main.java`](Main.java) — Java solution

---

📝 *A straightforward string manipulation problem perfect for practicing basic Java string methods!*