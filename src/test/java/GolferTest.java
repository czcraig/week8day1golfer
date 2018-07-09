import models.Golfer;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class GolferTest {

    Golfer golfer;

    @Before
    public void before(){
        golfer = new Golfer("Tiger", "Woods", 39, 1);
    }

    @Test
    public void hasFirstName(){
        assertEquals("Tiger", golfer.getFirstName());
    }

    @Test
    public void hasLastName(){
        assertEquals("Woods", golfer.getSecondName());
    }

    @Test
    public void hasAge(){
        assertEquals(39, golfer.getAge());
    }
}
