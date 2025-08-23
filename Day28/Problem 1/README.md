## Day 28 - Problem 1: A. Little Elephant and Bits ✅

### Problem Description

The Little Elephant has an integer `a` written in binary.  
He must delete **exactly one digit** and write the remaining digits to maximize the resulting binary number.

---

### Input

* A binary string `a` (`2 ≤ |a| ≤ 10^5`) without leading zeroes.

---

### Output

* Print the maximum possible binary number (without leading zeros).

---

### Examples

**Input 1**
```

101

```
**Output 1**
```

11

```

**Input 2**
```

110010

```
**Output 2**
```

11010

```

---

### Approach

1. Traverse the string left to right.  
2. Delete the **first `0`** found.  
   - This increases the number because earlier digits are more significant.  
3. If no `0` exists (the string is all `1`s), remove the **last digit**.  

---

### Complexity

* **Time Complexity:** O(n)  
* **Space Complexity:** O(n)  

---

### Files

* `Main.java` — Java solution