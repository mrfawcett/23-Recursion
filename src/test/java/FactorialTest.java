import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {
    
    private RecursionMethods rp;
    
    @BeforeEach
    void setUp() {
        rp = new RecursionMethods();
    }
    
    @DisplayName("factorial Test 1 - Base case 0")
    @Test
    void factorial_Test01() {
        int expected = 1;
        int result = rp.factorial(0);
        assertEquals(expected, result);
    }
    
    @DisplayName("factorial Test 2 - Base case 1")
    @Test
    void factorial_Test02() {
        int expected = 1;
        int result = rp.factorial(1);
        assertEquals(expected, result);
    }
    
    @DisplayName("factorial Test 3 - Small value")
    @Test
    void factorial_Test03() {
        int expected = 6;
        int result = rp.factorial(3);
        assertEquals(expected, result);
    }
    
    @DisplayName("factorial Test 4")
    @Test
    void factorial_Test04() {
        int expected = 120;
        int result = rp.factorial(5);
        assertEquals(expected, result);
    }
    
    @DisplayName("factorial Test 5")
    @Test
    void factorial_Test05() {
        int expected = 720;
        int result = rp.factorial(6);
        assertEquals(expected, result);
    }
    
    @DisplayName("factorial Test 6 - Larger value")
    @Test
    void factorial_Test06() {
        int expected = 40320;
        int result = rp.factorial(8);
        assertEquals(expected, result);
    }
}