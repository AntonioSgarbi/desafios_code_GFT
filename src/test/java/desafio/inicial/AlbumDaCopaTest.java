package desafio.inicial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AlbumDaCopaTest {
    AlbumDaCopa underTest;

    @BeforeAll
    void setUp() {
        underTest = new AlbumDaCopa();
    }

    @Test
    void test1() {
        Integer[] entrada = new Integer[3];
        entrada[0] = 5;
        entrada[1] = 8;
        entrada[2] = 3;
        int resultado = underTest.desafio(10, entrada);
        int esperado = 7;
        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    void test2() {
        Integer[] entrada = new Integer[4];
        entrada[0] = 2;
        entrada[1] = 1;
        entrada[2] = 3;
        entrada[3] = 3;
        int resultado = underTest.desafio(3, entrada);
        int esperado = 0;
        Assertions.assertEquals(esperado, resultado);
    }

}
