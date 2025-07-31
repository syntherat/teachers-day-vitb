## Day 7 - Problem 1: A. Watermelon ✅

### Problem Description
Pete and Billy want to divide a watermelon into two parts such that each part weighs an even number of kilos. Given the weight `w` of the watermelon, determine if such a division is possible.

### Problem Requirements
- Divide watermelon of weight `w` into two parts
- Each part must weigh an even number of kilos
- Each part must have positive weight
- Print "YES" if possible, "NO" otherwise

### Examples

**Example 1:**
```
Input: 8
Output: YES
Explanation: Can divide into 2 + 6 = 8 (both parts are even)
```

### Constraints
- 1 ≤ w ≤ 100
- Time limit: 1 second
- Memory limit: 64 megabytes

### Solution

**Approach:** Mathematical Analysis
- **Time Complexity:** O(1) - constant time solution
- **Space Complexity:** O(1) - no extra space needed

**Algorithm:**
1. **Key Insight:** For two even numbers to sum to `w`, `w` itself must be even
2. **Minimum Constraint:** Smallest positive even number is 2, so we need at least 4 total weight
3. **Check Conditions:** `w` must be even AND `w ≥ 4`

**Mathematical Proof:**
- Let the two parts be `a` and `b` where both are even and positive
- We need: `a + b = w`, `a ≥ 2`, `b ≥ 2`, `a % 2 = 0`, `b % 2 = 0`
- Since both `a` and `b` are even, their sum `w` must be even
- Minimum case: `a = 2, b = 2` → `w = 4`
- Therefore: `w` is even AND `w ≥ 4`

**Edge Cases:**
```
w = 2: NO (can't split into two positive even parts)
w = 3: NO (odd number)
w = 4: YES (2 + 2 = 4)
w = 6: YES (2 + 4 = 6)
w = 8: YES (2 + 6 = 8 or 4 + 4 = 8)
```

### Test Cases
```java
// Test Case 1: Example from problem
w = 8
Expected: YES

// Test Case 2: Minimum valid case
w = 4
Expected: YES

// Test Case 3: Too small even number
w = 2
Expected: NO

// Test Case 4: Odd number
w = 7
Expected: NO

// Test Case 5: Large even number
w = 100
Expected: YES
```

### Files
- [`Main.java`](Main.java) - Simple mathematical solution

---
*Codeforces problem solved! Mathematical insight leads to O(1) solution! 🍉*