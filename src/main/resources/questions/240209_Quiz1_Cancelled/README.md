<span style="color: red;">This quiz is the original quiz which was supposed to be taken as Quiz_1 and was cancelled due to server error.</span>

## Question 1: ReplaceWords

Write a program to transform a sentence by replacing specific words and characters with their corresponding numeric values based on the following mapping table:

| Word/Char | Replacement |
| --- | --- |
| **to** | 2 |
| **for** | 4 |
| **a** | 6 |
| **e** | 3 |
| **i** | 1 |
| **o** | 0 |
| **s** | 5 |

**Input Format:**

1. An integer indicating the number of words.
2. The sentence (a string of words separated by spaces).

**Output Format:**

* The transformed sentence with all specified replacements applied.

### Example:

| **Input** | **Result** |
|:---|:---|
| 4 <br> Hello World For To | H3ll0 W0rld 4 2 |

## Question 2: PIN Validation

Write a program to validate a user's Personal Identification Number (PIN). A PIN is considered **valid** (`true`) if it meets exactly two criteria:

1. It contains exactly **4 digits** or exactly **6 digits**.
2. It consists **only of numeric digits** (0-9). No letters or special characters allowed.

**Input Format:**

* A single string representing the PIN.

### Example:

| **Input** | **Result** |
|:---|:---|
| 4567 | true |
| 45678 | false |
| 45a2 | false |
| 0020 | true |


## Question 3: Century Finder

Write a program that takes a year as input and returns the corresponding century in ordinal format (e.g., 15th, 21st).

**Logic Note:**

* Years 1–100 are the 1st century.
* Years 101–200 are the 2nd century.
* Generally, if a year ends in `00`, the century is the first two digits. If it ends in any other number, it is the first two digits plus one.

**Input Format:**

* An integer representing the year.

|Input|Output|
|:---|:---|
|1500|15th|
|1569|16th|
|2003|21st|
|1121|12th|

## Question 4: Count Unique Digit Numbers

Write a program to evaluate a list of numbers and return the count of numbers where **every digit is unique** (no digit repeats within the same number).

**For Example:**

* `1234`: Unique (Count this)
* `1223`: Not unique (Digit 2 repeats)

**Input Format:**

1. An integer indicating how many numbers will be provided.
2. A list of integers separated by spaces.

### Example:

| **Input** | **Result** |
|:---|:---|
| 5 <br> 12234 1234 15678 2343 9700 | 2 |

## Question 5 Finite State Machine(cscms problem 48)
Go and read the question at [cscms problem 48](https://cscms.me/problem/48).