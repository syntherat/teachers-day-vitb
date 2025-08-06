## Day 11 - Problem 1: A. George and Accommodation ✅

### Problem Description

George and Alex are moving into a dormitory with `n` rooms. Each room already has `p_i` people living in it and can accommodate `q_i` people in total.  
We need to count how many rooms have **at least 2 free spots**, so both George and Alex can move in together.

---

### Input

- The first line contains a single integer `n` (1 ≤ n ≤ 100) — number of rooms.
- The next `n` lines contain two integers `p_i` and `q_i` (0 ≤ p_i ≤ q_i ≤ 100) — current number of people and total capacity.

---

### Output

- A single integer — the number of rooms that can accommodate both George and Alex.

---

### Examples

**Example 1:**

```

Input:
3
1 1
2 2
3 3

Output:
0

```

**Example 2:**

```

Input:
3
1 10
10 10
10 20

Output:
2

````

---

### Approach

- Iterate over each room.
- For each room, check if the available space `(q_i - p_i) >= 2`.
- Count the number of such rooms.

---

### Time and Space Complexity

- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

---

### Sample Test Cases

```java
// Case 1
Input:
4
0 3
2 3
1 2
2 4

Output:
2

// Case 2
Input:
1
0 1

Output:
0
````

---

### Files

* [`Main.java`](Main.java) — Full working Java code

---

✅ *Simple implementation with conditional logic. Great for beginners learning control structures and input handling.* 🚀