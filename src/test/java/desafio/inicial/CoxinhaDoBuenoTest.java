package desafio.inicial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CoxinhaDoBuenoTest {
    CoxinhaDoBueno underTest;

    @BeforeAll
    void setUp() {
        underTest = new CoxinhaDoBueno();
    }

    @Test
    void test1() {
        String resultado = underTest.desafio("10 90");
        String esperado = "0.11";
        Assertions.assertEquals(esperado, resultado);
    }
    @Test
    void test2() {
        String resultado = underTest.desafio("840 11");
        String esperado = "76.36";
        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    void test3() {
        String resultado = underTest.desafio("1 50");
        String esperado = "0.02";
        Assertions.assertEquals(esperado, resultado);
    }

}
