## Challenge 1

Write a program to read the data (name, email, and salary) of employees from a .csv file. Then, display, in alphabetical order, the emails of the employees whose salary is greater than a given value provided by the user. Also, show the sum of the salaries of employees whose name starts with the letter 'M'.

#### Input file(csv)

```
Maria,maria@gmail.com,3200.00
Alex,alex@gmail.com,1900.00
Marco,marco@gmail.com,1700.00
Bob,bob@gmail.com,3500.00
Anna,anna@gmail.com,2800.00
```

#### Execution

```
Enter full file path: /tmp/products1.csv
Enter salary: 2000.00
Email of people whose salary is more than 2000.00:
anna@gmail.com
bob@gmail.com
maria@gmail.com
Sum of salary of people whose name starts with 'M': 4900.00
```


## Challenge 2
Create a program to read a set of products from a .csv file (assuming there is at least one product). Then, display the average price of the products. Afterward, show the names, in descending order, of the products that have a price lower than the average price.

#### Input File:
```
Tv,900.00
Mouse,50.00
Tablet,350.50
HD Case,80.90
Computer,850.00
Monitor,290.00
```

#### Execution:
```
Enter full file path: /tmp/products2.csv
Average price: 420.23
Tablet
Mouse
Monitor
HD Case
```
