## Question 4
In digital image processing, the Zigzag traversal is a popular method used for scanning the elements of a two-dimensional array (matrix) in a zigzag manner. This pattern is notably utilized in the JPEG compression algorithm to serialize the quantized block of DCT coefficients before further compression. 

Write a Java program that generates a 2D array with given dimensions m x n and fills it with integers in a zigzag order. Then, print the generated 2D array to demonstrate the zigzag pattern.

Input: matrix dimension x and y

Output: a print out of matrix.

The example of this traversal shown below

![Zig Zag Traversal](zigzag.jpeg)

### For example:
| **Input**     | **Result** |
|:--------------|:-----------|
| 5 5 | 1 2 6 7 15 <br> 3 5 8 14 16 <br> 4 9 13 17 22 <br> 10 12 18 21 23 <br> 11 19 20 24 25|
