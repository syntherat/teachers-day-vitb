## Day 26 - Problem 2: C. Soldier and Cards ✅

### Problem Description

Two bored soldiers are playing a **card war game**.  
They split a deck of `n` cards (numbered `1` to `n`, all unique) and play rounds:

1. Each player puts the top card of their stack on the table.
2. The player with the higher card **wins the round**:
   * He places both cards at the bottom of his stack (first opponent’s card, then his own).
3. If a player has **no cards left**, he loses.

If the game continues forever (repeats states), output `-1`.

---

### Input

* First line: integer `n` (2 ≤ n ≤ 10), the total number of cards.
* Second line: integer `k1` followed by `k1` cards (player 1’s deck).
* Third line: integer `k2` followed by `k2` cards (player 2’s deck).

---

### Output

* If someone wins:  
  Print two integers — number of fights and the winner (`1` or `2`).

* If the game never ends:  
  Print `-1`.

---

### Examples

**Input 1:**
```

4
2 1 3
2 4 2

```

**Output 1:**
```

6 2

```

**Input 2:**
```

3
1 3
2 1 2

```

**Output 2:**
```

-1

```

---

### Explanation

* In Example 1, the game ends after **6 rounds**, Player 2 wins.
* In Example 2, the decks keep repeating forever, so the answer is `-1`.

---

### Approach

1. Use **queues** to represent each player’s deck.
2. Simulate rounds until one deck is empty or a repeated state occurs.
3. Use a **Set** to track visited states (`p1 | p2`) to detect infinite loops.
4. Count the number of fights.

---

### Complexity

* **Time Complexity:** Potentially exponential in states, but since `n ≤ 10`, this is manageable.
* **Space Complexity:** O(n!) due to state tracking.

---

### Files

* [`Main.java`](Main.java) — Java simulation solution

---

Another **classic simulation + cycle detection problem** solved ✅