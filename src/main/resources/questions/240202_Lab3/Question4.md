## Question 4  
GOTO [https://cscms.sit.kmutt.ac.th/bisection.pdf](https://cscms.sit.kmutt.ac.th/bisection.pdf) if you can't read it correctly.


Bisection Method is based on splitting x-interval into two halves

![diagram](if.png)

IF f(x)  has a root between a and b THEN f(a)×f(b)<0

![solution](solution.png)

**Algorithm** 

1. Use the given point of  interval by finding a and b such that f(a)×f(b)<0
2. Calculate the first estimate solution x<sub>ns</sub> = (a+b)/2

3. Determine the range with true solution
4. if f(a)×f(x<sub>ns</sub>)<0, the true solution is between  a and x<sub>ns</sub>
5. if f(a)×f(x<sub>ns</sub>)>0, the true solution is between x<sub>ns</sub> and b
6. Select subinterval obtained from step 3 and go back to step 2 
7. Calculate tolerance by tolerance = (b−a)/2
8. Repeat step 2 to 5 until specified tolerance attained

**Problem**

Use an introduced method to find value of x in equation c1 + c2 (x−sinx). The algorithm must stop when tolerance attained by using a this given argument a, b, c1, c2 and tolerance.

HINT1: use Math.sin(x) to calculate value of sine function.
HINT2: use double for your datatype.

**Example:**

**Input:** 2 3 8 -4.5 0.001

**Output:** 2.4306640625

**Explanation of the Example**

Find the value of x from equation 8−4.5(x−sinx) by using Bisection method with tolerance of less than 0.001 radian.

![explanation](explanation.png)

### For example:
| **Input**     | **Result** |
|:--------------|:-----------|
|2 3 8 -4.5 0.001|2.4306640625|
|2 3 8 -4.5 0.0001|2.43048095703125|
