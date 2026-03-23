import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {
    
    private RecursionMethods rp;
    
    @BeforeEach
    void setUp() {
        rp = new RecursionMethods();
    }
    
    @DisplayName("fibonacci Test 1 - Base case 0")
    @Test
    void fibonacci_Test01() {
        int expected = 0;
        int result = rp.fibonacci(0);
        assertEquals(expected, result);
    }
    
    @DisplayName("fibonacci Test 2 - Base case 1")
    @Test
    void fibonacci_Test02() {
        int expected = 1;
        int result = rp.fibonacci(1);
        assertEquals(expected, result);
    }
    
    @DisplayName("fibonacci Test 3")
    @Test
    void fibonacci_Test03() {
        int expected = 1;
        int result = rp.fibonacci(2);
        assertEquals(expected, result);
    }
    
    @DisplayName("fibonacci Test 4")
    @Test
    void fibonacci_Test04() {
        int expected = 5;
        int result = rp.fibonacci(5);
        assertEquals(expected, result);
    }
    
    @DisplayName("fibonacci Test 5")
    @Test
    void fibonacci_Test05() {
        int expected = 13;
        int result = rp.fibonacci(7);
        assertEquals(expected, result);
    }
    
    @DisplayName("fibonacci Test 6")
    @Test
    void fibonacci_Test06() {
        int expected = 55;
        int result = rp.fibonacci(10);
        assertEquals(expected, result);
    }
}