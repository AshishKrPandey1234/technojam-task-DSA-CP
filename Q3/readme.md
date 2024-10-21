# Range Bitwise AND Problem Solution

## How did I approach this task?

The goal of this problem is to calculate the bitwise AND of all numbers between `left` and `right` (inclusive). A direct approach would involve 
iterating through all numbers in the range, but this could be inefficient, especially for large ranges. Instead, I approached it using bit manipulation.

To solve this:
- I noticed that for large ranges, the higher bits of `left` and `right` eventually become zero due to shifting. So, the solution involves
   shifting both numbers right until they are equal.
- Once equal, the left shifted result by the number of shifts will give the correct bitwise AND of the entire range.

## Challenges I faced

The challenge was understanding how to reduce the range efficiently using bit shifts. By focusing on common bits at the start of `left` and `right`, 
I was able to minimize the complexity of the problem.
