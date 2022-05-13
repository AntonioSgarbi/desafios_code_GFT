package desafio.intermediario;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MediaTest {
    private Media underTest;
    private int valueNumber = 0;
    private String ARQUIVO_CASE = "test-media-in.txt";

    @BeforeAll
    void setUp() {
        this.underTest = new Media();
    }

    private double[] readTest(int testNumber) {
        double[] entradas = new double[3];
        ClassLoader classLoader = getClass().getClassLoader();
        try (InputStream inputStream = classLoader.getResourceAsStream(this.ARQUIVO_CASE);
             InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
             BufferedReader br = new BufferedReader(streamReader)) {
            boolean nextIsValue = false;
//            br.readLine().
            while (br.readLine() != null) {
                String line = br.readLine();
                if (nextIsValue) {
                    entradas[this.valueNumber] = Double.parseDouble(line);
                    this.valueNumber++;
                } else if (line.contains("test #" + testNumber)) {
                    nextIsValue = true;
                }
                if (valueNumber == 3) {
                    nextIsValue = false;
                    break;
                }
            }
            valueNumber = 0;
        } catch (IOException e) {
            System.out.println("Erro na leitura do arquivo!");
        }
        return entradas;
    }

    @Test
    void testDesafioMedia1() {
        double[] entradas = this.readTest(1);
        String resultado = underTest.desafio(entradas);
        String esperado = "MEDIA = 6.3";

        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    void testDesafioMedia2() {
        double[] entradas = this.readTest(2);
        String resultado = underTest.desafio(entradas);
        String esperado = "MEDIA = 9.0";

        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    void testDesafioMedia3() {
        double[] entradas = this.readTest(3);
        String resultado = underTest.desafio(entradas);
        String esperado = "MEDIA = 7.5";

        Assertions.assertEquals(esperado, resultado);
    }

}
