## Question 5
The gardener is cultivating a 3D grass field by planting a block of grass each day. For each day, the grass exhibits continuous growth, expanding into neighboring cells across six dimensions: up, down, left, right, front, and back. The gardener intends to continue planting for several days. On the final day of planting, write a program to determine the total number of cells occupied by the grass.

The input consitst of 3 parts:

1. size of the 3D field (row, column, depth)

2. number of days

3. a position of cell that the gardener plant a block of grass in each day

The output is the total number of cells occupied by the grass.

The first day of planting, the 3D field is visualized as follow:

![Day 1](day1.png)

The second day of planting, the 3D field is visualized as follow:

![Day 2](day2.png)

The third day of planting, the 3D field is visualized as follow:

![Day 3](day3.png)

From the example, after planting for 3 days, the total number of occupied cell is 18.



### For example:
| **Input**     | **Result** |
|:--------------|:-----------|
| 5 5 3 <br> 3 <br> 0 0 0 <br> 2 3 1 <br> 1 3 2 | 18|
| 3 3 3 <br> 2 <br> 0 0 0 <br> 2 2 2| 5 |
| 5 4 3 <br> 3 <br> 3 0 2 <br> 4 1 1 <br> 2 2 2| 17 |
| 4 4 5 <br> 4 <br> 1 2 3 <br> 2 2 2 <br> 3 1 4 <br> 0 0 1| 53 |
