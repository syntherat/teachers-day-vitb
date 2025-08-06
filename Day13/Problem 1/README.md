## Day 13 - Problem 1: B. Drinks ✅

### Problem Description

Little Vasya loves orange juice. He has `n` drinks in his fridge, and each drink contains a percentage `pᵢ` of orange juice.

**Goal:**  
Vasya mixes equal proportions of each of the `n` drinks. Find the **volume fraction of orange juice** (in %) in the final cocktail.

---

### Input

- An integer `n` (1 ≤ n ≤ 100) — number of drinks
- A line of `n` integers `pᵢ` (0 ≤ pᵢ ≤ 100) — percentage of orange juice in each drink

---

### Output

- A single float: volume fraction (in %) of orange juice in the cocktail
- Must be accurate within `10⁻⁴`

---

### Examples

**Input 1:**
```

3
50 50 100

```
**Output 1:**
```

66.666666666667

```

**Input 2:**
```

4
0 25 50 75

```
**Output 2:**
```

37.500000000000

````

---

### Explanation

- Since all drinks are mixed in equal quantities, the total orange juice percentage is just the **average** of all `pᵢ`.

---

### Approach

1. Read integer `n`
2. Read `n` integers into a loop
3. Calculate the sum of all percentages
4. Output `sum / n` with high precision

---

### Time and Space Complexity

- **Time:** O(n)
- **Space:** O(1)

---

### Sample Test Case

```java
Input: 5, [20, 40, 60, 80, 100]
Output: 60.000000000000
````

---

### Files

* [`Main.java`](Main.java) — Java implementation

---

✅ *A simple and elegant problem that reinforces averaging and precision printing in programming.* 🧃✨