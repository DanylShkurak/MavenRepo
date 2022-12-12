package homework20;

import homework20.entity.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void calculateTest(){
        Calculator calculator = new Calculator(2,3);
        int result = calculator.calculate();
        Assert.assertEquals(5,result);

    }
}
