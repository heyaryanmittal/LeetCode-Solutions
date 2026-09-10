# 1346. Check If N and Its Double Exist

- **LeetCode:** https://leetcode.com/problems/check-if-n-and-its-double-exist/
- **Difficulty:** Easy
- **Language:** Java
- **Status:** Accepted
- **Submission ID:** 2137226870
- **Runtime:** 2
- **Memory:** 44448000
- **Tags:** Array, Hash Table, Two Pointers, Binary Search, Sorting

## Problem

Given an array arr of integers, check if there exist two indices i and j such that :

- i != j
- 0 <= i, j < arr.length
- arr[i] == 2 * arr[j]

Example 1:

```
Input: arr = [10,2,5,3]
Output: true
Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
```

Example 2:

```
Input: arr = [3,1,7,11]
Output: false
Explanation: There is no i and j that satisfy the conditions.
```

Constraints:

- 2 <= arr.length <= 500
- -103 <= arr[i] <= 103

## Solution

See [solution.java](./solution.java).

## Complexity

- **Time:**
- **Space:**

_Complexity is intentionally left blank unless it is explicitly available; the extension does not invent complexity claims._
