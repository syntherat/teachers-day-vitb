## Day 7 - Problem 2: A. Way Too Long Words ✅

### Problem Description
Sometimes words are so long that writing them many times becomes tiresome. If a word's length is **strictly more than 10** characters, replace it with a special abbreviation: first letter + number of letters between first and last + last letter.

### Problem Requirements
- Process `n` words
- If word length > 10: abbreviate as `first + middle_count + last`
- If word length ≤ 10: keep unchanged
- Middle count is in decimal system without leading zeros

### Examples

**Example:**
```
Input:
4
word
localization
internationalization
pneumonoultramicroscopicsilicovolcanoconlosis

Output:
word
l10n
i18n
p43s
```

**Explanation:**
- "word" (4 chars) → unchanged
- "localization" (12 chars) → "l" + 10 + "n" = "l10n"
- "internationalization" (20 chars) → "i" + 18 + "n" = "i18n"
- "pneumono..." (45 chars) → "p" + 43 + "s" = "p43s"

### Constraints
- 1 ≤ n ≤ 100
- Each word: 1 to 100 lowercase Latin letters
- Time limit: 1 second
- Memory limit: 256 megabytes

### Solution

**Approach:** String Processing with Length Check
- **Time Complexity:** O(n × m) where n = number of words, m = average word length
- **Space Complexity:** O(1) extra space per word

**Algorithm:**
1. **Read Input:** Get number of words `n`
2. **Process Each Word:**
    - Check if `word.length() > 10`
    - If yes: create abbreviation `first + (length-2) + last`
    - If no: keep original word
3. **Output Result:** Print processed word

**Key Implementation Details:**
- First letter: `word.charAt(0)`
- Last letter: `word.charAt(word.length()-1)`
- Middle count: `word.length() - 2` (total - first - last)
- No need for complex string manipulation

**Edge Cases:**
```
Length = 1: "a" → "a" (unchanged)
Length = 10: "abcdefghij" → "abcdefghij" (unchanged, exactly 10)
Length = 11: "abcdefghijk" → "a9k" (first abbreviation case)
Length = 100: very long word → abbreviated
```

### Test Cases
```java
// Test Case 1: Mixed lengths
Input: 4 words - "word", "localization", "internationalization", "p...s"
Expected: "word", "l10n", "i18n", "p43s"

// Test Case 2: All short words
Input: 3 words - "a", "ab", "abcdefghij"
Expected: "a", "ab", "abcdefghij"

// Test Case 3: All long words  
Input: 2 words - "abcdefghijk", "verylongwordhere"
Expected: "a9k", "v14e"

// Test Case 4: Edge case
Input: 1 word - "abcdefghijk" (exactly 11 chars)
Expected: "a9k"
```

### Files
- [`Main.java`](Main.java) - Efficient string processing solution

---
*Codeforces problem solved! String abbreviation mastered! 📝*