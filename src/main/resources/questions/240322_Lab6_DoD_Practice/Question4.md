## Question 4  
Giving a grid (two-dimensional array) containing numbers, write a program to add up the number by 1 per click to the clicked cell and its adjacent cells (i.e., right cell, left cell, top cell, bottom cell).

For example, giving the array of 4 rows and 5 columns, if the clicked position is at (1,2) (2,2) and (1,3) respectively, the result is shown as below.

![field](addup.JPG)

The input has three parts. The first part is two numbers indicate row and column and the arrays. The second part is a number indicate number of clicks. The last part is the list of clicked position in a pair of row and column.

### For example:
| **Input**     | **Result** |
|:--------------|:-----------|
|4 5 <br> 3 <br> 1 2 <br> 2 2 <br> 1 3|0 0 1 1 0 <br> 0 1 3 2 1 <br> 0 1 2 2 0 <br> 0 0 1 0 0|
|6 6 <br> 10 <br> 1 1 <br> 5 3 <br> 4 2 <br> 4 1 <br> 3 3 <br> 3 2 <br> 2 5 <br> 5 1 <br> 2 4 <br> 3 3|0 1 0 0 0 0 <br> 1 1 1 0 1 1 <br> 0 1 1 3 2 2 <br> 0 2 4 3 3 1 <br> 1 3 3 4 0 0 <br> 1 2 3 1 1 0|
|5 3 <br> 5 <br> 0 0 <br> 4 2 <br> 3 1 <br> 1 2 <br> 2 2|1 1 1 <br> 1 1 2 <br> 0 2 2 <br> 1 1 3 <br> 0 2 1|
|10 7 <br> 20 <br> 6 5 <br> 3 1 <br> 0 6 <br> 9 2 <br> 2 2 <br> 8 3 <br> 3 1 <br> 6 5 <br> 7 2 <br> 1 5 <br> 6 5 <br> 4 1 <br> 0 6 <br> 9 2 <br> 2 5 <br> 3 3 <br> 2 1 <br> 6 4 <br> 1 2 <br> 1 3|0 0 1 1 0 3 2 <br> 0 2 3 2 2 2 3 <br> 1 4 3 3 1 2 1 <br> 2 4 4 1 1 1 0 <br> 1 3 1 1 0 0 0 <br> 0 1 0 0 1 3 0 <br> 0 0 1 1 4 4 3 <br> 0 1 1 2 1 3 0 <br> 0 0 4 1 1 0 0 <br> 0 2 2 3 0 0 0|
