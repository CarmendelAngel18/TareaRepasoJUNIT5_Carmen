
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Vocales2Test {
    @Test
    public void testSinvocales() {
        assertEquals("Hl Mnd", Vocales2.sinvocales("Hola Mundo"));
        assertEquals("st s n cdn", Vocales2.sinvocales("Esto Es una cadenA"));
        assertEquals("Jv ml Mglln", Vocales2.sinvocales("Java mola MogollOn"));
        assertEquals("4h0r4 s0n nm3r0s", Vocales2.sinvocales("4h0r4 s0n num3r0s"));
        assertEquals("Cdn Sn Vcls", Vocales2.sinvocales("Cadena Sin Vocales"));
    }
}
