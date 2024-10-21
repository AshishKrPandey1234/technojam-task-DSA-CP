## How did I approach this task?

I approached the problem as a dynamic programming challenge, similar to the Fibonacci sequence. The task is to calculate the number of distinct ways 
to reach the top of a staircase with `n` steps, where you can take either one or two steps at a time.
To solve this:
- I created an array `arr[]` to store the number of ways to reach each step.
- The base cases are simple: there's 1 way to stay at the ground (step 0) and 1 way to reach the first step.
- For each step beyond the first two, I calculated the number of ways by adding the values from the two previous steps (`arr[i-1]` and `arr[i-2]`).
- Finally, the value at `arr[n]` gives the number of ways to reach the top.

## Challenges I faced

The main challenge was structuring the logic ,Setting up the base cases and ensuring that each subsequent value is calculated based
on the previous two steps was crucial. Once this pattern was clear, implementing the solution became straightforward.
