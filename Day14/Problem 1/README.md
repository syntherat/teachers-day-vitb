## Day 14 - Problem 1: A. Dubstep ✅

### Problem Description

Vasya remixes songs by inserting the word `"WUB"`:
- Before the first word
- After the last word
- Between every pair of neighboring words

The remix is played as a continuous string. Your task is to **recover the original song**.

---

### Input

- A single string (max 200 characters)
- Consists of only uppercase English letters and the substring `"WUB"`
- The original song had no `"WUB"` in it

---

### Output

- Print the original song's words, separated by spaces

---

### Examples

**Input 1:**
```

WUBWUBABCWUB

```

**Output 1:**
```

ABC

```

**Input 2:**
```

WUBWEWUBAREWUBTHEWUBCHAMPIONSWUBMYWUBFRIENDWUB

```

**Output 2:**
```

WE ARE THE CHAMPIONS MY FRIEND

````

---

### Approach

1. Replace all occurrences of one or more `"WUB"` with a single space
2. Trim leading/trailing spaces

---

### Key Java Functions

- `String.replaceAll("(WUB)+", " ")`: Replace 1 or more WUBs with a space
- `.trim()`: Remove unnecessary whitespace from start and end

---

### Time and Space Complexity

- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

---

### Sample Test Case

```java
Input: WUBHELLOWUBWORLDCALLWUBMEWUBMAYBEWUB
Output: HELLO WORLDCALL ME MAYBE
````

---

### Files

* [`Main.java`](Main.java) — Java solution

---

🎵 *A great problem for string replacement and regex practice!*