## Question 1
Write the program to print a course which has the most number of registered students.

The input is the list of course and number of registered students pairs. The list ends when it reaches the word "end".

The output is the course with the highest number of registered students. (Hint: the test cases will provide only 1 course having highest number of registered students.)
### For example:
| **Input**     | **Result** |
|:--------------|:-----------|
| CSC102,1 <br> CSC105,5 <br> CSC217,8 <br> CSC102,4 <br> end| CSC217,8 |
| CSC102,3 <br> CSC102,2 <br> CSC220,10 <br> CSC217,7 <br> CSC102,2 <br> LNG320,8 <br> CSC102,10 <br> end|CSC102,17|
|CSC102,3 <br> CSC102,2 <br> CSC220,10 <br> CSC217,7 <br> CSC102,2 <br> LNG320,8 <br> CSC102,10 <br> CSC102,3 <br> CSC102,2 <br> CSC220,10 <br> CSC217,7 <br> CSC102,2 <br> LNG320,8 <br> CSC102,10 <br> CSC102,3 <br> CSC102,2 <br> CSC220,10 <br> CSC217,7 <br> CSC102,2 <br> LNG320,8 <br> CSC102,10 <br> end|CSC102,51|
|CSC102,2 <br> CSC102,5 <br> CSC220,11 <br> CSC217,32 <br> CSC102,6 <br> LNG320,8 <br> CSC102,13 <br> CSC309,40 <br> CSC217,32 <br> CSC102,6 <br> LNG320,8 <br> CSC102,13 <br> CSC309,40 <br> CSC102,2 <br> CSC102,5 <br> end|CSC309,80|
|CSC102,1 <br> CSC105,5 <br> CSC217,8 <br> CSC102,3 <br> CSC102,1 <br> CSC105,5 <br> CSC217,8 <br> CSC102,6 <br> CSC102,11 <br> CSC102,8 <br> CSC105,12 <br> CSC217,8 <br> CSC217,8 <br> CSC102,6 <br> CSC102,11 <br> CSC102,8 <br> CSC105,12 <br> CSC217,8 <br> end|CSC102,55|
