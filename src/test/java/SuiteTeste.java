import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import desafio.inicial.AlbumDaCopaTest;
import desafio.inicial.CoxinhaDoBuenoTest;
import desafio.inicial.DegustacaoVinhoTest;
import desafio.inicial.MultiplicacaoSimplesTest;

@Suite
@SelectClasses({
        AlbumDaCopaTest.class,
        CoxinhaDoBuenoTest.class,
        DegustacaoVinhoTest.class,
        MultiplicacaoSimplesTest.class})
public class SuiteTeste {
}
