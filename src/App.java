import java.util.Collection;

public class App {
    public static void main(String[] args) throws Exception {
        
        Collection<String> coleçãoOrdenada = CollectionFactorySingleton.getInstance().createCollection(CollType.TAMANHO_CONHECIDO_ORDENADO);


        coleçãoOrdenada.add("banana");
        coleçãoOrdenada.add("morango");
        coleçãoOrdenada.add("maça");
        for(String s : coleçãoOrdenada){
            System.out.println(s);
        }
    }
}
