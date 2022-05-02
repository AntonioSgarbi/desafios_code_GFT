package desafio.inicial;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AlbumDaCopa {
    public int desafio(int totalFigurinhas, Integer... figurinhaComprada) {
        Set<Integer> filtroRepetidas = new HashSet<>(List.of(figurinhaComprada));
        int resultado =  totalFigurinhas - filtroRepetidas.size();
        return resultado;
    }
}
