package desafio.inicial;

public class DegustacaoVinho {
    public int desafio(int tipoDeVinho, int... respostaCompetidores) {
        int acertos = 0;
        for(int i=0; i<respostaCompetidores.length; i++){
            if(tipoDeVinho == respostaCompetidores[i]) acertos++;
        }
        return acertos;
    }



}
