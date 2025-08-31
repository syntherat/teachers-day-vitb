## Day 31 - Problem 1: C. Registration System 📝

### Problem Description

You're helping build a new e-mail registration system for a platform in Berland.

When a user wants to register with a **username**:
- If it's **not taken**, register it and print `OK`
- If it's **already taken**, generate the smallest `name+number` (e.g., `name1`, `name2`, ...) that is not yet in use, and register it

---

### Input

- First line: integer `n` (1 ≤ n ≤ 10⁵) — number of registration attempts  
- Next `n` lines: each line is a string (max 32 lowercase letters) — username request

---

### Output

For each request, print:
- `"OK"` if the username was available  
- Or the new suggested unique username if the original is taken

---

### Examples

**Input**
```

6
first
first
second
second
third
third

```

**Output**
```

OK
first1
OK
second1
OK
third1

```

---

### Approach

- Use a `HashMap<String, Integer>` to keep track of how many times a base name has occurred
- For each new name:
  - If it's not present → register it directly
  - If it's present → try name+1, name+2, ... until you find a free one

---

### Complexity

- **Time Complexity:** O(1) per request on average  
- **Space Complexity:** O(n) for storing registered usernames

---

### Files

- `Main.java` — Java implementation for the registration system