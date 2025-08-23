## Day 23 - Problem 2: A. GukiZ and Contest ✅

### Problem Description

Professor GukiZ likes programming contests and wants to rank his students by their ratings.
Each student has a positive integer rating. After the contest, GukiZ expects that:

* A student with a **higher rating** always gets a **better (lower-numbered) position**.
* If two students have the **same rating**, they **share the same position**.

Formally, the position of student `i` is:

```
1 + (number of students with strictly higher rating than student i)
```

Your task is to print the final positions for all students in the order they appear in the input.

---

### Input

* The first line contains an integer `n` (1 ≤ n ≤ 2000) — the number of students.
* The second line contains `n` integers `a1, a2, ..., an` (1 ≤ ai ≤ 2000) — the ratings of the students.

---

### Output

* Print `n` integers: the final position of each student in the same order as given.

---

### Examples

**Input 1:**

```
3
1 3 3
```

**Output 1:**

```
3 1 1
```

---

**Input 2:**

```
1
1
```

**Output 2:**

```
1
```

---

**Input 3:**

```
5
3 5 3 4 5
```

**Output 3:**

```
4 1 4 3 1
```

---

### Approach

**Key Insight**:

* The rank of a student depends only on how many students have a strictly higher rating.
* For each student, we compute their position as:

  ```
  position = 1 + count of (ratings[j] > ratings[i])
  ```
* Since `n ≤ 2000`, a straightforward O(n²) solution works efficiently.

**Algorithm**:

1. Read `n` and ratings array.
2. For each student `i`, iterate through all others and count how many have a strictly higher rating.
3. Assign the final position = 1 + count.
4. Print positions in input order.

---

### Trace Through Example

**Example: n=3, ratings = \[1, 3, 3]**

* Student 1: rating=1 → 2 students have higher ratings → position=3.
* Student 2: rating=3 → 0 students higher → position=1.
* Student 3: rating=3 → 0 students higher → position=1.

Final Output = `3 1 1`

---

### Complexity

* **Time Complexity:** O(n²) (2000² = 4,000,000 comparisons, acceptable).
* **Space Complexity:** O(n) for storing results.

---

### Files

* [`Main.java`](Main.java) — Java solution

---

✅ Another clean ranking problem solved by direct counting!