# Number Spiral Problem Solution

## How did I approach this task?

The problem involves calculating the number at a given position `(y, x)` in a number spiral. The number spiral starts with `1` at position `(1, 1)` and fills numbers in a specific pattern.

To solve this:
- I divided the logic into two cases: when `y >= x` (row-major) and `x > y` (column-major).
- For each case:
  - I determined if the row or column is odd or even.
  - I applied the respective formulas to calculate the value at the given position.
  
  - If `y % 2 == 1`, the value is calculated differently than if `y % 2 == 0` (and similarly for `x`).

## Challenges I faced

The main challenge was understanding the spiral pattern and determining the correct formula for both row-major and column-major cases. Adjusting the calculation based on whether the row or column is odd or even was key to solving this efficiently.
