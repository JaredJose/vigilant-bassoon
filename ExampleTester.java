import org.junit.*;
import static org.junit.Assert.*;

public class ExampleTester {
    @Test
    public void testAdder(){
        int num1 = 1;
        int num2 = 2;
        assertEquals(2, Example.adder(num1, num2));
    }
}
