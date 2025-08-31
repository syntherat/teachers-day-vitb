## Day 8 - Problem 1: A. Next Round ✅

### Problem Description

"Contestant who earns a score equal to or greater than the k-th place finisher's score will advance to the next round, as long as the contestant earns a positive score." — from the contest rules.

Given a list of participant scores in non-increasing order, determine how many contestants advance to the next round.

---

### Problem Requirements

* A total of `n` participants, each with a score.
* You are given an integer `k` (1-indexed), the k-th place finisher.
* A contestant advances if:

    * Their score is **≥ the score of the k-th place**.
    * Their score is **positive**.

Print the number of participants who advance.

---

### Examples

**Example 1:**

```
Input:
8 5
10 9 8 7 7 7 5 5

Output:
6

Explanation:
The 5th place score is 7. Everyone with score ≥ 7 and > 0 advances. There are 6 such contestants.
```

**Example 2:**

```
Input:
4 2
0 0 0 0

Output:
0

Explanation:
Even though all scores are equal to the 2nd place, they are not positive, so nobody advances.
```

---

### Constraints

* 1 ≤ k ≤ n ≤ 50
* 0 ≤ aᵢ ≤ 100 (where aᵢ is the score of the i-th contestant)
* Time limit: 3 seconds
* Memory limit: 256 MB

---

### Solution

**Approach:** Array Iteration with Conditions

* **Time Complexity:** O(n)
* **Space Complexity:** O(1)

---

### Algorithm

1. Parse inputs `n` and `k`.
2. Read the `n` scores in a non-increasing order.
3. Identify the `k-th` place score (`scores[k - 1]`).
4. Iterate through the scores:

    * Count participants with:

        * Score ≥ `k-th` score
        * Score > 0

---

### Mathematical Insight

* Since the array is sorted in **non-increasing** order:

    * All scores before index `k - 1` are ≥ `scores[k - 1]`.
    * So we simply iterate and count all such scores that meet both conditions.

---

### Edge Cases

```
n = 1, k = 1, scores = [0] → Output: 0
n = 3, k = 2, scores = [10, 0, 0] → Output: 1
n = 6, k = 3, scores = [100, 50, 50, 0, 0, 0] → Output: 3
```

---

### Test Cases

```java
// Test Case 1: General case
n = 8, k = 5, scores = [10, 9, 8, 7, 7, 7, 5, 5]
Expected: 6

// Test Case 2: No positive score
n = 4, k = 2, scores = [0, 0, 0, 0]
Expected: 0

// Test Case 3: All positive and equal
n = 5, k = 3, scores = [5, 5, 5, 5, 5]
Expected: 5

// Test Case 4: Mixed scores
n = 7, k = 4, scores = [10, 9, 9, 8, 7, 0, 0]
Expected: 5

// Test Case 5: Edge minimum
n = 1, k = 1, scores = [1]
Expected: 1
```

---

### Files

* [`Main.java`](Main.java) - Java implementation with constant space, linear time.

---

✅ *Another Codeforces problem solved! Simple condition-based filtering with attention to indexing. Let's go! 🚀*