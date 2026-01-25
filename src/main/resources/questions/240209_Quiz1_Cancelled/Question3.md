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
