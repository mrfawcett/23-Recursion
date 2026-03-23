/* INSTRUCTIONS
 * This class contains several methods that must be implemented using RECURSION.
 * You may NOT use loops (for, while, do-while) in any of these methods.
 * Each method must be solved recursively.
 * 
 * Helper methods are allowed if needed, but they must also be recursive.
 */

public class RecursionMethods {
    
    /* COMPLETE THIS METHOD
     * Calculates the factorial of a number recursively.
     * Factorial of n (n!) is n * (n-1) * (n-2) * ... * 1
     * Base case: 0! = 1
     * 
     * @param n a non-negative integer
     * @return the factorial of n
     * 
     * EXAMPLES:
     *  factorial(0) returns 1
     *  factorial(1) returns 1
     *  factorial(5) returns 120 (5 * 4 * 3 * 2 * 1)
     *  factorial(6) returns 720
     */
    public int factorial(int n) {
        // Insert your code below

        return 0;
    }
    
    /* COMPLETE THIS METHOD
     * Calculates the nth Fibonacci number recursively.
     * Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
     * Each number is the sum of the two preceding numbers.
     * Base cases: fib(0) = 0, fib(1) = 1
     * 
     * @param n a non-negative integer representing the position in the sequence
     * @return the nth Fibonacci number
     * 
     * EXAMPLES:
     *  fibonacci(0) returns 0
     *  fibonacci(1) returns 1
     *  fibonacci(5) returns 5
     *  fibonacci(7) returns 13
     */
    public int fibonacci(int n) {
        // Insert your code below

        return 0;
    }
    
    /* COMPLETE THIS METHOD
     * Calculates the sum of all digits in a number recursively.
     * 
     * @param n a non-negative integer
     * @return the sum of all digits in n
     * 
     * EXAMPLES:
     *  sumOfDigits(0) returns 0
     *  sumOfDigits(123) returns 6 (1 + 2 + 3)
     *  sumOfDigits(555) returns 15 (5 + 5 + 5)
     *  sumOfDigits(9) returns 9
     * 
     * HINT: Use n % 10 to get the last digit, and n / 10 to remove the last digit
     */
    public int sumOfDigits(int n) {
        // Insert your code below

        return 0;
    }
    
    /* COMPLETE THIS METHOD
     * Reverses a string recursively.
     * 
     * @param str a string to reverse
     * @return the reversed string
     * 
     * EXAMPLES:
     *  reverseString("") returns ""
     *  reverseString("a") returns "a"
     *  reverseString("hello") returns "olleh"
     *  reverseString("recursion") returns "noisrucer"
     * 
     * HINT: Use str.substring() to get parts of the string
     */
    public String reverseString(String str) {
        // Insert your code below

        return null;
    }
    
    /* COMPLETE THIS METHOD
     * Calculates base raised to the exponent power recursively.
     * 
     * @param base the base number
     * @param exponent a non-negative integer exponent
     * @return base raised to the exponent power
     * 
     * EXAMPLES:
     *  power(2, 0) returns 1 (any number to the 0 power is 1)
     *  power(2, 3) returns 8 (2 * 2 * 2)
     *  power(5, 2) returns 25 (5 * 5)
     *  power(3, 4) returns 81 (3 * 3 * 3 * 3)
     */
    
    /* COMPLETE THIS METHOD
     * Checks if a string is a palindrome recursively.
     * A palindrome reads the same forwards and backwards.
     * 
     * @param str the string to check
     * @return true if str is a palindrome, false otherwise
     * 
     * EXAMPLES:
     *  isPalindrome("") returns true
     *  isPalindrome("a") returns true
     *  isPalindrome("racecar") returns true
     *  isPalindrome("hello") returns false
     *  isPalindrome("noon") returns true
     * 
     * HINT: Compare first and last characters, then check the substring in between
     */
    public boolean isPalindrome(String str) {
        // Insert your code below

        return false;
    }
}