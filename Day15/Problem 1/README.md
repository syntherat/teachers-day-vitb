## Day 15 - Problem 1: A. Is your horseshoe on the other hoof? ✅

### Problem Description

Valera the Horse is going to a party and wants to wear 4 horseshoes of **different colors**:
- He already has 4 horseshoes but they might have duplicate colors
- He needs to buy additional horseshoes to ensure he has at least one of each of 4 different colors
- Find the **minimum number** of horseshoes he needs to buy

---

### Input

- Four space-separated integers s₁, s₂, s₃, s₄ (1 ≤ sᵢ ≤ 10⁹)
- Each integer represents the color of a horseshoe Valera already has

---

### Output

- Print a single integer — the minimum number of horseshoes Valera needs to buy

---

### Examples

**Input 1:**
```
1 2 3 1
```

**Output 1:**
```
1
```

**Input 2:**
```
2 2 2 2
```

**Output 2:**
```
3
```

---

### Approach

1. Count the number of **unique colors** among the 4 horseshoes
2. The answer is `4 - (number of unique colors)`
3. Use a HashSet to automatically handle duplicates

---

### Key Java Functions

- `HashSet<Integer>`: Automatically stores only unique values
- `Set.add()`: Adds elements (duplicates ignored)
- `Set.size()`: Returns number of unique elements

---

### Time and Space Complexity

- **Time Complexity:** O(1) - Only 4 operations
- **Space Complexity:** O(1) - At most 4 unique colors

---

### Sample Test Cases

```java
Input: 1 7 3 3
Output: 1 (has colors 1,7,3 - needs 1 more unique color)

Input: 1 2 3 4  
Output: 0 (already has 4 different colors)

Input: 5 5 5 5
Output: 3 (has only 1 unique color - needs 3 more)
```

---

### Files

* [`Main.java`](Main.java) — Java solution

---

🐴 *A simple problem about counting unique elements using HashSet!*