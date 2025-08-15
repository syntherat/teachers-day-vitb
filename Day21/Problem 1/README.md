## Day 21 - Problem 1: A. Even Odds ✅

### Problem Description

Volodya, being a nonconformist, is displeased with the natural order of numbers. He decides to rearrange them by creating a sequence where:

1. **First**: All odd integers from 1 to n (in ascending order)
2. **Then**: All even integers from 1 to n (in ascending order)

Given n and k, find what number will be at position k in Volodya's rearranged sequence.

---

### Input

- Single line: two integers `n` and `k` (1 ≤ k ≤ n ≤ 10¹²)

---

### Output

- Print the number at position k in Volodya's sequence

---

### Examples

**Input 1:**
```
10 3
```

**Output 1:**
```
5
```

**Input 2:**
```
7 7
```

**Output 2:**
```
6
```

---

### Approach

**Key Insight**: The sequence has two distinct sections:
1. **Odd section**: Contains all odd numbers from 1 to n
2. **Even section**: Contains all even numbers from 1 to n

**Algorithm**:
1. Calculate how many odd numbers exist from 1 to n: `oddCount = (n + 1) / 2`
2. If `k ≤ oddCount`: position k is in the odd section
    - The k-th odd number is: `2 * k - 1`
3. If `k > oddCount`: position k is in the even section
    - Position in even section: `evenPos = k - oddCount`
    - The evenPos-th even number is: `2 * evenPos`

---

### Key Implementation Details

- Use `long` data type for large inputs (up to 10¹²)
- Odd count formula: `(n + 1) / 2` handles both even and odd n correctly
- Direct mathematical calculation avoids building the actual sequence

---

### Trace Through Examples

**Example 1: n=10, k=3**
```
Sequence: {1, 3, 5, 7, 9, 2, 4, 6, 8, 10}
oddCount = (10 + 1) / 2 = 5
k=3 ≤ 5, so it's in odd section
3rd odd number = 2 * 3 - 1 = 5
```
Result: `5` ✓

**Example 2: n=7, k=7**
```
Sequence: {1, 3, 5, 7, 2, 4, 6}
oddCount = (7 + 1) / 2 = 4
k=7 > 4, so it's in even section
evenPos = 7 - 4 = 3
3rd even number = 2 * 3 = 6
```
Result: `6` ✓

---

### Pattern Analysis

**For any n:**
- **Odd numbers**: 1, 3, 5, 7, 9, ... (formula: 2i - 1 for i-th odd)
- **Even numbers**: 2, 4, 6, 8, 10, ... (formula: 2i for i-th even)

**Count of odds from 1 to n:**
- If n is odd: (n + 1) / 2 odd numbers
- If n is even: n / 2 odd numbers
- Combined formula: (n + 1) / 2 using integer division

---

### Time and Space Complexity

- **Time Complexity:** O(1) - constant time calculation
- **Space Complexity:** O(1) - only using variables

---

### Sample Test Cases

```java
Input: 1 1
Output: 1 (only one odd number)

Input: 6 4
Output: 1 (sequence: {1,3,5,2,4,6}, 4th position is 2... wait, that's wrong)

Let me recalculate:
n=6, sequence: {1,3,5,2,4,6}
oddCount = (6+1)/2 = 3
k=4 > 3, so even section
evenPos = 4-3 = 1  
1st even = 2*1 = 2

Input: 5 5
Output: 4 (sequence: {1,3,5,2,4}, 5th position is 4)

Input: 100 50
Output: 99 (50th position in sequence of 100 numbers)
```

---

### Files

* [`Main.java`](Main.java) — Java solution

---

🔢🔀 *A number theory problem about sequence rearrangement and positional access!*