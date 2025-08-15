## Day 19 - Problem 2: A. Soft Drinking ✅

### Problem Description

A group of friends want to make toasts with a soft drink. Each friend needs a specific amount of drink, lime, and salt to make one toast. Given the available resources, determine how many toasts each friend can make.

**Requirements per toast:**
- `nl` milliliters of drink
- 1 slice of lime
- `np` grams of salt

---

### Input

- Single line: 8 positive integers `n k l c d p nl np` (not exceeding 1000, ≥ 1)
    - `n`: number of friends
    - `k`: number of bottles
    - `l`: milliliters per bottle
    - `c`: number of limes
    - `d`: slices per lime
    - `p`: grams of salt available
    - `nl`: milliliters needed per toast
    - `np`: grams of salt needed per toast

---

### Output

- Print single integer: number of toasts each friend can make

---

### Examples

**Input 1:**
```
3 4 5 10 8 100 3 1
```

**Output 1:**
```
2
```

**Input 2:**
```
5 100 10 1 19 90 4 3
```

**Output 2:**
```
3
```

**Input 3:**
```
10 1000 1000 25 23 1 50 1
```

**Output 3:**
```
0
```

---

### Approach

1. Calculate maximum possible toasts from each resource:
    - **Drink**: `(k * l) / nl` total toasts possible from available drink
    - **Lime**: `c * d` total toasts possible from available lime slices
    - **Salt**: `p / np` total toasts possible from available salt

2. Find the limiting resource: `min(drink_toasts, lime_toasts, salt_toasts)`

3. Divide by number of friends: `total_possible_toasts / n`

---

### Key Implementation Details

- Use integer division throughout
- The bottleneck resource determines the maximum toasts
- Each friend gets an equal share of the total possible toasts

---

### Trace Through Example 1

Given: `n=3, k=4, l=5, c=10, d=8, p=100, nl=3, np=1`

**Resource calculations:**
- Drink: `(4 * 5) / 3 = 20 / 3 = 6` toasts
- Lime: `10 * 8 = 80` toasts
- Salt: `100 / 1 = 100` toasts

**Limiting resource:** `min(6, 80, 100) = 6` total toasts
**Per friend:** `6 / 3 = 2` toasts each

Result: `2` ✓

---

### Time and Space Complexity

- **Time Complexity:** O(1) - constant time calculations
- **Space Complexity:** O(1) - only using variables

---

### Sample Test Cases

```java
Input: 1 1 1 1 1 1 1 1
Output: 1 (exactly enough for 1 toast)

Input: 2 1 10 1 1 10 5 5
Output: 1 (drink allows 2, lime allows 1, salt allows 2 → min=1, per friend=0)

Input: 1 10 10 10 10 100 1 1
Output: 100 (salt is limiting factor)
```

---

### Files

* [`Main.java`](Main.java) — Java solution

---

🍹🍋🧂 *A resource allocation problem about finding the bottleneck!*## Day X - Problem X: A. Soft Drinking ✅

### Problem Description

A group of friends want to make toasts with a soft drink. Each friend needs a specific amount of drink, lime, and salt to make one toast. Given the available resources, determine how many toasts each friend can make.

**Requirements per toast:**
- `nl` milliliters of drink
- 1 slice of lime
- `np` grams of salt

---

### Input

- Single line: 8 positive integers `n k l c d p nl np` (not exceeding 1000, ≥ 1)
    - `n`: number of friends
    - `k`: number of bottles
    - `l`: milliliters per bottle
    - `c`: number of limes
    - `d`: slices per lime
    - `p`: grams of salt available
    - `nl`: milliliters needed per toast
    - `np`: grams of salt needed per toast

---

### Output

- Print single integer: number of toasts each friend can make

---

### Examples

**Input 1:**
```
3 4 5 10 8 100 3 1
```

**Output 1:**
```
2
```

**Input 2:**
```
5 100 10 1 19 90 4 3
```

**Output 2:**
```
3
```

**Input 3:**
```
10 1000 1000 25 23 1 50 1
```

**Output 3:**
```
0
```

---

### Approach

1. Calculate maximum possible toasts from each resource:
    - **Drink**: `(k * l) / nl` total toasts possible from available drink
    - **Lime**: `c * d` total toasts possible from available lime slices
    - **Salt**: `p / np` total toasts possible from available salt

2. Find the limiting resource: `min(drink_toasts, lime_toasts, salt_toasts)`

3. Divide by number of friends: `total_possible_toasts / n`

---

### Key Implementation Details

- Use integer division throughout
- The bottleneck resource determines the maximum toasts
- Each friend gets an equal share of the total possible toasts

---

### Trace Through Example 1

Given: `n=3, k=4, l=5, c=10, d=8, p=100, nl=3, np=1`

**Resource calculations:**
- Drink: `(4 * 5) / 3 = 20 / 3 = 6` toasts
- Lime: `10 * 8 = 80` toasts
- Salt: `100 / 1 = 100` toasts

**Limiting resource:** `min(6, 80, 100) = 6` total toasts
**Per friend:** `6 / 3 = 2` toasts each

Result: `2` ✓

---

### Time and Space Complexity

- **Time Complexity:** O(1) - constant time calculations
- **Space Complexity:** O(1) - only using variables

---

### Sample Test Cases

```java
Input: 1 1 1 1 1 1 1 1
Output: 1 (exactly enough for 1 toast)

Input: 2 1 10 1 1 10 5 5  
Output: 1 (drink allows 2, lime allows 1, salt allows 2 → min=1, per friend=0)

Input: 1 10 10 10 10 100 1 1
Output: 100 (salt is limiting factor)
```

---

### Files

* [`Main.java`](Main.java) — Java solution

---

🍹🍋🧂 *A resource allocation problem about finding the bottleneck!*