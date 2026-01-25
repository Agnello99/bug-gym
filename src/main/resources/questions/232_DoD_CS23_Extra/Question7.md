## Question 7: Grid Click Simulation

Given a grid (two-dimensional array) containing numbers, write a program to change the number by 1 per click to the clicked cell and its adjacent cells (i.e., right, left, top, and bottom). The number will be changed up to 3. If the cell already contains a value of 3, the number will be changed back to 1 again.

For example, giving the array of 4 rows and 5 columns, if the clicked position  is at (1, 2), (2, 2), (1, 3) and (1, 3) respectively, the result is shown as below.

![q7](q7.jpg)

**Input Format:**

1. Two numbers indicating row and column and the arrays.
2. A number indicating the number of clicks.
3. The list of clicked positions in pairs of row and column.

### Example:

| **Input** | **Result** |
| --- | --- |
| 4 5 <br> 4 <br> 1 2 <br> 2 2 <br> 1 3 <br> 1 3 | 0 0 1 2 0 <br> 0 1 1 3 2 <br> 0 1 2 3 0 <br> 0 0 1 0 0 |