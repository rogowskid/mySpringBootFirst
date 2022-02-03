package pl.rogowski.springfirst.CalcTestAll;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.rogowski.springfirst.Calc.Calc;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CalcTest {

    @Autowired
    Calc calc;

    @Test
    public void checkNullValueAandB()

    {
        assertNotNull(calc.getA());
        assertNotNull(calc.getB());
    }

    @Test
    public void checkNullValueRandomInt()
    {
        assertNotNull(calc.calcRandom());

    }

}
