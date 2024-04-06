import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class VocalesTest {

    @Test
    public void testContarVocales1() {
        assertEquals(4, Vocales.contarVocales("Hola Mundo"));
    }

    @Test
    public void testContarVocales2() {
        assertEquals(8, Vocales.contarVocales("Esto Es una cadenA"));
    }

    @Test
    public void testContarVocales3() {
        assertEquals(7, Vocales.contarVocales("Java mola MogollOn"));
    }

    @Test
    public void testContarVocales4() {
        assertEquals(1, Vocales.contarVocales("4h0r4 s0n num3r0s"));
    }

    @Test
    public void testContarVocales5() {
        assertEquals(6, Vocales.contarVocales("Cadena S1n Vocales"));
    }
}
