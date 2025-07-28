## Day 4 - Problem 2: Min Stack ✅

### Problem Description
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the `MinStack` class:
- `MinStack()` initializes the stack object.
- `void push(int val)` pushes the element val onto the stack.
- `void pop()` removes the element on the top of the stack.
- `int top()` gets the top element of the stack.
- `int getMin()` retrieves the minimum element in the stack.

You must implement a solution with **O(1)** time complexity for each function.

### Examples

**Example 1:**
```
Input:
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output:
[null,null,null,null,-3,null,0,-2]

Explanation:
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2
```

### Constraints
- -2³¹ ≤ val ≤ 2³¹ - 1
- Methods `pop`, `top` and `getMin` operations will always be called on **non-empty** stacks.
- At most 3 × 10⁴ calls will be made to `push`, `pop`, `top`, and `getMin`.

### Solution

**Approach:** Two Stack Method with Parallel Tracking
- **Time Complexity:** O(1) for all operations
- **Space Complexity:** O(n) where n is the number of elements

**Algorithm:**
1. **Two Stacks:** Use `mainStack` for actual values and `minStack` for tracking minimums
2. **Push Operation:** Always push to mainStack. For minStack, push new value if it's ≤ current min, otherwise duplicate current min
3. **Pop Operation:** Pop from both stacks simultaneously to maintain parallel structure
4. **Top Operation:** Return top of mainStack
5. **GetMin Operation:** Return top of minStack (always contains current minimum)

**Key Insight:** By maintaining a parallel minStack that tracks the minimum at each level, we can retrieve the minimum in O(1) time. The minStack grows and shrinks with the mainStack, ensuring the minimum is always available at the top.

**Visual Walkthrough:**
```
Operation     MainStack    MinStack     getMin()
push(-2)      [-2]         [-2]         -2
push(0)       [-2,0]       [-2,-2]      -2
push(-3)      [-2,0,-3]    [-2,-2,-3]   -3
pop()         [-2,0]       [-2,-2]      -2
push(-1)      [-2,0,-1]    [-2,-2,-2]   -2

Note: MinStack duplicates current minimum to maintain parallel structure
```

### Performance
![LeetCode Submission Result](https://github.com/syntherat/teachers-day-vitb/blob/main/Day4/Problem%202/img.png)

**Stats:**
- ✅ **Accepted** (32/32 test cases passed)
- **Runtime:** 5ms (Beats 38.13%)
- **Memory:** 45.04 MB (Beats 42.96%)

### Test Cases
```java
// Test Case 1: Basic operations with negative numbers
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]
Expected: [null,null,null,null,-3,null,0,-2]

// Test Case 2: All same values
["MinStack","push","push","getMin"]
[[],[2],[2],[]]
Expected: [null,null,null,2]

// Test Case 3: Ascending order
["MinStack","push","push","push","getMin"]
[[],[1],[2],[3],[]]
Expected: [null,null,null,null,1]
```

### Files
- [`Main.java`](Main.java) - Complete solution with all required methods and test cases

---
*Problem solved on LeetCode! All operations in O(1) time complexity achieved! 🚀*