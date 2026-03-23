import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class SumOfDigitsTest {
    
    private RecursionMethods rp;
    
    @BeforeEach
    void setUp() {
        rp = new RecursionMethods();
    }
    
    @DisplayName("sumOfDigits Test 1 - Base case 0")
    @Test
    void sumOfDigits_Test01() {
        int expected = 0;
        int result = rp.sumOfDigits(0);
        assertEquals(expected, result);
    }
    
    @DisplayName("sumOfDigits Test 2 - Single digit")
    @Test
    void sumOfDigits_Test02() {
        int expected = 9;
        int result = rp.sumOfDigits(9);
        assertEquals(expected, result);
    }
    
    @DisplayName("sumOfDigits Test 3")
    @Test
    void sumOfDigits_Test03() {
        int expected = 6;
        int result = rp.sumOfDigits(123);
        assertEquals(expected, result);
    }
    
    @DisplayName("sumOfDigits Test 4")
    @Test
    void sumOfDigits_Test04() {
        int expected = 15;
        int result = rp.sumOfDigits(555);
        assertEquals(expected, result);
    }
    
    @DisplayName("sumOfDigits Test 5")
    @Test
    void sumOfDigits_Test05() {
        int expected = 10;
        int result = rp.sumOfDigits(1234);
        assertEquals(expected, result);
    }
    
    @DisplayName("sumOfDigits Test 6")
    @Test
    void sumOfDigits_Test06() {
        int expected = 45;
        int result = rp.sumOfDigits(123456789);
        assertEquals(expected, result);
    }
}