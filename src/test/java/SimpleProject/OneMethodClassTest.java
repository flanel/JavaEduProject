package SimpleProject;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OneMethodClassTest {


    @Test
    public void testAssert() {

        OneMethodClass simpleObject = new OneMethodClass();
        assertEquals( simpleObject(2,3), 25);

    }
}
