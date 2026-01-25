## Question 1

A soldier wants to buy w bananas in the shop. He has to pay k dollars for the first banana, 2k dollars for the second one, and so on (in other words, he has to pay i \* k dollars for the i-th banana).
He has n dollars. How much (in dollar) does he have to borrow from his friend to buy w bananas?

Input
The first line contains three positive integers k, n, w (1 ≤ k, w ≤ 1000, 0 ≤ n ≤ 109), the cost of the first banana, initial number of dollars the soldier has, and number of bananas he wants.

Output
Output one integer — the amount of dollars that the soldier must borrow from his friend. If he doesn't have to borrow money, output 0.

### For example:

| **Input**           | **Result** |
| :------------------ | :--------- |
| 3 17 4              | 13         |
| 3 35 4              | 0          |
| 1000 0 1000         | 500500000  |
| 1000 500500001 1000 | 0          |
| 432 10000 241       | 12587552   |
| 634 87973 214       | 14497197   |
| 1000 500499999 1000 | 1          |
| 47 2367 20          | 7503       |
