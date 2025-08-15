## Day 20 - Problem 2: A. Young Physicist ✅

### Problem Description

A physics student named Vasya needs help determining if a body is in equilibrium. A body is in equilibrium when the net force acting on it is zero in all dimensions.

Given n force vectors in 3D space, determine if their vector sum equals zero (equilibrium condition).

**Physics Concept**: A body is in equilibrium when ΣF⃗ = 0⃗, meaning the sum of all force components in each dimension equals zero.

---

### Input

- First line: positive integer `n` (1 ≤ n ≤ 100) - number of force vectors
- Next n lines: three integers each `xi yi zi` (-100 ≤ xi, yi, zi ≤ 100) - force vector components

---

### Output

- Print "YES" if the body is in equilibrium, "NO" if it is not

---

### Examples

**Input 1:**
```
3
4 1 7
-2 4 -1
1 -5 -3
```

**Output 1:**
```
NO
```

**Input 2:**
```
3
3 -1 7
-5 2 -4
2 -1 -3
```

**Output 2:**
```
YES
```

---

### Approach

1. **Vector Sum Calculation**: For equilibrium, the sum of all force vectors must be the zero vector
    - ΣFx = 0 (sum of x-components = 0)
    - ΣFy = 0 (sum of y-components = 0)
    - ΣFz = 0 (sum of z-components = 0)

2. **Algorithm**:
    - Initialize three sum variables for x, y, z components
    - For each force vector, add its components to respective sums
    - Check if all three sums equal zero

---

### Key Implementation Details

- Use simple integer arithmetic (no floating point needed)
- Sum all x, y, and z components separately
- Body is in equilibrium only if ALL three sums are zero

---

### Trace Through Examples

**Example 1:**
```
Forces: (4,1,7), (-2,4,-1), (1,-5,-3)
ΣFx = 4 + (-2) + 1 = 3 ≠ 0
ΣFy = 1 + 4 + (-5) = 0
ΣFz = 7 + (-1) + (-3) = 3 ≠ 0
```
Result: "NO" (x and z components don't sum to zero) ✓

**Example 2:**
```
Forces: (3,-1,7), (-5,2,-4), (2,-1,-3)  
ΣFx = 3 + (-5) + 2 = 0
ΣFy = (-1) + 2 + (-1) = 0
ΣFz = 7 + (-4) + (-3) = 0
```
Result: "YES" (all components sum to zero) ✓

---

### Physics Background

**Newton's First Law**: A body remains at rest or in uniform motion unless acted upon by an unbalanced force.

**Equilibrium Conditions**:
- **Static Equilibrium**: Body at rest with net force = 0
- **Dynamic Equilibrium**: Body moving at constant velocity with net force = 0

In both cases, ΣF⃗ = 0⃗ in all directions.

---

### Time and Space Complexity

- **Time Complexity:** O(n) - single pass through all force vectors
- **Space Complexity:** O(1) - only using three sum variables

---

### Sample Test Cases

```java
Input: 1 / 0 0 0
Output: YES (single zero force)

Input: 2 / 5 3 -2 / -5 -3 2
Output: YES (forces cancel exactly)

Input: 1 / 1 1 1  
Output: NO (non-zero net force)

Input: 4 / 1 0 0 / 0 1 0 / 0 0 1 / -1 -1 -1
Output: YES (net force is zero)
```

---

### Files

* [`Main.java`](Main.java) — Java solution

---

⚖️🔬 *A physics problem about force equilibrium and vector addition!*