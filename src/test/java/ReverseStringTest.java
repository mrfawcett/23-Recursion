import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseStringTest {
    
    private RecursionMethods rp;
    
    @BeforeEach
    void setUp() {
        rp = new RecursionMethods();
    }
    
    @DisplayName("reverseString Test 1 - Empty string")
    @Test
    void reverseString_Test01() {
        String expected = "";
        String result = rp.reverseString("");
        assertEquals(expected, result);
    }
    
    @DisplayName("reverseString Test 2 - Single character")
    @Test
    void reverseString_Test02() {
        String expected = "a";
        String result = rp.reverseString("a");
        assertEquals(expected, result);
    }
    
    @DisplayName("reverseString Test 3")
    @Test
    void reverseString_Test03() {
        String expected = "olleh";
        String result = rp.reverseString("hello");
        assertEquals(expected, result);
    }
    
    @DisplayName("reverseString Test 4")
    @Test
    void reverseString_Test04() {
        String expected = "noisrucer";
        String result = rp.reverseString("recursion");
        assertEquals(expected, result);
    }
    
    @DisplayName("reverseString Test 5")
    @Test
    void reverseString_Test05() {
        String expected = "dcba";
        String result = rp.reverseString("abcd");
        assertEquals(expected, result);
    }
    
    @DisplayName("reverseString Test 6")
    @Test
    void reverseString_Test06() {
        String expected = "avaj";
        String result = rp.reverseString("java");
        assertEquals(expected, result);
    }
}