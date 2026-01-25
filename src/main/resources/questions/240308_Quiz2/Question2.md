## Question 2
Write a Java program that calculates the sum of the elements in the upper and lower triangular parts of a given N x N square matrix, including the diagonal elements. Your program must separately print the sum of the elements in the upper triangular matrix and the sum of the elements in the lower triangular matrix.

Input:
- The first line contains a single integer N, the size of the matrix.
- The next N lines contain N integers each, representing the elements of the matrix.

Output:

Print two integers on separate lines. The first integer is the sum of the elements in the upper triangular matrix, including the diagonal. The second integer is the sum of the elements in the lower triangular matrix, including the diagonal.
For example, the matrix of size 3 has following list of integer.

1	2	3  
4	5	6  
7	8	9

The upper triangular matrix is:   
1	2	3  
0	5	6  
0	0	9  
Thus, the sum of upper trianular matrix is 1+2+3+5+6+9 = 26

The lower triangular matrix is:  
1	0 0  
4	5	0  
7	8	9  
Thus, the sum of lower trianular matrix is 1+5+9+4+8+7 = 34

### For example:
| **Input**     | **Result** |
|:--------------|:-----------|
| 3 <br> 1 2 3 <br> 4 5 6 <br> 7 8 9| 26 <br> 34|
| 5 <br> 12 4 5 6 10 <br> 7 8 14 6 21 <br> 11 2 3 6 16 <br> 3 6 7 9 1 <br> 8 9 1 2 4| 125 <br> 92|
| 5 <br> 1 1 1 1 1 <br> 1 1 1 1 1 <br> 1 1 1 1 1 <br> 1 1 1 1 1 <br> 1 1 1 1 1| 15 <br> 15|
| 10 <br> 14 15 13 95 21 4 77 48 40 51 <br> 87 98 100 89 10 19 49 55 31 44 <br> 1 7 83 33 72 50 64 53 96 81 <br> 10 29 35 56 47 8 44 10 88 78 <br> 89 100 12 41 22 100 18 96 45 25 <br> 60 39 8 77 15 22 8 13 45 16 <br> 15 96 77 59 87 59 45 7 66 31 <br> 72 89 100 18 79 20 24 9 25 15 <br> 63 77 47 23 95 96 58 68 33 18 <br> 28 99 19 73 9 67 9 58 31 24| 2419 <br> 2731|
