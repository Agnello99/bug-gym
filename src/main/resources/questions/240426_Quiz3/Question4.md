## Question 4
Have you ever play Harvest Moon? In the game, you can plant some crops to harvest for selling. Each time you sow a bag of seeds, seeds are spreaded into 9 cells in the field as shown below.

![field](harvestMoon.jpg)

Giving 20 X 20 crop field for planting, each day you sow only one bag of seeds. There are 3 types of crops that you can grow including: tomato, leek and strawberry. Each of them has different period of harvest:
Tomato takes 5 days to fully grows (start counting next day after it is sowed).
Leek takes 3 days to fully grows (start counting next day after it is sowed).
Strawberry takes 7 days to fully grows (start counting next day after it is sowed).

Your task is to write a program to count number of harvests for each type of crop after 10 days. The input consist of 2 parts:
1. number of sow days.
2. type of sow seed (i.e., 1 = tomato, 2 = leek, 3 = strawberry) then followed by sow position of the cell in row and colum (the the seed will be spreaded to all directions from the sow position i.e., top, top-left, top-right, left, right, bottom, bottom-left, bottom-right).

PS. If there already exists a crop at the spreaded cell, the cell will be replaced by the newly sowed seed.
### For example:
| **Input**     | **Result** |
|:--------------|:-----------|
|5 <br> 1 3 3 <br> 1 12 8 <br> 3 3 12 <br> 2 15 15 <br> 2 7 10 | Tomato: 18 <br> Leek: 18 <br> Strawberry: 9 |
|5 <br> 1 3 3 <br> 1 12 8 <br> 2 15 15 <br> 2 7 10 <br> 3 3 12 <br> |Tomato: 18 <br> Leek: 18 <br> Strawberry: 0 |
|7 <br> 1 3 3 <br> 1 12 8 <br> 3 7 17 <br> 3 3 12 <br> 2 15 15 <br> 2 7 10 <br> 2 16 4 | Tomato: 18 <br> Leek: 27 <br> Strawberry: 9|
|7 <br> 1 3 3 <br> 3 7 17 <br> 3 3 12 <br> 1 12 8 <br> 2 15 15 <br> 2 7 10 <br> 2 16 4 | Tomato: 18 <br> Leek: 27 <br> Strawberry: 18 |
|7 <br> 1 2 2 <br> 3 3 12 <br> 1 5 18 <br> 3 7 17 <br> 2 15 15 <br> 1 18 13 <br> 3 18 2 | Tomato: 16 <br> Leek: 9 <br> Strawberry: 9|
