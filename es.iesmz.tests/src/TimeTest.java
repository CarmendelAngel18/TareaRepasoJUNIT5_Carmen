
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TimeTest {

    @Test
    public void testNextSecond1() {
        Time time = new Time(12, 14, 15);
        Time expected = new Time(12, 14, 16);
        assertEquals(expected, time.nextSecond());
    }

    @Test
    public void testNextSecond2() {
        Time time = new Time(12, 59, 44);
        Time expected = new Time(12, 59, 45);
        assertEquals(expected, time.nextSecond());
    }

    @Test
    public void testNextSecond3() {
        Time time = new Time(1, 9, 59);
        Time expected = new Time(1, 10, 0);
        assertEquals(expected, time.nextSecond());
    }

    @Test
    public void testNextSecond4() {
        Time time = new Time(17, 59, 59);
        Time expected = new Time(18, 0, 0);
        assertEquals(expected, time.nextSecond());
    }

    @Test
    public void testNextSecond5() {
        Time time = new Time(23, 59, 59);
        Time expected = new Time(0, 0, 0);
        assertEquals(expected, time.nextSecond());
    }
}
