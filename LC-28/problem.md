# 28. Find the Index of the First Occurrence in a String

- **LeetCode:** https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
- **Difficulty:** Easy
- **Language:** Java
- **Status:** Accepted
- **Submission ID:** 2139893502
- **Runtime:** 0 ms
- **Memory:** 43364000
- **Tags:** Two Pointers, String, String Matching, Z Algorithm, Knuth–Morris–Pratt Algorithm, Boyer–Moore String-Search Algorithm

## Problem

Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

```
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
```

Example 2:

```
Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
```

Constraints:

- 1 <= haystack.length, needle.length <= 104
- haystack and needle consist of only lowercase English characters.

## Solution

See [solution.java](./solution.java).

## Complexity

- **Time:**
- **Space:**

_Complexity is intentionally left blank unless it is explicitly available; the extension does not invent complexity claims._
