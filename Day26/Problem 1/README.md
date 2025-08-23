## Day 26 - Problem 1: B. BerSU Ball ✅

### Problem Description

The Berland State University is hosting a ballroom dance in celebration of its 100500-th anniversary!  
There are `n` boys and `m` girls, each with a known **dancing skill**.  

We want to form pairs of one boy and one girl such that the **difference in their dancing skills is at most 1**.  
The task is to find the **maximum possible number of pairs**.

---

### Input

* The first line contains an integer `n (1 ≤ n ≤ 100)` — number of boys.  
* The second line contains `n` integers `a1, a2, ..., an (1 ≤ ai ≤ 100)` — boys' skills.  
* The third line contains an integer `m (1 ≤ m ≤ 100)` — number of girls.  
* The fourth line contains `m` integers `b1, b2, ..., bm (1 ≤ bj ≤ 100)` — girls' skills.  

---

### Output

* Print a single integer — the **maximum number of pairs** that can be formed.

---

### Examples

**Input 1:**
```

4
1 4 6 2
5
5 1 5 7 9

```

**Output 1:**
```
3
```

**Input 2:**
```
4
1 2 3 4
4
10 11 12 13
```

**Output 2:**
```
0
```

**Input 3:**
```
5
1 1 1 1 1
3
1 2 3
```

**Output 3:**
```
2
```

---

### Explanation

* In the first example, the optimal pairs are `(1,1)`, `(2,1)`, and `(6,7)`.  
* In the second example, no pair can be formed because skill differences are too large.  
* In the third example, two pairs can be made, e.g., `(1,1)` and `(1,2)`.

---

### Approach

1. Sort both the boys' and girls' skill arrays.  
2. Use a **two-pointer greedy approach**:
   * Compare the current boy and girl.
   * If their skill difference ≤ 1, pair them and move both pointers.
   * Otherwise, move the pointer of the smaller skill forward.  
3. Count and print the number of valid pairs.

---

### Complexity

* **Time Complexity:** O(n log n + m log m) (due to sorting).  
* **Space Complexity:** O(1).  

---

### Files

* [`Main.java`](Main.java) — Java solution