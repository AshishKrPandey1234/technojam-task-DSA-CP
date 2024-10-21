How did I approach this task?
I approached this task by breaking it down into smaller steps. The goal was to generate Pascal’s Triangle up to a given number of rows (n). 
Pascal’s Triangle is a pattern where the first and last numbers of each row are always 1, and every number in between is the sum of the two numbers
directly above it in the previous row.
To achieve this:
- I initialized a 2D array to store the triangle's values.
- The outer loop iterates through each row, ensuring that the first and last elements are set to 1.
- The inner loop fills in the values between the first and last elements using the sum of the elements from the previous row.
- Finally, I printed the triangle row by row.
## Challenges I faced
One of the main challenges was understanding how to correctly calculate the values for the elements in the triangle. 
Since each number depends on the values from the previous row, it was important to ensure that the indices were handled correctly. 
Additionally, I had to carefully manage the loops to maintain the proper structure of Pascal’s Triangle while printing the output.
