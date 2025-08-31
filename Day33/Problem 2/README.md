## Day 33 - Problem 2: B. BerSU Ball 💃🕺

### Problem Description

At Berland State University, boys and girls are practicing for a ballroom dance.  
Each boy and girl has a dancing skill level. A boy and girl can form a pair **if their skill levels differ by at most 1**.

Your task is to find the **maximum number of such valid pairs**.

---

### Input

- First line: integer `n` (1 ≤ n ≤ 100) — number of boys  
- Second line: `n` integers — boys' dancing skills  
- Third line: integer `m` (1 ≤ m ≤ 100) — number of girls  
- Fourth line: `m` integers — girls' dancing skills

---

### Output

- Print a single number — maximum number of pairs that can be formed

---

### Example

**Input**
```

4
1 4 6 2
5
5 1 5 7 9

```

**Output**
```

3

```

---

### Approach

1. Sort both boys and girls' skill arrays
2. Use two pointers `i` and `j` to iterate through both arrays
3. If `abs(boys[i] - girls[j]) <= 1` → pair them and increment both
4. Otherwise, move the pointer for the smaller value forward
5. Count the total pairs formed

---

### Complexity

- **Time Complexity:** O(n log n + m log m) for sorting  
- **Space Complexity:** O(1)

---

### Files

- `Main.java` — Java implementation for maximum pairing based on skill levels