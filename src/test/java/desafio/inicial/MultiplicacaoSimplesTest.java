package desafio.inicial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MultiplicacaoSimplesTest {
    MultiplicacaoSimples underTest;

    @BeforeAll
    void setUp() {
        underTest = new MultiplicacaoSimples();
    }

    @Test
    void test1(){
        String resultado = underTest.desafio(3, 9);
        String esperado = "PROD = 27";
        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    void test2(){
        String resultado = underTest.desafio(-30, 10);
        String esperado = "PROD = -300";
        Assertions.assertEquals(esperado, resultado);
    }
    @Test
    void test3(){
        String resultado = underTest.desafio(0, 9);
        String esperado = "PROD = 0";
        Assertions.assertEquals(esperado, resultado);
    }

}
