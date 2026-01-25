## Question 3  
Write a Java program to sort a list of number and then swap according to the following conditions:

1. If the size of list is odd number, then swap the first number with the number before the middle number and swap the last number with the number after the middle number as an example:

  5  21.3  4  10  0.2  15  9     --> sort --> 0.2  4  5  9  10  15  21.3 --> swap --> 5  4  0.2  9  21.3  15  10

2. If the size of list is even number, there will be two numbers in the middle. Then swap the first number with the left middle number, and swap the last number with the right middle number as example:

  5  21.3  4  10  15  9     --> sort --> 4  5  9  10  15  21.3 --> swap --> 9  5  4  21.3  15  10

The first input is a size of a list. The second input is the list of numbers. Use datatype as double.
### For example:
| **Input**     | **Result** |
|:--------------|:-----------|
| 7 <br> 5  21.3  4  10  0.2  15  9|5.0 4.0 0.2 9.0 21.3 15.0 10.0|
| 6<br>5  21.3  4  10  15  9|9.0 5.0 4.0 21.3 15.0 10.0|
|6<br>64  -399  -29  -790  475  854|-29.0 -399.0 -790.0 854.0 475.0 64.0|
|11<br>7  -250  341  137  235  750  136  -83  571  632  -153|136.0 -153.0 -83.0 7.0 -250.0 137.0 750.0 341.0 571.0 632.0 235.0|
|14<br>-142  955  873  -316  -102  806  -894  -362  542  -279  463  667  207  598|207.0 -362.0 -316.0 -279.0 -142.0 -102.0 -894.0 955.0 542.0 598.0 667.0 806.0 873.0 463.0|
