## Question 4
Write a program to find a submatrix by deleting a row and a column from a matrix. Then transpose the submatrix.

Hint: A submatrix is obtained by deleting any rows and columns. For example,

![DeleteRowCol](transposeSubmatrix1.JPG)

To transpose a metrix can be done by switching row and column. For example,

![Transpose](transposeSubmatrix2.JPG)

The input of each case has three lines. The first line indicates a size of array (i.e., rows and columns). The second line contains the number of row and column that will be deleted. Note that number of row and column ranged from 0. The third line contains a list of integer values in an array. The output is the result after transposing the submatrix.
### For example:
| **Input**     | **Result** |
|:--------------|:-----------|
| 3 4<br>2 1<br>1 2 3 4 5 6 7 8 9 10 11 12 | 1 5 3 7 4 8 |
| 5 5<br>0 4<br>1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25|6 11 16 21 7 12 17 22 8 13 18 23 9 14 19 24|
