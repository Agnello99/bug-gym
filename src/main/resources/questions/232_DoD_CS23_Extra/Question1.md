## Question 1: List Element Swapping

Write a program to swap the elements from the given order of swap as a pair of positions and print the result. For example, if the given list of numbers is:

`1 2 3 4 5 6 7 8 9 0`

And there are 5 given pairs of swap: `(0,3), (4,6), (7,5), (9,1), and (2,1)`, the result after each swap (in the given order) will be:

* `0 3 -> 4 2 3 1 5 6 7 8 9 0`
* `4 6 -> 4 2 3 1 7 6 5 8 9 0`
* `7 5 -> 4 2 3 1 7 8 5 6 9 0`
* `9 1 -> 4 0 3 1 7 8 5 6 9 2`
* `2 1 -> 4 3 0 1 7 8 5 6 9 2`

Therefore the result from the last swap is: `4 3 0 1 7 8 5 6 9 2`

**Input Format:**

1. A number indicating the size of the given list.
2. A list of integers.
3. A number indicating the number of swaps.
4. A list of swap positions as pairs.

### Example:

| **Input** | **Result** |
| --- | --- |
| 10 <br> 1 2 3 4 5 6 7 8 9 0 <br> 5 <br> 0 3 <br> 4 6 <br> 7 5 <br> 9 1 <br> 2 1 | 4 3 0 1 7 8 5 6 9 2 |
| 4 <br> 1 2 3 0 <br> 8 <br> 0 1 <br> 1 2 <br> 3 2 <br> 2 0 <br> 3 1 <br> 2 3 <br> 0 1 <br> 3 0 | 2 0 3 1 |