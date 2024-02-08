import org.example.SelectorDeRegalos;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SelectorDeRegalosTest {

    @Test
    public void regalo1(){
        SelectorDeRegalos r1 = new SelectorDeRegalos();
        assertEquals("Juguete de construcción",r1.seleccionarRegalo(120,5));
    }

    @Test
    public void regalo4(){
        SelectorDeRegalos r1 = new SelectorDeRegalos();
        assertEquals("Libro de aventuras",r1.seleccionarRegalo(80,15));
    }



}
