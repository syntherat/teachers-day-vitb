## Day 4 - Problem 1: Best Time to Buy and Sell Stock ✅

### Problem Description
You are given an array `prices` where `prices[i]` is the price of a given stock on the `ith` day.

You want to maximize your profit by choosing a **single day** to buy one stock and choosing a **different day in the future** to sell that stock.

Return *the maximum profit you can achieve from this transaction*. If you cannot achieve any profit, return `0`.

### Examples

**Example 1:**
```
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
```

**Example 2:**
```
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
```

### Constraints
- 1 ≤ prices.length ≤ 10⁵
- 0 ≤ prices[i] ≤ 10⁴

### Solution

**Approach:** Single Pass with Min Price Tracking
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

**Algorithm:**
1. **Track Minimum Price:** Keep track of the lowest price seen so far
2. **Calculate Current Profit:** For each day, calculate profit if selling today (current price - minimum price)
3. **Update Maximum Profit:** Keep track of the highest profit encountered
4. **Update Minimum Price:** If current price is lower than minimum, update minimum price

**Key Insight:** To maximize profit, we need to buy at the lowest price and sell at the highest price that comes after it. By tracking the minimum price seen so far and calculating potential profit at each step, we can find the optimal buy-sell pair in a single pass.

**Visual Walkthrough:**
```
prices = [7, 1, 5, 3, 6, 4]
Day 0: price=7, minPrice=7, profit=0, maxProfit=0
Day 1: price=1, minPrice=1, profit=0, maxProfit=0
Day 2: price=5, minPrice=1, profit=4, maxProfit=4
Day 3: price=3, minPrice=1, profit=2, maxProfit=4
Day 4: price=6, minPrice=1, profit=5, maxProfit=5
Day 5: price=4, minPrice=1, profit=3, maxProfit=5

Result: Buy at price 1 (day 1), sell at price 6 (day 4) = profit 5
```

### Performance
![LeetCode Submission Result](https://github.com/syntherat/teachers-day-vitb/blob/main/Day4/Problem%201/img.png)

**Stats:**
- ✅ **Accepted** (212/212 test cases passed)
- **Runtime:** 1ms (Beats 99.86%)
- **Memory:** 62.20 MB (Beats 11.91%)

### Test Cases
```java
// Test Case 1: [7,1,5,3,6,4] → 5 (buy at 1, sell at 6)
// Test Case 2: [7,6,4,3,1] → 0 (prices only decrease)
// Test Case 3: [1,2] → 1 (buy at 1, sell at 2)
```

### Edge Cases
- **Decreasing Prices:** If prices only go down, maximum profit is 0
- **Single Element:** Array with one price returns 0 (can't buy and sell)
- **All Same Prices:** Returns 0 (no profit possible)


### Files
- [`Main.java`](Main.java) - Complete solution with test cases

---
*Problem solved on LeetCode! Near-perfect 99.86% runtime performance! 🚀*