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
