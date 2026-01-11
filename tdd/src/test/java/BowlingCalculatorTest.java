import be.ucll.craft.BowlingCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingCalculatorTest {

    BowlingCalculator calculator;
    @BeforeEach
    public void initCalculator() {
         calculator    = new BowlingCalculator();
    }


    @Test
    public void canCalculateGutterGame() {
        for (int i=0; i<20; i++){
            calculator.addRoll(0);
        }
        assertEquals(0,calculator.getScore());
    }

    @Test
    public void canCalculateBasicGmae(){
        for (int i=0; i<20; i++){
            calculator.addRoll(1);
        }

        assertEquals(0,calculator.getScore());
    }
}


