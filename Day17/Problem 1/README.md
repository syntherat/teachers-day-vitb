## Day 17 - Problem 1: A. Sereja and Dima ✅

### Problem Description

Sereja and Dima play a card game with simple rules:
- `n` cards are arranged in a **row**, each with a number
- Players take turns, **Sereja goes first**
- On each turn, a player must take either the **leftmost** or **rightmost** card
- Both players play **greedily** - they always choose the card with the larger number
- The game ends when no cards remain
- The player with the **maximum sum** wins

**Goal**: Determine the final scores of both players.

---

### Input

- First line: integer `n` (1 ≤ n ≤ 1000) — number of cards
- Second line: `n` space-separated integers — card values (distinct integers from 1 to 1000)

---

### Output

- Print two integers: Sereja's final score, then Dima's final score

---

### Examples

**Input 1:**
```
4
4 1 2 10
```

**Output 1:**
```
12 5
```

**Input 2:**
```
7
1 2 3 4 5 6 7
```

**Output 2:**
```
16 12
```

---

### Approach

**Greedy Simulation**: Since both players are greedy, simulate the game by always picking the larger of the two available cards (leftmost or rightmost).

**Algorithm:**
1. Use two pointers: `left = 0`, `right = n-1`
2. For each turn:
    - Compare `cards[left]` and `cards[right]`
    - Choose the larger value
    - Add to current player's score
    - Move the appropriate pointer
    - Switch to the other player
3. Continue until `left > right`

---

### Trace Through Example 1

**Initial:** `[4, 1, 2, 10]`, left=0, right=3

1. **Sereja's turn**: Compare 4 vs 10 → Choose 10 → Score: S=10, D=0 → `[4, 1, 2]`
2. **Dima's turn**: Compare 4 vs 2 → Choose 4 → Score: S=10, D=4 → `[1, 2]`
3. **Sereja's turn**: Compare 1 vs 2 → Choose 2 → Score: S=12, D=4 → `[1]`
4. **Dima's turn**: Only 1 left → Take 1 → Final: S=12, D=5

**Result:** `12 5` ✓

---

### Trace Through Example 2

**Initial:** `[1, 2, 3, 4, 5, 6, 7]`

1. Sereja: 1 vs 7 → Choose 7 → S=7
2. Dima: 1 vs 6 → Choose 6 → D=6
3. Sereja: 1 vs 5 → Choose 5 → S=12
4. Dima: 1 vs 4 → Choose 4 → D=10
5. Sereja: 1 vs 3 → Choose 3 → S=15
6. Dima: 1 vs 2 → Choose 2 → D=12
7. Sereja: Take 1 → S=16

**Final:** `16 12` ✓

---

### Key Implementation Details

- **Two pointers technique**: `left` and `right` to track available cards
- **Turn alternation**: Use boolean `serejaTurn` to track whose turn it is
- **Greedy choice**: Always pick `max(cards[left], cards[right])`
- **Pointer update**: Move `left++` or `right--` based on choice

---

### Time and Space Complexity

- **Time Complexity:** O(n) - each card is processed exactly once
- **Space Complexity:** O(n) - store the card array

---

### Edge Cases

- **Single card**: One player gets everything, other gets 0
- **Two cards**: Each player gets one card
- **All equal cards**: Doesn't matter which is chosen
- **Alternating high-low**: Players will naturally get different patterns

---

### Sample Test Cases

```java
Input: n=2, cards=[5, 3] → Output: "5 3" (Sereja gets 5, Dima gets 3)
Input: n=3, cards=[1, 100, 2] → Output: "100 3" (S gets 100, D gets 1+2)
Input: n=1, cards=[42] → Output: "42 0" (Sereja gets everything)
```

---

### Files

* [`Main.java`](Main.java) — Java solution

---

🃏 *A classic greedy simulation problem using two pointers!*