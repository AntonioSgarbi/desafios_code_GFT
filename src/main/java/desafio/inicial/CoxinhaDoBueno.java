package desafio.inicial;

public class CoxinhaDoBueno {
    public String desafio(String input) {
        String[] inputSplit = input.split(" ");
        double media = Double.parseDouble(inputSplit[0]) / Double.parseDouble(inputSplit[1]);
        String resultado = String.format("%.2f", media);
        return resultado;
    }
}
