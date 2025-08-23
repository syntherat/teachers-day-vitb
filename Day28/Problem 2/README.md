## Day 28 - Problem 2: A. Magic Numbers ✨

### Problem Description

A magic number is formed only by concatenating **1, 14, and 144** any number of times.  
Examples:  
- 14144 ✅  
- 141141 ✅  
- 1444 ❌ (not allowed)  
- 514 ❌  
- 414 ❌  

Given an integer `n`, determine if it is a magic number.

---

### Input
- An integer `n` (1 ≤ n ≤ 10^9), given as a string without leading zeros.

### Output
- Print `"YES"` if it is a magic number.  
- Print `"NO"` otherwise.

---

### Examples

**Input 1**
```

114114

```
**Output 1**
```

YES

```

**Input 2**
```

1111

```
**Output 2**
```

YES

```

**Input 3**
```

441231

```
**Output 3**
```

NO

```

---

### Approach

1. Traverse the string left to right.  
2. At each step, try to match:
   - `"144"` (highest priority)  
   - else `"14"`  
   - else `"1"`  
3. If none matches, print `"NO"`.  
4. If the whole string is covered, print `"YES"`.  

---

### Complexity
- **Time Complexity:** O(n)  
- **Space Complexity:** O(1)  

---

### Files
- `Main.java` — Java solution