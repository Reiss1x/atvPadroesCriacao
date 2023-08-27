import java.util.Collection;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        //teste das coleções
        
        Collection<String> coleçãoOrdenada = CollectionFactorySingleton.getInstance().createCollection(CollType.TAMANHO_CONHECIDO_ORDENADO);

        coleçãoOrdenada.add("banana");
        coleçãoOrdenada.add("morango");
        coleçãoOrdenada.add("maça");
        for(String s : coleçãoOrdenada){
            System.out.println(s);
        }

        //teste do banco
        Conta conta1 = Conta.builder(123456L, "João")
        .saldoLivreInicial(1000)
        .saldoAplicacaoInicial(5000)
        .taxaRemuneracao(0.05)
        .taxaSaldoNegativo(0.1)
        .categoriaInicial(Categoria.NORMAL)
        .build();

        System.out.println(conta1);

        //teste dos personagens
        for(int x = 0; x<=5;x++){
            Personagem personagemAleatorio = Personagem.criarPersonagemAleatorio();
            System.out.println(personagemAleatorio);
        }
    }
}