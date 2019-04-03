import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {
    @Test
    public void testAdd(){

        Calculator calculator = new Calculator();
        int result = calculator.add(1, 1);
        Assert.assertEquals(result, 2);
    }
}
