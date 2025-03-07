# 1.8-Lambdas-Nivell2
This repository contains solutions to four exercises that demonstrate the use of Java streams, lambdas, functional interfaces, and various other Java features.

## Exercise 1 - Filter Names
### Task:
Create a list of strings containing proper names. Write a method that returns a list of all the strings that start with the letter 'A' (uppercase) and have exactly three letters. Print the result.
### Explanation:
We create a list of names and use the stream() method to filter names that start with 'A' and have exactly three characters.
The result is collected into a new list and printed.

## Exercise 2 - Number String Format
### Task:
Write a method that returns a comma-separated string based on a list of integers. Each element should be preceded by the letter "e" if the number is even, or "o" if the number is odd. For example, if the input list is (3, 55, 44), the output should be "o3, o55, e44".
### Explanation:
- We use stream() to process the list of integers.
- The map() function prefixes each number with "e" or "o" based on whether it's even or odd.
- The result is joined into a comma-separated string and printed.

## Exercise 3 - Functional Interface and Lambda Operations
### Task:
Create a functional interface that contains a method called operation(). This method should return a float. Inject the body of the method using a lambda expression, so that the operation can be transformed into addition, subtraction, multiplication, and division.
### Explanation:
- A functional interface Operation is created with a method operation().
- Different operations (addition, subtraction, multiplication, division) are implemented using lambda expressions and printed for the values 10 and 5.

## Exercise 4 - Mixed List Processing
### Task:
Create a list containing both strings and numbers. Perform the following operations:
1. Sort the list alphabetically based on the first character.
2. Strings containing "e" should appear first.
3. Replace all occurrences of 'a' with '4' in the strings.
4. Print only the numeric values (even if they are stored as strings).
### Explanation:
- We create a mixed list of strings and numbers.
- The list is sorted based on the first character and strings containing "e" are prioritized.
- All occurrences of the character 'a' are replaced by '4'.
- We filter the list to only show elements that are numeric, even if they are stored as strings.
