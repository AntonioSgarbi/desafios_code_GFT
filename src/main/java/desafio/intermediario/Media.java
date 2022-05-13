package desafio.intermediario;

public class Media {
    public String desafio(double[] entradas){
        double a = entradas[0] * 2;
        double b = entradas[1] * 3;
        double c = entradas[2] * 5;

        double media = (a + b + c) / 10;

        return String.format("MEDIA = %.1f", media);
    }
}
