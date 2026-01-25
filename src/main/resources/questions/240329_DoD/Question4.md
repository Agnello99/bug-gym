## Question 4  
The gardener is cultivating a 2D grass field by planting a blade of grass each day. For each day, the grass exhibits continuous growth, expanding into neighboring cells across 4 dimensions: up, down, left, and right. The gardener intends to continue planting for several days. On the final day of planting, write a program to determine the total number of cells occupied by the grass.

The input consitst of 3 parts:

1. size of the 2D field (row, column)

2. number of days

3. a position of cell that the gardener plant a blade grass in each day

The output is the total number of cells occupied by the grass.

For example:

Input:

5 5  
3  
0 0  
1 2  
3 3

The first day of planting, the 2D field is visualized as follow:

![Day1](day1.png)

The second day of planting, the 2D field is visualized as follow:

![Day2](day2.png)

The third day of planting, the 2D field is visualized as follow:

![Day3](day3.png)

From the example, after planting for 3 days, the total number of occupied cell is 10.


### For example:
| **Input** | **Result** |
|:--------- |:-----------|
|5 5 <br> 3 <br> 0 0 <br> 1 2 <br> 3 3|10|
|10 10 <br> 5 <br> 2 4 <br> 6 8 <br> 1 2 <br> 3 5 <br> 6 2|61|
|20 20 <br> 10 <br> 15 1 <br> 12 13 <br> 14 10 <br> 3 1 <br> 14 19 <br> 3 14 <br> 17 15 <br> 19 16 <br> 15 15 <br> 3 5|324|
