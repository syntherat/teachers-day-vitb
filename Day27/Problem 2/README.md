## Day 27 - Problem 2: B. Pashmak and Flowers ✅

### Problem Description

Parmida wants a pair of flowers whose **beauty difference** is as large as possible.  
Given `n` flowers with beauty values `b1, b2, ..., bn`, find:

1. The maximum possible beauty difference.  
2. The number of ways to choose such pairs.  

Two ways are different if there is at least one flower chosen in one way and not the other.

---

### Input

* First line: integer `n` (`2 ≤ n ≤ 2*10^5`)  
* Second line: `n` integers `b1, b2, ..., bn` (`1 ≤ bi ≤ 10^9`)

---

### Output

* Print two integers:  
  1. Maximum beauty difference  
  2. Number of pairs with this difference  

---

### Examples

**Input 1**
```

2
1 2

```
**Output 1**
```

1 1

```

**Input 2**
```

3
1 4 5

```
**Output 2**
```

4 1

```

**Input 3**
```

5
3 1 2 3 1

```
**Output 3**
```

2 4

```

---

### Approach

1. Find `min` and `max` of the array.  
2. The maximum difference = `max - min`.  
3. Count how many flowers have `min` (`cntMin`) and how many have `max` (`cntMax`).  
   * If `max == min`, then all flowers have the same beauty.  
     * The number of ways = `n choose 2 = n*(n-1)/2`.  
   * Otherwise, the number of ways = `cntMin * cntMax`.  

---

### Complexity

* **Time Complexity:** O(n)  
* **Space Complexity:** O(1)  

---

### Files

* `Main.java` — Java solution