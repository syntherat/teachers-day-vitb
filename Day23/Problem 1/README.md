## Day 23 - Problem 1: A. Kyoya and Photobooks ✅

### Problem Description

Kyoya Ootori has a photobook represented as a string `s` of lowercase letters (photos labeled `'a'` to `'z'`).
He wants to make "special edition" photobooks by **inserting exactly one new photo** (a letter `'a'`–`'z'`) into any position of `s`.

Find the total number of **distinct photobooks** that can be created this way.

---

### Input

* A single string `s` (1 ≤ |s| ≤ 20), consisting of lowercase English letters.

---

### Output

* Print a single integer: the number of distinct photobooks Kyoya can create.

---

### Examples

**Input 1:**

```
a
```

**Output 1:**

```
51
```

**Input 2:**

```
hi
```

**Output 2:**

```
76
```

---

### Approach

**Key Insight**:

* There are `(n + 1)` possible positions to insert a new character in a string of length `n`.
* At each position, we can insert **26 possible letters**.
* In total, there are `(n + 1) × 26` possible insertions, but **duplicates may occur** (e.g., inserting `'a'` in `"a"` at different spots might produce the same string).
* To ensure uniqueness, use a `HashSet` to store all generated strings.

**Algorithm**:

1. Initialize an empty `HashSet<String>`.
2. For every insertion position `i = 0…n`:

    * For every letter `c = 'a'…'z'`:

        * Form new string: `s[0..i-1] + c + s[i..n-1]`.
        * Insert into set.
3. Answer = size of the set.

---

### Key Implementation Details

* Use `HashSet` for uniqueness.
* String length ≤ 20 → worst case `(21 × 26 = 546)` possible strings, which is very manageable.
* Direct brute force is efficient enough.

---

### Trace Through Examples

**Example 1: s="a"**

```
Possible insertions: insert each 'a'–'z' before or after "a".
This gives 26 (before) + 26 (after), but "aa" is counted twice.
Total = 51
```

**Example 2: s="hi"**

```
Positions = 3 (before h, between h and i, after i).
Each with 26 letters = 78 possible.
Some duplicates occur (like inserting 'h' before and after produces "hhi").
Final count = 76
```

---

### Time and Space Complexity

* **Time Complexity:** O(26 × n) ≈ O(n)
* **Space Complexity:** O(26 × n) for the set

---

### Files

* [`Main.java`](Main.java) — Java solution

---

📚 *A fun combinatorial problem using string insertions and uniqueness checking!*