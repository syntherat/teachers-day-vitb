## Day 34 - Problem 1: C. Soldier and Cards 🪖🃏

### Problem Description

Two soldiers are playing a simplified **"War"** card game.  
Each round, both draw the top card of their deck:
- The higher card wins and collects both cards (winner’s card first)
- Cards are added to the **bottom of the winner's deck**
- The game continues until one player runs out of cards

You must simulate the game and:
- Count total number of rounds
- Determine the winner (1 or 2)
- Detect infinite loops if the game cycles

---

### Input

- First line: integer `n` — total number of cards (2 ≤ n ≤ 10)
- Second line: `k1` followed by `k1` integers — Player 1’s initial deck
- Third line: `k2` followed by `k2` integers — Player 2’s initial deck

All cards are distinct and values are from 1 to `n`.

---

### Output

- If the game ends, print: `<number_of_rounds> <winner>`  
- If the game goes into an infinite loop, print `-1`

---

### Example

**Input**
```

4
2 1 3
2 4 2

```

**Output**
```

6 2

```

**Input**
```

3
1 2
2 3 1

```

**Output**
```

-1

```

---

### Approach

- Use two `Queue<Integer>` structures to simulate both players' decks
- Use a `Set<String>` to store previous states and detect loops
- In each round:
  - Remove top cards from both queues
  - Append both cards (winner first, then loser) to winner's queue
- If a state repeats → infinite loop → return `-1`

---

### Complexity

- **Time Complexity:** O(k × n), where `k` is the number of moves (bounded due to finite state space)  
- **Space Complexity:** O(n!) max possible states (but small for n ≤ 10)

---

### Files

- `Main.java` — Java simulation for Soldier and Cards game