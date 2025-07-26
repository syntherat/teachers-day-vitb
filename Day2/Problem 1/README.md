## Day 2 - Problem 2: Group Anagrams ✅

### Problem Description
Given an array of strings `strs`, group the **anagrams** together. You can return the answer in **any order**.

An **Anagram** is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

### Examples

**Example 1:**
```
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Explanation:
• There is no string in strs that can be rearranged to form "bat".
• The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
• The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
```

**Example 2:**
```
Input: strs = [""]
Output: [[""]]
```

**Example 3:**
```
Input: strs = ["a"]
Output: [["a"]]
```

### Constraints
- `1 <= strs.length <= 10⁴`
- `0 <= strs[i].length <= 100`
- `strs[i]` consists of lowercase English letters.

### Solution

**Approach:** Hash Map with Sorted String as Key
- **Time Complexity:** O(N × K × log K) where N is the number of strings and K is the maximum length of a string
- **Space Complexity:** O(N × K) for storing all strings in the hash map

**Algorithm:**
1. **Create a HashMap** to group anagrams together
2. **For each string:**
    - Convert string to character array and sort it
    - Use the sorted string as the key in HashMap
    - Add the original string to the list of values for that key
3. **Return all values** from the HashMap as the result

**Key Insight:** Anagrams will have identical characters when sorted. For example:
- "eat" → sorted: "aet"
- "tea" → sorted: "aet"
- "ate" → sorted: "aet"

All three map to the same key "aet", so they belong in the same group.

### Performance
![LeetCode Submission Result](https://github.com/syntherat/teachers-day-vitb/blob/main/Day2/Problem%201/img.png)

**Stats:**
- ✅ **Accepted** (127/127 test cases passed)
- **Runtime:** 6ms (Beats 98.38% 🚀)
- **Memory:** 48.46 MB (Beats 19.03%)

### Files
- [`Main.java`](Main.java) - Complete runnable solution with test cases


### Difficulty Level
🟡 **Medium**

---
*Problem solved on LeetCode - Hash Map mastery achieved! 🗂️*