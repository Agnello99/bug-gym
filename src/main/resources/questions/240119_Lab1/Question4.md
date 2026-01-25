## Question 4  
Mr. A and Arslan Mrs. B like to drink Cola. They usually challenge each other to drinking a lot of Cola. In each round of challenge, the first person to drink will be random as well as a total number of Cola is also random. The order of drinking is shown in the below table.

| **round**     | **1** |**2** |**3** |**4** |**5** |**...** |**n** |
|:--------------|:------|:------|:------|:------|:------|:------|:------|
| First person | 1| 3 4| 7 8 9 | 13 14 15 16| 21 22 23 24 25| ... | ...|
|Second person| 2| 5 6 | 10 11 12 | 17 18 19 20| 26 27 28 29 30| ... | ...|

Your task is to write a program to check which person will drink the last glass of Cola in order to ensure that both of them drink Cola according to the condition of the challenge. For example, if the first person to drink Cola is A and total number of Cola to drink is 20, the B is the one who drink the last glass of Cola (i.e., the 20th of Cola glass).

The input consists of two data:
1. a person who will drink the first glass of Cola
2. total number of Cola

### For example:
| **Input**     | **Result** |
|:--------------|:-----------|
|A 20|B|
|B 21|B|
|A 30|B|
|B 36|B|
|B 6|A|
|A 54|B|
|A 43|A|
|A 46|A|
