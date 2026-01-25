## Question 4  
Giving a grid (two-dimensional array) containing lights, write a program to toggle the light according to the following conditions:

1. User number 0 and 1 to represent light off and on respectively.

2. At the selected position, the light will be toggled. The light in the adjacent positions are also toggled. These include the above, the below, the left and the right.

For example, giving the grid below if the selected toggle position is at row 1 and column 2, the toggle is shown as below.

![ToggleLight](lightup.JPG)

The input has three lines. The first line indicates a size of array (i.e., rows and columns which are at least 3 rows/columns). The second line contains a list of 0 and 1 values in an array. The third line contains the toggled positions (i.e., row and column).  The output is the resulted array after toggling the input array according to the toggle positions.


### For example:
| **Input** | **Result** |
|:--------- |:-----------|
|5 5 <br> 1 0 1 1 1 0 0 0 1 0 1 0 0 0 0 1 1 1 1 1 0 0 0 0 0 <br> 3 2|1 0 1 1 1 0 0 0 1 0 1 0 1 0 0 1 0 0 0 1 0 0 1 0 0|
|3 4 <br> 0 0 1 1 1 0 1 1 1 0 0 0 <br> 1 2|0 0 0 1 1 1 0 0 1 0 1 0|
|5 3 <br> 0 0 0 0 0 1 1 1 0 1 0 1 0 0 0 <br> 1 1|0 1 0 1 1 0 1 0 0 1 0 1 0 0 0|
