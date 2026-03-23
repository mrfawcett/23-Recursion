import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class IsPalindromeTest {
    
    private RecursionMethods rp;
    
    @BeforeEach
    void setUp() {
        rp = new RecursionMethods();
    }
    
    @DisplayName("isPalindrome Test 1 - Empty string")
    @Test
    void isPalindrome_Test01() {
        boolean expected = true;
        boolean result = rp.isPalindrome("");
        assertEquals(expected, result);
    }
    
    @DisplayName("isPalindrome Test 2 - Single character")
    @Test
    void isPalindrome_Test02() {
        boolean expected = true;
        boolean result = rp.isPalindrome("a");
        assertEquals(expected, result);
    }
    
    @DisplayName("isPalindrome Test 3 - Not a palindrome")
    @Test
    void isPalindrome_Test03() {
        boolean expected = false;
        boolean result = rp.isPalindrome("hello");
        assertEquals(expected, result);
    }
    
    @DisplayName("isPalindrome Test 4 - Odd length palindrome")
    @Test
    void isPalindrome_Test04() {
        boolean expected = true;
        boolean result = rp.isPalindrome("racecar");
        assertEquals(expected, result);
    }
    
    @DisplayName("isPalindrome Test 5 - Even length palindrome")
    @Test
    void isPalindrome_Test05() {
        boolean expected = true;
        boolean result = rp.isPalindrome("noon");
        assertEquals(expected, result);
    }
    
    @DisplayName("isPalindrome Test 6 - Not a palindrome")
    @Test
    void isPalindrome_Test06() {
        boolean expected = false;
        boolean result = rp.isPalindrome("java");
        assertEquals(expected, result);
    }
}