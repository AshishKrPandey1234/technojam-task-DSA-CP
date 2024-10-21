
# String Compression Problem Solution

## How did I approach this task?

The task is to compress a character array where consecutive duplicate characters are replaced by the character followed by its count. 

To solve this:
- I used two pointers: one (`i`) to iterate through the original array and the other (`index`) to fill in the compressed array.
- For each character, I counted consecutive occurrences.
- If the count is greater than 1, I added the character and its count (as a string) to the array.
- The method returns the new length of the compressed array.

## Challenges I faced

The challenge was efficiently updating the array in place without losing any characters. Handling counts greater than 1 by converting them to strings and placing each digit in the array required careful indexing.
