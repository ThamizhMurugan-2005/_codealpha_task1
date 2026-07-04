# _codealpha_task1
Data redundancy removal

# Data Redundancy Removal System

## Project Overview
The Data Redundancy Removal System is a simple Java application developed as part of the **CodeAlpha Cloud Computing Internship**. The project identifies duplicate email entries and prevents them from being stored, ensuring that only unique data is maintained.

## Objective
- Detect duplicate email records.
- Store only unique data.
- Improve data accuracy.
- Reduce data redundancy.

## Features
- User-friendly console application.
- Accepts multiple email inputs.
- Detects duplicate email addresses.
- Stores only unique email records.
- Displays all unique emails at the end.

## Technologies Used
- Java
- ArrayList
- Scanner Class

## Project Structure
```
DataRedundancyRemoval.java
README.md
```

## How It Works
1. Enter the number of users.
2. Enter each user's email address.
3. The program checks whether the email already exists.
4. If the email is unique, it is added to the list.
5. If the email is a duplicate, it is rejected.
6. Finally, all unique email addresses are displayed.

## Sample Input
```
Enter number of users:
4

Enter email:
arun@gmail.com

Enter email:
kavi@gmail.com

Enter email:
arun@gmail.com

Enter email:
raja@gmail.com
```

## Sample Output
```
Unique data added successfully.
Unique data added successfully.
Duplicate data detected. Not added.
Unique data added successfully.

Stored Unique Emails:
arun@gmail.com
kavi@gmail.com
raja@gmail.com
```

## Advantages
- Prevents duplicate data storage.
- Improves database efficiency.
- Saves storage space.
- Maintains data consistency.

## Future Enhancements
- Integrate with MySQL database.
- Add a graphical user interface (GUI).
- Deploy on a cloud platform.
- Implement user authentication.

## Author
**Muthamizharasi M**

## Internship
**CodeAlpha – Cloud Computing Internship**
