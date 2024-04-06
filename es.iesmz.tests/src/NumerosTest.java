
import junit.framework.TestCase;
import org.junit.Test;

public class NumerosTest extends TestCase {

    @Test
    public void testSoniguales() {
        assertEquals(2, Numeros.soniguales(4, 55, 7));
        assertEquals(2, Numeros.soniguales(14, 23, 27));
        assertEquals(1, Numeros.soniguales(14, 55, 14));
        assertEquals(1, Numeros.soniguales(14, 14, 33));
        assertEquals(1, Numeros.soniguales(32, 55, 55));
        assertEquals(0, Numeros.soniguales(329, 329, 329));
    }
}

