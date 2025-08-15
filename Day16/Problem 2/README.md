## Day 16 - Problem 2: A. I Wanna Be the Guy ✅

### Problem Description

There's a game called "I Wanna Be the Guy" with `n` levels. Two friends want to cooperate:
- **Little X** can pass only `p` specific levels
- **Little Y** can pass only `q` specific levels
- They want to know if **together** they can pass **all levels** from 1 to n
- If yes, print `"I become the guy."`
- If no, print `"Oh, my keyboard!"`

---

### Input

- First line: integer `n` (1 ≤ n ≤ 100) — total number of levels
- Second line: integer `p`, followed by `p` distinct integers — levels Little X can pass
- Third line: integer `q`, followed by `q` distinct integers — levels Little Y can pass

---

### Output

- If they can pass all levels together: `"I become the guy."`
- Otherwise: `"Oh, my keyboard!"`

---

### Examples

**Input 1:**
```
4
3 1 2 3
2 2 4
```

**Output 1:**
```
I become the guy.
```

**Input 2:**
```
4
3 1 2 3
1 2
```

**Output 2:**
```
Oh, my keyboard!
```

---

### Approach

1. **Use a Set** to store all levels that can be passed by either player
2. **Add all Little X's levels** to the set
3. **Add all Little Y's levels** to the set (duplicates automatically ignored)
4. **Check if set size equals n** — this means all levels 1 to n are covered

**Why this works:**
- Set automatically handles overlapping levels (both players can pass the same level)
- If the set contains exactly n unique levels, and all input levels are between 1 and n, then we must have levels {1, 2, 3, ..., n}

---

### Trace Through Examples

**Example 1:** n=4
- Little X can pass: {1, 2, 3}
- Little Y can pass: {2, 4}
- Combined: {1, 2, 3, 4} → size = 4 = n ✓

**Example 2:** n=4
- Little X can pass: {1, 2, 3}
- Little Y can pass: {2}
- Combined: {1, 2, 3} → size = 3 ≠ 4 ✗

---

### Key Insights

- **Set automatically handles duplicates**: If both players can pass level 2, it's only counted once
- **Size check is sufficient**: Since levels are numbered 1 to n, having exactly n unique passable levels means all levels are covered
- **Union operation**: We're essentially finding the union of two sets

---

### Alternative Approach (Less Elegant)

```java
boolean[] canPass = new boolean[n + 1];
// Mark Little X's levels
// Mark Little Y's levels  
// Check if all levels 1 to n are marked
```

**But Set approach is cleaner!**

---

### Time and Space Complexity

- **Time Complexity:** O(p + q) - process each level once
- **Space Complexity:** O(p + q) - store unique levels in set

---

### Sample Test Cases

```java
Input: n=3, X=[1,3], Y=[2] → Output: "I become the guy."
Input: n=5, X=[1,2], Y=[3,4] → Output: "Oh, my keyboard!"
Input: n=2, X=[1,2], Y=[1,2] → Output: "I become the guy."
```

---

### Files

* [`Main.java`](Main.java) — Java solution

---

🎮 *A set union problem disguised as a gaming challenge!*