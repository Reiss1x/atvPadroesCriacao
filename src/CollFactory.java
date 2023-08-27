import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

class CollFactory {
    public Collection<String> createCollection(CollType type) {
        switch (type) {
            case TAMANHO_CONHECIDO_ORDENADO:
                return new ArrayList<>();
            case TAMANHO_DESCONHECIDO_ORDENADO:
                return new LinkedList<>();
            case TAMANHO_DESCONHECIDO_DESORDENADO_UNICO:
                return new HashSet<>();
            case TAMANHO_DESCONHECIDO_ORDENADO_UNICO:
                return new TreeSet<>();
            default:
                throw new IllegalArgumentException("Tipo desconhecido de coleção");
        }
    }
}