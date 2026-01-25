## Question 7  
Giving a black rubik 5x5x5 (all pieces of rubik are black at the initial state as shown in the picture below) and toggle positions, write a program to toggle the color between black and white according to the given conditions and return the number of white pieces.
<p float="left">
  <img src="rubik.JPG" width="40%" />
  <img src="rubik_adjacent.JPG" width="40%" />
</p>

**Toggle Conditions**  
1. At the selected position, a piece of rubik will be toggled. The adjacent pieces are also toggled. These include the front, the behind, the left, the right, the above, and the below.
2. Each toggle will change the color between black and white. In detail, if the color before toggle is black, the color will be changed to white after the toggle. If the color before toggle is white, the color will be changed from white to black.

The first line of input is number of times to toggle. The following lines represent toggle position. The program must return the number of white pieces after all toggles are performed.
### For example:
| **Input**           | **Result** |
|:----------------------|:------------|
| 1 <br> 0 0 0|4|
|2<br>1 3 2<br>1 1 2|12|
|4<br>4 0 0<br>4 0 4<br>1 2 3<br>2 1 1|22|
|5<br>1 2 3<br>2 1 1<br>2 1 1<br>3 1 4<br>1 1 3|16|
|10<br>1 2 3<br>4 0 4<br>1 3 2<br>2 1 1<br>3 1 4<br>1 1 3<br>4 4 4<br>1 1 1<br>2 1 4<br>4 0 1|34|
|15<br>1 2 3<br>4 0 4<br>1 3 2<br>0 2 0<br>2 1 1<br>1 3 0<br>3 1 4<br>1 1 3<br>2 1 4<br>4 4 4<br>1 1 1<br>2 1 4<br>4 0 1<br>3 4 0<br>1 3 4|50|
