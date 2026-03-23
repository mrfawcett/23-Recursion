# Recursion Assignment

## Overview

In this assignment, you will implement eight methods using **recursion**. Recursion is a programming technique where a method calls itself to solve a problem by breaking it down into smaller, similar subproblems.

## Important Rules

- **NO LOOPS ALLOWED**: You may not use `for`, `while`, or `do-while` loops in any method
- All solutions must use recursion
- Helper methods are allowed if needed, but they must also be recursive
- Each method must have a base case (stopping condition) and a recursive case

## Understanding Recursion

Every recursive method needs two parts:

1. **Base Case**: The stopping condition that prevents infinite recursion
2. **Recursive Case**: The method calls itself with a simpler version of the problem

**Example Pattern:**
```java
public int example(int n) {
    // Base case - when to stop
    if (n == 0) {
        return someValue;
    }
    
    // Recursive case - call yourself with a simpler problem
    return someOperation + example(n - 1);
}
```

## Methods to Implement

### 1. factorial(int n)
Calculate n! = n × (n-1) × (n-2) × ... × 1

**Base case:** 0! = 1  
**Recursive case:** n! = n × (n-1)!

**Examples:**
- `factorial(5)` → 120
- `factorial(0)` → 1

---

### 2. fibonacci(int n)
Return the nth number in the Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13...

**Base cases:** fib(0) = 0, fib(1) = 1  
**Recursive case:** fib(n) = fib(n-1) + fib(n-2)

**Examples:**
- `fibonacci(5)` → 5
- `fibonacci(7)` → 13

---

### 3. sumOfDigits(int n)
Add all digits in a number.

**Base case:** If n is 0, return 0  
**Recursive case:** Last digit + sum of remaining digits  
**Hint:** Use `n % 10` for last digit, `n / 10` to remove it

**Examples:**
- `sumOfDigits(123)` → 6
- `sumOfDigits(555)` → 15

---

### 4. reverseString(String str)
Reverse a string.

**Base case:** Empty or single character string returns itself  
**Recursive case:** Last character + reverse of remaining string  
**Hint:** Use `str.substring()` to get parts of the string

**Examples:**
- `reverseString("hello")` → "olleh"
- `reverseString("recursion")` → "noisrucer"

---

### 5. isPalindrome(String str)
Check if a string reads the same forwards and backwards.

**Base cases:** Empty string or single character is a palindrome  
**Recursive case:** First and last characters match AND middle is a palindrome

**Examples:**
- `isPalindrome("racecar")` → true
- `isPalindrome("hello")` → false

---

## Testing

Your implementation will be tested using JUnit test files:
- `FactorialTest.java`
- `FibonacciTest.java`
- `SumOfDigitsTest.java`
- `ReverseStringTest.java`
- `IsPalindromeTest.java`

Run all tests to ensure your implementations are correct.

## Tips for Success

1. **Always identify the base case first** - What's the simplest version of the problem?
2. **Trust the recursion** - Assume the recursive call works for simpler inputs
3. **Make progress toward the base case** - Each recursive call should get closer to the base case
4. **Trace through small examples** - Work through factorial(3) step by step on paper
5. **Don't use loops** - Think recursively.

## Common Mistakes to Avoid

- Forgetting the base case (causes infinite recursion/stack overflow)
- Not making progress toward the base case
- Using loops instead of recursion
- Not returning the result of the recursive call

## Submission

Complete the `RecursionMethods.java` file by implementing all eight methods recursively. Make sure all test cases pass before submitting your work.