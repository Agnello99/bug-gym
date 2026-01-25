
## Question 8: Invoice UML Implementation

Given the UML Class Diagram below, write a program accordingly.
![q8](q8_oop.jpg)
**Logic Requirements:**

* **Invoice Class:** Holds `LineItem` objects in an `ArrayList`.
* `addLineItem`: Checks if the item exists. If yes, prints "This line item already exists." Otherwise, adds it.
* `removeLineItem`: Checks if the item exists. If yes, removes it. Otherwise, prints "This line item does not exist."


* **LineItem Class:** Attributes include `product`, `quantity`, `unit_price`, and `line_sum`.
* `line_sum` is calculated as .
* `setQuantity` and `setUnit_price` must update `line_sum` whenever called.



**Note:** Do not modify the provided driver class.
