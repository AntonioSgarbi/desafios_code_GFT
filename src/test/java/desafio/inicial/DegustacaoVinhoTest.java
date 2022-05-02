package desafio.inicial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DegustacaoVinhoTest {
    DegustacaoVinho underTest;

    @BeforeAll
    void setUp() {
        underTest = new DegustacaoVinho();
    }

    @Test
    void test1() {
        int[] respostasParticipantes = new int[5];
        respostasParticipantes[0] = 1;
        respostasParticipantes[1] = 2;
        respostasParticipantes[2] = 3;
        respostasParticipantes[3] = 2;
        respostasParticipantes[4] = 1;

        int resultado = underTest.desafio(1, respostasParticipantes);
        int esperado = 2;

        Assertions.assertEquals(esperado, resultado);
    }

}
